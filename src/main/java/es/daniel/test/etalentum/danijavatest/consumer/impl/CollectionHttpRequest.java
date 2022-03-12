package es.daniel.test.etalentum.danijavatest.consumer.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import es.daniel.test.etalentum.danijavatest.config.CollectionsConfig;
import es.daniel.test.etalentum.danijavatest.consumer.ICollectionHttpRequest;
import es.daniel.test.etalentum.danijavatest.dto.CollectionDto;
import es.daniel.test.etalentum.danijavatest.utils.JsonUtils;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.List;

@Component
public class CollectionHttpRequest implements ICollectionHttpRequest {

    private final CollectionsConfig collectionsConfig;

    @Autowired
    public CollectionHttpRequest(CollectionsConfig collectionsConfig){
        this.collectionsConfig = collectionsConfig;

    }

    @Override
    public List<CollectionDto> getCollectionsListHttpRequest() throws URISyntaxException, IOException, InterruptedException {
        var httpClient = HttpClient.newBuilder().build();
        URI uri = new URIBuilder(collectionsConfig.getUrlEndPoint()).
                addParameter("client_id",
                        new String(Base64.getDecoder().decode(collectionsConfig.getPublicKey())))
                .build() ;

        var request = HttpRequest.newBuilder(uri)
                .GET()
                .build();

        return JsonUtils.convertFromJsonToList(httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body(),
                new TypeReference<List<CollectionDto>>(){});
    }
}
