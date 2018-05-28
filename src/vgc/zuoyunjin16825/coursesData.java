/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vgc.zuoyunjin16825;

/**
 *
 * @author ludwig
 */
class coursesData {
    private int BID,FID,CID;
    private String CSN,MON,TUES,WED,THUR,FRI,CNA;
    
    public coursesData(String CSN,int BID,String MON,String TUES,String WED,String THUR,String FRI)
    {
      this.BID=BID;
      this.CSN=CSN;
      this.MON=MON;
      this.TUES=TUES;
      this.WED=WED;
      this.THUR=THUR;
      this.FRI=FRI;

    }
    
    public coursesData(int CID,String CNA,int FID,int BID,String MON,String TUES,String WED,String THUR,String FRI)
    {
      this.BID=BID;
      this.CSN=CSN;
      this.MON=MON;
      this.TUES=TUES;
      this.WED=WED;
      this.THUR=THUR;
      this.FRI=FRI;
      this.CID=CID;
      this.CNA=CNA;
      this.FID=FID;

    }

    public int getFID() {
        return FID;
    }

    public int getCID() {
        return CID;
    }

    public String getCNA() {
        return CNA;
    }
    public int getBID(){
        return BID;
    }
    public String getCSN(){
        return CSN;
    }
    public String getMON(){
        return MON;
    }
    public String getTUES(){
        return TUES;
    }
    public String getWED(){
        return WED;
    }
    public String getTHUR(){
        return THUR;
    }
    public String getFRI(){
        return FRI;
    }
}
