package es.daniel.test.etalentum.danijavatest.commons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericExit {

    private Integer state;

    private String message;

    private Object contains;

    public GenericExit(Integer state, String message, Object contains) {
        this.state = state;
        this.message = message;
        this.contains = contains;

    }
}
