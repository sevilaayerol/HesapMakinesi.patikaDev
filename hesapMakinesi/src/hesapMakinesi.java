import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		int select;
		double n1, n2;
		
		// De�erleri giriyoruz.
		Scanner input= new Scanner(System.in);
		System.out.print("1. say�y� giriniz: ");
		n1=input.nextInt();
		System.out.print("2. say�y� giriniz: ");
		n2=input.nextInt();
		
		//Secim yapacag�m�z islemi seciyoruz.
		System.out.println("1-Toplama\n2-C�karma\n3-Carpma\n4-Bolme");
		System.out.print("Se�iminiz: ");
		select=input.nextInt();
		
		//�slemleri yap�yoruz ve sonucu yazd�r�yoruz.
		switch(select) {
			case 1:
				System.out.println("Toplam: " + (n1+n2));
				break;
			case 2:
				System.out.println("C�karma: " + (n1-n2));
				break;
			case 3:
				System.out.println("Carpma: " + (n1*n2));
				break;
			case 4:
					if(n2!=0) {
					System.out.println("Bolme: " + (n1/n2));
					}
					else {
					System.out.println("Bir say� 0'a bolunemez.");
					}
				break;
			default:
				System.out.println("Yanl�s secim yaptiniz, tekrar deneyiniz..");
				break;
			
		}
		
		
		
	}

}
