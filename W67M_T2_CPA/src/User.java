/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Daw Rong
 * Student ID: 20014009
 * Class: E73E
 * Date/Time created: Monday 02-08-2021 17:01
 */

public class User {
	private int userid;
	private String name;
	private String role;
	private String email;
	private String password;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int userid, String name, String role, String email, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
	}
	
	
	
	

}
