package es.daniel.test.etalentum.danijavatest.service;


import org.springframework.http.ResponseEntity;

public interface ICollectionsService {

    ResponseEntity<Object> getCollectionsFilter(String filter);

}
