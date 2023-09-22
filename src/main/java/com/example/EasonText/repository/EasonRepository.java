package com.example.EasonText.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.EasonText.model.EasonModel;
import com.example.EasonText.DTO.RMB_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_NTD_DTO;
import com.example.EasonText.DTO.USD_to_RMB_DTO;

@Repository
public interface EasonRepository extends JpaRepository<EasonModel, Long> {
	@Query("SELECT new com.example.EasonText.DTO.USD_to_NTD_DTO(e.id, e.date, e.usd_to_ntd) FROM EasonModel e")
    List<USD_to_NTD_DTO> findIdDateUsdToNtd();
    @Query("SELECT new com.example.EasonText.DTO.RMB_to_NTD_DTO(e.id, e.date, e.rmb_to_ntd) FROM EasonModel e")
    List<RMB_to_NTD_DTO> findIdDateRmbToNtd();
    @Query("SELECT new com.example.EasonText.DTO.USD_to_RMB_DTO(e.id, e.date, e.usd_to_rmb) FROM EasonModel e")
    List<USD_to_RMB_DTO> findIdDateUsdToRmb();
}
