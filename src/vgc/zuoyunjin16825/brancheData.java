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
class brancheData {
     private int BID,BNO;
    private String BADD;
    
    public brancheData(int BID,String BADD,int BNO)
    {
      this.BID=BID;
      this.BADD=BADD;
      this.BNO=BNO;
    }
    public int getBID(){
        return BID;
    }
    public int getBNO(){
        return BNO;
    }
    public String getBADD(){
        return BADD;
    }
}
