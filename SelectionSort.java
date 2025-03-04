public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
        int n = input.length;

        // outer loop 
        for (int i = 0; i < n - 1; i++) {
            int smallIndex = i;
            // find index of smallest value after i
            for (int j = i+1; j < n; j++) {
                if (input[j] < input[smallIndex]) {
                    smallIndex = j;
                }
            }
            // swap values in the index i and index smallestIndex 
            int temp = input[smallIndex];
            input[smallIndex] = input[i]; 
            input[i] = temp;
        }

    }
}
