package board.utils;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 8:45
 * To change this template use File | Settings | File Templates.
 */
public abstract class TypeConvertor {
    public static int convertInputToInt(String userInput) {
        return Integer.parseInt(userInput);
    }
}
