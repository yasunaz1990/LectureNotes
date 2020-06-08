package lecture5array;

public class ArrayPractice {


    public static void main(String[] args) {

        // ============ CODE 1 ============ //
        // Part 1: create int array.
        int[] array = {0, 0, 0, 0, 0};

        // Part 2: assign first three elements.
        array[0] = 1;
        array[1] = 10;
        array[2] = 100;

        // Part 3: loop over elements.
        for (int i = 0; i < array.length; i++) {
            // Get value.
            int value = array[i];
            // Print value.
            System.out.println(value);
        }


        // ============ CODE 2 ============ //
        // Two input arrays.
        int[] array1 = {1, 3, 5};
        String[] array2 = {"frog", "toad", "squirrel"};

        // Array lengths.
        System.out.println(array1.length);
        System.out.println(array2.length);

        // First elements in each array.
        System.out.println(array1[0]);
        System.out.println(array2[0]);



        // ============ CODE 3 ============ //
        boolean[] values = { false, true, true, true };

        // Loop over array elements in reverse order.
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }


    }
}
