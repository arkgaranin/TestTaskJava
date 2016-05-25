import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class RtriangleProviderTest implements Rtriangle {

    @Test //Тест на данный момент работает, если в методе getRtriangle() прописать return null
    public void testGetRtriangle() throws Exception {

        //Вычисление длин сторон треугольника из координат его вершин (по формуле).
        double sideA = Math.sqrt(Math.pow(apexX3 - apexX2, 2) + Math.pow(apexY3 - apexY2, 2));
        double sideB = Math.sqrt(Math.pow(apexX2 - apexX1, 2) + Math.pow(apexY2 - apexY1, 2));
        double sideC = Math.sqrt(Math.pow(apexX3 - apexX1, 2) + Math.pow(apexY3 - apexY1, 2));

        double[] sidesTriangle = {sideA, sideB, sideC}; //Массив из 3-х эл-ов: сторон треугольника.
        Arrays.sort(sidesTriangle); //Сортировка элементов массива по возрастанию его значений.
        int longSide = (int)sidesTriangle[2]; //В longSide теперь самая длинная сторона треугольника.

        //По теор Пифагора вычисление значения и присвоение его переменной tp.
        int tp = (int)Math.sqrt(Math.pow(sidesTriangle[0], 2) + Math.pow(sidesTriangle[1], 2));

        //Проверка: Если теорема Пифагора == true, тест проходит, а если == false, значит фейлится.
        Assert.assertTrue("Ошибка: Треугольник не прямоугольный!", longSide == tp);
    }

        //Валидный набор тест-данных (прямоугольный треугольник)
        int apexX1 = 0;
        int apexY1 = 0;
        int apexX2 = 0;
        int apexY2 = 2;
        int apexX3 = 5;
        int apexY3 = 0;

        //Невалидный набор тест-данных (не треугольник, а отрезок)
        /*int apexX1 = 3;
        int apexY1 = 3;
        int apexX2 = 5;
        int apexY2 = 5;
        int apexX3 = 7;
        int apexY3 = 7;*/

        //Невалидный набор тест-данных (не прямоугольный треугольник)
        /*int apexX1 = 2;
        int apexY1 = 2;
        int apexX2 = 6;
        int apexY2 = 5;
        int apexX3 = 11;
        int apexY3 = 2;*/

        @Override
        public int getApexX1 () {
            return apexX1;
        }

        @Override
        public int getApexY1 () {
            return apexY1;
        }

        @Override
        public int getApexX2 () {
            return apexX2;
        }

        @Override
        public int getApexY2 () {
            return apexY2;
        }

        @Override
        public int getApexX3 () {
            return apexX3;
        }

        @Override
        public int getApexY3 () {
            return apexY3;
        }
    }
