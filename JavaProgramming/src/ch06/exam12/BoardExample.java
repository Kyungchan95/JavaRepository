package ch06.exam12;

public class BoardExample {
	public static void main(String[] args) {
		Board board = new Board();

		board.setBno(-2);
		board.setTitle("�ù� ���̿�?");
		board.setContent("�� ����~~~");
		board.setWriter("�强��");
		board.setOpen(true);

		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
		System.out.println(board.getWriter());
		System.out.println(board.isOpen());

	}

}
