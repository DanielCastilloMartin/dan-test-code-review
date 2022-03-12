package es.daniel.test.etalentum.danijavatest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dan/etalentum/collection")
public interface ICollectionsController {

    @GetMapping("filter/{filter}")
    ResponseEntity<Object> getCollectionFiltered(@PathVariable("filter") String filter);
}
