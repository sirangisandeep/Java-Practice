class SumOfDigit
{
    public static void main(String args[])
    {
        int[] arr={54,93,12,65};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            while(temp>0)
            {
                int rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
                 System.out.println("The sum of digits is: " + sum);
            }
             //System.out.println("The sum of digits is: " + sum);
        }
        //System.out.println("The sum of digits is: " + sum);
    }
}