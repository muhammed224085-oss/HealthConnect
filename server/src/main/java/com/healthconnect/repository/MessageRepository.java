package com.healthconnect.repository;

import com.healthconnect.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findBySenderIdOrReceiverIdOrderByTimestampDesc(String senderId, String receiverId);
}
