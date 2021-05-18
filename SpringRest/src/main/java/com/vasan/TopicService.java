package com.vasan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	//private TopicService topicService;
	private List<Topics> topics=new ArrayList<>(Arrays.asList(new Topics("Java", "Spring Framework","Spring Boot Learn"),
			new Topics("Spring","spring Boot ","Spring Boot Development"),
	new Topics("Hibernate","Hibernate","Spring Hibernate Developmet"),new Topics("rest","Hibernate","Spring Hibernate Developmet")));
	public List<Topics>getAllTopics(){
		return topics;
	}
	public Topics getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		
	}
	public void addTopic(Topics topic) {
		
		topics.add(topic);
		
	}
	public void updateTopic(String id, Topics topic) {
		for(int i=0;i<topics.size();i++) {
			Topics t=topics.get(i);
			if(t.getId().equals(id)) {
			topics.set(i, topic);
			return ;
			}
		}
		
	}
	public void deleteTopic(String id) {
		
		topics.removeIf(t->t.getId().equals(id));
	}

}

