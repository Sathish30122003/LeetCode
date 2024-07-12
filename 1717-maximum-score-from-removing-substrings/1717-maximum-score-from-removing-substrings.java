class Solution {
    public int maximumGain(String s, int x, int y) {
        char a = (x > y) ? 'a' : 'b';
        char b = (x > y) ? 'b' : 'a';
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(s.charAt(i));
        }
        int count = 0;
        count += calculateGain(arr, a, b, Math.max(x, y));
        count += calculateGain(arr, b, a, Math.min(x, y));
        
        return count;
    }

    private int calculateGain(List<Character> arr, char a, char b, int value) {
        int gain = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == a && arr.get(i + 1) == b) {
                gain += value;
                arr.remove(i + 1);
                arr.remove(i);
                i = -1;
            }
        }
        return gain;
    }
}