package com.bs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bs.base.BaseClass;

public class DragandDrop extends BaseClass  {
	
	 
	@FindBy(id="draggable")
	WebElement drag;
	@FindBy(id="droppable")
	WebElement drop;
	
	public DragandDrop() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void dragdrop() {
		Actions act=new Actions(getDriver());
		 
		
	
		act.dragAndDrop(drag, drop).build().perform();
		
	}
	
	
	
	 
	 
	  
	   
	   
	   
	  
	    
	   
}
