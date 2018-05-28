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
class teacherData {
    private int FID,FPHONE;
    private String FFN,FLN,CSN;
    
    public teacherData(int FID,int FPHONE,String FFN,String FLN,String CSN)
    {
      this.FID=FID;
      this.FPHONE=FPHONE;
      this.FFN=FFN;
      this.FLN=FLN;
      this.CSN=CSN;
    }
    public teacherData(int FID,int FPHONE,String FFN,String FLN)
    {
      this.FID=FID;
      this.FPHONE=FPHONE;
      this.FFN=FFN;
      this.FLN=FLN;
      this.CSN=CSN;
    }
    public int getFID(){
        return FID;
    }
    public int getFPHONE(){
        return FPHONE;
    }
    public String getFFN(){
        return FFN;
    }
    public String getFLN(){
        return FLN;
    }
    public String getCSN(){
        return CSN;
    }
}
