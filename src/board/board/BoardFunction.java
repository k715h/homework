package board.board;

import board.article.Article;
import board.article.WriteManager;
import board.commander.ConsoleInputCommander;
import board.commander.InputCommander;
import board.commander.PrintManager;
import board.utils.MenuInterface;
import board.utils.TypeConvertor;
import board.utils.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 1:42
 * To change this template use File | Settings | File Templates.
 */
public class BoardFunction implements MenuInterface {
    private InputCommander consoleInputCommander = new ConsoleInputCommander();
    private Board currentBoard;
    private PrintManager printManager = new PrintManager();

    public BoardFunction(Board board) {
        this.currentBoard = board;
    }

    @Override
    public void selectMenu() {
        String userInput = null;
        while(!BoardFunctionEnum.EXIT_BOARD.getIndex().equals(userInput)) {
            printManager.printArticleList(currentBoard);
            System.out.print("메뉴를 선택하세요 1. 게시글 읽기  2. 글쓰기  0. 메인메뉴로 : ");
            userInput = consoleInputCommander.inputSource();
            selectReadArticle(userInput);
            selectWriteArticle(userInput);
        }
    }

    public void selectReadArticle(String userInput) {
        if(!BoardFunctionEnum.READ_ARTICLE.getIndex().equals(userInput)) {
            return;
        }
        PrintManager printManager = new PrintManager();
        if(currentBoard.getArticleList().isEmpty()) {
            System.out.println("게시글이 없습니다");
            return;
        }
        int articleNumber = inputArticleNumber();
        if(Validator.checkIndexValidation(articleNumber, currentBoard.size())) {
            System.out.println("잘못입력하셨습니다");
            return;
        }
        printManager.printArticle(currentBoard.getArticle(articleNumber));
    }

    public void selectWriteArticle(String userInput) {
        if(!BoardFunctionEnum.WRITE_ARTICLE.getIndex().equals(userInput)) {
            return;
        }
        WriteManager writeManager = new WriteManager();
        Article newArticle = writeManager.writeArticle();
        currentBoard.addArticle(newArticle);
    }

    public int inputArticleNumber() {
        System.out.print("글 번호 : ");
        int articleNumber = TypeConvertor.convertInputToInt(consoleInputCommander.inputSource()) - 1;
        if(Validator.checkNumberValidation(articleNumber)) {
            return 0;
        }
        return articleNumber;
    }


}
