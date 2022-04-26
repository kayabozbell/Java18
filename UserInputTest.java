import java.util.Objects;
import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String realusername = "Kaya";
        String realpassword = "Mustafakaya57.";

        System.out.print("Lutfen kullanici adinizi giriniz: ");
        String kullaniciadi = scanner.next();
        System.out.print("Lutfen sifrenizi giriniz: ");
        String sifre = scanner.next();
        if (!Objects.equals(kullaniciadi, realusername)){          //kullanici adini kontrol ediyor.
            System.out.println("Girdiginiz kullanici adi hatalidir.");
        }
        else{           //Kullanici adi dogru oldugu durumda yapılacaklar kısmına giriş.
            if (Objects.equals(sifre, realpassword)){
                System.out.println("Bravo basarili bir sekilde giris yaptiniz.");
            }
            else{           //Girilen sifrenin farklı olması durumunda yapılması gerekenler.
                System.out.println("Girdiginiz sifre yanlistir. Sifrenizi sifirlamak ister misiniz? (evet/hayir) ");
                String select = scanner.next();
                if (select .equals("hayir")){            //secim hayirsa sonlandırmak gerekiyor.
                    System.out.println("Bir daha giris yapmayi deneyiniz.");
                }
                else if (select .equals("evet")){            //secim evetse yeni sifre almamız gerekiyor.
                    System.out.println("Yeni bir sifre olusturunuz: ");
                    String newpassword = scanner.next();
                    if (newpassword.equals(realpassword) || newpassword.equals(sifre)){            //yeni sifrenin gerçek sifremizle veya hatalı girdigimiz sifreyle aynı olmaması gerekiyor.
                        System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz. ");

                    }
                    else {          //tüm tehlikeli koşullardan kaçıldıgında şifremiz oluşturuluyor.
                        System.out.println("sifre olusturuldu.");
                        realpassword = newpassword;
                        System.out.println("Kullanici adi -" + realusername + "- olan hesabinizin sifresi -" + realpassword + "- olmustur.");
                    }
                }
                else {
                    System.out.println("Isleminizi aygilayamadik. Lutfen evet veya hayiri seciniz.");
                }
            }
        }
    }

}



