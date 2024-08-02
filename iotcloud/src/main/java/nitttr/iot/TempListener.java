package nitttr.iot;

import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TempListener
 *
 */
@WebListener
public class TempListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TempListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         
    
    	ServletContext ctx = sce.getServletContext();
    	
    	ArrayList<TempDTO> list = new ArrayList<TempDTO>();
    	ctx.setAttribute("tempList",list);
    
    }
	
}
