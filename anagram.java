import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="tea";
String s2="eat";
char [] ch1=s1.toCharArray();
char [] ch2=s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(Arrays.equals(ch1, ch2))
{
	System.out.println("The String is Anagram");
	
}
else
{
	System.out.println("The String is not an Anagram");
}

	}

}
