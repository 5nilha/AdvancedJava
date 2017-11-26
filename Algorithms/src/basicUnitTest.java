/**
 * Created by fabioquintanilha on 8/20/17.
 */
public class basicUnitTest {


    public int max (int a, int b) {

        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    //Unit test

    void testMax() {
        int x = max(3, 7);

        if (x != 7) {
            System.out.println("Max of (3 , 7) gives " + x);
        }
        else {
            System.out.println(x);
        }
    }


        public static void main(String[] args) {
            new basicUnitTest().testMax();
        }



}
