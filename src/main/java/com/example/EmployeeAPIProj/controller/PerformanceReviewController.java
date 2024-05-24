package com.example.EmployeeAPIProj.controller;

import com.example.EmployeeAPIProj.model.PerformanceReview;
import com.example.EmployeeAPIProj.service.PerformanceReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reviews")
public class PerformanceReviewController {
    @Autowired
    private PerformanceReviewService performanceReviewService;

    @PostMapping
    public PerformanceReview createPerformanceReview(@RequestBody PerformanceReview performanceReview) {
        return performanceReviewService.createPerformanceReview(performanceReview);
    }

    @GetMapping
    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewService.getAllPerformanceReviews();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerformanceReview> getPerformanceReviewById(@PathVariable Long id) {
        Optional<PerformanceReview> performanceReview = performanceReviewService.getPerformanceReviewById(id);
        return performanceReview.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerformanceReview> updatePerformanceReview(@PathVariable Long id, @RequestBody PerformanceReview performanceReviewDetails) {
        PerformanceReview updatedPerformanceReview = performanceReviewService.updatePerformanceReview(id, performanceReviewDetails);
        return ResponseEntity.ok(updatedPerformanceReview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerformanceReview(@PathVariable Long id) {
        performanceReviewService.deletePerformanceReview(id);
        return ResponseEntity.noContent().build();
    }
}
