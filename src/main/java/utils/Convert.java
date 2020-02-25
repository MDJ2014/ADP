package utils;

public class Convert {
	
	public static String makeCamel(String input)  {
		String[] parts = input.split("\\W|_|\\s");
        String output = "";


        for (String part : parts){
            output += toProperCase(part);
        }

        return output;
    }
	
    static String toProperCase(String part) {
        return part.substring(0, 1).toUpperCase() +
                part.substring(1).toLowerCase();
    }
    
	}

