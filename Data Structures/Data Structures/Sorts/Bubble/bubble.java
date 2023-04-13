package Sorts.Bubble;

public class bubble {
    /**
     * Method that uses bubble sort to sort a generic array into ascending order. 
     *
     * @param arr   the input array to sort
     * @return      the sorted array
     */
    public static <T> T[] bubbleAsc(T[] arr) {
        // for each pass in the sort
        for (int i=0; i < arr.length; i++) {
            // for every unsorted element
            for (int j=0; j < arr.length - 1 - i; j++) {
                // swap them
                if (arr[j].toString().compareTo(arr[j+1].toString()) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Method that uses bubble sort to sort a generic array into descending order. 
     *
     * @param arr   the input array to sort
     * @return      the sorted array
     */
    public static <T> T[] bubbleDesc(T[] arr) {
        // for each pass in the sort
        for (int i=0; i < arr.length; i++) {
            // for every unsorted element
            for (int j=0; j < arr.length - 1 - i; j++) {
                // swap them
                if (arr[j].toString().compareTo(arr[j+1].toString()) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] o = {1, 4, 6, 5, 3, 2};
        o = bubbleAsc(o);
        for (int p: o) {
            System.out.print(p+" ");
        }
        System.out.print('\n');
        o = bubbleDesc(o);
        for (int p: o) {
            System.out.print(p+" ");
        }
    }
}
