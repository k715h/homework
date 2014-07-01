package board.article;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 6. 30.
 * Time: 오후 1:21
 * To change this template use File | Settings | File Templates.
 */
public class Article {
    private String articleTitle;
    private String articleContents;
    private String writerName;

    public Article() {}

    public Article(String title, String contents, String name) {
        this.articleTitle = title;
        this.articleContents = contents;
        this.writerName = name;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

//    public int getArticleSerial() {
//        return articleSerial;
//    }
//
//    public void setArticleSerial(int articleSerial) {
//        this.articleSerial = articleSerial;
//    }


}
