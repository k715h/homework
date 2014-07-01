package board;

import board.board.Board;
import board.board.BoardFunction;
import board.board.BoardMakingManager;
import board.commander.ConsoleInputCommander;
import board.commander.InputCommander;
import board.utils.MenuInterface;
import board.utils.TypeConvertor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: coupang
 * Date: 2014. 7. 1.
 * Time: 오후 4:09
 * To change this template use File | Settings | File Templates.
 */
public class BoardServiceManagement implements MenuInterface{
    private InputCommander consoleInputCommander = new ConsoleInputCommander();
    private BoardMakingManager boardMakingManager = new BoardMakingManager();
    private List<Board> boardList = new ArrayList<Board>();

    public BoardServiceManagement() {
        Board noticeBoard = boardMakingManager.makeNewBoard("공지사항");
        boardList.add(noticeBoard);
        Board freeBoard = boardMakingManager.makeNewBoard("자유게시판");
        boardList.add(freeBoard);
    }

    @Override
    public void selectMenu() {
        String userInput = null;
        while(!BoardsMenuEnum.EXIT_SERVICE.getIndex().equals(userInput)) {
            printMenu();
            userInput = consoleInputCommander.inputSource();
            selectMakeBoard(userInput);
            selectViewBoard(userInput);
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void selectMakeBoard(String userInput) {
        if(!BoardsMenuEnum.MAKE_BOARD.getIndex().equals(userInput)) {
            return;
        }
        System.out.print("생성할 게시판 이름을 입력하세요 : ");
        String userInputName = consoleInputCommander.inputSource();
        Board newBoard = boardMakingManager.makeNewBoard(userInputName);
        boardList.add(newBoard);
    }

    public void selectViewBoard(String userInput) {
        if(!checkUserSelect(userInput)) {
            return;
        }
        int index = TypeConvertor.convertInputToInt(userInput) - 2;
        if(index < boardList.size()) {
//            PrintManager printManager = new PrintManager();
//            printManager.printArticleList(boardList.get(index));
            BoardFunction boardFunction = new BoardFunction(boardList.get(index));
            boardFunction.selectMenu();
        }
        else {
            System.out.println("해당 게시판이 존재하지 않습니다");
            return;
        }
    }

    public boolean checkUserSelect(String userInput) {
        if(BoardsMenuEnum.MAKE_BOARD.getIndex().equals(userInput)) {
            return false;
        }
        if(BoardsMenuEnum.EXIT_SERVICE.getIndex().equals(userInput)) {
            return false;
        }
        if(TypeConvertor.convertInputToInt(userInput) < 0) {
            return false;
        }
        return true;
    }

    public void printMenu() {
        System.out.print("메뉴를 선택하세요 1. 게시판 생성 ");
        for(int i = 0; i < boardList.size(); i++) {
            System.out.print((i+2) + ". " + boardList.get(i).getBoardName() + " ");
        }
        System.out.print("0. 종료 : ");
    }
}
