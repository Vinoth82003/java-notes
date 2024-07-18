package Test;
import java.util.*;

public class Duplicate {
    public static void Remove(int[] a)
    {
        int count=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[j]!=-1)
                {
                    if(a[i]==a[j])
                    {
                        a[j]=-1;
                        count++;
                    }
                }
            }
        }System.out.println(Arrays.toString(a));
        int[] b= new int[a.length-count];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1)
            {
                b[j] =a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    int size=S.nextInt();
    int[] a = new int[size];
    for(int i=0;i<a.length;i++)
    {
        a[i] = S.nextInt();
    }System.out.println(Arrays.toString(a));
    Remove(a);

    
  }  
}
