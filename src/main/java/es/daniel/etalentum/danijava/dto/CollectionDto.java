package es.daniel.etalentum.danijava.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionDto implements Serializable {

    private String id;

    private String title;

    private String description;

    @JsonProperty("cover_photo")
    private CoverPhotoDto coverPhotoDto;

}
