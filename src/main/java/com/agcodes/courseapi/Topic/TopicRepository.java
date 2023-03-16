package com.agcodes.courseapi.Topic;

import com.agcodes.courseapi.Course.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, Long> {

//    public List<Course> getCourseByTopicId(long topicId);
}
