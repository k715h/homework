package board.board;

import board.article.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 1:36
 * To change this template use File | Settings | File Templates.
 */
public class Board {
    private String boardName;
    private List<Article> articleList;

    public Board() {
        articleList = new ArrayList<Article>();
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public int size() {
        return articleList.size();
    }

    public void addArticle(Article article) {
        articleList.add(article);
    }

    public Article getArticle(int index) {
        return articleList.get(index);
    }



}
