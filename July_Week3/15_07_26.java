public class Main {
    public static void main(String args[]) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.addNumbers(1, 2));
        System.out.println(m.addNumbers(1, 2, 3));

        ParentClass P = new ParentClass();
        P.OverridenFunction();
        ChildClass C = new ChildClass();
        C.OverridenFunction();
    }

    public static class MethodOverloading{
        static int addNumbers(int a, int b){
            return a + b;
        }
        static int addNumbers(int a, int b, int c){
            return a + b + c;
        }
    }

    public static class ParentClass{
        void OverridenFunction(){
            System.out.println("This is inside of the parent class");
        }
    }

    public static class ChildClass extends ParentClass{
        void OverridenFunction(){
            System.out.println("This is inside of the child class");
        }
    }
}
