package com.search_service_es.intf;

import com.search_service_es.dto.Employee;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.util.List;

public interface bulk_insert {
    HttpStatus ingestdata(List<Employee> employee) throws InterruptedException, IOException;
}
