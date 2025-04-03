class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalin() {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public void disRes() {
        if (isPalin()) {
            System.out.println(text + " is Palindrome");
        } else {
            System.out.println(text + " is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker str1 = new PalindromeChecker("racecar");
        str1.disRes();

        PalindromeChecker str2 = new PalindromeChecker("apple");
        str2.disRes();
    }
}
