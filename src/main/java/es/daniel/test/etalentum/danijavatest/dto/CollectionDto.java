package es.daniel.test.etalentum.danijavatest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CollectionDto implements Serializable {

    private Long id;

    private String title;

    private String description;

    private CoverPhotoDto coverPhotoDto;

}
