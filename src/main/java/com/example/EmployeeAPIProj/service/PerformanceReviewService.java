package com.example.EmployeeAPIProj.service;

import com.example.EmployeeAPIProj.model.PerformanceReview;
import com.example.EmployeeAPIProj.repository.PerformanceReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceReviewService {
    @Autowired
    private PerformanceReviewRepository performanceReviewRepository;

    public PerformanceReview createPerformanceReview(PerformanceReview performanceReview) {
        return performanceReviewRepository.save(performanceReview);
    }

    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewRepository.findAll();
    }

    public Optional<PerformanceReview> getPerformanceReviewById(Long id) {
        return performanceReviewRepository.findById(id);
    }

    public PerformanceReview updatePerformanceReview(Long id, PerformanceReview performanceReviewDetails) {
        PerformanceReview performanceReview = performanceReviewRepository.findById(id).orElseThrow(() -> new RuntimeException("Performance review not found"));

        performanceReview.setReviewDate(performanceReviewDetails.getReviewDate());
        performanceReview.setReview(performanceReviewDetails.getReview());

        return performanceReviewRepository.save(performanceReview);
    }

    public void deletePerformanceReview(Long id) {
        PerformanceReview performanceReview = performanceReviewRepository.findById(id).orElseThrow(() -> new RuntimeException("Performance review not found"));
        performanceReviewRepository.delete(performanceReview);
    }
}
