package com.home.demo.main;import static org.junit.Assert.assertEquals;import java.util.Arrays;import java.util.HashMap;import java.util.List;import java.util.Map;import org.activiti.engine.runtime.ProcessInstance;import org.activiti.engine.task.Task;import org.activiti.engine.test.Deployment;import org.junit.Test;import com.home.demo.base.AbstractTest;/** * 多实例测试用例 * * @author henryyan */public class MultiInstanceTest extends AbstractTest {    /**     * Java Service多实例（是否顺序结果一样）     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceFixedNumbers.bpmn"})    public void testParallel() throws Exception {        Map<String, Object> variables = new HashMap<String, Object>();        long loop = 3;        variables.put("loop", loop);        variables.put("counter", 0); // 计数器        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("testMultiInstanceFixedNumbers", variables);        Object variable = runtimeService.getVariable(processInstance.getId(), "counter");        assertEquals(loop, variable);    }    /**     * 用户任务多实例--顺序     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.sequential.bpmn"})    public void testForUserSequence() throws Exception {        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask");        long count = taskService.createTaskQuery().processInstanceId(processInstance.getId()).count();        assertEquals(1, count);        Task task = taskService.createTaskQuery().singleResult();        taskService.complete(task.getId());        count = taskService.createTaskQuery().processInstanceId(processInstance.getId()).count();        assertEquals(1, count);        task = taskService.createTaskQuery().singleResult();        taskService.complete(task.getId());        count = taskService.createTaskQuery().processInstanceId(processInstance.getId()).count();        assertEquals(1, count);        task = taskService.createTaskQuery().singleResult();        taskService.complete(task.getId());        count = taskService.createTaskQuery().processInstanceId(processInstance.getId()).count();        assertEquals(0, count);    }    /**     * 用户任务多实例--并行     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.nosequential.bpmn"})    public void testForUserNoSequential() throws Exception {        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask");        long count = taskService.createTaskQuery().processInstanceId(processInstance.getId()).count();        assertEquals(3, count);    }    /**     * 用户任务多实例，通过用户数量决定实例个数--并行     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.users.nosequential.bpmn"})    public void testForUserCreateByUsersNoSequential() throws Exception {        Map<String, Object> variables = new HashMap<String, Object>();        List<String> users = Arrays.asList("user1", "user2", "user3");        variables.put("users", users);        runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask", variables);        for (String userId : users) {            assertEquals(1, taskService.createTaskQuery().taskAssignee(userId).count());        }    }    /**     * 用户任务多实例，通过用户数量决定实例个数--顺序     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.users.sequential.bpmn"})    public void testForUserCreateByUsersSequential() throws Exception {        Map<String, Object> variables = new HashMap<String, Object>();        List<String> users = Arrays.asList("user1", "user2", "user3");        variables.put("users", users);        runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask", variables);        for (String userId : users) {            Task task = taskService.createTaskQuery().taskAssignee(userId).singleResult();            taskService.complete(task.getId());        }    }    /**     * 用户任务多实例，按照任务完成的百分比比率决定是否提前结束流程     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.users.sequential.with.complete.conditon.bpmn"})    public void testForUserCreateByUsersSequentialWithCompleteCondition() throws Exception {        Map<String, Object> variables = new HashMap<String, Object>();        List<String> users = Arrays.asList("user1", "user2", "user3");        variables.put("users", users);        variables.put("rate", 0.6d);        runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask", variables);        Task task = taskService.createTaskQuery().taskAssignee("user1").singleResult();        taskService.complete(task.getId());        task = taskService.createTaskQuery().taskAssignee("user2").singleResult();        taskService.complete(task.getId());        long count = historyService.createHistoricProcessInstanceQuery().finished().count();        assertEquals(1, count);    }    /**     * 用户任务多实例，按照任务完成的百分比比率决定是否提前结束流程     */    @Test    @Deployment(resources = {"diagrams/chapter9/testMultiInstanceForUserTask.exception.bpmn"})    public void testForUserCreateByUsersException() throws Exception {        Map<String, Object> variables = new HashMap<String, Object>();        List<String> users = Arrays.asList("user1", "user2", "user3");        variables.put("users", users);        runtimeService.startProcessInstanceByKey("testMultiInstanceForUserTask", variables);        Task task = taskService.createTaskQuery().taskAssignee("user1").singleResult();        taskService.complete(task.getId());        task = taskService.createTaskQuery().taskAssignee("user2").singleResult();        taskService.complete(task.getId());        task = taskService.createTaskQuery().taskAssignee("user3").singleResult();        taskService.complete(task.getId());        List<Task> list = taskService.createTaskQuery().list();        for (Task task2 : list) {            System.out.println("============" + task2.getName());        }    }}