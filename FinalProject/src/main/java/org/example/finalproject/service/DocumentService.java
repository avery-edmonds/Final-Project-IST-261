package org.example.finalproject.service;

import org.example.finalproject.model.Document;
import org.example.finalproject.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public List<Document> getDocumentsByDoctorId(int doctorId) {
        return documentRepository.findByDoctor_docId(doctorId);
    }

    public List<Document> getDocumentsByUserId(int userId) {
        return documentRepository.findByUser_userId(userId);
    }

    public List<Document> getDocumentsByDoctorAndUser(int doctorId, int userId) {
        return documentRepository.findByDoctor_docIdAndUser_userId(doctorId, userId);
    }
}
