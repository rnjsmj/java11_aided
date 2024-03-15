package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		//no, title, content, author, resdate, view
		List<Board> boardList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Board board = new Board(i, "제목"+i, "내용"+i, "작성자"+i, "2024-03-1"+i, 0); 
			boardList.add(board); 
		}
		for(Board b : boardList) { 
			System.out.println(b.toString()); 
		}
	}

}
