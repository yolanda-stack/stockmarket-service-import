package com.smc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.smc.entity.Company;


public interface CompanyDao extends JpaRepository<Company,Long>{

    Company findById(Integer id);

    @Query(name = "getByCompanycode", nativeQuery = true, value = "SELECT company_name from company where company_code = :companycode")
    String getByCompanycode(String companycode);
    
//    String editByCompanycode(String companycode);
//    String deleteByCompanycode(String companycode);


}
