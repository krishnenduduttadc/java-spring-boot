package com.example.demo32.repository;

import com.example.demo32.model.LogEvent;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LogEventRepository extends ElasticsearchRepository<LogEvent, String> {
}

