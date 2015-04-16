/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.peminjaman.senjata;

import java.util.Date;

public class Peminjaman {
 
    private BuktiPeminjaman buktipeminjaman;
    private Date date;
    private Petugas petugas;
   
    public BuktiPeminjaman getBuktiPeminjaman() {
        return buktipeminjaman;
    }

    public void setBuktiPeminjaman(BuktiPeminjaman buktipeminjaman) {
        this.buktipeminjaman = buktipeminjaman;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }
}
