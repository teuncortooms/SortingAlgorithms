public class CountingSorter {

    public int[] sort(int[] A, int upperValueBound) {

        int[] B = new int[A.length];
        int[] C = new int[upperValueBound];

        for (int i = 0; i < A.length; i++){
            int value = A[i];
            C[value]++;
        }

        for (int i = 1; i < C.length; i++){
            C[i] = C[i] + C[i-1];
        }

        for (int i = A.length-1; i <= 0; i--){
            int value = A[i];
            int newIndex = C[value];
            B[newIndex] = value;
            C[value]--; // decrement index by 1
        }

        return B;
    }
}
