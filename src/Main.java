import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String yn;
		int number = 1;
		
		System.out.println("Press enter for next Prime");
		
		for(int x=0;x<number+2;x++){
			yn = scan.nextLine();
			if(yn != "N"){
				System.out.println(nextPrime(number));
				number = nextPrime(number)+1;
			}
			else
				x = number;
		}
	
		System.out.println("Thanks!");
		
	}
	
	public static boolean checkPrime(int x){// where x is the number being checked
		
		
		
		for(int y=2;y<(Math.sqrt(x)+1); y++){
			if(x==2)
				return true;
			else if(x%y==0)
				return false;
		}
		
		
		return true;
		
	}
	
	public static int nextPrime(int x){ //where x is the last prime number plus one
		
		
		for(int y=x;y>-1;y++){
			if(checkPrime(y))
				return(y);
		}
		return(1);
		
	}
}
