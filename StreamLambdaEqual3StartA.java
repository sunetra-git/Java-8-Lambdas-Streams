import java.util.stream.Collectors;
import java.util.*;
public class StreamLambdaEqual3StartA {
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> entireList = new ArrayList<String>();
		int size;
		System.out.println("Please enter size of list");
		size=scanner.nextInt();
		scanner.nextLine();
		for(int i=0 ; i < size ; i++){
			System.out.println("Please enter Strings "+ (1+i));
                        entireList.add(scanner.nextLine());
		}
		List<String> Alist = entireList.stream().filter(x -> x.startsWith("a") && x.length() == 3).collect(Collectors.toList());
		System.out.println("The Strings which start with letter a and have exactly 3 letters: " + Alist + "\n");
	}
}
