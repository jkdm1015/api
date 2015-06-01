package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	// 회원가입 기능을 하는 메소드
	// HashMap을 해야 id 값을 가지고 password 를 호출해야겠네
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 이 패턴은 DB에 저장하는 패턴과 일치한다.
		 즉, 값을 활용하면서 오염되거나 변질 될 수 있이게
		 가장 먼저 순수값을 DB에 저장하고 본다. 
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		/*
		 Map 사용시 에러유형
		 1. map.put(vo.getId(),vo.getPassword()); // 키값 에러
		 2. map.put("age",vo.getAge()); // valueOf 로 변환 안함
		 3. map.get(id); 반드시 String 값으로 "" <-- 리터럴 상수
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// 키와 벨류 패턴에서 벨류값을 String 으로 통일시키려고
		// int 타입인 age 를 String 타입으로 변환
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
	}
	/*
	 * 회원가입 후 로그인 기능을 하는 메소드이후에 
	 * 별다른 말이 없으니까 로그인 성공, 실패, 메시지까지 여기에서 마감
	 */
	@Override
	public void logint(String id, String password) {
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("환영합니다."+vo.getAddr()+"에 사는 "+vo.getAge()+"세 "+vo.getName()+"님");
			
		}else if(!map.get("id").equals(id)&&map.get("password").equals(password)){
			System.out.println("입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요");
		}else{
			System.out.println("비번이 다릅니다. 다시 입력하세요");
		}
		
	}

}
