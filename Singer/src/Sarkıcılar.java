
import java.util.ArrayList;


public class Sarkıcılar {
   // Source = MUSTAFA MURAT COŞKUN
    private ArrayList<String> sarkıcı_listesi = new ArrayList<>();
    //herhangi bir arrayliste sahip olmasına gerek yok
    public void sarkicilari_bastir() {
        
        System.out.println("Şarkıcı Listesinde " + sarkıcı_listesi.size() + " kadar şarkıcı var");
        
        for (int i = 0; i < sarkıcı_listesi.size();i++) {
            
            System.out.println((i+1) + ".Şarkıcı :" + sarkıcı_listesi.get(i));
            
        }
    }
    public void sarkıcı_ekle(String isim){
        sarkıcı_listesi.add(isim);
        System.out.println("Şarkıcı listesi Güncellendi .");
    }
    public void sarkıcı_guncelle(String yeni_isim,int pozisyon){
        sarkıcı_listesi.set(pozisyon, yeni_isim);
        System.out.println("Şarkıcı Listesi Güncellendi.");
        
    }
    public void sarkıcı_sil(String isim){
        System.out.println(isim+" adlı şarkıcı listeden çıkarıldı.");
        sarkıcı_listesi.remove(isim);
        
    }
    public void sarckıcı_sil(int pozisyon){
        //overloading
        String isim = sarkıcı_listesi.get(pozisyon);
        System.out.println(pozisyon+" nunda bulunan "+isim+"şarkıcı listeden çıkarıldı");
        sarkıcı_listesi.remove(pozisyon);
        
    }
    public void sarkıcı_ara(String sarkıcı_ismi){
        int pozisyon =sarkıcı_listesi.indexOf(sarkıcı_ismi);
        if(pozisyon>=0){
            System.out.println("Şarkıcı Bulundu.");
            System.out.println("Şarkıcı ismi : "+sarkıcı_ismi+" listenizdeki konumu ise = "+(pozisyon+1));
        }else{
            System.out.println("Şarkıcı Bulunamadı");
        }
    }
}
