package Tests;

import java.util.List;


public class KSCriterion {

    public static void forAnyDoubleSequence(List<Double> array) {
        double scale = Math.pow(10, 3);
        double maxP = 0;
        double maxM = 0;
        int size = array.size();

        for (int i = 0; i < size; i++) {
            if ((double) i / size - array.get(i) > maxP)
                maxP = (double) i / size - array.get(i);

            if ((array.get(i) - ((double) ((i - 1) / size))) > maxM)
                maxM = array.get(i) - ((double) ((i - 1) / size));

        }
        double KnP = Math.ceil((Math.sqrt(size) * maxP) * scale) / scale;
        double KnM = Math.ceil((Math.sqrt(size) * maxM) * scale) / scale;
        System.out.println("\nРезультат КС-Критерия: [Kn+ = " + KnP + ", Kn- = " + KnM + "]");
    }
}
