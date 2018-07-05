/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Patientbook;
import com.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nasrin
 */
public class PatientbookDAO {

    public void doSave(Patientbook p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();
    }

    public void doDelete(Patientbook p) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(p);
        s.getTransaction().commit();
        s.close();
    }

    public List<Patientbook> showAll() {
        List<Patientbook> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Patientbook");
        all = q.list();
        return all;
    }

    public List<Integer> shId() {
        List<Integer> aId = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("select appointId from Patientbook");
        aId = q.list();
        return aId;
    }

    public Patientbook aPatientBook(int appointId) {
        Patientbook p = new Patientbook();
        List<Patientbook> all = new ArrayList<>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery(" from Patientbook where appointId=" + appointId);
        all = q.list();
        p = all.get(0);
        return p;
    }
}
