package com.agcodes.courseapi.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController

@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/{id}")
    public Topic getTopic(@PathVariable long id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Topic addTopic(@RequestBody Topic topic){
        return topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT,path = "/{id}")
    public Topic updateTopic(@RequestBody Topic topic,@PathVariable long id){

        return topicService.updateTopic(topic,id);
    }


    @RequestMapping(method=RequestMethod.DELETE,path = "/{id}")
    public void deleteTopic(@PathVariable long id){
        topicService.deleteTopic(id);
    }



}
