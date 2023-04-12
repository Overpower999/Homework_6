import part1.MyClassPart1;
import part2.MyClassPart2;

public class Main {
    public static void main(String[] args) {
        MyClassPart1 myClassPart1 = new MyClassPart1();
        myClassPart1.findSymbolOccurance("asdaaa", 'a');
        myClassPart1.findWordPosition("Apollo", "pollo");
        myClassPart1.stringReverse("asdasdasdaasdqweqwfcz");
        myClassPart1.isPalindrome("ere");

        MyClassPart2 myClassPart2 = new MyClassPart2();
        myClassPart2.program();
    }
}
