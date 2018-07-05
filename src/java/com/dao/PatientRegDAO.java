/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.PatientReg;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nasrin
 */
public class PatientRegDAO {
    public void doSave(PatientReg p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();
    }
    public void doUp(PatientReg p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(p);
        s.getTransaction().commit();
        s.close();
    }
    
    public PatientReg aPatient(int id, String password) {
        PatientReg p = null;
        List<PatientReg> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from PatientReg where id=:a and password=:b");
        q.setInteger("a", id);
        q.setString("b", password);
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
    
    public List<PatientReg> showAll() {
        List<PatientReg> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from PatientReg");
        all = q.list();
        return all;
    }

    public List<Integer> shId() {
        List<Integer> aId = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("select id from PatientReg");
        aId = q.list();
        return aId;
    }

    public PatientReg aPatientReg(int id) {
        PatientReg p = new PatientReg();
        List<PatientReg> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery(" from PatientReg where id=" + id);
        all = q.list();
        p = all.get(0);
        return p;
    }
}
