package board;

import board.article.Article;
import board.board.Board;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 6:34
 * To change this template use File | Settings | File Templates.
 */
public class BoardTest {
    Article testArticle = new Article("제목","내용내용내용내용-------------\n쭈---------------욱","루나");

    @Test
    public void testSize() throws Exception {
        Board testBoard = new Board();
        testBoard.addArticle(testArticle);
        assertEquals(1, testBoard.size());
        testBoard.addArticle(testArticle);
        assertEquals(2, testBoard.size());
    }

    @Test
    public void testAddArticle() throws Exception {
        Board testBoard = new Board();
        testBoard.addArticle(testArticle);
    }

    @Test
    public void testGetArticle() throws Exception {
        Board testBoard = new Board();
        testBoard.addArticle(testArticle);
        Article resultArticle = testBoard.getArticle(0);
        assertEquals(testArticle, resultArticle);
        System.out.print(resultArticle);
    }

}
