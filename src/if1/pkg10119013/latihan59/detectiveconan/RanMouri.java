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


public class RanMouri extends DetectiveConan{
    
    private String namaAyah;
    private String profesiAyah;
    private String namaIbu;
    private String profesiIbu;
    private String tujuan;
    private String karakter;
    private String keahlian;
    
    public RanMouri(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getNamaAyah(){
        return namaAyah;
    }
    
    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }
    
    public String getProfesiAyah(){
        return profesiAyah;
    }
    
    public void setProfesiAyah(String profesiAyah){
        this.profesiAyah = profesiAyah;
    }
    
    public String getNamaIbu(){
        return namaIbu;
    }
    
    public void setNamaIbu(String namaIbu){
        this.namaIbu = namaIbu;
    }
    
    public String getProfesiIbu(){
        return profesiIbu;
    }
    
    public void setProfesiIbu(String profesiIbu){
        this.profesiIbu = profesiIbu;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getKeahlian(){
        return keahlian;
    }
    
    public void setKeahlian(String keahlian){
        this.keahlian = keahlian;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
