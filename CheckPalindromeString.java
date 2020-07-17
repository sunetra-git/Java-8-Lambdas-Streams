import java.util.*;
public class CheckPalindromeString{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[]){
		int val;
		System.out.println("Enter the number of Strings from which you want to find out Palindrome String"); 
		val=input.nextInt();
		ArrayList<String> p= new ArrayList<String>();
		buildAL(p,val);
	}
	public static void buildAL(ArrayList<String> pword,int val){
		input.nextLine();
		for(int i=0;i<val;i++){
			System.out.println("Please enter String "+ (1+i));
			//if(i<(val-1))
				pword.add(input.nextLine());
			//else
				//pword.add(input.nextLine());
		}
		ArrayList<String> palindromes=new ArrayList<String>();
		for(int i=0;i<val;i++){
			palindromes.add(isPalindrome(pword.get(i)));
		}
		palindromes.removeAll(Collections.singleton(" "));
		System.out.println(palindromes);
	}
	static String isPalindrome(String word){
		StringBuffer newStr =new StringBuffer();
		for(int i = word.length()-1; i >= 0 ; i--) {
			newStr = newStr.append(word.charAt(i));
		}
		if(word.equalsIgnoreCase(newStr.toString())) {
			return word;
		} 
		else {
			return " ";
		}
	}
}