package board.commander;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 2:15
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleInputCommander extends InputCommander {
    @Override
    public BufferedReader inputFrom() {
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
        return consoleInput;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
