package com.tuners.tuners.repositoryTests;

import com.tuners.tuners.Repository.ItemMongoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
class TunersApplicationTests {

	@Autowired
	private ItemMongoRepository itemMongoRepository;

	@Test
	void save_Item_Repo_Test() {

	}

}
