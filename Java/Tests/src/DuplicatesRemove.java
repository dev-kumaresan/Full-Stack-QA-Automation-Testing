public class DuplicatesRemove
{
  public static void main(String [] args)
  {
     int a[] = {10,10,20,30,70,20,50};
     
     int j,temp;
     
     for(int i=0;i<a.length;i++)
     {
        for(j=i+1;j<a.length;j++)
        {
           if(a[i]>a[j])
           {
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
            }
         }
      }
      System.out.println("After removing : ");
      System.out.println(a[0]);
      for(int i=1;i<a.length;i++)
      {
         if(a[i] == a[i-1])
         {
			continue;
		}
		else
		{
		   System.out.println(a[i]);
		 }
		}
}
  }