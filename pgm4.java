
public class pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="ineuron@ai";
 int cCount=0;
 int vCount=0;
int sCcount=0;
for(int i=0;i<s1.length();i++)
{
	
	 if((s1.charAt(i)=='a')||(s1.charAt(i)=='e')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u'))
	{
		vCount++;
	}
	 else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
	{
		
		cCount++;
	}
	else 
	{
		sCcount++;
	}
}

System.out.println("The no. of vCount is:"+ vCount);
System.out.println("The no. of cCount is:"+cCount);
System.out.println("The no. of scCount is:"+sCcount);
	}
}
