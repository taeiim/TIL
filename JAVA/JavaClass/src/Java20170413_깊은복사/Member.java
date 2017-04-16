package Java20170413_깊은복사;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car){
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Member cloned = (Member) super.clone();
		
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public static void main(String[] args) {
		Member original = new Member("홍길동",25,new int[] {90,90},new Car("소나"));
	}
}
