package com.google.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.google.Entity.Amazon;
import com.google.Repo.AmazonRepository;

@Controller
public class HomeController
{
	@Autowired
	private AmazonRepository repo;
	
	@RequestMapping("/")
	public String home(Model theModel)
	{
		
		theModel.addAttribute("date", new Date());
		
		List<Amazon> list = repo.findAll();
		
//		List<Amazon> list = repo.findByName("Hp");
//		
//		List<Amazon> list2 = repo.findByNameAndDes("asus rog", "laptop");
//		
//		List<Amazon> list3 = repo.findByPriceBetween(100000, 200000);
		
//		List<Amazon> list =  repo.findByPriceGreaterThan(100000);
		
//		List<Amazon> list = repo.findByDesContains("mobile");
		
//		List<Amazon> list = repo.findByPriceBetween(50000, 150000);
		
		
		
		System.out.println(list);
		
		theModel.addAttribute("amazonData", list);
		return "home";
	}
	
	@RequestMapping("/show")
	public String product(@ModelAttribute("amazon") Amazon theAmazon, Model theModel)
	{

//		List<Amazon> list = repo.findByName(theAmazon.getName());
		
		List<Amazon> list = repo.findByName(theAmazon.getName());
		
		theModel.addAttribute("amazonData", list);
		
		
		return "home";
		
	}
	
}
