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


public class Main {

    public static void main(String[] args) {
        //Judul
        System.out.println("KARAKTER-KARAKTER DETECTIVE CONAN");
        System.out.println("     Penulis : Gosho Aoyama");
        System.out.println("\t   Since 1994");
        System.out.println();
        
        
        //Conan Edogawa
        ConanEdogawa ce = new ConanEdogawa("Conan Edogawa","Detektif Cilik, Siswa SMA yang menyamar jadi siswa SD","Lajang","Protagonis",7,"Laki-laki");
        ce.setNamaAsli("Shinichi Kudo");
        ce.setUmurAsli(17);
        ce.setNamaAyah("Yusaku Kudo");
        ce.setProfesiAyah("Penulis novel misteri terkenal (terutama novel detektif)");
        ce.setNamaIbu("Yukiko Kudo");
        ce.setProfesiIbu("Ibu rumah tangga, mantan aktris");
        ce.setKarakter("Imut dan lucu(saat menjadi kecil)");
        ce.setCiriKhas("Sering mengucapkan 'Ah-re-re?!'(Lho?!)");
        ce.tampilAtributSuper();
        System.out.println("Nama asli\t: " + ce.getNamaAsli());
        System.out.println("Umur asli\t: " + ce.getUmurAsli() + " tahun");
        System.out.println("Nama Ayah\t: " + ce.getNamaAyah());
        System.out.println("Profesi Ayah\t: " + ce.getProfesiAyah());
        System.out.println("Nama Ibu\t: " + ce.getNamaIbu());
        System.out.println("Profesi Ibu\t: " + ce.getProfesiIbu());
        System.out.println("Karakter\t: " + ce.getKarakter());
        System.out.println("Ciri khas\t: " + ce.getCiriKhas());
        ce.tampilKeterangan("Tubuhnya berubah menjadi kecil karena dipaksa meminum racun\n" +
                        "\t\t  yang diberikan oleh Gin dan Vodka setelah terpergok saat\n" +
                        "\t\t  menginvestigasi Gin dan Vodka");
        System.out.println();
        
        //Kazuha Toyama
        KazuhaToyama kt = new KazuhaToyama("Kazuha Toyama","Murid Akademi Kaihou, Praktisi Aikido","Lajang (Teman Tapi Mesra(TTM) Heiji Hattori)","Protagonis",17,"Perempuan");
        kt.setNamaAyah("Ginshiro Toyama");
        kt.setProfesiAyah("Komisaris Kepolisian Osaka");
        kt.setKarakter("Takut pada hantu, tidak pernah menyatakan perasaan sukanya,\n" + 
                        "\t\t  dan percaya pada takhayul dan jimat");
        kt.setKeahlian("Aikido");
        kt.tampilAtributSuper();
        System.out.println("Nama Ayah\t: " + kt.getNamaAyah());
        System.out.println("Profesi Ayah\t: " + kt.getProfesiAyah());
        System.out.println("Karakter\t: " + kt.getKarakter());
        kt.tampilKeterangan("Awalnya muncul disebabkan oleh kecemburuannya pada Conan,\n" +
                        "\t\t  yang dia kira adalah seorang perempuan yang mendekati\n" +
                        "\t\t  Heiji Hattori");
        System.out.println();
        
        
        //Heiji Hattori
        HeijiHattori hh = new HeijiHattori("Heiji Hattori", "Siswa SMA, Praktisi Kendo, dan Detektif", "Lajang (Teman Tapi Mesra (TTM) Kazuha Toyama)", "Protagonis", 17, "Laki-laki");
        hh.setHobi("Ellery Queen");
        hh.setKeahlian("Kendo, keterampilan detektif, kemampuan mengingat, dan atletik");
        hh.setCiriKhas("Berkuliat gelap");
        hh.tampilAtributSuper();
        System.out.println("Penulis favorit\t: " + hh.getHobi());
        System.out.println("Keahlian\t: " + hh.getKeahlian());
        System.out.println("Ciri khas\t: " + hh.getCiriKhas());
        hh.tampilKeterangan("Sering membantu Conan dalam menyembunyikan identitas aslinya.\n" +
                        "\t\t  Walaupun berteman dekat dengan Conan, tetapi kompetitif dalam\n" +
                        "\t\t  menyelidiki kasus dan sering menganggap jika Conan(Shinichi)\n" +
                        "\t\t  adalah rivalnya.");
        System.out.println();
        
        //Sonoki Suzuki
        SonokiSuzuki ss = new SonokiSuzuki("Sonoki Suzuki", "Siswa SMA Teitan", "Kekasih Makoto Kyogoku", "Protagonis", 17, "Perempuan");
        ss.setNamaAyah("Shiro Suzuki");
        ss.setNamaIbu("Tomoko Suzuki");
        ss.setProfesiAyah("Pemilik perusahaan besar");
        ss.setProfesiIbu("Ibu rumah tangga");
        ss.setKarakter("- Keluarga kaya dan status sosial tinggi\n" +
                        "\t\t  - Centil\n" +
                        "\t\t  - Suka mencari perhatian remaja laki-laki\n" + 
                        "\t\t  - Agresif");
        ss.tampilAtributSuper();
        System.out.println("Nama Ayah\t: " + ss.getNamaAyah());
        System.out.println("Profesi Ayah\t: " + ss.getProfesiAyah());
        System.out.println("Nama Ibu\t: " + ss.getNamaIbu());
        System.out.println("Profesi Ibu\t: " + ss.getProfesiIbu());
        System.out.println("Karakter\t: " + ss.getKarakter());
        ss.tampilKeterangan("Bersahabat dekat dengan Ran Mouri. Sonoki sering disetrum oleh\n" +
                            "\t\t  Conan dengan Jam Senjata Setrum agar Sonoki tertidur. Conan\n" +
                            "\t\t  lalu berpura-pura menjadi Sonoko untuk menangkap penjahat.");
        System.out.println();
        
        //Ran Mouri
        RanMouri rm = new RanMouri("Ran Mouri", "Siswa SMA Teitan", "Lajang (menyukai Shinichi Kudo)","Protagonis",17,"Perempuan");
        rm.setNamaAyah("Kogoro Mouri");
        rm.setProfesiAyah("Detektif swasta");
        rm.setNamaIbu("Eri Kisaki");
        rm.setProfesiIbu("Pengacara");
        rm.setTujuan("Ingin menyatukan Ayah dan Ibunya lagi yang telah berpisah sejak dia berumur\n" +
                        "\t\t  7 tahun.");
        rm.setKarakter("Berani, mandiri, bertanggung jawab, mudah menangis, dan takut terhadap Hantu");
        rm.setKeahlian("Memiliki keberuntungan delam berbagai hal, terampil dalam Karate, dan hebat\n" +
                        "\t\t  dalam mengurus rumah tangga");
        rm.tampilAtributSuper();
        System.out.println("Nama Ayah\t: " + rm.getNamaAyah());
        System.out.println("Profesi Ayah\t :" + rm.getProfesiAyah());
        System.out.println("Nama Ibu\t: " + rm.getNamaIbu());
        System.out.println("Profesi Ibu\t: " + rm.getProfesiIbu());
        System.out.println("Tujuan\t\t: " + rm.getTujuan());
        System.out.println("Karakter\t: " + rm.getKarakter());
        System.out.println("Keahlian\t: " + rm.getKeahlian());
        rm.tampilKeterangan("Dia berteman sejak kecil dengan Shinichi (Conan) dan dia menyukai Shinichi\n" +
                            "\t\t  sejak lama. Saat Shinichi menjadi Conan dia tinggal di rumah Ran\n" +
                            "\t\t  untuk membantu ayah Ran, Kogoro dalam menyelidiki kasus.");
        System.out.println();
        
        //Kogoro Mouri
        KogoroMouri km = new KogoroMouri("Kogoro Mouri", "Detektif swasta", "Menikah (berpisah)", "Tritagonis", 38, "Laki-laki");
        km.setNamaAnak("Ran Mouri");
        km.setNamaIstri("Eri Kisaki");
        km.setProfesiIstri("Pengacara");
        km.setKarakter("Bermalas-malasan, jorok, sering membuat komentar sarkastik, dan pecandu alkohol\n" +
                        "\t\t  & rokok.");
        km.setHobi("Fans dengan idol Yoko Okino, bertaruh pada pacuan kuda, bermain Mahjong, dan bermain\n" +
                    "\t\t  & menonton Bisbol.");
        km.setKeahlian("Ahli Judo dan hebat dalam menembak dengan pistol.");
        km.setCiriKhas("Tergila-gila dengan wanita cantik dan sering tertidur saat sedang memecahkan kasus");
        km.tampilAtributSuper();
        System.out.println("Nama Anak\t: " + km.getNamaAnak());
        System.out.println("Nama Istri\t: " + km.getNamaIstri());
        System.out.println("Profesi Istri\t: " + km.getProfesiIstri());
        System.out.println("Karakter\t: " + km.getKarakter());
        System.out.println("Hobi\t\t: " + km.getHobi());
        System.out.println("Keahlian\t: " + km.getKeahlian());
        System.out.println("Ciri khas\t: " + km.getCiriKhas());
        km.tampilKeterangan("Dia sering tertidur karena dibius oleh Conan dan kemudian Conan menggunakan\n" +
                            "\t\t  alat pengubah suara untuk meniru suara Kogoro.");
        System.out.println();
        
        //Eri Kisaki
        EriKisaki ek = new EriKisaki("Eri Kisaki", "Pengacara", "Menikah (berpisah)", "Tritagonis", 38, "Perempuan");
        ek.setNamaAnak("Ran Mouri");
        ek.setNamaSuami("Kogoro Mouri");
        ek.setProfesiSuami("Detektif swasta");
        ek.setHewanPeliharaan("Kucing jenis Russian Blue bernama Goro");
        ek.tampilAtributSuper();
        System.out.println("Nama Anak\t: " + ek.getNamaAnak());
        System.out.println("Nama Suami\t: " + ek.getNamaSuami());
        System.out.println("Profesi Suami\t: " + ek.getProfesiSuami());
        System.out.println("Hewan peliharaan: " + ek.getHewanPeliharaan());
        ek.tampilKeterangan("Dikenal sebagai 'Ratu Pengacara'. Meskipun hidup terpisah, tetapi di dalam\n" + 
                            "\t\t  diperlihatkan bahwa Eri sepertinya masih menggunakan cincin kawinnya.\n" +
                            "\t\t  Dia juga masih mencintai suaminya walaupun benci dengan kebiasaan buruk\n" +
                            "\t\t  suaminya.");
        System.out.println();
        
        //Hiroshi Agasa
        HiroshiAgasa ha = new HiroshiAgasa("Hiroshi Agasa", "Profesor", "Lajang", "Protagonis", 53, "Laki-laki");
        ha.setKeahlian("Ahli dalam membuat perangkat-perangkat");
        ha.setKendaraan("VW Beetle");
        ha.tampilAtributSuper();
        System.out.println("Keahlian\t: " + ha.getKeahlian());
        System.out.println("Kendaraan\t: " + ha.getKendaraan());
        ha.tampilKeterangan("Sering membantu Detektif Cilik untuk membuat alat-alat unik dan hebat dan sering\n" +
                            "\t\t  membawa mereka dengan mobilnya. Hiroshi menemukan Shiho Miyano di jalan\n" +
                            "\t\t  lalu mengadopsinya dan memberinya nama samaran 'Ai Haibara'.");
        System.out.println();
        
        //Genta Kojima
        GentaKojima gk = new GentaKojima("Genta Kojima", "Siswa SD Teitan, Detektif", "Lajang", "Protagonis", 7, "Laki-laki");
        gk.setNamaAyah("Genji Kojima");
        gk.setKarakter("Gemuk, besar, dan jago makan.");
        gk.setHobi("Makan, terutama Nasi Belut Bakar");
        gk.tampilAtributSuper();
        System.out.println("Nama Ayah\t: " + gk.getNamaAyah());
        System.out.println("Karakter\t: " + gk.getKarakter());
        System.out.println("Hobi\t\t: " + gk.getHobi());
        gk.tampilKeterangan("Awalnya dia adalah penindas, tetapi berubah menjadi baik kemudian.");
        System.out.println();
        
        
        //Mitsuhiko Tsuburaya
        MitsuhikoTsuburaya mt = new MitsuhikoTsuburaya("Mitsuhiko Tsuburaya", "Siswa SD Teitan, Detectif", "Lajang", "Protagonis", 7, "Laki-laki");
        mt.setKarakter("pintar dan pengetahuannya melebihi anak seumurannya");
        mt.setHobi("Menyukai teknologi");
        mt.tampilAtributSuper();
        System.out.println("Karakter\t: " + mt.getKarakter());
        System.out.println("Hobi\t\t: " + mt.getHobi());
        mt.tampilKeterangan("Dia sering cemburu pada kedekatan Ai dan Conan");
        System.out.println();
        
        
        //Ai Haibara
        AiHaibara ah = new AiHaibara("Ai Haibara","Detektif, mantan anggota Organisasi Hitam", "Lajang", "Protagonis", 7, "Perempuan");
        ah.setNamaAsli("Shiho Miyano");
        ah.setUmurAsli(18);
        ah.setNamaAyah("Atsushi Miyano (meninggal)");
        ah.setProfesiAyah("Ahli Biokimia, anggota Organisasi Hitam");
        ah.setNamaIbu("Elena Miyano (meninggal)");
        ah.setProfesiIbu("Ahli Biokimia, anggota Organisasi Hitam");
        ah.setKarakter("Sering sinis");
        ah.tampilAtributSuper();
        System.out.println("Nama asli\t: " + ah.getNamaAsli());
        System.out.println("Umur asli\t: " + ah.getUmurAsli() + " tahun");
        System.out.println("Nama Ayah\t: " + ah.getNamaAyah());
        System.out.println("Profesi Ayah\t: " + ah.getProfesiAyah());
        System.out.println("Nama Ibu\t: " + ah.getNamaIbu());
        System.out.println("Profesi Ibu\t: " + ah.getProfesiIbu());
        System.out.println("Karakter\t: " + ah.getKarakter());
        ah.tampilKeterangan("Dialah yang membuat obat APTX 4869 (yang mengecilkan tubuh Shinichi), tetapi dia\n" +
                            "\t\t  akhirnya juga ikut mengecil berkat obat tersebut.");
        System.out.println();
        
        //Ayumi Yoshida
        AyumiYoshida ay = new AyumiYoshida("Ayumi Yoshida", "Siswa SD Teitan, Detektif", "Lajang (menyukai Conan)", "Protagonis", 7, "Perempuan");
        ay.setKarakter("Baik hati, mudah tersenyum, dan menggunakan kata yang membuat suasana tenang");
        ay.tampilAtributSuper();
        System.out.println("Karakter\t: " + ay.getKarakter());
        ay.tampilKeterangan("Anggota Detektif Cilik perempuan pertama");
        
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
}
