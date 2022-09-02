import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		int select;
		double n1, n2;
		
		// Deðerleri giriyoruz.
		Scanner input= new Scanner(System.in);
		System.out.print("1. sayýyý giriniz: ");
		n1=input.nextInt();
		System.out.print("2. sayýyý giriniz: ");
		n2=input.nextInt();
		
		//Secim yapacagýmýz islemi seciyoruz.
		System.out.println("1-Toplama\n2-Cýkarma\n3-Carpma\n4-Bolme");
		System.out.print("Seçiminiz: ");
		select=input.nextInt();
		
		//Ýslemleri yapýyoruz ve sonucu yazdýrýyoruz.
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (n1+n2));
				break;
			case 2:
				System.out.println("Cýkarma: " + (n1-n2));
				break;
			case 3:
				System.out.println("Carpma: " + (n1*n2));
				break;
			case 4:
					if(n2!=0) {
					System.out.println("Bolme: " + (n1/n2));
					}
					else {
					System.out.println("Bir sayý 0'a bolunemez.");
					}
				break;
			default:
				System.out.println("Yanlýs secim yaptiniz, tekrar deneyiniz..");
				break;
			
		}
		
		
		
	}

}
