package com.agcodes.courseapi.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Long> {
    public List<Course> findByTopicId(long topicId);
}
