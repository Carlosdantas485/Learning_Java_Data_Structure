
public class Main {

	public static void main(String[] args) {
	

		int nota1 = 1;
		int nota2 = 5;
		int result = 0;
		
		int real1 = 0;
		int real5 = 0;
		
		int value = 21;

		for(int i = 0; i < value; i++) {
			if(nota2 + result <= value ) {
				result+=nota2;
				real1++;
				
			}else {
				real5++;
				result+=nota1;
			}
		}
		
		System.out.println(real1);
		System.out.println(real5);
	
	}

}
