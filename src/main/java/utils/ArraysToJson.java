package utils;

import java.util.HashMap;
import java.util.Map;


public class ArraysToJson {
	
	public static Object combineArrays(String[] arrayKeys, Integer[] arrayValues){

        Map<String, Integer> marks = new HashMap<String, Integer>();

             for( int i = 0; i < arrayKeys.length; i++ ){

            marks.put( arrayKeys[i], arrayValues[i] );
        }


        return marks;
    }

}
