/**
 * Created by fabioquintanilha on 8/20/17.
 */
public class Rainfall {

     public static void main (String[] args){

        double sum = 0;

        double[] rainfall = new double [365];


        for (int i = 0; i < rainfall.length; i++) {
            rainfall[i] = 1 + i;

            sum += rainfall[i];

        }
       double avgRainfall = sum / rainfall.length;

        System.out.println(avgRainfall);
    }


}
