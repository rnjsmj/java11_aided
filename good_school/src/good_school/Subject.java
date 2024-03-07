package good_school;

public class Subject {
	private int code; //과목코드
	private String style; //평가방법
	private String subName; //과목명
	public Subject(int code, String style, String subName) {
		super();
		this.code = code;
		this.style = style;
		this.subName = subName;
	}
	public Subject() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "Subject [code=" + code + ", style=" + style + ", subName=" + subName + "]";
	}
	
	
}
