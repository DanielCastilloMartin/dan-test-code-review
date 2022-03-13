package es.daniel.etalentum.danijava.service.impl;

import es.daniel.etalentum.danijava.commons.GenericExit;
import es.daniel.etalentum.danijava.dto.CollectionDto;
import es.daniel.etalentum.danijava.consumer.impl.CollectionHttpRequest;
import es.daniel.etalentum.danijava.service.ICollectionsService;
import es.daniel.etalentum.danijava.utils.CollectionUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CollectionsService implements ICollectionsService {

    private final CollectionHttpRequest collectionHttpRequest;

    @Autowired
    public CollectionsService(CollectionHttpRequest collectionHttpRequest) {
        this.collectionHttpRequest = collectionHttpRequest;
    }

    @Override
    public ResponseEntity<Object> getCollectionsFilter(String filter) {
        log.info("GetCollectionsFilter {}", filter);
        List<CollectionDto> dtoList = new ArrayList<>();
        try {
            dtoList = collectionHttpRequest.getCollectionsListHttpRequest();

        } catch (URISyntaxException | IOException | InterruptedException e) {
            log.error("Se ha producido un error en la request {}", e.getMessage());
            Thread.currentThread().interrupt();

        }
        return new ResponseEntity<>(new GenericExit(200, null, applyFilterService(filter, dtoList)), HttpStatus.OK);

    }

    private List<CollectionDto> applyFilterService(String filter, List<CollectionDto> collectionDtoList){
        List<CollectionDto> collectionDtoListAux = new ArrayList<>();

        if(collectionDtoList != null && !collectionDtoList.isEmpty()){
            collectionDtoListAux = collectionDtoList.stream()
                    .filter(p -> CollectionUtils.filterCollection(p, filter))
                    .collect(Collectors.toList());

        }

        return collectionDtoListAux;
    }
}
