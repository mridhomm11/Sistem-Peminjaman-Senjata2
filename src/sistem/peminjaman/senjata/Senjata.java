/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.peminjaman.senjata;

/**
 *
 * @author Asus
 */
public class Senjata {
    private String Jenis;
    private NoSenjata nosenjata;
    
     void setJenisSenjata (String Jenis)throws Exception{
        if(Jenis.equalsIgnoreCase("SMG")|| Jenis.equalsIgnoreCase("Rifle")
        ||Jenis.equalsIgnoreCase("Laras Panjang")||Jenis.equalsIgnoreCase("Pistol")){
          this.Jenis = Jenis;  
        } else {
            throw new Exception("Hanya ada SMG, Rifle, Laras Panjang dan Pistol");
        }
    }
    String getJenisSenjata(){
        return Jenis;
}
     void setNoSenjata (NoSenjata nosenjata){
        this.nosenjata =nosenjata;
    }
    NoSenjata getNoSenjata(){
        return nosenjata;
   
}
}
