//Hessam Farhat, N20239030
import java.util.Scanner;

public class DrawShapes {
	
	
	public static void displayMenu() {                                   //burada menu sunuluyor ve gecerli bir sayi 1 den 6'ya kadar bir int deger girmemizi istiyor
		
        System.out.println("Seklinizi secin!"); 
        System.out.println("1. Ucgen"); 
        System.out.println("2. Ters Ucgen"); 
        System.out.println("3. Baklava Sekli"); 
        System.out.println("4. Kum Saati"); 
        System.out.println("5. Roket"); 
        System.out.println("6. Cik");
	}
	
	public static int readChoice(Scanner a) {                            //bu metotda menu'deki girilen sayi gecersiz sayi ise tekrardan girmemizi istiyor
		System.out.print("Opsiyon: ");
		int b = a.nextInt();
		
		while((b<1) || (b>6)) {
			Scanner keyboard2 = new Scanner(System.in);
			System.out.println("1 ile 6 arasinda bir opsiyon girin.");
			System.out.print("Opsiyon: ");
			b = keyboard2.nextInt();
			
			
		}	
		
		return b;
	}
	
	public static int readSize(Scanner a) {                               //bu metotda ucgen yuksekligini girmemizi isteyecek ve bu 3 ve 20 arasindaki bir int sayi olmasi lazim, aksi taktirde uyari mesaji gonderip gecerli sayiyi girmemizi isteyecek. 
		
		System.out.print("Ucgen Yuksekligi: ");
		int b = a.nextInt();
		
		while (b<3 || b>20) {
			System.out.println("3 ile 20 arasinda bir ucgen yuksekligi girin.");
			System.out.print("Ucgen Yuksekligi: ");
			Scanner keyboard3 = new Scanner(System.in);
			b = keyboard3.nextInt();
			
		}
		return b;
	}
	
	
	
	public static void drawTriangle(int h) {                                //bu metot yuksekligi (satir sayisi) h olan bir ucgen cizecek
		
		
		
		
		for (int i = 1; i <= h; i++) {
			  
            for (int j = 1; j <= (h-i); j++) { 
                System.out.print(" ");
            }
  
            for (int j = 1; j <= 2*i-1 ; j++) { 
                System.out.print("*");
            }
            
            System.out.println();
		}
		
	}
	
	
	
	public static void drawUpsideDownTriangle(int h) {                        //bu metot yuksekligi (satir sayisi) h olan bir ters ucgen cizecek
		
		
		
		 for(int i = h; i >= 1 ; i--) {	     
			 
	         for(int j=i; j < h; j++) {
	             System.out.print(" ");
	         }
	         
	         for(int j=1; j <= 2*i-1; j++){
	             System.out.print("*");
	         }
	         
	         System.out.println(" ");
	     }
	}
	
	public static void drawSquare(int s) {                            //bu metot kare cizecektir ve karenin boyutu ucgenin tabanin yildiz sayisi kadardir

        for (int i=1; i <= 2*s-1; i++) {
            for (int j=1; j <= 2*s-1; j++) {
                if ( j==1 || j == 2*s-1 || i==1 || i == 2*s-1 )   
                	
                    System.out.print("*");      
                
                else
                	
                    System.out.print(" ");
            }
            
            System.out.println();
        }
		

	}

	public static void ucgenCiz(Scanner a) {                  //ucgen metodunu cagirip satir sayisini (h) degerini girerek ucgeni ciziyor
		
		
		drawTriangle(readSize(a));
		

	}
	
	public static void tersUcgenCiz(Scanner a) {              //ters ucgen metodunu cagirip satir sayisini (h) degerini girerek ters ucgeni ciziyor
		
		
		drawUpsideDownTriangle(readSize(a));
		

	}
	
	public static void baklavaCiz(Scanner a) {              // ucgen ve ters ucgen metodunu cagirip satir sayisini (h) degerini girerek baklava ciziyor
		
		
		int b = readSize(a);
		drawTriangle(b);
		drawUpsideDownTriangle(b);
		

	}
	
	public static void kumSaatiCiz(Scanner a) {             //ters ucgen ve ucgen metodunu cagirip satir sayisini (h) degerini girerek kum saati ciziyor
		
		
		int b = readSize(a);
		drawUpsideDownTriangle(b);
		drawTriangle(b);
		

	}
	
	public static void roketCiz(Scanner a) {                //ucgen ve kare metodunu cagirip satir sayisini (h) degerini girerek roket ciziyor
		
		int b = readSize(a);
		drawTriangle(b);
		drawSquare(b);
		
	
	}
	
	public static void sayBye() {                           //bu metot programdan cikiyor
		
		System.out.println("Bye.");
		

	}
	
		public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int choice;
			do {
				displayMenu();
				choice = readChoice(keyboard);
				switch (choice) {
					case 1: ucgenCiz(keyboard); break;
					case 2: tersUcgenCiz(keyboard); break;
					case 3: baklavaCiz(keyboard); break;
					case 4: kumSaatiCiz(keyboard); break;
					case 5: roketCiz(keyboard); break;
					case 6: sayBye();
				}
			} while(choice != 6);
		}
				
}