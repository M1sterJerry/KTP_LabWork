import java.awt.geom.Rectangle2D;
// Создаем подкласс
public class Mandelbrot extends FractalGenerator{

    public static final int MAX_ITERATIONS = 2000;

    public void getInitialRange (Rectangle2D.Double range){
        // Устанавливаем начальный диапозон
        range.x = -2;
        range.y = -1.5;
        range.height =3;
        range.width = 3;
    }

    // Реализует итеративную функцию для фрактала
    public int numIterations(double x, double y) {
        double Re = x;
        double Im = y;
        int counter = 0;
        while ((counter < MAX_ITERATIONS)) {
            counter++;
            double Re2 = Re * Re - Im * Im + x;
            double Im2 = 2 * Re * Im + y;
            Re = Re2;
            Im = Im2;
            if ((Re * Re + Im * Im) > 4)
                break;
        }
        if (counter == MAX_ITERATIONS)
            return -1;
        return counter;
    }
}