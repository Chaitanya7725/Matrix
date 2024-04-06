package easy;

import java.text.DecimalFormat;

public class CircleCoordinates {

    public static void main(String[] args) {
        int angle = 360;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for (int i = 1; i <= 10; i++)
            System.out.println(angle / i +" degree : ("+df.format(Math.sin(angle / i))+","+df.format(Math.cos(angle / i))+")");
    }

}
