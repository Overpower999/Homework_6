package part1;

public class MyClassPart1 {
    public int findSymbolOccurance(String a, char b) {
        char[] charik = a.toCharArray();
        int c = 0;
        for (int i = 0; i < charik.length; i++) {
            if (charik[i] == b) {
                c++;
            }
        }
        System.out.println(c);
        return c;
    }

    public int findWordPosition(String source, String target) {
        System.out.println(source.indexOf(target));
        return source.indexOf(target);
    }

    public String stringReverse(String a) {
        String revers = "";
        for (int i = 0; i < a.length(); i++) {
            revers = a.charAt(i) + revers;
        }
        System.out.println(revers);
        return revers;
    }

    public boolean isPalindrome(String a) {
        String reversA = "";
        for (int i = 0; i < a.length(); i++) {
            reversA = a.charAt(i) + reversA;
        }
        System.out.println(a.equalsIgnoreCase(reversA));
        return a.equalsIgnoreCase(reversA);


    }
}
