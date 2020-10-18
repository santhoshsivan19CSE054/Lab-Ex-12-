package lbex12;

import java.util.Scanner;


public class maxrange {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={500,54,96,3,1236};
        m<Integer>obj1=new m<>(num);
        obj1.display();
        
       
    }
    
}
class m<T >
{
    T[] value;
    
    public m(T[] value)
    {
        this.value=value;
        
    }

    public void display()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range");
        System.out.println("Beginning limit:");
        int b=obj.nextInt();
        System.out.println("Ending limit:");
        int e=obj.nextInt();
        int ma=0;
        
        for(b=0;b<e;b++)
            {
                int w =Integer.parseInt(""+ value[b]);
                if(w>ma)
                {
                    ma=w;
                }
            }
             
        
        System.out.println("Maximum number in the range"+ma);
    }

}
[22:18, 10/18/2020] Aravinda Krishnan: package lab.ex.pkg12;

/**
 *
 * @author hp.pc
 */
public class oddint {
    public static void main(String[]args){
        
        Integer num[]={1,2,3,4,5,6};
        od<Integer>obj1=new od<>(num);
        obj1.display();
        
    }
    
}
class od<T >
{
    T[] value1;
    
    public od(T[] value1)
    {
        this.value1=value1;
        
    }
    int c=0;
    public void display()
    {
    for(int i=0; i<value1.length;i++)
    {
        int w =Integer.parseInt(""+ value1[i]);
        if(w%2!=0)
        {
            c++;
            
        }
            
    }
    System.out.println("number of odd numbers in the list : " + c);
    }
}