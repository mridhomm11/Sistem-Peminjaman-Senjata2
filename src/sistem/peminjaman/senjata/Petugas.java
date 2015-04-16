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
public class Petugas {

    private String id;
    private String nama2;
    
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

 
    public String getNama2() {
        return nama2;
    }

    public void setNama2(String nama2) throws Exception {
        for(char c : nama2.toCharArray()){  //Mengidentifikasi array dari karakter satu per satu
            if(Character.isDigit(c)){  //Mengecek c angka atau bukan?
                throw new Exception("Nama tidak boleh angka"); //Bila angka, maka akan di return (berhenti)
            }
        }
        this.nama2 = nama2;
    }
    
  
}