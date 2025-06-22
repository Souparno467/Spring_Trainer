package org.example.trainer.repository;

import org.example.trainer.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {// Repository interface for Trainer entity

    List<Trainer> findBySubjectIgnoreCase(String subject);// Find trainers by subject, ignoring case

    List<Trainer> findByEmailEndingWith(String suffix);// Find trainers by email ending with a specific suffix

    Trainer findFirstByOrderBySalaryDesc();// Find the trainer with the highest salary

    List<Trainer> findAllBySubjectIgnoreCase(String subject);// Find all trainers by subject, ignoring case
}
