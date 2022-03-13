package es.daniel.etalentum.danijava.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest/")
public interface ICollectionsController {

    @GetMapping("/getCollectionFilter/{filter}")
    ResponseEntity<Object> getCollectionFiltered(@PathVariable("filter") String filter);
}
