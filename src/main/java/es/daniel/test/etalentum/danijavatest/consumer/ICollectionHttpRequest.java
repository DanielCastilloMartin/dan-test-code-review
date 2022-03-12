package es.daniel.test.etalentum.danijavatest.consumer;

import es.daniel.test.etalentum.danijavatest.dto.CollectionDto;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ICollectionHttpRequest {

    public List<CollectionDto> getCollectionsListHttpRequest() throws URISyntaxException, IOException, InterruptedException;
}
