import java.util.Arrays;
public class HelloWorld {

        public static void main(String[] args){

            System.out.println("Hello World!");
            int a = 1;
            a = a +1;
            a = a +2;

            System.out.println("a is " + a);

            a = a+3;

            a = a+4;

            System.out.println("a is "+ a);

            char c = '1';
            c++;
            System.out.println("c is "+ c);

            int[] counts = new int[10];
            int i;
            int[] x = {6,7,3,0,3,1,5,0,3,7};
            for (i = 0; i < x.length; i++) {
                System.out.println("x pre "+ x[i]);
                counts[x[i]] = counts[x[i]] +1; // counts[x[i]]++;
                System.out.println("x post "+ x[i]);

            }
            System.out.println(Arrays.toString(counts));

        }
}
