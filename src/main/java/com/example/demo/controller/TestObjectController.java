package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TestObject;
import com.example.demo.service.TestObjectService;



@RequestMapping("/testObject")
@RestController
public class TestObjectController {
	
	@Resource
	private TestObjectService testObjectService;
	
	@GetMapping("/new")
	public void create() {
		TestObject object = new TestObject();
		object.setName("new record");
		testObjectService.create(object);
	}
	
	@GetMapping("/index")
	public List<TestObject> list() {
		return testObjectService.list();
	}
	
	@GetMapping("/{id}")
	public TestObject get(@PathVariable(name = "id") int id) {
		return testObjectService.selectByPrimaryKey(id);
	}
	
}
