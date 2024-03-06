package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		//글쓰기
		nVector.add(new Notice("공지사항1", "내용1", "운영자1"));
		nVector.add(new Notice("공지사항2", "내용2", "운영자2"));
		nVector.add(new Notice("공지사항3", "내용3", "운영자3"));
		nVector.add(new Notice("공지사항4", "내용4", "운영자4"));
		nVector.add(new Notice("공지사항5", "내용5", "운영자5"));
		nVector.add(new Notice("공지사항6", "내용6", "운영자6"));
		
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.printf("%s\t%s\t%s\n", n.getTitle(), n.getContent(), n.getAuthor());
		}

		System.out.println();
		nVector.remove(2);
		
		Notice not = new Notice("공지set", "내용", " 관리자");
		nVector.set(3, not); //중간에 삽입
		// >>> 
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.printf("%s\t%s\t%s\n", n.getTitle(), n.getContent(), n.getAuthor());
		}
		
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지되고 있지만
		//Vector는 내용이 없으면 메모리에서 자동으로 제거됨
	}

}
