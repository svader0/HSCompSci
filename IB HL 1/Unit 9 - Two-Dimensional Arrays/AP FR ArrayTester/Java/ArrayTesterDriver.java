
public class ArrayTesterDriver {
    public static void main(String[] args) {
        int[][] arr2D = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };

        int[] result = ArrayTester.getColumn(arr2D, 1);

        System.out.println("/***************************************/");
        System.out.println("              Test Part(a)");
        System.out.println("/***************************************/");
        System.out.print("{");
        int count = 0;
        for (int num : result) {
            if (count == result.length - 1)
                System.out.print(num);
            else
                System.out.print(num + ", ");

            count++;
        }
        System.out.println("}\n");

        System.out.println("/***************************************/");
        System.out.println("              Test Part(b)");
        System.out.println("/***************************************/");

        int[][] ex1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

        int[][] ex2 = { { 10, 30, 20, 0 }, { 0, 20, 30, 10 }, { 30, 0, 10, 20 }, { 20, 10, 0, 30 } };

        int[][] ex3 = { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 2 } };

        int[][] ex4 = { { 1, 2, 3 }, { 3, 1, 2 }, { 7, 8, 9 } };

        int[][] ex5 = { { 1, 2 }, { 1, 2 } };

        System.out.println("result = " + ArrayTester.isLatin(ex1));
        System.out.println("result = " + ArrayTester.isLatin(ex2));
        System.out.println("result = " + ArrayTester.isLatin(ex3));
        System.out.println("result = " + ArrayTester.isLatin(ex4));
        System.out.println("result = " + ArrayTester.isLatin(ex5));

    }
}
