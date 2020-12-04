
import java.util.Scanner;


public class Main {
    private static Sarkıcılar sarkıcılar = new Sarkıcılar();//başka bir obje direkt oalrak classımızın içine alınmış oldu (composition)
    private static Scanner scn = new Scanner(System.in);
    public static void islemleri_bastır(){
        System.out.println("\t 0-islemleri görüntüle\n"
                + "\t 1-şarkıcıları görüntüle\n"
                + "\t 2-şarkıcı ekle\n"
                + "\t 3-şarkıcı güncelle\n"
                + "\t 4-şarkıcı sil\n"
                + "\t 5-şarkıcı ara\n"
                + "\t 6-uygulamadan çık\n");
    }
    public static void goruntule(){
        sarkıcılar.sarkicilari_bastir();
    }
    public static void sarkıcı_ekle(){
        System.out.println("eklemek istediğiniz sarkıcının ismi");
        String isim = scn.nextLine();
        sarkıcılar.sarkıcı_ekle(isim);
    }
    public static void sarkıcı_guncelle(){
        System.out.println("Güncellemek istediğiniz pozisyonu giriniz :");
        int pozisyon = scn.nextInt();
        scn.nextLine();
        String isim = scn.nextLine();
        sarkıcılar.sarkıcı_guncelle(isim, pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon :(1,2,3,vb..) :");
        int pozisyon = scn.nextInt();
        scn.nextLine();
        sarkıcılar.sarckıcı_sil(pozisyon-1);
    
    }
    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcının adını giriniz :");
        String isim = scn.nextLine();
        sarkıcılar.sarkıcı_ara(isim);
    }
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı uygulamasına Hoşgeldiniz.");
        islemleri_bastır();
        boolean cıkıs = false ;
        int islem ;
        while(!cıkıs){
            System.out.println("Bir işlem seçiniz :");
            islem = scn.nextInt();
            scn.nextLine();//risk 0
            switch(islem){
                case 0:
                    islemleri_bastır();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkıcı_ekle();
                    break;
                case 3:
                    sarkıcı_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cıkıs = true;
                    System.out.println("Uygulamadan çıkılıyor.");
                    break;
                    
            }
            
            
            
        }
    }
    
}
