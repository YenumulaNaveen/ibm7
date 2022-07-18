package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Flight;
import com.ibm.service.FlightService;
@CrossOrigin
@RestController
public class FlightController {
	
	@Autowired
	private FlightService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String save(@RequestBody Flight f) {
		int code = service.save(f);
		return "Flight added with code: " + code;
	}
	
	@GetMapping(value = "/get/{code}", produces = "application/json")
	public Flight fetch(int code) {
		return service.fetch(code);
	}

	@GetMapping(value = "/list", produces = "application/json")
	public List<Flight> list() {
		return service.list();
	}
	
	@DeleteMapping(value = "/del/{code}")
	public String delete(@PathVariable int code) {
		service.remove(code);
		return "Flight del"+code;
	}
	
	@PutMapping(value = "/update", consumes = "application/json")
	public String update(@RequestBody Flight f) {
		service.update(f);
		return "Flight updated";
	}
	@GetMapping(value = "/findC/{Bus}")
	public String byCarrier(@PathVariable String Bus) {
		return "Flight finded by CARRIER"+Bus;
	}
	
	@GetMapping(value = "/findR/{source}{destination}")
	public String byRoute(@RequestBody Flight f) {
		return "Flight finded by ROUTE";
	}
	

}
