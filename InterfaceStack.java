interface stack
{
    void push(int item);
    int pop();
}
class FixedStack implements stack
{
    final private int[] stk;
    private int tos;
    FixedStack(int size)
    {
        stk=new int[size];
        tos=-1;
    }
    public void push(int item)
    {
        if(tos==stk.length-1)
        {
            System.out.println("Stack Overflow");
        }
        else
            stk[++tos]=item;
    }
    public int pop()
    {
        if(tos<0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stk[tos--];
    }
}
class InterfaceStack {
    public static void main(String[] args)
    {
        FixedStack fs=new FixedStack(3);
        for(int i=0;i<3;i++) {
            fs.push(i);
        }
        System.out.println("Fixed length Stack Contents are.");
        for(int i=0;i<3;i++) {
            System.out.println(fs.pop());
        }
    }
}
