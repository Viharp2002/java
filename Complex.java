class First{
    int i,r;

    First(){
        i=0;
        r=0;
    }
    First(int ro,int io)
    {
       i = io;
       r = ro;
    }
    First add(First obj)
    {
        First temp = new First();
        temp.r = r + obj.r;
        temp.i = i + obj.i;
        return temp;
    }
    void disp()
    {
        System.out.println(r);
        System.out.println(i);
    }
}

public class Complex {
    public static void main(String args[]) {
        First obj1 = new First(1,2);
        First obj2 = new First(2,1);
        First obj3 = new First();
        obj3=obj1.add(obj2);
        obj3.disp();
    }
}
