package es.daniel.test.etalentum.danijavatest.service.impl;

import es.daniel.test.etalentum.danijavatest.commons.GenericExit;
import es.daniel.test.etalentum.danijavatest.service.ICollectionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CollectionsService implements ICollectionsService {

    @Override
    public ResponseEntity<Object> getCollectionsFilter(String filter) {
        log.info("GetCollectionsFilter {}", filter);
        return new ResponseEntity<>(new GenericExit(200, null, filter), HttpStatus.OK);

    }



}
