import java.util.*;
class SegregateElements
{
 public static void main(String[] args)
 {
    int [] arr={4,13,7,18,22,39,89,56,12,9};

    ArrayList<Integer> odd_list=new ArrayList<Integer>();
    ArrayList<Integer> even_list=new ArrayList<Integer>();

    for(int ele:arr)
    {
        if(ele%2==0)
        {
            even_list.add(ele);
        }
        else
        {
            odd_list.add(ele);
        }
    }
    System.out.println("Even numbers are: "+even_list);
    System.out.println("Odd numbers are: "+odd_list);
 }   
}