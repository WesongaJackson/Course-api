package org.example.courseapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return List.of(
                new Topic("React","React Framework","Javascript Description"),
                new Topic("Spring","Spring Framework","Java Description"),
                new Topic("Django","Django Framework","Python Description")
        );
    }
}
