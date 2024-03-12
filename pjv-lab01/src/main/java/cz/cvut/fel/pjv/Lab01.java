package cz.cvut.fel.pjv;
import java.util.Locale;
import java.util.Scanner;
public class Lab01 {

   public void homework(String[] args) {
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);
       System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
       int operace = sc.nextInt();
       switch (operace) {
           case 1:
               System.out.println("Zadej scitanec: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double scitanecA = sc.nextDouble();
               System.out.println("Zadej scitanec: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double scitanecB = sc.nextDouble();
               System.out.println("Zadej pocet desetinnych mist: ");
               int decimalPoint = sc.nextInt();
               if (decimalPoint < 0) {
                   System.out.println("Chyba - musi byt zadane kladne cislo!");
                   sc.close();
                   break;
               }
               String formattedString = String.format(Locale.US, "%." + decimalPoint + "f + %." + decimalPoint + "f = %." + decimalPoint + "f\n", scitanecA, scitanecB, scitanecA + scitanecB);
               System.out.print(formattedString);
               sc.close();
               break;
           case 2:
               System.out.println("Zadej mensenec: ");
               if (!sc.hasNextDouble()) {
                     System.out.println("Chyba - musi byt zadane cislo!");
                     sc.close();
                     break;
               }
               double mensenecA = sc.nextDouble();
               System.out.println("Zadej mensitel: ");
               if (!sc.hasNextDouble()) {
                        System.out.println("Chyba - musi byt zadane cislo!");
                        sc.close();
                        break;
               }
               double mensenecB = sc.nextDouble();
               System.out.println("Zadej pocet desetinnych mist: ");
               int decimalPoint2 = sc.nextInt();
               if (decimalPoint2 < 0) {
                   System.out.println("Chyba - musi byt zadane kladne cislo!");
                   sc.close();
                   break;
               }
               String formattedString2 = String.format(Locale.US, "%." + decimalPoint2 + "f - %." + decimalPoint2 + "f = %." + decimalPoint2 + "f\n", mensenecA, mensenecB, mensenecA - mensenecB);
               System.out.print(formattedString2);
               sc.close();
               break;
           case 3:
               System.out.println("Zadej cinitel: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double cinitelA = sc.nextDouble();
               System.out.println("Zadej cinitel: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double cinitelB = sc.nextDouble();
               System.out.println("Zadej pocet desetinnych mist: ");
               int decimalPoint3 = sc.nextInt();
               if (decimalPoint3 < 0) {
                   System.out.println("Chyba - musi byt zadane kladne cislo!");
                   sc.close();
                   break;
               }
               String formattedString3 = String.format(Locale.US, "%." + decimalPoint3 + "f * %." + decimalPoint3 + "f = %." + decimalPoint3 + "f\n", cinitelA, cinitelB, cinitelA * cinitelB);
               System.out.print(formattedString3);
               sc.close();
               break;
           case 4:
               System.out.println("Zadej delenec: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double delenecA = sc.nextDouble();
               System.out.println("Zadej delitel: ");
               if (!sc.hasNextDouble()) {
                   System.out.println("Chyba - musi byt zadane cislo!");
                   sc.close();
                   break;
               }
               double delitelB = sc.nextDouble();
               if (delitelB == 0) {
                   System.out.println("Pokus o deleni nulou!");
                   sc.close();
                   break;
               }
               System.out.println("Zadej pocet desetinnych mist: ");
               int decimalPoint4 = sc.nextInt();
               if (decimalPoint4 < 0) {
                   System.out.println("Chyba - musi byt zadane kladne cislo!");
                   sc.close();
                   break;
               }
               String formattedString4 = String.format(Locale.US, "%." + decimalPoint4 + "f / %." + decimalPoint4 + "f = %." + decimalPoint4 + "f\n", delenecA, delitelB, delenecA / delitelB);
               System.out.print(formattedString4);
               sc.close();
               break;
           default:
               System.out.println("Chybna volba!");
               break;
       }
   }
}