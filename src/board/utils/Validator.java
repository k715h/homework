package board.utils;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 10:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class Validator {
    public static boolean checkNumberValidation(int userInput) {
        return (userInput < 0);
    }
    public static boolean checkIndexValidation(int userInput, int listSize) {
        return (userInput >= listSize);
    }
}
