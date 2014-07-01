package board.article;

import board.commander.ConsoleInputCommander;
import board.commander.InputCommander;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 8:53
 * To change this template use File | Settings | File Templates.
 */
public class WriteManager {
    private InputCommander consoleInputCommander = new ConsoleInputCommander();

    public Article writeArticle() {
        Article articleInput = new Article();

        inputArticleTitle(articleInput);
        inputWriterName(articleInput);
        inputArticleContents(articleInput);

        return articleInput;
    }

    public void inputArticleTitle(Article article) {
        System.out.print("제목 : ");
        article.setArticleTitle(consoleInputCommander.inputSource());
    }

    public void inputWriterName(Article article) {
        System.out.print("이름 : ");
        article.setWriterName(consoleInputCommander.inputSource());
    }

    public void inputArticleContents(Article article) {
        System.out.print("내용 : ");
        article.setArticleContents(consoleInputCommander.inputSource());
    }

}
