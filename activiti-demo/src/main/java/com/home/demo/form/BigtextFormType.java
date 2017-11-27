package com.home.demo.form;

import org.activiti.engine.impl.form.StringFormType;

/**
 * 大文本表单字段
 *
 * @author henryyan
 */
public class BigtextFormType extends StringFormType {

    @Override
    public String getName() {
        return "bigtext";
    }

}
