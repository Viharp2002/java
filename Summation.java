public class Summation {
    public static void main(String args[]) {
        // int ar[] = new int[10];
int sum=0;
    for(int i=0;i<5;i++)
    {
          sum = sum + Integer.parseInt(args[i]); 
    }
    System.out.println(sum);
    }
}
