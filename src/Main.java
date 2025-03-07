//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mul obj=new Mul();
        int c=obj.Multiplication(5,8);
        System.out.println("MULTIPLICATION:"+c);
        Add obj1=new Add();
        int d=obj1.Addition(3,6);
        System.out.println("ADDITION:"+d);
        Sub obj2=new Sub();
        int e=obj2.Substraction(5,2);
        System.out.println("SUBSTRACTION:"+e);
        Div obj3=new Div();
        int f=obj3.Division(2,4);
        System.out.println("DIVISION:"+f);
    }
}