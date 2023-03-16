package com.agcodes.courseapi.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/topics")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all courses that belong to a particular Topic
    @RequestMapping(method = RequestMethod.GET, value = "/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable long topicId) {

        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable long id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{topicId}/courses")
    public void addCourse(@PathVariable long topicId,@RequestBody Course course) {

        courseService.addCourse(topicId,course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{topicId}/courses/{courseId}")
    public void updateCourse(@PathVariable long topicId,
                             @PathVariable long courseId,
                             @RequestBody Course course) {
        courseService.updateCourse(topicId,courseId,course);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        courseService.deleteCourse(id);
    }

}
