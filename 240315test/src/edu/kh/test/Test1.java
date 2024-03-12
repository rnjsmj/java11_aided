package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//List<IPInfo> ipInfoList = null;
		//ipInfoList를 선언한 List는 인터페이스이므로 객체를 생성할 수 없음
		//ArrayList로 생성해야 하지만, null로 대입하였으므로 
		//요소를 추가하는 코드에서 NullPointException이 발생
		//=> IPInfo 객체를 포함하는 ArrayList를 생성
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		//ipInfoList.add(new IPInfo("212.133.7.8"));
		//IPInfo 클래스의 생성자 중 매개변수가 1개인 생성자가 없으므로 IPInfo 클래스 객체를 생성할 수 없음
		//=> 생성자의 user 매개변수로 들어갈 String 데이터를 입력해야 함
		ipInfoList.add(new IPInfo("212.133.7.8", "이름"));
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0; i<ipInfoList.size(); i++) {
			//if(ipInfoList.get(i) == ip) {
			//1) ipInfoList.get(i)는 i번째의 IPInfo 클래스의 객체이고,
			//   ip는 String 변수이므로 비교할 수 없음
			// => ipInfoList.get(i).getIp()를 사용하여 같은 String 타입끼리 동일한지 비교해야 함
			//2) ArrayList는 참조형이므로 '==' 연산자를 사용하면 갖고있는 주소값을 비교하게 되어 
			//   갖고있는 String 값이 같은지 확인할 수 없음
			// => ipInfoList.get(i).getIp().equals(ip)로 조건을 수정하여
			//    갖고있는 값이 같은지 비교
			if(ipInfoList.get(i).getIp().equals(ip)) {
				//System.out.println(ipInfoList.get(i));
				System.out.println(ipInfoList.get(i));
				break;
			}
			//+
			else {
				System.out.println("일치하는 ip 사용자가 없습니다.");
				break;
			}
		}
		
		//System.out.println("일치하는 ip 사용자가 없습니다.");
		// 일치하는 사용자가 있는 경우에도 27번에서 일치하는 ip 사용자가 없다고 출력된다.
		// => 21번의 조건문에 맞지 않는 경우에만 일치하는 사용자가 없다고 출력되어야 하므로
		//    24 번의 코드의 뒤에 else {sysout System.out.println("일치하는 ip 사용자가 없습니다.");
		//    break;} 를 추가하여 일치하는 사용자가 없다는 정보를 한 번 출력한다.
		
	}

}
