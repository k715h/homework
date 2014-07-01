package board.commander;

import board.article.Article;
import board.article.WriteManager;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오전 10:04
 * To change this template use File | Settings | File Templates.
 */
public class WriteManagerTest {

    public static void main(String[] args) {
        WriteManager testWrite = new WriteManager();
        Article resultArticle = testWrite.writeArticle();
        System.out.println(resultArticle.getArticleTitle());
        System.out.println(resultArticle.getWriterName());
        System.out.println(resultArticle.getArticleContents());

    }
}
