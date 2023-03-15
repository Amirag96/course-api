package com.agcodes.courseapi.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
            new Topic(1, "Java", "Java Basics"),
            new Topic(2, "Spring Boot", "Spring Boot Essentials"),
            new Topic(3, "Design Patterns", "Main design patterns")));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(long id) {
        return topics.stream().filter(t-> t.getId() == id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, long id) {

        OptionalInt index= IntStream.range(0, topics.size())
                .filter(x-> topics.get(x).getId() == id)
                .findFirst();

        if(index.isPresent()) {
            topics.set(index.getAsInt(),topic);
            return;
        }

    }

    public void deleteTopic(long id) {
        topics.removeIf(t-> t.getId() == id);
    }
}
