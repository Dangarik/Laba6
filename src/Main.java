public class Main {
    public static void main(String[] args) {
        double set1[] = {-1.4, -3.1, 5.4, 3.9, 2.2};
        double set3[] = {};

        printResults(set1);
        printResults(set3);
    }

    public static void printResults(double set[]) {
        int i = 0;
        int j = 0;
        try {
            checkproblem(set);
            System.out.println("Сортований масив:");
            for (i = 0; i < set.length - 1; i++) {
                int jMin = i;
                for (j = i + 1; j < set.length; j++) {
                    if (set[j] < set[jMin]) {
                        jMin = j;
                    }
                }

                if (jMin != i) {
                    swap(set, i, jMin);
                }
            }
            for (double num : set) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static void checkproblem(double set[]) {
        if (set == null) {
            throw new NullPointerException("Масив не може бути null.");
        }
        if (set.length == 0) {
            throw new IllegalArgumentException("Масив не може бути пустим.");
        }
    }

    public static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
