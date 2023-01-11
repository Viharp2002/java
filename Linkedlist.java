class First{
    int data;
    First next;

    First(){}
    First(int v){
        data = v;
        next = null;
    }

    void append(First p)
    {
        First temp = this;

        while(temp.next !=null)
        {
            temp = temp.next;
        }
        temp.next = p;
    }
    void traversal()
    {
        First temp = this;

        while (temp!=null) {
            System.out.println(temp.data);
        }
    }
}

public class Linkedlist {
    public static void main(String args[]) {
        int i=0;

        First obj = new First();
        while(i<args.length)
        {
            if(args[i].equals("append") == true)
            {
                First p = new First(Integer.parseInt(args[i+1]));
                obj.append(p);
                i=i+2;
            }
            else
            {
                i++;
            }
            obj.traversal();
        }
    }
}
