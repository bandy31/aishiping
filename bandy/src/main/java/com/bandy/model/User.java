package com.bandy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
    @GeneratedValue
	private Integer id;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_pass")
	private String userPass;
	@Column(name="user_age")
	private Integer userAge;
	
	
	
 
}
