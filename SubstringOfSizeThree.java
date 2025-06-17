public class SubstringOfSizeThree {

    public static void main(String[] args) {
        SubstringOfSizeThree sst = new SubstringOfSizeThree();
        String input = "xyzzaz";
        int result = sst.countGoodSubstrings(input);
        System.out.println("Count of good substrings of size 3: " + result);
    }

    public int countGoodSubstrings(String s) {
        int start = 0, end = 0;
        int count = 0;
        while (end < s.length()) {
            if (end - start + 1 == 3) {
                if (s.charAt(start) != s.charAt(start + 1) && s.charAt(start + 1) != s.charAt(start + 2)
                        && s.charAt(start + 2) != s.charAt(start)) {

                    count++;
                }
                start++;
            }
            end++;
        }
        return count;
    }
}
