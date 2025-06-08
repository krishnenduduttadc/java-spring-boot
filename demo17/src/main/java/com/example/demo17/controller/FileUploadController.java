package com.example.demo17.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/files")
public class FileUploadController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // Set an absolute path for reliable storage
            String uploadDir = "C:/uploads/"; // 🔁 You can change this to any existing directory

            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs(); // Create directory if not exists
            }

            String filePath = uploadDir + file.getOriginalFilename();
            file.transferTo(new File(filePath));

            return ResponseEntity.ok("✅ File uploaded: " + file.getOriginalFilename());
        } catch (IOException e) {
            return ResponseEntity.status(500).body("❌ Upload failed: " + e.getMessage());
        }
    }
}
