package com.glarimy.cmad;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepo extends MongoRepository<LogEntry, String> {
	//public LogEntry create(LogEntry log);

}
