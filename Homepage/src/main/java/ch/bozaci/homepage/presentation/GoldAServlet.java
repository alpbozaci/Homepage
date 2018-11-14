package ch.bozaci.homepage.presentation;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch.bozaci.homepage.business.PlayerBusiness;
import ch.bozaci.homepage.entity.Player;


/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/goldaServlet")
public class GoldAServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    private Logger logger = Logger.getLogger(GoldAServlet.class.getSimpleName());
    
    @Inject
    private PlayerBusiness playerBusiness;

    public GoldAServlet()
    {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Player> playerList = playerBusiness.getPlayerList();
        
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();

        for (Player player : playerList)
        {
            JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
            jsonObjectBuilder.add("firstname", player.getFirstname());
            jsonObjectBuilder.add("lastname", player.getLastname());
            jsonObjectBuilder.add("position", player.getPosition());
            jsonObjectBuilder.add("number", player.getNumber());
            
            JsonObject jsonObject = jsonObjectBuilder.build();
            jsonArrayBuilder.add(jsonObject);
        }
        
        JsonArray build = jsonArrayBuilder.build();
        
        logger.info(build.toString());
        
        response.setContentType("text/json");
        response.getWriter().append(build.toString());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request, response);
    }

}
