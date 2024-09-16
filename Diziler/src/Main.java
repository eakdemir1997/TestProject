
public class Main {

	public static void main(String[] args) {
		
		/*int[] sayilar = new int[5];
		sayilar[0]= 10;
		sayilar[1]= 20;
		sayilar[2]= 30;
		sayilar[3]= 40;
		sayilar[4]= 50;
		
		
		for(int i = 0; i<5; i++) {
			System.out.println(sayilar[i]);
		}
		
		System.out.println("**********************");
		
		int[] sayilar2 = {3,5,7,9,11};
		
		for(int i=0 ;i<sayilar2.length;i++) {
			System.out.println(sayilar2[i]);
		}

		System.out.println("**********************");
		
		String[] kisiler = {"Erdinç","Merter","Musa"};
		System.out.println(kisiler[2]); */
		
		
		
		/*int[] dizi = {10,7,23,14};
		int[] diziTers = new int[4]; //14,23,7,10 
		
		for(int i=0; i<4;i++) {
			diziTers[i]=dizi[3-i];
		}
		
		
		for(int i=0 ;i<diziTers.length;i++) {
			System.out.println(diziTers[i]);
		} */
		
		int[] dizi = {10,7,23,35,6};
		int gecici;
		
		for(int i=0;i<dizi.length;i++) {
			for(int j=0;j<dizi.length-1;j++) {
				if(dizi[j]>dizi[j+1]) {
					gecici=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=gecici;
				}
			}
		}
		
		for(int i=0 ;i<dizi.length;i++) {
			System.out.println(dizi[i]);
		}
		
	}

}
