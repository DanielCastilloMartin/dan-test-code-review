package es.daniel.test.etalentum.danijavatest.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class CollectionsConfig {

    @Value("${adn.header.wsse.url}")
    private String publicKey;

    @Value("${endpoint.url.value}")
    private String urlEndPoint;

}
