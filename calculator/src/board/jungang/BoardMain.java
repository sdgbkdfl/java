package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
//	int[] intArr = {1,2,3,4,5};
	int[] intArr = new int[5];
	
	//타입[]이름 =new 타입[개수];
	Board[] boardArr = new Board[5];
	
	//board객체를 생성하여 boardArr배열 0번째 index에 넣어줌
		boardArr[0] = new Board("게시글1","홍길동");
		boardArr[1] = new Board("게시글2","홍길동");
		boardArr[2] = new Board("게시글3","홍길동");
		boardArr[3] = new Board("게시글4","홍길동");
		boardArr[4] = new Board("게시글5","홍길동");
	
	for(Board board:boardArr) {
		System.out.println("==========");
		System.out.println(board.title);
		System.out.println(board.writer);
	}

	}

}
