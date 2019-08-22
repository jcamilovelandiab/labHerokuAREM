package edu.escuelaing.arem;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/hello", (req, res) -> "Hello Heroku");
    }
}
