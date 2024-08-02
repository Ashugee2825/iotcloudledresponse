package nitttr.iot;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TempCntrl
 */
@WebServlet("/TempCntrl")
public class TempCntrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TempCntrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("temp controller called");
		
		//READ INPUT PARAMETERS
		String temp = request.getParameter("temp");
		String deviceId = request.getParameter("deviceId");
				
		//CREATE TEMPERATURE DTO(DATA TRANSFER OBJECT)
		TempDTO tempDTO =new TempDTO();
		tempDTO.setDeviceId(deviceId);
		tempDTO.setTemp(temp);
		
		
		ServletContext ctx = getServletContext();
		try {
		ArrayList<TempDTO> list = (ArrayList<TempDTO>)ctx.getAttribute("tempList");
		
		list.add(tempDTO);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
