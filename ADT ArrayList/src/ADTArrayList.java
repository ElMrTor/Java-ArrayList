import java.util.ArrayList;
import java.util.Scanner;

public class ADTArrayList {

	
	private ArrayList<Integer> adtAr;
	private Scanner sc;
	private int end = 0;
	
	public ADTArrayList() {
		
		adtAr = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		
		System.out.println("Choose request type: \n1 X To put X at the end of the arraylist\n2 Y To remove all Y from the arraylist\n3 To print size of arraylist\nOr press 4 to end.");
		
		while(end != 1) {
			switch(sc.nextInt()) {
			
				case 1:{
					adtAr.add(sc.nextInt());
					System.out.println(adtAr);
					break;
				}
				
				case 2:{
					int rem = sc.nextInt();
					
					while(adtAr.contains(rem)) {
						for(int i = 0; i < adtAr.size(); i++) {
							if(rem == adtAr.get(i)) {
								adtAr.remove(i);
							}
						}
					}
					System.out.println(adtAr);
					break;
				}
				
				case 3:{
					System.out.println("Size of arraylist is: " + adtAr.size());
					break;
				}
				
				case 4:{
					end = 1;
					System.out.println("Program has ended");
					break;
				}		
			}
		}
		
		
			
	}
	
	
	
	
}
