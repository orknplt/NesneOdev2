public class Ogrenci {

    private String ad ;
    Ogrenci ogrenci;
    private String bolum;
    private double gano;
    private String ogrNo;
    private int girisyili;

    private double harc;


    public Ogrenci (String ad , String bolum){
        this.ad = ad;
        this.bolum = bolum;
    }
    public Ogrenci (Ogrenci ogrenci){
        this.ogrenci = ogrenci;
    }
    public Ogrenci (String ogrNo, double gano){
        this.ogrNo = ogrNo;
        this.gano = gano;
    }
    public Ogrenci(String ad, String bolum,  String ogrNo, double gano,int girisyili) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.ogrNo = ogrNo;
        this.girisyili= girisyili;

    }
    public Ogrenci (){

    }

    @Override
    public String toString() {
        return ad +" "+  bolum + " "+gano + " "+ ogrNo + " ";
    }
    public double harcHesapla (){
        int gecikmeYili = 2020 - girisyili;
        return Math.max(gecikmeYili * 480, 0);
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

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGirisyili() {
        return girisyili;
    }

    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }

}