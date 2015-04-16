/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.peminjaman.senjata;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SistemPeminjamanSenjata {

    public static void main(String[] args) {
        
       Petugas petugas1= new Petugas();
       petugas1.setId("55412");
       try {
            petugas1.setNama2("Sersan Fikri");
        } catch (Exception ex) {
            Logger.getLogger(SistemPeminjamanSenjata.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       Senjata senjata1 = new Senjata();
       try {
            senjata1.setJenisSenjata("Pistol");
        }
        catch(Exception e){
            System.out.println("Terjadi error" + e.getMessage());
        }
          
       
       NoSenjata nosenjata1 = new NoSenjata();
       
       try {
            nosenjata1.SetKodeLemari("A");
        } catch (Exception ex) {
            Logger.getLogger(SistemPeminjamanSenjata.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       try {
            nosenjata1.SetKodeUrut("3567");
       }
       catch (Exception e){
            System.out.println(e.getMessage());
       }
       try {
           nosenjata1.SetKodeJenis("FN");
       } catch (Exception ex) {
            Logger.getLogger(SistemPeminjamanSenjata.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       senjata1.setNoSenjata(nosenjata1);
       
       TandaPengenal tandapengenal1 = new TandaPengenal();
       
       tandapengenal1.setIdTentara("30152");
       try {
           tandapengenal1.setNama("Kadet Idin");
       } catch (Exception ex) {
           Logger.getLogger(SistemPeminjamanSenjata.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       BuktiPeminjaman buktipeminjaman1= new BuktiPeminjaman();
       
       buktipeminjaman1.setKode("ABC123");
       buktipeminjaman1.setSenjata(senjata1);
       buktipeminjaman1.setPetugas(petugas1);
       buktipeminjaman1.setTandaPengenal(tandapengenal1);
       buktipeminjaman1.setDate(new Date());
       
       cetakBuktiPeminjaman(buktipeminjaman1);
        
       
       Peminjaman peminjaman1 = new Peminjaman();
       
       peminjaman1.setBuktiPeminjaman(buktipeminjaman1);
       peminjaman1.setPetugas(petugas1);
       peminjaman1.setDate(new Date());

    }
    
    static void cetakBuktiPeminjaman (BuktiPeminjaman buktipeminjaman){
       System.out.println("Kode Peminjaman :" + buktipeminjaman.getKode());
       System.out.println("ID Tentara :" + buktipeminjaman.getTandaPengenal().getIdTentara());
       System.out.println("Nama Tentara :" + buktipeminjaman.getTandaPengenal().getNama());
       System.out.println("Jenis Senjata :" + buktipeminjaman.getSenjata().getJenisSenjata());
       System.out.print("Kode Senjata :" + buktipeminjaman.getSenjata().getNoSenjata().getKodeLemari());
       System.out.print(buktipeminjaman.getSenjata().getNoSenjata().getKodeJenis());
       System.out.print(buktipeminjaman.getSenjata().getNoSenjata().getKodeUrut());
       System.out.println();
       System.out.println("Waktu Peminjaman:" + buktipeminjaman.getDate());
       System.out.println("ID Petugas :" + buktipeminjaman.getPetugas().getId());
       System.out.println("Nama Petugas :" + buktipeminjaman.getPetugas().getNama2());
       
        }
    
}
