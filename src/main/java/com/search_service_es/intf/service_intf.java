package com.search_service_es.intf;

import com.search_service_es.dto.Employee;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.util.List;

public interface service_intf {
    HttpStatus ingest_data() throws IOException, InterruptedException;

    List<Employee> get_all_data() throws IOException;

    List<Employee> get_specific_docs(String search_string) throws IOException;
}
