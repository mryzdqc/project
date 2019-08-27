package model;


public class Type2 implements TypeInterface {
	private int id;
	private String name;
	
	private Type t;
	
	
	public Type getT() {
		return t;
	}
	public void setT(Type t) {
		this.t = t;
	}
	public Type2() {
		// TODO Auto-generated constructor stub
	}
	public Type2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Type2(Type t) {
		super();
		this.t = t;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("≥ı ºªØ");
	}
	
	
}
