package com.google.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;


@ToString
@Data

@Entity
public class Amazon
{
	
	@Id
	private int id;
	
	private String name;
	private int price;
	private String des;
	
}
