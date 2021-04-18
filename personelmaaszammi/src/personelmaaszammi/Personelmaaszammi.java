/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personelmaaszammi;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class Personelmaaszammi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sec;
        while(true)
        {
            Scanner deger = new Scanner(System.in);
            System.out.println("hesaplama yapmak için 1 e çıkmak ıçın 2 e tıkla");
            sec = deger.nextInt();
            if(sec == 2)
            {
                break;
            }
            else
            {
                System.out.println("Adınızı giriniz:");
                String personelAd = deger.next();
                System.out.println("Soyadınızı giriniz:");
                String personelSoyad = deger.next();
                System.out.println("Çocuk sayısını giriniz:");
                int kacCocuk = deger.nextInt();
                System.out.println("Maaşınızı giriniz:");
                double maas = deger.nextDouble();
                System.out.println("Kaç yıl sonra maaşınızın hesaplanmsaını istersiniz:");
                int yil = deger.nextInt();
                double sonuc = Personelmaaszammi.zam_hesapla(maas, kacCocuk);
                System.out.println(personelAd + " " + personelSoyad + " " + " Eski maaşı : " + maas + " " + " Yeni maaşı:" + sonuc + " " + " Zam:" + (sonuc - maas));
                yil_hesapla(yil,maas,kacCocuk);
            }
        }
    }
    
    public static double zam_hesapla(double maas, int kacCocuk){
	    if(maas < 1000)
            {
                return(maas +((maas*3)/100) + kacCocuk*42);
	    }
	    else if (maas < 2500 && maas > 1000)
            {
	        return(maas + ((maas*4)/100) + kacCocuk*42);
	    } 
	    else if (maas>2500)
            {
	        return(maas + ((maas*5)/100) + kacCocuk*42);
	    }  
            return 0;
	}
	public static void yil_hesapla(int yil,double maas,int kacCocuk){
	   for(int i = 1; i <= yil; i++) 
           {
               if(maas < 1000)
               {
                   maas = maas + ((maas*3)/100) + kacCocuk*42;
	       }
	       else if (maas < 2500 && maas > 1000)
               {
	           maas = maas +((maas*4)/100) + kacCocuk*42;
	       }
	       else if(maas>2500) {
	           maas = maas + ((maas*5)/100) + kacCocuk*42;
	       } 
	    }
	    System.out.println(yil+" sonraki maaşınız:"+maas);
        }
}
