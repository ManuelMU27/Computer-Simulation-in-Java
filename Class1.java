import java.util.Arrays;
public class Class1 {
	
	//This class generates a random number	
	private static int getRandom (int min, int max) {
		
		double r = ((Math.random() * (max - min)) + min);
		int i = (int) Math.round(r);
		return i;
	}
	
	public static void main(String[] args) {
		
		int rev;
		int infBeginningOfDay;
		
		//Array that stores all computers
		int[] arrComp = new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int numInf = 1;
		
		int numIte = 0;
		int newInf = 0;
		int cleaned = 0;
		System.out.println("Day      New Inf.       Cleaned      Inf. End of Day");
		System.out.println(numIte + "           0              0     " + "          " + numInf);
		while(numInf > 0) {
			
			numIte++;
			newInf = 0;
			infBeginningOfDay = numInf;
			for(int j = 0; j < infBeginningOfDay; j++) {
				
				for(int i = 0; i < arrComp.length; i++) {
				
					if(arrComp[i] == 0) {
					
						double inf = Math.random();
						if(inf <= 0.1) {
						
							arrComp[i] = 1;
							newInf++;
							numInf++;
						}
					}
				}
			}
			
			if(numInf < 5) {
				
				for(int i = 0; i < arrComp.length; i++) {
					
					arrComp[i] = 0;
				}
				numInf = 0;
				System.out.println(numIte + "           " + newInf + "              " + "ALL" + "               " + numInf + "           " + Arrays.toString(arrComp));
				System.out.println("All clean.");
				break;
			}
			cleaned = 0;
			while((cleaned < 5) && (numInf > 0)) {
				
				rev = getRandom(0, 19);
				if(arrComp[rev] == 1) {
					
					cleaned++;
					arrComp[rev] = 0;
				}
			}
			numInf = numInf - cleaned;
			System.out.println(numIte + "           " + newInf + "              " + cleaned + "               " + numInf + "           " + Arrays.toString(arrComp));
		}
	}
				
}


