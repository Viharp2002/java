class Factorialb {
    public int fact(int n)
    {
        int facto = 1;
        for (int i = 1;i <=n;i++) {
            facto = facto * i;
        }
        return facto;
    } 
}
public class Factorial{
   public static void main(String args[]) {
       int n = Integer.parseInt(args[0]);
       Factorialb obj = new Factorialb();
       int facto = obj.fact(n);
       System.out.println(facto);
   } 
}
