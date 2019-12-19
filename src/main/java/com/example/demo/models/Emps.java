package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Emps {
	@Id
	public ObjectId _id;
	  
	  public String name;
	  public String email;
	  public String addr;
	  
	  public Emps() {}
	public Emps(ObjectId _id, String name, String email, String addr) {
		super();
		this._id = _id;
		this.name = name;
		this.email = email;
		this.addr = addr;
	}
	
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String get_id() {
		return _id.toHexString();
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddr() {
		return addr;
	}
	
}
