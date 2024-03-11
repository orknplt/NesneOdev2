public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Ogrenci[] ogrenciler = {
                new Ogrenci(0.0),
                new Ogrenci("Gökhan", "Bilgisayar Müh", 2023,0.0 ,102,324),
                new Ogrenci("Ayşe", "Makine Müh", 2015,0.0 ,103,258),
                new Ogrenci("Elif", "Elektrik-Elektronik Müh", 2017,1.98,104,152)
        };

        System.out.println("Öğrenci Bilgileri");
        for (int i = 0; i < ogrenciler.length; i++) {
            ganoCont(ogrenciler[i].getGano());
            System.out.println("OGR-" + (i+1) + " " + ogrenciler[i]+ " ");



        }
        for (int i = 1; i < ogrenciler.length; i++) {
            if (ogrenciler[i].harcHesapla()>0) {
                System.out.println(i+1+". Öğrencinin Ödeyeceği harc: "+ ogrenciler[i].harcHesapla());
            }

        }


    }
    public static void ganoCont (double gano) throws IllegalAccessException {
        if (gano<0 || gano>4){
            throw new IllegalAccessException("Geçerli bir gano giriniz!");
        }
    }
}
