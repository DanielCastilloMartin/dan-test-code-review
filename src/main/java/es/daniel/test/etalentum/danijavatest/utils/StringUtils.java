package es.daniel.test.etalentum.danijavatest.utils;

public class StringUtils {

    private StringUtils(){
        throw new IllegalStateException();

    }

    public static String checkNullValueS(String value){
        return value != null ? value : "";

    }
}
