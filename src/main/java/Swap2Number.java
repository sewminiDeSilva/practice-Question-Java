public class Swap2Number {

    public static void main(String[] args) {
        //using third variable
        int a = 10;
        int b = 20;
        System.out.println("Using third variable");
        System.out.println("before swap:"+" a=" +a+" b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap:"+" a=" +a+" b="+b);
        System.out.println();



        //using + and-
        int c = 10;
        int d= 20;
        System.out.println("Using +and-");
        System.out.println("before swap:"+" c=" +c +" d="+d);
        int temp2 =c+d;
        c=temp2-c;
        d=temp2-d;
        System.out.println("After swap:"+" c=" +c+" d="+d);
        System.out.println();


        //using *
        int e = 10;
        int f= 20;
        System.out.println("Using *");
        System.out.println("before swap:"+" e=" +e +" f="+f);
        int temp3 =e*f;
        e=temp3/e;
        f=temp3/f;
        System.out.println("After swap:"+" e=" +e+" f="+f);


    }
}