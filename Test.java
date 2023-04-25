 class Test

{

    int i =10;

    public static void main(String[] args) {

       


        Test t = new Test();

        System.out.println(t.i);//valid

        t.m1();

    }

    public void m1()

    {

        System.out.println(i);//valid

    }


}
