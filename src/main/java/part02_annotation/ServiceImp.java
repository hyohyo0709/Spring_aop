package part02_annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

//핵심로직만 구현해놓은 클래스 - 핵심관점
@Component("svc")
public class ServiceImp implements Service {

	public ServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prn1() {
		System.out.println("prn");

	}
	
	@Override
	public void prn1(Random rn) {
		System.out.println(rn.nextDouble());
		
	}

	@Override
	public void prn1(int a, int b) {
		System.out.printf("a:%d  b:%d\n", a,b);

	}

	@Override
	public void prn1(int x) {
		System.out.printf("x: %d\n", x);

	}

	@Override
	public void prn2() {
		System.out.println("prn2");

	}

	@Override
	public String prn3() {
		System.out.println("prn3");
		return "홍길동";
	}

	@Override
	public void prn4() {
		System.out.println("prn4");
//		String data="123";
		String data = "abc";
		int num = Integer.parseInt(data);
		System.out.println("num:"+num);

	}

	@Override
	public void prn5() {
		System.out.println("prn5 ");
		
		

	}

}
