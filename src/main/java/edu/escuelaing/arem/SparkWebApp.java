package edu.escuelaing.arem;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class SparkWebApp 
{
    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello Heroku");

        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
        
        post("/mean",(req,res)-> {
            String[] numbers=req.body().split(" ");
            LinkedList<Double> list = new LinkedList<Double>();
            for(String i: numbers){ 
                list.add_back(Double.parseDouble(i));    
            }
            return App.mean(list);
        });

        post("/stdeviation",(req,res)-> {
            String[] numbers=req.body().split(" ");
            LinkedList<Double> list=new LinkedList<Double>();
            for(String i: numbers){
                list.add_back(Double.parseDouble(i));
            }
            return App.standardDeviation(list);
        });

    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  Please. Insert the numbers separated by spaces:<br>"
                + "  <input type=\"text\" name=\"numbers\" value=\"\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\". Also, the mean and the standard deviation will be calculated and showed on that page. \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        String[] numbers=req.queryParams("numbers").split(" ");
        LinkedList<Double> list = new LinkedList<Double>();
        for(String i: numbers){
            list.add_back(Double.parseDouble(i));
        }
        return "The mean of the given data is: "+ App.mean(list) +", and The standard deviation is: "+App.standardDeviation(list) ;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
