package com.example.EasonText.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.EasonText.model.EasonModel;
import com.example.EasonText.repository.EasonRepository;
import com.example.EasonText.DTO.RMB_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_RMB_DTO;

@Service
@Component
public class EasonServices {
	
	@Autowired
	private EasonRepository easonRepository ;
	

	//find all material
	public List<EasonModel> findAll() {
        return  easonRepository.findAll();
    }
	//find material by id
	public EasonModel findByID(Long id){
		EasonModel result = easonRepository.findById(id)
				 .orElseThrow(() -> new IllegalArgumentException("此項目" + id + "不存在"));
		return result ;
	}
	
	 // find usd_to_ntd 
	public List<USD_to_NTD_DTO> findIdDateUsdToNtd() {
        return easonRepository.findIdDateUsdToNtd();
    }	
	
	//find rmb_to_ntd 
	public List<RMB_to_NTD_DTO> findIdDateRmbToNtd(){
		return easonRepository.findIdDateRmbToNtd();
	}
	//find usd_to_rmb 
	public List<USD_to_RMB_DTO> findIdDateUsdToRmb(){
		return easonRepository.findIdDateUsdToRmb();
	}
	//add
	public EasonModel addExchangeRates(EasonModel easonModel) {
		return easonRepository.save(easonModel);
	}
	//delete
	public void deleteExchangeRates(Long id) {
		easonRepository.deleteById(id);
	}
	//update
	public EasonModel updateExchangeRates(Long id, EasonModel updatedModel) {
        EasonModel existingModel = easonRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Exchange rate with ID " + id + " does not exist"));
        existingModel.setDate(updatedModel.getDate());
        existingModel.setUsd_to_ntd(updatedModel.getUsd_to_ntd());
        existingModel.setAud_to_usd(updatedModel.getAud_to_usd());
        existingModel.setRmb_to_ntd(updatedModel.getRmb_to_ntd());
        existingModel.setEur_to_usd(updatedModel.getEur_to_usd());
        existingModel.setUsd_to_jpy(updatedModel.getUsd_to_jpy());
        existingModel.setGbp_to_usd(updatedModel.getGbp_to_usd());
        existingModel.setUsd_to_hkd(updatedModel.getUsd_to_hkd());
        existingModel.setUsd_to_rmb(updatedModel.getUsd_to_rmb());
        existingModel.setUsd_to_zar(updatedModel.getUsd_to_zar());
        existingModel.setNzd_to_usd(updatedModel.getNzd_to_usd());
        
        return easonRepository.save(existingModel);
      
    }
	
	
}
