package board.commander;

import board.article.Article;
import board.board.Board;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 8:28
 * To change this template use File | Settings | File Templates.
 */
public class PrintManager {
    public void printArticle(Article article) {
        System.out.println("제목 : " + article.getArticleTitle());
        System.out.println("작성자 : " + article.getWriterName());
        System.out.println("내용 : " + article.getArticleContents());
    }

    public void printArticleList(Board board) {
        System.out.println("=====" + board.getBoardName() + "=====");
        System.out.println("글번호  |  제목  |   작성자");
        for(int i = 0; i < board.size(); i++) {
            System.out.println(i+1 + " | " + board.getArticle(i).getArticleTitle() + " | " + board.getArticle(i).getWriterName());
            System.out.println("--------------------------");
        }
    }
}
