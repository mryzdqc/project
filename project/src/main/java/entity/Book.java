package entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
	public static String sexs[]= {"²»ÏÞ","ÄÐ","Å®"};
	private int id;
	private String name;
	private int sex;
	private int typeid;
	
	
	private String sexname;
	public String getSexname() {
		return sexs[sex];
	}
	
	
	private String typename;
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void setSexname(String sexname) {
		this.sexname = sexname;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	
	
}
