package com.agcodes.courseapi.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepo;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic(1, "Java", "Java Basics"),
//            new Topic(2, "Spring Boot", "Spring Boot Essentials"),
//            new Topic(3, "Design Patterns", "Main design patterns")));

    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepo.findAll().forEach(topics::add);
        return topics;

//        return (List<Topic>) topicRepo.findAll();

    }

    public Topic getTopic(long id) {
//        return topics.stream().filter(t -> t.getId() == id).findFirst().get();
   return topicRepo.findById(id)
           .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User with id %d not found", id)));
    }

    public Topic addTopic(Topic topic) {

//        topics.add(topic);
        return topicRepo.save(topic);
    }

    public Topic updateTopic(Topic topic, long id) {

//        OptionalInt index = IntStream.range(0, topics.size())
//                .filter(x -> topics.get(x).getId() == id)
//                .findFirst();
//
//        if (index.isPresent()) {
//            topics.set(index.getAsInt(), topic);
//            return;
//        }

        return topicRepo.save(topic);

    }

    public void deleteTopic(long id) {
//        topics.removeIf(t -> t.getId() == id);
        topicRepo.deleteById(id);
    }
}
