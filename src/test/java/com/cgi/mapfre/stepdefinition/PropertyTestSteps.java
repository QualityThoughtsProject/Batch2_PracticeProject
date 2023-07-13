package com.cgi.mapfre.stepdefinition;

import com.cgi.mapfre.Lobs.PropertyHelper;

import io.cucumber.java8.En;

public class PropertyTestSteps implements En {
	
	PropertyHelper help=new PropertyHelper();

	public 	PropertyTestSteps(){

		Then("i issue a Home policy of HO3 with Primary usage type and Residence type House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO4 with Primary usage type and Residence type House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});

		Then("i issue a Home policy of HO6 with Primary usage type and Residence type House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO3 with Secondary usage type and Residence type House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO4 with Secondary usage type and Residence type House and homemaster plus package", () -> {
		   
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO6 with Secondary usage type and Residence type House and homemaster plus package", () -> {
		   
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO3 with Seasonal usage type and Residence type House and homemaster plus package", () -> {
		   
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO4 with Seasonal usage type and Residence type House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO6 with Seasonal usage type and Residence type House and homemaster plus package", () -> {
			help.issuePropertyPolicy();
			
		});

		Then("i issue a Home policy of HO3 with Primary usage type and Residence type Row House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO4 with Primary usage type and Residence type Row House and homemaster plus package", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO6 with Primary usage type and Residence type Row House and homemaster plus packageExamples:", () -> {
		    
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO3 with Primary usage type and Residence type TownHouse and homemaster plus package", () -> {
			
			help.issuePropertyPolicy();
			
		});


		Then("i issue a Home policy of HO4 with Primary usage type and Residence type TownHouse and homemaster plus package", () -> {
		   
			help.issuePropertyPolicy();
		});


		Then("i issue a Home policy of HO6 with Primary usage type and Residence type TownHouse and homemaster plus package", () -> {
		   
			help.issuePropertyPolicy();
		});
	}
}
