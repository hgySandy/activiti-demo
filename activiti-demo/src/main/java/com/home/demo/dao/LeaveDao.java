package com.home.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.demo.entity.Leave;

/**
 * @author henryyan
 */
@Repository
public class LeaveDao {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 保存实体
     */
    public void save(Leave entity) {
        getSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {
        getSession().delete(get(id));
    }

    public Leave get(Long id) {
        return (Leave) getSession().get(Leave.class, id);
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

}
