package es.daniel.etalentum.danijava.service;


import org.springframework.http.ResponseEntity;

public interface ICollectionsService {

    ResponseEntity<Object> getCollectionsFilter(String filter);

}
