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
class examData {
    private int SID,CID,EXR;
    private String EXD,CNA;
    
    public examData(int SID,int CID,String EXD,int EXR)
    {
      this.SID=SID;
      this.CID=CID;
      this.EXD=EXD;
      this.EXR=EXR;
    }
    public examData(String CNA,String EXD,int EXR)
    {

      this.CNA=CNA;
      this.EXD=EXD;
      this.EXR=EXR;
    }
    public examData(String CNA)
    {

      this.CNA=CNA;
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

    public String getEXD() {
        return EXD;
    }

    public int getEXR() {
        return EXR;
    }
    
}
