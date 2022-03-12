package es.daniel.test.etalentum.danijavatest.service.impl;

import es.daniel.test.etalentum.danijavatest.service.ICollectionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CollectionsService implements ICollectionsService {


    @Override
    public ResponseEntity<Object> getCollectionsFilter(String filter) {
        return null;
    }
}
