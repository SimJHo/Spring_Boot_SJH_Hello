package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter

@Data // lombok이 생성자/getter/setter 등 자동 생성
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	
	// 데이터(커맨드) 객체
	private String id;
	private String pw;
	private int age;	
}
