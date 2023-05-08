public class TempConverter {

    public static double convertAll(String inString, String outString, double temp ){

        double result;

        if (inString.equalsIgnoreCase(outString)) {
            return temp;
        }

        if (inString.equalsIgnoreCase("kelvin")) {
            if (outString.equalsIgnoreCase("celsius")) {
                result = kelvinToCelsius(temp);
            }
            else {
                result = kelvinToFahr(temp);
            }
        }
        else if (inString.equalsIgnoreCase("celsius")) {
            if (outString.equalsIgnoreCase("kelvin")) {
                result = celsiusToKelvin(temp);
            }
            else {
                result = celsiusToFahr(temp);
            }
        }
        else {
            if (outString.equalsIgnoreCase("celsius")) {
                result = fahrToCelsius(temp);
            }
            else {
                result = fahrToKelvin(temp);
            }
        }
        return result ;
    } // End convertAll

    public static double celsiusToFahr( double t ){
        return ( ( t * 1.8 ) + 32 );
    }

    public static double celsiusToKelvin( double t ){
        return ( t + 273.15 ) ;
    }

    public static double fahrToCelsius( double t ){
        return ( ( t - 32 ) / 1.8 ) ;
    }

    public static double fahrToKelvin( double t ){
        double c = fahrToCelsius( t ) ;
        return ( c + 273.15 ) ;
    }

    public static double kelvinToCelsius( double t ){
        return ( t - 273.15 ) ;
    }

    public static double kelvinToFahr( double t ){
        return ( ( t * 1.8) - 459.67 ) ;
    }

    public static boolean isValidTemp(String inString, double temp) {
        return convertAll(inString, "kelvin", temp) >= 0;
    }

}
