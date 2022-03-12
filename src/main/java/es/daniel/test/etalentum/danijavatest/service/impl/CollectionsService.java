package es.daniel.test.etalentum.danijavatest.service.impl;

import es.daniel.test.etalentum.danijavatest.commons.GenericExit;
import es.daniel.test.etalentum.danijavatest.consumer.impl.CollectionHttpRequest;
import es.daniel.test.etalentum.danijavatest.dto.CollectionDto;
import es.daniel.test.etalentum.danijavatest.service.ICollectionsService;
import es.daniel.test.etalentum.danijavatest.utils.CollectionUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
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

        return new ResponseEntity<>(new GenericExit(200, null, dtoList), HttpStatus.OK);
    }


    private List<CollectionDto> applyFilterService(String filter, List<CollectionDto> collectionDtoList){
        List<CollectionDto> collectionDtoListAux = new ArrayList<>();
        List<Datos> datosOrdenVigenciaN = consultaTestMayoristaDatosResponse
                .stream()
                .filter(p -> Objects.nonNull(p.getFechaFin()))
                .filter(p -> p.getIndVigencia().equalsIgnoreCase(IND_VIGENCIA_N))
                .sorted(Comparator.comparing(Datos::getFechaFin).reversed())
                .collect(Collectors.toList());
        if(collectionDtoList != null && !collectionDtoList.isEmpty()){
            collectionDtoListAux = collectionDtoList.stream().filter(CollectionUtils::filterCollection).


        }

        return collectionDtoListAux;
    }
}
