
public class maxchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="FULL STACK JAVA DEVELOPER";
int [] ar=new int[256];
int maxcount=0;
char result=' '; 
for(int i=0;i<s1.length();i++)
{
	ar[s1.charAt(i)]++;
}
for(int i=0;i<s1.length();i++)
{
	if(maxcount<ar[s1.charAt(i)])
	{
		maxcount=ar[s1.charAt(i)];
		result=s1.charAt(i);
	}
}
System.out.println("maximum occurance of charater is:");
System.out.print(result);
System.out.print(maxcount);
	}

}