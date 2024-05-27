package com.github.aastrandemma.photoz.clone.repository;

import com.github.aastrandemma.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}