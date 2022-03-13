package es.daniel.etalentum.danijava.utils;

import es.daniel.etalentum.danijava.dto.CollectionDto;
import es.daniel.etalentum.danijava.dto.CoverPhotoDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    private CollectionDto collectionDto;

    @BeforeEach
    void setUp() {
        collectionDto = new CollectionDto();
        CoverPhotoDto coverPhotoDto = new CoverPhotoDto();
        coverPhotoDto.setId("JF43242334");
        collectionDto.setId("8541819230");
        collectionDto.setTitle("Prueba test");
        collectionDto.setCoverPhotoDto(coverPhotoDto);
        collectionDto.setDescription("Esto es un test");

    }

    @Test
    void filterCollection() {
        assertTrue(CollectionUtils.filterCollection(collectionDto, "test"));

    }
}