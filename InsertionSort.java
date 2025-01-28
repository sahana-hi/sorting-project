public class InsertionSort implements Sorter {


    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");

        int n = input.length;
        // outer loop starts from 1 to length-1
        for (int i = 1; i < n; i++) {
            int value = input[i];
            int holeIndex = i;

            // insert the small values into the left 
            while (holeIndex > 0 && input[holeIndex-1] > value) {
                input[holeIndex] = input[holeIndex-1];
                holeIndex = holeIndex - 1;
            }
            input[holeIndex] = value;
        }

    }
}
