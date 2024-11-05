package com.codnuria.main.Business.Person;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codnuria.main.Business.Person.ResponseObject.ResponseGetData;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("person")
public class PersonController {
    @GetMapping(path = "getdata")
	public ResponseEntity<ResponseGetData> getData() {
		ResponseGetData responseGetData = new ResponseGetData();

		responseGetData.firstName = "Nuria";
		responseGetData.surName = "Segundo Villa";
		responseGetData.dni = "12345678";

		return new ResponseEntity<>(responseGetData, HttpStatus.OK);
	}   
}
