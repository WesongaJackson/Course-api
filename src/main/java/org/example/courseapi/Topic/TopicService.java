package org.example.courseapi.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TopicService {
    @Autowired
    private TopicRepositry topicRepositry;
//    private List<Topic> topics = new ArrayList<>(List.of(
//            new Topic("React", "React Framework", "Javascript Description"),
//            new Topic("Spring", "Spring Framework", "Java Description"),
//            new Topic("Django", "Django Framework", "Python Description")
//    ));

    public List<Topic> getAllTopics() {
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepositry.findAll().forEach(topics::add);
        return topics;

    }

    public Optional<Topic> getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepositry.findById(id);

    }

    public void addTopic(Topic topic) {
//        topics.add(topic);
        topicRepositry.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i <topics.size(); i++) {
//            Topic t=topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i,topic);
//                return;
//
//            }
//
//        }
        topicRepositry.save(topic);


    }

    public void deleteTopic(String id) {

//        topics.removeIf(topic -> topic.getId().equals(id));
        topicRepositry.deleteById(id);
    }
}
