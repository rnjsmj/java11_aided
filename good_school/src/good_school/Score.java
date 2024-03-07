package good_school;

public class Score {
	private int stuNo; 	//학번
	private Subject subject;	//과목
	private int point;	//점수
	public Score(int stuNo, Subject subject, int point) {
		super();
		this.stuNo = stuNo;
		this.subject = subject;
		this.point = point;
	}
	public Score() {
		super();
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Score [stuNo=" + stuNo + ", subject=" + subject + ", point=" + point + "]";
	}
	
	
	
	
}
