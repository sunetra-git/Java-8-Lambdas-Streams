import java.util.*;
public class AverageCalculation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
	int size;
    System.out.println("Please enter size of list");
    size=scanner.nextInt();
	for(int i=0 ; i < size ; i++){
        System.out.println("Please enter interger "+ (1+i));
            list.add(scanner.nextInt());
    }
	list.stream() //
    .mapToInt(i -> i) //
    .average() //
    .ifPresent(avg -> System.out.println("Average found is " + avg));
    
  }
}
