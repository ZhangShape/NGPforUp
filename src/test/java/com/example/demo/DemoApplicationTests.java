package com.example.demo;

import com.example.demo.prop.MyProps;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;

@SpringBootTest
class DemoApplicationTests {

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	private MyProps myProps;

	//@Test
	void contextLoads1() throws JsonProcessingException {
		System.out.println("simpleProp: " + myProps.getPort());
		System.out.println("arrayProps: " + objectMapper.writeValueAsString(myProps.getArrayProps()));
		System.out.println("listProp1: " + objectMapper.writeValueAsString(myProps.getListProps1()));
		System.out.println("listProp2: " + objectMapper.writeValueAsString(myProps.getListProps2()));
		System.out.println("mapProps: " + objectMapper.writeValueAsString(myProps.getMapProps()));
	}

	@Test
	void contextLoads2() throws JsonProcessingException {
		System.out.println("myProps: " + myProps.toString());
	}

}
