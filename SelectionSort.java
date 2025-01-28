public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        for (int i = 0; i < input.length -1; i++) {
            int smallIndex = i;
            // find smallest index after i
            for (int j = i+1; j < input.length; j++) {
                if (input[j] < smallIndex) {
                    smallIndex = j;
                }
            }
            // swap i and smallestIndex values
            int temp = input[i];
            input[i] = input[smallIndex];
            input[smallIndex] = temp;
        }

    }
}
