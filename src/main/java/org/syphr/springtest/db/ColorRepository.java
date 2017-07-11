package org.syphr.springtest.db;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.syphr.springtest.model.ColorDTO;

public interface ColorRepository extends MongoRepository<ColorDTO, String>
{}
