public class InsertionSort implements Sorter {

    // public static void main(String[] args) {

    //     InsertionSort s = new InsertionSort();
    //     int[] testInput = { 1, 2, 3, 1 };
    //     s.sort(testInput);
    //     for(int i = 0; i < testInput.length; i++) {
    //         System.out.print(testInput[i] + ", ");
    //     }
    // }


    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");

        int n = input.length;
        for (int i = 1; i < n; i++) {
            int value = input[i];
            int hole = i;

            // insert the small values into the left 
            while (hole > 0 && input[hole-1] > value) {
                input[hole] = input[hole-1];
                hole = hole - 1;
            }
            input[hole] = value;
        }

    }
}
