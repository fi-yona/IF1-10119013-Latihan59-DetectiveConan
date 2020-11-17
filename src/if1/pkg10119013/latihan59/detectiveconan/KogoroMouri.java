/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan59.detectiveconan;

/**
 *
 * @author Fiona Avila
 */


public class KogoroMouri extends DetectiveConan{
    
    private String namaAnak;
    private String namaIstri;
    private String profesiIstri;
    private String karakter;
    private String hobi;
    private String keahlian;
    private String ciriKhas;
    
    public KogoroMouri(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getNamaAnak(){
        return namaAnak;
    }
    
    public void setNamaAnak(String namaAnak){
        this.namaAnak = namaAnak;
    }
    
    public String getNamaIstri(){
        return namaIstri;
    }
    
    public void setNamaIstri(String namaIstri){
        this.namaIstri = namaIstri;
    }
    
    public String getProfesiIstri(){
        return profesiIstri;
    }
    
    public void setProfesiIstri(String profesiIstri){
        this.profesiIstri = profesiIstri;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public void setHobi(String hobi){
        this.hobi = hobi;
    }
    
    public String getKeahlian(){
        return keahlian;
    }
    
    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    
    public String getCiriKhas(){
        return ciriKhas;
    }
    
    public void setCiriKhas(String ciriKhas){
        this.ciriKhas = ciriKhas;
    }
    
    @Override
    public void setKeterangan (String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
