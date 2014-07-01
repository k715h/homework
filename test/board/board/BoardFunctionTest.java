package board.board;

import board.article.Article;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 4:32
 * To change this template use File | Settings | File Templates.
 */
public class BoardFunctionTest {
    public static void main(String[] args) {
        Article testArticle = new Article("테스트제목", "테스트내용", "테스트이름");
        Board testBoard = new Board();
        testBoard.addArticle(testArticle);

        BoardFunction testBoardFunction = new BoardFunction(testBoard);
        testBoardFunction.selectMenu();
    }
}
