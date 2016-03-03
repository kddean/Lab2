

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ToDoServlet
 */
@WebServlet({ "/ToDoServlet", "/ToDo" })
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Scanner s = new Scanner(System.in);
	String a = "";
	String input = "";
	int input2;
	Database data;
    /**
     * Default constructor. 
     */
    public ToDoServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		Database data = new Database();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("Welcome to the To Do System");
//		response.getWriter().append("\n");
//		response.getWriter().append("\n");
//		response.getWriter().append("What would you like to do? (Insert, Update, List, Delete, Exit)");
		
		//response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.getWriter().println("Welcome to the To Do System");
		response.getWriter().println();
		response.getWriter().println("What would you like to do? (Insert, Update, List, Delete, Exit)");
		//a = s.nextLine();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		a = request.getParameter("sel1");
		if (a.equals("Insert"))
		{
			System.out.println("Please enter a message.");
			input = request.getParameter("m");
			
		}
		else if (a.equals("Update"))
		{
			System.out.println("Please enter an id.");
			input2 = s.nextInt();
			System.out.println("Please enter a new message.");
			input = s.nextLine();
			
		}
		else if (a.equals("List"))
		{
			String list = "";
			list = data.getList();
			System.out.println(list);
		}
		else if (a.equals("Delete"))
		{
			System.out.println("Please enter an id to delete.");
			input2 = s.nextInt();
			
		}
		else if (a.equals("Exit"))
		{
			break;
		}
		else 
			System.out.println("That's not an option.");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
