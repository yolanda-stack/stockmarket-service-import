package com.smc.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.smc.model.ImportSummary;
import com.smc.utils.ExcelUtil;
import com.smc.utils.ResponseCode;
import com.smc.utils.CommonResult;
@CrossOrigin
@RestController
public class ImportDataController {

    @Autowired
    ExcelUtil excelUtil;

    @RequestMapping("/file/download")
	public ResponseEntity<InputStreamResource> downloadexcel(HttpServletRequest request) 
			throws IOException, ParseException {
        ResponseEntity<InputStreamResource> response = excelUtil.downloadExcel();
		return response;
    }

    @RequestMapping("/file/upload")
    public CommonResult uploadexcel(@RequestParam("file")MultipartFile file) throws IOException, ParseException {
        String name=file.getOriginalFilename();
          if(name.length()<6|| !name.substring(name.length()-5).equals(".xlsx")){
              return CommonResult.build(ResponseCode.FILE_FORMAT_ERROR, "Error File Format.");
          }
        ImportSummary importSummary = (ImportSummary) excelUtil.uploadExcel(file.getInputStream());
        System.out.println(importSummary);
        return CommonResult.build(ResponseCode.SUCCESS, "Success!", importSummary);
        
    }

}