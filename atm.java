class B
{
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        int c=0;
     for(int i=1;i<=9;i++)
     {   if(i>=3)
        {
            c=a+b;
            a=b;
            b=c;
        }
        for(int j=1;j<=i;j++)
        {
            if(i<3)
            {
                if(i+j==2) {System.out.print(a);}
                else if(i+j==4){System.out.print(b);}
                else 
                System.out.print(" ");
            }
            else
            {
              if(i<=5)
              {
                if(i==j) { System.out.print(c);}
                else{System.out.print(" ");}
              }
              else{
                if (i+j==10) {
                  System.out.print(c);
                }
                else{
                  System.out.print(" ");
                }
              }
              
            }
    }
    System.out.println();
}
}
}