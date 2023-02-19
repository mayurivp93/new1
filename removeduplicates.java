
public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabcdd";
		StringBuilder sb=new StringBuilder(s1);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				char c1=sb.charAt(i);
				char c2=sb.charAt(j);
				if(c1==c2)
				{
					sb.deleteCharAt(i);	
				}
;			}
		}
		System.out.println("The given string is:");
		System.out.println(s1);
		System.out.println("After removing duplicates the string is:");
		System.out.println(sb);
	}
}
		
		