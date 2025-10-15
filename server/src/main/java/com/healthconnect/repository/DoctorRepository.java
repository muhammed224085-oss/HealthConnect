package com.healthconnect.repository;

import com.healthconnect.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Optional<Doctor> findByEmail(String email);
    boolean existsByEmail(String email);
}
