public class ProgrammingPractice{
		int x,y;
	public ProgrammingPractice(){
		//1
/*		for (int i = 1; i <= 1000; i++){
			if (i%5==3){
				y++;
				x+=i;
			}
		}
		System.out.println("The average is: " + (double) x/y);
*/
		//2
/*		for (int r = 5; r > 0; r--){
			for(int c = 0; c < r; c++){
				System.out.print("*");
			}
			System.out.println();
		}
*/
		//3
/*		for (int r = 5; r >= 1; r--){
			for (int c = 5; c > r; c--){
				System.out.print(c);
				if (r==3 && c==4)
					System.out.print("*");
				if(r==1 && c==2)
					System.out.print("*");
			}
			System.out.println();
		}
*/
		//4
/*		x = (int)(Math.random()*20)+10;
		for (int i = 0; i < 15; i++){
			for (int y = 0; y <= x; y++){
				System.out.print("*");
				x = (int)(Math.random()*20)+10;
			}
			System.out.println();
		}
*/
		//5
/* 		for (int i = 1; i <= 10; i+=2){
			for (int k = 1; k <= i; k++){
				if (k==3 && i==3 || k==5 && i==5 || k==7 && i==7 || k==9 && i==9){
					x = 1;
					System.out.print(x);
				}
				else if (k==3 && i==5 || k==3 && i==7 || k==5 && i==7 || k==3 && i==9 || k==7 && i==9){
					x = 4;
					System.out.print(x + " ");
				}
				else if (k==4 && i==5 || k==6 && i==7 || k==8 && i==9){
					x = 2;
					System.out.print(x + " ");
				}
				else if (k==4 && i==7 || k==4 && i==9 || k==6 && i==9){
					x = 8;
					System.out.print(x + " ");
				}
				else if (k==5 && i==9){
					x = 16;
					System.out.print(x + " ");
				}
				else
					System.out.print(k + " ");
			}
			System.out.println();
*/
		//6
/* 		x = 0;
		for (int r = 0; r < 10; r++){
			for (int c = x; c < r; c++){
				System.out.print("*");
			}
			System.out.println(x);
			if(r%2==0)
				x++;
		}
*/
		//7
/*		x = 8;
		for (int i = 0; i < 5; i++){
			System.out.println(x + "12" + x + "4");
			x-=2;
		}
*/
		//8
/* 		x = 0;
		for (int i = 0; i < 20; i++){
			x = (int)(Math.random()*5)+(x + 1);
			System.out.print(x + " ");
		}
*/
		//9
/* 		int x = 2;
		int y = 1;
		int temp = 0;
		for (int i = 1; i <= 20; i++){
			System.out.print(x + " ");
			temp = x;
			x+=y;
			y = temp;
			if (i%5==0)
				System.out.println();
		}
*/
	}
	public static void main(String args[]){
		ProgrammingPractice app = new ProgrammingPractice();
	}
}