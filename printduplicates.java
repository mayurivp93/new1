
public class printduplicates {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1="programming";
			System.out.println("the string is:"+" "+ s1);
			System.out.println("duplicate charater are");
			char [] ch=s1.toCharArray();
			boolean flag=false;
				for(int i=0;i<s1.length();i++)
			{
				for(int j=i+1;j<s1.length();j++)
				{
					if(ch[i]==ch[j])
					{
					    
						System.out.print(ch[j]+" ");
					flag=true;
					break;
					}
					
					}
			}
				if(flag==false)
				{
					System.out.println("duplicate char not found");
				}
	         }	
		}

			

