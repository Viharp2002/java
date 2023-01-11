class First{
    int stack[];
    static int top;

    First(){
        stack = new int[10];
        top=-1; 
    }
    void push(int data){
        top++;
        stack[top] = data;
    }
    int pop()
    {
        int item = stack[top];
        top--;
        return item;
    }
    void disp()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }
}


public class Stack {
    public static void main(String args[]) {
        First obj = new First();
        // obj.push(1);
        // obj.push(2);
        // obj.push(3);
        // System.out.println("Popped: "+obj.pop());
        // obj.push(4);
        // obj.push(5);
        // obj.disp();

        int i = 0,num,flag;
        while(i<args.length)
        {
            flag=0;
            if(args[i].equals("push") == true)
            {
                try {
                    num = Integer.parseInt(args[i+1]);
                    flag=1;
                } catch (NumberFormatException e) {
                    System.out.println("Please provide number after push argument...");
                    flag = 0 ;
                }
                
                if(flag==0)
                    obj.push(num);
                i=i+2;
            }
            else if(args[i].equals("pop") == true){
               System.out.println("Popped: "+obj.pop());
               i=i+1;
            }
            else{
                obj.disp();
                i=i+1;
            }
        }
    }
}
