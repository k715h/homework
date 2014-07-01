package board.board;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 3:14
 * To change this template use File | Settings | File Templates.
 */
public enum BoardFunctionEnum {
    READ_ARTICLE("1"),    //본문 읽기
    WRITE_ARTICLE("2"),   //글쓰기
    EXIT_BOARD("0");      //게시판 나가기

    String index;

    BoardFunctionEnum(String index) {
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
