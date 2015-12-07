package com.walle.le.vo;

public class User {
	private int id_w = 0;
	private String name_w = "";

	public void setid_w(int id) {
		this.id_w = id;
	}

	public int getid_w() {
		return this.id_w;
	}

	public void setname_w(String name) {
		this.name_w = name;
	}

	public String getname_w() {
		return this.name_w;
	}
	@Override
	public String toString(){
		return "id_w = "+id_w+",name_w = "+name_w;
	}
}
