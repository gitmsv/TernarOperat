
package ternaroperat;


public class TernarOperat {
// application of a ternary operation;
    
    public static void main(String[] args) {
        int a;
        int b;
        
        a=10;
        b=a<0 ?-a:a; // get the absolute value of the variable;
        System.out.println("absolute value "+a+" equally (=) "+b);
        
        a=-10;
        b=a<0 ?-a:a; // get the absolute value of the variable;
        System.out.println("absolute value "+a+" equally (=) "+b);
           }
    
}
