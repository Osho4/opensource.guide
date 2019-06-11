import java.util.*;
class missint
{
 static int pos=-1;
 public static void main(int args[])
 {
      int min; int j; int t;
       for(int k=0; k<args.length; k++)
        {
            min=k;
            for(j=k+1; j<args.length; j++)
            {
                if(args[j]<args[min])
                {
                    min=j;
                    if (args[min] < 0)
                    pos= min; 
                }
            }
            t= args[k];
            args[k]=args[min];
            args[min]=t;
        }
        
        System.out.println("the numbers in ascending order:");
        for(int i=0; i<args.length ; i++)
        System.out.print(args[i]+" ");
       
        int pm;int m;
     for( m=pos+1; m<args.length;  m++  )
     {
      
         if((args[m+1] - args[m]) >0)
         {
             pm= args[m]+1;
             System.out.println("Smallest integer is="+ pm);
             break;
            }
      }
    }
  }
