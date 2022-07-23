public class Main {
    public static void main(String[] args) {
        examples1();
        examples2();
        examples3();
        examples4();

    }

    public static void examples1() {
        int[] year = {1, 2, 3};  //1.Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.

        double[] force = new double[]{1.57, 7.654, 9.986}; //2.Массив, в котором можно хранить
        // три дробных числа – 1.57, 7.654, 9.986 –
        // сразу заполнив его значениями.
        int[] weight = new int[]{25, 50, 75, 36, 98, 45}; //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.
    }

    public static void examples2() {
        int[] year = {1, 2, 3};
        for (int i = 0; i < year.length - 1; i++) {
            System.out.print(year[i] + ", ");
        }
        System.out.println(year[year.length - 1] + "  ");

        double[] force = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < force.length - 1; i++) {
            System.out.print(force[i] + ", ");
        }
        System.out.println(force[force.length - 1] + "  ");

        int[] weight = new int[]{25, 50, 75, 36, 98, 45};
        for (int i = 0; i < weight.length - 1; i++) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[weight.length - 1]);
    }


    public static void examples3() {
        int[] year = {1, 2, 3};
        for (int i = year.length - 1; i > 0; i--) {
            System.out.print(year[i] + ", ");
        }
        System.out.println(year[0] + "  ");
        double[] force = new double[]{1.57, 7.654, 9.986};
        for (int i = force.length - 1; i > 0; i--) {
            System.out.print(force[i] + ", ");
        }
        System.out.println(force[0] + "  ");
        int[] weight = new int[]{25, 50, 75, 36, 98, 45};
        for (int i = weight.length - 1; i > 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(weight[0] + "  ");
    }

    public static void examples4() {
        int[] even = new int[]{17, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < even.length; i++) {
            if (even[i] % 2 == 0) {
                System.out.print(even[i] + "  ");
            } else {
                System.out.print(even[i] + 1 + "  ");
            }
        }
        System.out.println();
        System.out.println("Размер массива равен " + even.length + " ячеек");

    }
}

