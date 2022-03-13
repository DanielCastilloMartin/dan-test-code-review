package es.daniel.etalentum.danijava.utils;

import es.daniel.etalentum.danijava.dto.CollectionDto;

import java.util.function.Predicate;

public class CollectionUtils {

    private CollectionUtils(){
        throw new IllegalStateException();
    }

    public static boolean filterCollection(CollectionDto collectionDto, String filter){
        Predicate<CollectionDto> collectionId           =  (CollectionDto p) -> StringUtils.checkNullValueS(p.getId()).toLowerCase().contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionTitle        =  (CollectionDto p) -> StringUtils.checkNullValueS(p.getTitle()).toLowerCase().contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionDescription  =  (CollectionDto p) -> StringUtils.checkNullValueS(p.getDescription()).toLowerCase().contains(filter.toLowerCase());
        Predicate<CollectionDto> collectionCoverId      =  (CollectionDto p) -> StringUtils.checkNullValueS(p.getCoverPhotoDto() != null ?
                p.getCoverPhotoDto().getId() : null).toLowerCase().contains(filter.toLowerCase());

        Predicate<CollectionDto> collection = collectionId.or(collectionTitle).or(collectionDescription).or(collectionCoverId);

        return collection.test(collectionDto);
    }

}
