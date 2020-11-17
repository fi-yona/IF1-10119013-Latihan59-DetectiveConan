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


public class DetectiveConan {
    
    private String profesi;
    private String peran;
    private String status;
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String keterangan;
    
    public DetectiveConan(String nama, String profesi, String status, String peran,  int umur, String jenisKelamin){
        this.nama = nama;
        this.profesi = profesi;
        this.peran = peran;
        this.status = status;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getProfesi(){
        return profesi;
    }
    
    public void setProfesi(String profesi){
        this.profesi = profesi;
    }
    
    public String getPeran(){
        return peran;
    }
    
    public void setPeran(String peran){
        this.peran = peran;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public void tampilAtributSuper(){
        System.out.println(this.nama);
        System.out.println("Umur\t\t: " + this.umur + " tahun");
        System.out.println("Jenis kelamin\t: " + this.jenisKelamin);
        System.out.println("Profesi\t\t: " + this.profesi);
        System.out.println("Status\t\t: " + this.status);
        System.out.println("Peran\t\t: " + this.peran);
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
