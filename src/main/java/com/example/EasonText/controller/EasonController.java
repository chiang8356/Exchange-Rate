package com.example.EasonText.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EasonText.DTO.RMB_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_RMB_DTO;
import com.example.EasonText.model.EasonModel;
import com.example.EasonText.services.EasonServices;


import java.util.List;

@RestController
public class EasonController {
	 @Autowired
    private EasonServices easonServices ;
       

    @GetMapping("/")
    public String home() {
    	System.out.println("hello java world");
        return "hello java world"; 
    }
    
    @GetMapping("/findAll")
    public List<EasonModel> findAll() {
        return easonServices.findAll();
    }
    
    // find usd_to_ntd,date
    @GetMapping("/find/usdToNtd")
    public List<USD_to_NTD_DTO> findIdDateUsdToNtd() {
        return easonServices.findIdDateUsdToNtd();
    }
    
	//find rmb_to_ntd
    @GetMapping("/find/rmbToNtd")
    public List<RMB_to_NTD_DTO> findIdDateRmbToNtd(){
    	return easonServices.findIdDateRmbToNtd();
    }
    
    //findusd_to_rmb
    @GetMapping("/find/usdToRmb")
    public List<USD_to_RMB_DTO> findIdDateUsdToRmb(){
    	return easonServices.findIdDateUsdToRmb();
    }
    
    @GetMapping("/findByID/{id}")
    public EasonModel findByID(@PathVariable Long id) {
    	return easonServices.findByID(id);
    }

    @PostMapping("/add")
    //PostMan test-->use row JSON.  Model need constructor 
    public ResponseEntity<String> addExchangeRate(@RequestBody EasonModel easonModel) {
        EasonModel savedModel = easonServices.addExchangeRates(easonModel);
        return ResponseEntity.ok("Exchange rate added successfully with ID: " + savedModel.getId());
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteExchangeRates(@PathVariable Long id){
    	easonServices.deleteExchangeRates(id);
    	return ResponseEntity.ok("Exchange rate with ID " + id + " has been deleted.");
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<EasonModel> updateExchangeRate(@PathVariable Long id, @RequestBody EasonModel updatedModel) {
        EasonModel updatedRate = easonServices.updateExchangeRates(id, updatedModel);
        return ResponseEntity.ok(updatedRate);
    }

    
}
