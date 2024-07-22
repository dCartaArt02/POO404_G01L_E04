public class switch1
{
    public static void  main(String[]args)
    {
        int a=1;
        int b=1;
        char op='+';
        System.out.println("El resultado es :");
        switch (op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
            break;
            case'/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
