package org.example.finalproject.repository;

import org.example.finalproject.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
    List<Document> findByDoctor_docId(int doctorId);
    List<Document> findByUser_userId(int userId);
    List<Document> findByDoctor_docIdAndUser_userId(int doctorId, int userId);
}
