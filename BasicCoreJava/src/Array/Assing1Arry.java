 package Array;

public class Assing1Arry {
          public static void main(String[] args) 
          {
			Assing1Arry obj= new Assing1Arry();
			//obj.reversArray();
			//obj.alterEle();
			//obj.greatestNo();
			//obj.leastNo();
			obj.eleRepeated();
        	  
		  }
	//6) Make an integer array. Write a for loop to print the integer array in reverse.
          public void reversArray()
          {
        	  int [] arr = {10,20,30,40,50,60,70,80,90,100};
        	  
        	  
        	  for (int i=9;i>=0;i--)
        	  {
        		 // System.out.println(i);
        		  System.out.println(arr[i]);
        	  }
          
          }
          
  //7) Print alternate elements of String array array
          public void alterEle()
          {
        	  String [] name= {"sonali","Pillu","Anu","Nilesh","ABC","XYZ","PQR"};
        	  for(int i=0; i<name.length;i++)
        	  {
        		  if(i%2==0)
        			  System.out.println(name[i]);
        	  }
          
          }
          
 //8) Find the greates number in a array
          public void greatestNo()
          {
        	 // int [] arr = {10,20,30,40,50,60,70,80,90,100};
        	  int [] arr = {90,40,30,20,50,70,80,60,10};
        	  int gts=arr[0];
        	  for (int i=0;i<arr.length;i++)
        	  {
        		 if (gts<=arr[i])
        			 gts=arr[i];
        	  }
        	  System.out.println("Greteast No is"+gts);
          }
          
  //9) Find the least number in a array  
          public void leastNo()
          {
        	  int [] arr = {90,40,30,20,50,70,80,60,10};
        	  int lst=arr[0];
        	  for (int i=0;i<arr.length;i++)
        	  {
        		 if (lst>=arr[i])
        			 lst=arr[i];
        	  }
        	  System.out.println("Least No is"+lst);  
          }
          
  //10) Suppose there is an integer array holding following elements:
  //        1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
          
          public void eleRepeated()
          {
        	  int [] arr={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
        	  
        	  /*int temp;
        	  for(int i=0; i<arr.length;i++)
        		    {for(int j=i;j<arr.length;j++)
        		    	{
        		    	   if(arr[i]>=arr[j])
        		    	
        		    	     {   temp=arr[i];
        		    	       arr[i]=arr[j];
        		    	       arr[j]=temp;
        		    	     }
        		    	}
        		    }
        	  
        	  for(int i=0; i<arr.length;i++)
        		  System.out.print(arr[i]+",");
        		  System.out.println();
        		  System.out.println(arr.length);
          for(int i=0;i<arr.length;)
          {
        	  int cnt=0;
        	  
        	  for(int j=i;j<arr.length;j++)
        	  { if (arr[i]==arr[j] )
        	        {cnt++;
        	        
        	          if( j==arr.length-1 )
        	          {
        	        	System.out.println(arr[i]+"- Repeated "+cnt);
        	        	i++;
        	        	break;
        	          }
        	        }
        	  else
        	  {// i=j;
                System.out.println(arr[i]+"- Repeated "+cnt+"times");
                
                
                i=j;
                break;
        	  }
        	  }
          }**/
        	  
        	  for(int i=0;i<arr.length;i++)
              {
            	  int cnt=0;
            	  
            	  for(int j=i;j<arr.length;j++)
            	  { if (arr[i]==arr[j] )
            	        cnt++;
            	  }
            	  
            	   boolean flag;
            	  for(int k=i-1;k>0;k--)
            		  {
	            		  if(arr[k]==arr[i])
	            		  { flag=false;
	            	          break;
	            		  }
            		  else
            			  flag=true;
            		  }
            	  if(flag)
            	  {
            	      System.out.println(arr[i]+"- Repeated "+cnt);
            	        	
            	  }
            }
            	 
        }
            
          }
        	 
           
