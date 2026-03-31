import java.util.*;
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the no of element in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	    }
		
		Set<Integer> st = new HashSet<>();
		for(int num : arr) {
			st.add(num);
		}
		int maxStreak =0;
		for(int num : arr) {
			if(!st.contains(num-1)) {
				int currNum=num;
				int currStreak=1;
				while(st.contains(currNum+1)) {
					currNum+=1;
					currStreak+=1;
				}
			maxStreak =Math.max(currStreak, maxStreak);
			}
		}
		
		System.out.print("The longest consecutive sequence is: "+maxStreak);

   }
}