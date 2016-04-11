/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ClassAnak extends ClassOrtu{
    
   // double hasil;
    
    
    public ClassAnak(){
    this.nama = getNama();
    this.quis = getQuis();
    this.uts = getUts();
    this.tgs = getTgs();
    this.uas = getUas();
    }    
    public ClassAnak(String nama,double quis,double uts,double tgs,double uas){
  setNama(nama);
  setQuis(quis);
  setTgs(tgs);
  setUts(uts);
  setUas(uas);
  
  }
    
   public void hitung(){
     
   akir=0.20*quis+0.25*tgs+0.25*uts+0.30*uas;
    
   setAkir(akir);
    }
   
      
     
    
 
}
