public class Ogrenci {

    private String ad ;
    Ogrenci ogrenci;
    private String bolum;
    private double gano;

    private  int girisYili;
    private  int girisSirsai;
    private  int bolumKodu;
    private String ogrNo;

    public Ogrenci (String ad , String bolum){
        this.ad = ad;
        this.bolum = bolum;
    }
    public Ogrenci (Ogrenci ogrenci){
        this.ogrenci = ogrenci;
    }
    public Ogrenci (double gano){
        this.gano = gano;
    }
    public Ogrenci(String ad, String bolum, int girisyili, double gano,int bolumKodu,int girisSirsai) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili= girisyili;
        this.ogrNo = String.valueOf(girisyili) + String.valueOf(bolumKodu)+ String.valueOf(girisSirsai);
    }
    @Override
    public String toString() {
        return ad +" "+  bolum + " "+gano + " " + ogrNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }


    public int getGirisyili() {
        return girisYili;
    }

    public void setGirisyili(int girisyili) {
        this.girisYili = girisyili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public double harcHesapla (){
        // anlık yılı 2023 kabul ettim.
        int gecikmeYili = 2019 - girisYili;
        return Math.max(gecikmeYili * 480, 0);
    }



}
