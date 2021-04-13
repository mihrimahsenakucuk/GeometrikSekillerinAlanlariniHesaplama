import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String islemler="İşlemler...\n"
                       +"1.Kare Alan Hesapla\n"
                       +"2.Üçgen Alan Hesapla\n"
                       +"3.Daire Alan Hesapla\n"
                       +"Çıkış : q";
        
        
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz);
            String sekil_turu= scanner.nextLine();
                               
            if(sekil_turu.equals("q")){
                System.out.println("Çıkış yapılıyor...);
                break;
          }
           else if(sekil_turu.equals("1"){
               System.out.println("Karenin kenarı: );
               int kenar= scanner.nextInt();  
               scanner.nextLine();                   
               
                sekil= new Kare("Kare1", kenar);
                sekil.alanHesapla();
           }
                                  
           else if(sekil_turu.equals("2"){
               System.out.println("Üçgenin kenarı: );
               ;                   
                              

                                  
               
               
                sekil= new ucgen("Üçgen1", kenar);
                sekil.alanHesapla();
           }                   
                   
        }
    }
}
