public class bubleSort {

    public static void swap(int[] A, int j) {
        if (A[j] > A[j + 1]) {
            int temp = A[j];
            A[j + 1] = A[j];
            A[j + 1] = temp;
        }


    }

    public static void BubbleSort(int[] A, int n) {
        boolean flag; // used to skip extra iterations in case of an already sorted array
        for (int i = 0; i < n - 1; i++) { // i denotes the number of iterations!
            flag = false;
            for (int j = 0; j < i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    swap(A, j);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] A = {6,2,8,4,10};
        BubbleSort(A, 5);


    }

}
