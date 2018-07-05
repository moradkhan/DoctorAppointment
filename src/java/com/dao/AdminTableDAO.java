/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.AdminTable;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nasrin
 */
public class AdminTableDAO {

    public void doSave(AdminTable a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(a);
        s.getTransaction().commit();
        s.close();
    }
    public void doUp(AdminTable a) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(a);
        s.getTransaction().commit();
        s.close();
    }

    public AdminTable aAdmin(String aId, String aPass) {
        AdminTable p = null;
        List<AdminTable> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from AdminTable where aId=:a and aPass=:b");
        q.setString("a", aId);
        q.setString("b", aPass);
        list = q.list();
        try {
            if (list != null) {
                p = list.get(0);
            } else {
                p = null;
            }
        } catch (Exception e) {
            return p;
        }
        return p;
    }
    public AdminTable aDoctor(int dId, String dPass) {
        AdminTable p = null;
        List<AdminTable> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from AdminTable where dId=:a and dPass=:b");
        q.setInteger("a", dId);
        q.setString("b", dPass);
        list = q.list();
        try {
            if (list != null) {
                p = list.get(0);
            } else {
                p = null;
            }
        } catch (Exception e) {
            return p;
        }
        return p;
    }

    public List<AdminTable> showAll() {
        List<AdminTable> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from AdminTable");
        all = q.list();
        return all;
    }

    public List<Integer> shId() {
        List<Integer> aId = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("select dId from AdminTable");
        aId = q.list();
        return aId;
    }

    public AdminTable aDocReg(int dId) {
        AdminTable p = new AdminTable();
        List<AdminTable> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery(" from AdminTable where dId=" + dId);
        all = q.list();
        p = all.get(0);
        return p;
    }
}
