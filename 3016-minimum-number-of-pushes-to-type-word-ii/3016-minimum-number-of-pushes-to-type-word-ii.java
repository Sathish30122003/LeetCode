
class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26]; // Array size for 'a' to 'z'
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        
        List<Integer> frequencies = new ArrayList<>();
        for (int freq : arr) {
            if (freq > 0) {
                frequencies.add(freq);
            }
        }
        
        Collections.sort(frequencies, Collections.reverseOrder());
        
        int i1 = 1, l = 2;
        int count = 0;
        int keysInRow = 1;
        
        for (int freq : frequencies) {
            count += freq * i1;
            keysInRow++;
            
            if (keysInRow > 8) {
                i1++;
                keysInRow = 1;
            }
        }
        
        return count;
    }
}