package com.tuners.tuners.Repository;

import com.tuners.tuners.Models.ItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemMongoRepository extends MongoRepository<ItemModel, String> {
}
