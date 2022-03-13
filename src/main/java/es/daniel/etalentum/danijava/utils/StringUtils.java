package es.daniel.etalentum.danijava.utils;

public class StringUtils {

    private StringUtils(){
        throw new IllegalStateException();

    }

    public static String checkNullValueS(String value){
        return value != null ? value : "";

    }
}
