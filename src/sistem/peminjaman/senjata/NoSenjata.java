
package sistem.peminjaman.senjata;

public class NoSenjata {
    private String kodeLemari, kodeJenis, kodeUrut;
    
    void SetKodeLemari (String kodeLemari) throws Exception{
        if (kodeLemari.length()>0&&kodeLemari.length()<3){
        this.kodeLemari = kodeLemari;
        }else {
            throw new Exception("Tidak bisa lebih dari dua huruf");
        }
    }
    String getKodeLemari(){
        return kodeLemari;
    }    
    
    void SetKodeJenis (String kodeJenis)throws Exception{
        if (kodeJenis.length()>0&&kodeJenis.length()<3){
        this.kodeJenis = kodeJenis;
        }else {
            throw new Exception("Tidak bisa lebih dari dua huruf");
        }
    }
    String getKodeJenis(){
        return kodeJenis;
    }   
    
    void SetKodeUrut (String kodeUrut) throws Exception {
        try{
            Integer.parseInt(kodeUrut);
        }
        catch (Exception e){
            throw new Exception("Harus berupa angka semua");
        }
        //if (nomor.length()>0&&nomor.length()<){
        //Integer.parseInt(nomor); // Harus Angka dengan Integer.parseInt, bila tidak akan error
            this.kodeUrut = kodeUrut;
    }   //}
    
    String getKodeUrut(){
        return kodeUrut;
    }   
}

