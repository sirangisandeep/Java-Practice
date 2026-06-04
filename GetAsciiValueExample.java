class GetAsciiValueExample
{
    public static void main(String args[])
    {
        String s="sandeep";
        char [] ch = s.toCharArray();
        for(char c:ch)
        {
            System.out.println(c+"->"+(c-96));
        }
    }
}