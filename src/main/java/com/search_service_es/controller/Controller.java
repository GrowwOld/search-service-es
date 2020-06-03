package com.search_service_es.controller;

import com.search_service_es.dto.Employee;
import com.search_service_es.intf.service_intf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    public service_intf serv;

    @PostMapping("/ingest")
    public HttpStatus ingest_data() throws IOException, InterruptedException {
        return serv.ingest_data();
    }

    @GetMapping("/example")
    public List<Employee> get_all_data() throws IOException {
        return serv.get_all_data();
    }

    @GetMapping("/search/{searchString}")
    public List<Employee> get_specific_docs(@PathVariable String searchString) throws IOException {
        return serv.get_specific_docs(searchString);
    }

}
