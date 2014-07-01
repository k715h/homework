package board;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 4:13
 * To change this template use File | Settings | File Templates.
 */
public enum BoardsMenuEnum {
    MAKE_BOARD("1"),
    EXIT_SERVICE("0");

     String index;

     BoardsMenuEnum(String index) {
         this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
