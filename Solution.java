class Solution {
    public String solution(String mystring, int s, int e) {
        String front = mystring.substring(0, s);
        String mid = mystring.substring(s, e + 1);
        String reversed = new StringBuilder(mid).reverse().toString();
        String back = mystring.substring(e + 1);

        return front + reversed + back;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abcdefg", 2, 5));
    }
}