package lab6_var2_7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;



public class Main {
    public static void main(String[] args) {

        List<Segment> segments = new ArrayList<>();
        segments.add(new Segment(2, 4, 3, 5));
        segments.add(new Segment(1, 4, 4, 1));
        segments.add(new Segment(4, 4, 1, 5));

        TreeMap<Double, double[]> intersectionPointsWithMinAbscissa = new TreeMap<>();

        for (int i = 0; i < segments.size(); i++) {
            Segment s1 = segments.get(i);
            for (int j = i + 1; j < segments.size(); j++) {
                Segment s2 = segments.get(j);
                List<double[]> intersectionPoints = s1.getIntersectionPoints(s2);
                for (double[] point : intersectionPoints) {
                    double x = point[0];
                    double y = point[1];
                    intersectionPointsWithMinAbscissa.put(x, new double[]{x, y});
                    System.out.println("Точка пересечения: (" + x + ", " + y + ")");
                }
            }
        }

        if (!intersectionPointsWithMinAbscissa.isEmpty()) {
            double[] minPoint = intersectionPointsWithMinAbscissa.firstEntry().getValue();
            System.out.println("Точка пересечения с минимальной абциссой: (" + minPoint[0] + ", " + minPoint[1] + ")");
        } else {
            System.out.println("Нет точек пересечения");
        }
    }
}