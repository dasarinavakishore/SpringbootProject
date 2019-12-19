package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Emps;
import com.example.demo.repositories.EmpsRepository;

@RestController
@RequestMapping("/emps")
public class EmpsController {
	@Autowired
	  private EmpsRepository repository;
	
	//Getting all EMps
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Emps> getAllEmps() {
	    return repository.findAll();
	  }
	
	//Getting Emp by ID
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Emps getEmpById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	
	//Putting/updating Emp records by ID
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyEmpById(@PathVariable("id") ObjectId id, @Valid @RequestBody Emps emps) {
	    emps.set_id(id);
	    repository.save(emps);
	  }
	
	//posting or inserting new records into collection
	 @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Emps createEmp(@Valid @RequestBody Emps emps) {
	    emps.set_id(ObjectId.get());
	    repository.save(emps);
	    return emps;
	  }
	 
	 //Deleting records from collection
	 @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteEMp(@PathVariable ObjectId id) {
		 System.out.println("delected records!!");
	    repository.delete(repository.findBy_id(id));
	  }
	
}
