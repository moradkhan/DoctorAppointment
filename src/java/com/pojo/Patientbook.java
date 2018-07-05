package com.pojo;
// Generated Feb 5, 2018 12:41:58 AM by Hibernate Tools 4.3.1


import com.dao.PatientbookDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 * Patientbook generated by hbm2java
 */
@ManagedBean(name = "book")
public class Patientbook  implements java.io.Serializable {


     private int appointId;
     private String category;
     private String type;
     private Date bdate;
     private String time;
     private Integer patientId;
     private String doctorName;

    public Patientbook() {
    }

	
    public Patientbook(int appointId) {
        this.appointId = appointId;
    }
    public Patientbook(int appointId, String category, String type, Date bdate, String time, Integer patientId, String doctorName) {
       this.appointId = appointId;
       this.category = category;
       this.type = type;
       this.bdate = bdate;
       this.time = time;
       this.patientId = patientId;
       this.doctorName = doctorName;
    }
   
    public int getAppointId() {
        return this.appointId;
    }
    
    public void setAppointId(int appointId) {
        this.appointId = appointId;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Date getBdate() {
        return this.bdate;
    }
    
    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public Integer getPatientId() {
        return this.patientId;
    }
    
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    public String getDoctorName() {
        return this.doctorName;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

public void doBook() {
        PatientbookDAO pb = new PatientbookDAO();
        pb.doSave(this);
    }

    public void doCancel() {
        PatientbookDAO pb = new PatientbookDAO();
        pb.doDelete(this);
    }
    private List<Integer> liId =new ArrayList<>();
    private List<Patientbook> showAllP=new ArrayList<>();

    public List<Integer> getLiId() {
         PatientbookDAO da = new PatientbookDAO();
        liId = da.shId();
        return liId;
    }
 
    public void setLiId(List<Integer> liId) {
        this.liId = liId;
    }

    public List<Patientbook> getShowAllP() {
        PatientbookDAO da = new PatientbookDAO();
        showAllP = da.showAll();
        return showAllP;
    }
 
    public void setShowAllP(List<Patientbook> showAll) {
        this.showAllP= showAll;
    }
    
    public void findaPatient(){
        PatientbookDAO da = new PatientbookDAO();
        Patientbook p=da.aPatientBook(appointId);
       this.appointId = p.appointId;
       this.category = p.category;
       this.type = p.type;
       this.bdate = p.bdate;
       this.time = p.time;
       this.patientId = p.patientId;
       this.doctorName = p.doctorName;
    }


}


