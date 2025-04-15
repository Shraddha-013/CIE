package Overloading;

public class Method_Overloading {
     int add(int a, int b) {
        int sum= a + b;
        System.out.println("Sum is: " + sum);
        return sum;
      }
      int add(int a,double b) {
     double sum= a + b;
        System.out.println("Sum is: " + sum);
        return (int) sum;
      }
      int add(int a, int b, int c) {
        int sum= a + b + c;
        System.out.println("Sum is: " + sum);
        return sum;
      }
        public static void main(String[] args) {
            Method_Overloading obj = new Method_Overloading();
            obj.add(1, 2);
            obj.add(1, 2.5);
            obj.add(1, 2, 3);
            System.out.println("In mater branch");
        }
}
