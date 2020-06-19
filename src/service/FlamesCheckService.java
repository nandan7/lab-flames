package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService {
	public char findFlames(String name1,String name2) {
		     int i,j,a,b;
		     a=name1.length();
		     b=name2.length();
		     for(i=0;i<a;i++) {
			   for(j=0;j<b;j++) {
				   if(name1.charAt(i)==name2.charAt(j)) {
					   name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "#");
					   name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "#");	          
				   }
			   }
			 
		   }
		     String result = name1 + name2;
			 result = result.replaceAll("#", "");
			 System.out.println(result);
			 System.out.println(result.length());
		     
			  StringBuffer flames1=new StringBuffer("flames");
			  String s4=new String();

			  int d=(a+b);


			  for(i=0;i<5;i++)
				{int n=-1,l=0,p=0;
					for(j=1;j<=d;j++)
					{
					n++;
					l++;

					if(n>flames1.length()-1)
					{
		
					if(l==d)
				      {
					    flames1.deleteCharAt(p);
						s4=flames1.substring(p,flames1.length());
					    flames1.delete(p,flames1.length());
						flames1.insert(0,s4);
						break;
					  }
					
					else {
						p++;
					    if(p==flames1.length())
					       {
							 p=0;
						   }
		                 }
					}
					   else {
						if(l==d)
					     {
							flames1.deleteCharAt(n);
							s4=flames1.substring(n,flames1.length());
							flames1.delete(n,flames1.length());
							flames1.insert(0,s4);
					    	break;
							}
						}
					}
				}

			  char result1=flames1.charAt(0);
			  return result1;
	  }
	}
			
	
