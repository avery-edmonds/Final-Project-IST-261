package org.example.finalproject.controller;

import org.example.finalproject.model.Document;
import org.example.finalproject.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/documents")
    public List<Document> getDocuments(
            @RequestParam(required = false) Integer doctorId,
            @RequestParam(required = false) Integer userId) {

        if (doctorId != null && userId != null) {
            return documentService.getDocumentsByDoctorAndUser(doctorId, userId);
        } else if (doctorId != null) {
            return documentService.getDocumentsByDoctorId(doctorId);
        } else if (userId != null) {
            return documentService.getDocumentsByUserId(userId);
        } else {
            return documentService.getAllDocuments();
        }
    }
}
