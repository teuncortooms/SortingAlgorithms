public class CountingSorter {

    public int[] sort(int[] input, int upperValueBound) {

        int[] output = new int[input.length];
        int[] counts = new int[upperValueBound];

        for (int value : input) {
            counts[value]++;
        }

        for (int i = 1; i < counts.length; i++){
            counts[i] = counts[i] + counts[i-1];
        }

        for (int i = input.length-1; i >= 0; i--){
            int value = input[i];
            int newIndex = counts[value] - 1; // -1 because indexed at 0
            output[newIndex] = value;
            // remove occurrence and decrement next index by 1
            counts[value]--;
        }

        return output;
    }
}
