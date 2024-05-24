package com.example.EmployeeAPIProj.repository;

import com.example.EmployeeAPIProj.model.PerformanceReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceReviewRepository extends JpaRepository<PerformanceReview, Long> {
}
