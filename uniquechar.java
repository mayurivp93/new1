

public class uniquechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="computer";
char [] ch=str1.toCharArray();
boolean flag=false;
for(int i=0;i<ch.length;i++)
{
	for(int j=i+1;j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			flag=true;
			break;
		}
	}
}
if(flag==false)
{
	System.out.println("The String is  Unique");
}
else
{
	System.out.println("The String is not Unique");
}
	}
}





