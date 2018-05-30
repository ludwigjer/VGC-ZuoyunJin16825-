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
class AssignmentsData {
    private int SID,CID,AMR;
    private String AMD,CNA;
    
    public AssignmentsData(int SID,int CID,String AMD,int AMR)
    {
      this.SID=SID;
      this.CID=CID;
      this.AMD=AMD;
      this.AMR=AMR;
    }
    public AssignmentsData(String CNA,String AMD,int AMR)
    {
      this.CNA=CNA;
      this.AMD=AMD;
      this.AMR=AMR;
    }

    public String getCNA() {
        return CNA;
    }
     public int getSID() {
        return SID;
    }

    public int getCID() {
        return CID;
    }

    public String getAMD() {
        return AMD;
    }

    public int getAMR() {
        return AMR;
    }
}
