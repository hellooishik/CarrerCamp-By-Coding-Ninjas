package solution;
class main{
	

class A{
   A(){
        System.out.print("first ");
    }
}
class B extends A{
    B(){
        System.out.print("second ");
    }
}
class C extends B{
    C(){
        System.out.print("third ");
    }
}

    public static void main (String[] args) {
        C c=new C();
    }
}