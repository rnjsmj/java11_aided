package sec2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Board {
	private int pno;
	private String title;
	private String content;
	private int viewCnt;
}
