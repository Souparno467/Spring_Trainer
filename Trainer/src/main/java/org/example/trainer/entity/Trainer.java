package org.example.trainer.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor            // This annotation is used to generate a constructor with required arguments
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate ID
    private Long id;

    @NonNull               // NonNull ensures that this field must be provided
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NonNull
    @NotBlank(message = "Phone number is required")     // NotBlank ensures that the phone number is not empty
    private String phone;

    @NonNull
    @NotBlank(message = "Address is required")
    private String address;

    @NonNull
    @Email(message = "Invalid email format")
    @Size(max = 100, message = "Email must not exceed 100 characters")
    private String email;

    @NonNull
    @NotBlank(message = "Subject is required")
    private String subject;

    @NonNull
    @Positive(message = "Salary must be positive")   // Positive ensures that the salary is greater than zero
    private double salary;
}
