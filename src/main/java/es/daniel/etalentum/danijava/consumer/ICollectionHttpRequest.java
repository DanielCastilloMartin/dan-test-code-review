package es.daniel.etalentum.danijava.consumer;

import es.daniel.etalentum.danijava.dto.CollectionDto;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ICollectionHttpRequest {

    public List<CollectionDto> getCollectionsListHttpRequest() throws URISyntaxException, IOException, InterruptedException;
}
