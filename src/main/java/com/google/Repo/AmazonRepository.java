package com.google.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.Entity.Amazon;

public interface AmazonRepository extends JpaRepository<Amazon, Integer> {
	

	List<Amazon> findByName(String string);

	List<Amazon> findByNameAndDes(String string, String string2);
	
	List<Amazon> findByPriceGreaterThan(int price);
	
	List<Amazon> findByDesContains(String des);

	List<Amazon> findByPriceBetween(int price1, int price2);

	List<Amazon> findByDesLike(String des);
	
	
//	List<Amazon> findByName(String name);
//
//	List<Amazon> findByNameAndDes(String string, String string2);
//
//	List<Amazon> findByPriceGraterThan(int price);
	
	
	
	

}
