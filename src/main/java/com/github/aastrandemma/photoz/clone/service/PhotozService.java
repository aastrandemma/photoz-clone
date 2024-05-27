package com.github.aastrandemma.photoz.clone.service;

import com.github.aastrandemma.photoz.clone.model.Photo;
import com.github.aastrandemma.photoz.clone.repository.PhotozRepository;
import org.springframework.stereotype.Service;

//@Component
@Service
public class PhotozService {
    private final PhotozRepository photozRepository;

    public PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }

    public Photo save(String filename, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(filename);
        photo.setData(data);
        photozRepository.save(photo);
        return photo;
    }
}