package com.agcodes.courseapi.Course;

import com.agcodes.courseapi.Topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private TopicRepository topicRepo;

    public List<Course> getAllCourses(long topicId) {

        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses::add);
        return courses;

    }

    public Course getCourse(long id) {
        return courseRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User with id %d not found", id)));
    }

    public Course addCourse(Long topicId,Course course) {
        return topicRepo.findById(topicId).map(topic-> {
            course.setTopic(topic);
            return courseRepo.save(course);
        }).orElseThrow(() -> new InvalidConfigurationPropertyValueException("topicId",topicId,"TOPIC_NOT_FOUND"));
    }

    public Course updateCourse(Long topicId,Long courseId,Course course) {

        if(!courseRepo.existsById(courseId)) {
            throw new InvalidConfigurationPropertyValueException("courseId", courseId, "COURSE_NOT_FOUND");
        }
        return topicRepo.findById(topicId).map(topic -> {
                course.setTopic(topic);
                return courseRepo.save(course);
            }).orElseThrow(() -> new InvalidConfigurationPropertyValueException("topicId", topicId, "TOPIC_NOT_FOUND"));

    }

    public void deleteCourse(long id) {
        courseRepo.deleteById(id);
    }
}
