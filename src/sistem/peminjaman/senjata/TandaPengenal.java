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
public class TandaPengenal {
    private String idTentara;
    private String nama;
    
    
    public String getIdTentara() {
        return idTentara;
    }

    public void setIdTentara(String idTentara) {
        this.idTentara = idTentara;
    }

 
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        for(char c : nama.toCharArray()){  //Mengidentifikasi array dari karakter satu per satu
            if(Character.isDigit(c)){  //Mengecek c angka atau bukan?
                throw new Exception("Nama tidak boleh angka"); //Bila angka, maka akan di return (berhenti)
            }
        }
        this.nama = nama;
    }
    
  
}
    

