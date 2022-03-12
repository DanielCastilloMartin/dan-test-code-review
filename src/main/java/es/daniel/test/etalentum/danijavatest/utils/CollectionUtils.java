package es.daniel.test.etalentum.danijavatest.utils;

import es.daniel.test.etalentum.danijavatest.dto.CollectionDto;

import java.util.function.Predicate;

import static es.daniel.test.etalentum.danijavatest.utils.StringUtils.checkNullValueS;

public class CollectionUtils {

    private CollectionUtils(){
        throw new IllegalStateException();
    }

    public static Predicate<CollectionDto> filterCollection(String filter){
        Predicate<CollectionDto> collectionId           =  (CollectionDto p) -> checkNullValueS(p.getId().toLowerCase()).contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionTitle        =  (CollectionDto p) -> checkNullValueS(p.getTitle().toLowerCase()).contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionDescription  =  (CollectionDto p) -> checkNullValueS(p.getDescription().toLowerCase()).contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionCoverId      =  (CollectionDto p) -> checkNullValueS(p.getCoverPhotoDto().getId()).toLowerCase().contains(filter.toLowerCase());

        return collectionId.or(collectionTitle).or(collectionDescription).or(collectionCoverId);
    }

}
