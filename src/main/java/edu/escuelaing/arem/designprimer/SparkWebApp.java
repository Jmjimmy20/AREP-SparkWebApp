package edu.escuelaing.arem.designprimer;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

import edu.escuelaing.arem.math.LinkedList;
import edu.escuelaing.arem.math.Operacion;

public class SparkWebApp{

    public static void main(String[] args){
        port(getPort());
        // get("/hello", (req, res) -> "Hello Heroku");
        get("/calc", (req, res) -> mainPage(req, res));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) { 
           return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost) 
    }

    private static  String mainPage(Request req, Response res){
        String content = "<!DOCTYPE html>" + "<html>" + "<body>"
                + "<center>"
                + "<h1>Calculadora</h1>"
                + "<form action=\"/calc\">" 
                + "Neste site, use o laboratório 1 para mostrar os resultados"
                + "<h2>Inserir dados</h2>"
                + "  <input type=\"text\" name=\"data\" placeholder=\"Ej. 1,2,3\">" + "<br/><br/>"
                + "  <input type=\"submit\" value=\"Submit\">" + "</form>"
                + "</center>"
                + "</body>" + "</html>";
        return content;
    }

    
}
