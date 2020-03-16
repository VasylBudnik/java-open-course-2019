import ru.mail.polis.open.HelloWorld2;
import ru.mail.polis.open.task1.FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.lang.Character. *;

/**
 * @author mikhail.nechaev
 * Since 25/02/2019
 */
public class HelloWorld implements FizzBuzz{

    public static String FIZZ = "FIZZ";
    public static String BUZZ = "BUZZ";

    public static void main(String[] args) {
        Character[] bracket = new Character[]{'(', ')', '[', ']', '{', '}'};
        List<Character> bracketLists = Arrays.asList(bracket);

        HelloWorld test = new HelloWorld();

        System.out.println(test);
        int i;
        int sum = 0;
        int step = 0;
        int tmp = 0;
        String str = "(()))";
        for (Character bracketList : bracketLists) {
            i = 0;
            i = test.checkSymbol(str, bracketList);
            if (step >= 1) {
                if (i != tmp) {
                    System.out.println("In correct");
                    break;
                }
            }
            tmp = i;
            sum += i;
            step++;
            if (sum == str.length()) {
                break;
            }
        }
    }

    /**
     * @param str
     * @param symbol
     * @return int
     */
    public int checkSymbol(String str, Character symbol) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (symbol == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void print(int from, int to) {
        if (to < from) {
            System.out.println("Incorrect value: " + from);
            return ;
        }
        if ((from < 0 || from > 100) && (to < 0 || to > 100)) {
            System.out.println("Incorrect value: " + from);
            System.out.println("Incorrect value: " + to);
            return ;
        }
        int i;
        for(i = from; i <= to; i++) {
            if (i % 15 == 0) {
                System.out.println(HelloWorld.FIZZ + HelloWorld.BUZZ);
            } else if (i % 5 == 0) {
                System.out.println(HelloWorld.FIZZ);
            } else if (i % 3 == 0) {
                System.out.println(HelloWorld.BUZZ);
            } else {
                System.out.println(i);
            }
        }
    }
}
