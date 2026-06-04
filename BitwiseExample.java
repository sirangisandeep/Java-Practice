class BitwiseExample{
    public static void main(String[] args) {
     int a = 4,b=7;
     System.out.println("Before swap a is : " + a + " and b is : " + b);
      
      a=a+b;
      a=a-b;
      b=a-b;
     
     
     System.out.println("AND: " + (a & b));
    }
}