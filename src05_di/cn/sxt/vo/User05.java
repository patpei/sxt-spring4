package cn.sxt.vo;

public class User05 {
	private String name;
	private int age;
	public User05() {
		// TODO Auto-generated constructor stub
	}
	public User05(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User05 [name=" + name + ", age=" + age + "]";
	}

	
}
