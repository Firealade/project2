import java.util.Scanner;

public class Main{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("=== Not Ortalamasi Hesaplayici ===");
    System.out.print("Vize Notunuzu Giriniz: ");
    double vize = sc.nextDouble();

    System.out.print("Final Notunuzu Giriniz: ");
    double finalNotu = sc.nextDouble();

    double ortalama = (vize * 0.4) + (finalNotu * 0.6);
    System.out.println("Not Ortalamaniz: " + ortalama);

    sc.close();

    if(ortalama >= 50) {
        System.out.println("Tebrikler, dersten gectiniz!");
    } else {
        System.out.println("Maalesef, dersten kaldiniz.");
   }  

 }
}