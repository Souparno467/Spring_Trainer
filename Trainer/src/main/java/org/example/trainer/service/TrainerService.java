package org.example.trainer.service;

import org.example.trainer.entity.Trainer;

import java.util.List;

public interface TrainerService {                   // Interface for Trainer Service
    Trainer addTrainer(Trainer trainer);// Method to add a new trainer
    List<Trainer> getAllTrainers();// Method to get all trainers
    Trainer getTrainerById(Long id);// Method to get a trainer by ID
    Trainer updateTrainer(Long id, Trainer trainer);// Method to update a trainer by ID
    void deleteTrainer(Long id);// Method to delete a trainer by ID
    List<Trainer> getPythonTrainers();// Method to get trainers who teach Python
    List<Trainer> getGmailTrainers();// Method to get trainers with Gmail addresses
    Double getTotalSalary();// Method to calculate the total salary of all trainers
    Trainer getTopEarner();// Method to get the trainer with the highest salary
    void deleteCppTrainers();// Method to delete trainers who teach C++
}
