package com.pojo;
// Generated Feb 5, 2018 12:41:58 AM by Hibernate Tools 4.3.1



/**
 * DoctorTable generated by hbm2java
 */
public class DoctorTable  implements java.io.Serializable {


     private String doctorMob;
     private String note;

    public DoctorTable() {
    }

	
    public DoctorTable(String doctorMob) {
        this.doctorMob = doctorMob;
    }
    public DoctorTable(String doctorMob, String note) {
       this.doctorMob = doctorMob;
       this.note = note;
    }
   
    public String getDoctorMob() {
        return this.doctorMob;
    }
    
    public void setDoctorMob(String doctorMob) {
        this.doctorMob = doctorMob;
    }
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }




}

