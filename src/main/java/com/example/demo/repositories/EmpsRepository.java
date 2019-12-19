package com.example.demo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Emps;


  public interface EmpsRepository extends MongoRepository<Emps, String> {
    Emps findBy_id(ObjectId _id);
  
  }
 
