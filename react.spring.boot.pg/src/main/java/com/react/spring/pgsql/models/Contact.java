package com.react.spring.pgsql.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name = "contact")
public class Contact implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    @Column(name = "name")
    String name;
    @Column(name = "address")
    String address;
    @Column(name = "city")
    String city;
    @Column(name = "phone")
    String phone;
    @Column(name = "email")
    String email;

    public Contact() {
    }

    public Contact(String name, String address, String city, String phone, String email) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", phone=" + phone + ", email=" + email + " ]";
	}
}
