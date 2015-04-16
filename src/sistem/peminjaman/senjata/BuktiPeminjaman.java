/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.peminjaman.senjata;
import java.util.Date;
/**
 *
 * @author Asus
 */
public class BuktiPeminjaman {
    private String kode;
    private Senjata senjata;
    private Petugas petugas;
    private TandaPengenal tandapengenal;
    private Date date;
    
    void setKode (String kode){
        this.kode =kode;
    }
    String getKode(){
        return kode;
}

    void setSenjata (Senjata senjata){
        this.senjata =senjata;
    }
    Senjata getSenjata(){
        return senjata;
    }
    
    public Petugas getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

   
    public void setTandaPengenal(TandaPengenal tandapengenal) {
        this.tandapengenal = tandapengenal;
    }
    
    public TandaPengenal getTandaPengenal() {
        return tandapengenal;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
    

