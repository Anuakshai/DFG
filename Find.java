import java.util.Scanner;

public class Find{
  
  
  public static void main(String[] args) {
      System.out.println("Enter 5 values:");
      Scanner s=new Scanner(System.in);
      int[] arr1=new int[5];
      for(int i=0;i<5;i++)
      {
        arr1[i]=s.nextInt();
      }
      System.out.println(findUniqueElement(arr1));
      s.close();
  }
    public static int findUniqueElement(int[] arr1)
    {
      
      for(int i=0;i<5;i++)
      {int count=0;
        for(int j=0;j<5;j++)
        {
            if(arr1[i]==arr1[j])
            {
              count++;
            }
        }
        if(count==2)
        {
            continue;
        }
        else {
            return arr1[i];
        }
      }
      return 0;
      
  }
  
}