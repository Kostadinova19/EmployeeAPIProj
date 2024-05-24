package com.example.EmployeeAPIProj.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class PerformanceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate reviewDate;
    private String review;


    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}