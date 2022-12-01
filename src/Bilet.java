import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        int km;
        double perKm = 0.10;
        int age;
        int roundTrip;
        double totalPrice;
        double discountPrice = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.print("Mesafeyi Giriniz : ");
        km = input.nextInt();

        System.out.println("1 - Tek Yön");
        System.out.println("2 - Gidiş Dönüş");
        roundTrip = input.nextInt();

        if(age > 0 && km > 0) {
            if(roundTrip == 1 || roundTrip == 2) {
                totalPrice = km * perKm;
                if(age < 12) {
                    discountPrice = totalPrice - ((totalPrice * 50) / 100);
                }
                else if (age >= 12 && age <= 24) {
                    discountPrice = totalPrice - ((totalPrice * 10) / 100);
                }
                else if (age >= 65 ) {
                    discountPrice = totalPrice - ((totalPrice * 30) / 100);
                }

                if (roundTrip == 2) {
                    discountPrice = discountPrice - ((discountPrice * 20) / 100);
                    discountPrice *= 2;
                    totalPrice *= 2;
                }

                String trip = (roundTrip == 1 ? "Tek Yön" : "Gidiş-Dönüş");

                System.out.println("Mesafe : " + km + " KM");
                System.out.println("Yaş : " + age);
                System.out.println("Yolculuk : " + trip);
                System.out.println("Toplam Fiyat : " + totalPrice + " TL");
                System.out.println("İndirimli Fiyat : " + discountPrice + " TL");


            }
            else {
                System.out.println("Hatalı Giriş.");
            }
        }
        else {
            System.out.println("Hatalı Giriş Yaptınız.");
        }







    }
}
