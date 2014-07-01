package board.commander;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 2:13
 * To change this template use File | Settings | File Templates.
 */
public abstract class InputCommander {
    public String inputSource() {
        String readStream = "";
        BufferedReader input = this.inputFrom();
        try {
            readStream = input.readLine();
        }catch(IOException e){
            System.out.println("InputCommander IOException");
        }

        return readStream;
    }

    public abstract BufferedReader inputFrom();
}
