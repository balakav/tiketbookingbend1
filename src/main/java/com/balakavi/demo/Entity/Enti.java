package com.balakavi.demo.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name = "Booking_tiket_database")

public class Enti {

@Id

private int id;
private String name;
private int age;
private String genter;
private String start;
private String end;
private String bustype;
private String seattype;
private String date;
private String time;


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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGenter() {
	return genter;
}

public void setGenter(String genter) {
	this.genter = genter;
}

public String getStart() {
	return start;
}

public void setStart(String start) {
	this.start = start;
}

public String getEnd() {
	return end;
}

public void setEnd(String end) {
	this.end = end;
}

public String getBustype() {
	return bustype;
}

public void setBustype(String bustype) {
	this.bustype = bustype;
}

public String getSeattype() {
	return seattype;
}

public void setSeattype(String seattype) {
	this.seattype = seattype;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public Enti(int id, String name,int age,String genter,String start,String end,String bustype,String seattype,String date,String time) {

super();
this.id = id;
this.name =name;
this.age = age;
this.genter = genter;
this.start = start ;
this.end =end ;
this.bustype =bustype;
this.seattype=seattype;
this.date=date;
this.time=time;

}

public Enti() {

}
//
//public String toString() {
//
//return "id="+id+"studentName="+studentName+"section="+section+"mobile="+mobile+
//
//"mailid="+mailid+"address="+address;
//
//}

}