/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

/**
 *
 * @ZuoyunJin16825
 */
class studentData {

    private int SID, SPHONE;
    private double FOWED;
    private String SFN, SLN, SADD, SED, SAT;

    public studentData(int SID, int SPHONE, String SFN, String SLN, String SADD, String SED) {
        this.SID = SID;
        this.SPHONE = SPHONE;
        this.SFN = SFN;
        this.SLN = SLN;
        this.SADD = SADD;
        this.SED = SED;
    }

    public studentData(int SID, int SPHONE, String SFN, String SLN, String SADD, String SED, double FOWED, String SAT) {
        this.SID = SID;
        this.SPHONE = SPHONE;
        this.SFN = SFN;
        this.SLN = SLN;
        this.SADD = SADD;
        this.SED = SED;
        this.SAT = SAT;
        this.FOWED = FOWED;

    }

    public studentData(int SID, String SAT) {
        this.SID = SID;
        this.SAT = SAT;

    }
    
    
    
    public studentData(String SFN, String SLN) {
        this.SFN = SFN;
        this.SLN = SLN;
    }

    public int getSID() {
        return SID;
    }

    public double getFOWED() {
        return FOWED;
    }

    public String getSAT() {
        return SAT;
    }

    public int getSPHONE() {
        return SPHONE;
    }

    public String getSFN() {
        return SFN;
    }

    public String getSLN() {
        return SLN;
    }

    public String getSADD() {
        return SADD;
    }

    public String getSED() {
        return SED;
    }

}
