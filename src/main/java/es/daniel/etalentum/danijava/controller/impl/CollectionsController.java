package es.daniel.etalentum.danijava.controller.impl;

import es.daniel.etalentum.danijava.controller.ICollectionsController;
import es.daniel.etalentum.danijava.service.ICollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectionsController implements ICollectionsController {

    private final ICollectionsService collectionsService;

    @Autowired
    public CollectionsController(ICollectionsService collectionsService){
        this.collectionsService = collectionsService;

    }

    @Override
    public ResponseEntity<Object> getCollectionFiltered(@PathVariable("filter") String filter) {
        return collectionsService.getCollectionsFilter(filter);

    }

}
