package es.daniel.test.etalentum.danijavatest.utils;

import es.daniel.test.etalentum.danijavatest.dto.CollectionDto;
import es.daniel.test.etalentum.danijavatest.dto.CoverPhotoDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.function.Predicate;

import static es.daniel.test.etalentum.danijavatest.utils.StringUtils.checkNullValueS;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

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