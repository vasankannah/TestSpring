package com.vasan;

//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@Autowired
	private TopicService topicservice;
		
		public String sayHello() {
			return "Hi Vaikunthavasan";
		}
		@RequestMapping("/topics")
		public List<Topics>getAllTopics(){
			return topicservice.getAllTopics();
			
			
		}
		@RequestMapping("/topic/{id}")
		public Topics getTopic(@PathVariable String id) {
			return topicservice.getTopic(id);
		}
		@RequestMapping(method = RequestMethod.POST, value = "/topics")
		public void addTopic(@RequestBody Topics topic) {
			topicservice.addTopic(topic);
			
		}
		@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
		public void updateTopic(@RequestBody Topics topics,@PathVariable String id) {
			topicservice.updateTopic(id,topics);
		}
		@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
		public void deleteTopics(@PathVariable String id) {
			topicservice.deleteTopic(id);
		}
		

	}


