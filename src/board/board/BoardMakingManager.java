package board.board;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 6:15
 * To change this template use File | Settings | File Templates.
 */
public class BoardMakingManager {
    public Board makeNewBoard(String boardName) {
        Board newBoard = new Board();
        newBoard.setBoardName(boardName);
        return newBoard;
    }
}
