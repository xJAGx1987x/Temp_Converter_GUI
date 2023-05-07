public class TempConverter {

    public static double convertAll(String inString, String outString, double temp ){
        double result = 0 ;

        if(inString.equals("Fahrenheit") ){
            if(outString.equals("Celsius" ) ){
                result = fahrToCelsius(temp) ;
            }
            else if(outString.equals("Kelvin") ){
                result = fahrToKelvin(temp) ;
            }
            else{
                result = temp ;
            }

        }
        else if(inString.equals("Celsius" ) ){
            if(outString.equals("Fahrenheit" ) ){
                result = celsiusToFahr(temp) ;
            }
            else if(outString.equals("Kelvin") ){
                result = celsiusToKelvin(temp) ;
            }
            else{
                result = temp ;
            }
        }
        else if(inString.equals("Kelvin") ){
            if(outString.equals("Fahrenheit") ){
                result = kelvinToFahr(temp) ;
            }
            else if(outString.equals("Celsius") ){
                result = kelvinToCelsius(temp) ;
            }
            else {
                result = temp ;
            }
        }
        return result ;
    }

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

}
