package CRM2.CRM2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet ("/TestDbServlet")
public class TestJDBC extends HttpServlet {
    private static final  long serialVersionUID =1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException {


        String jdcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";
        String driver="com.mysql.jdbc.Driver";
        try {

            PrintWriter out=response.getWriter();
            out.println("Connecting to database" + jdcUrl);

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdcUrl, user, pass);

            System.out.println("Connection successful!");

            myConn.close();
        } catch (Exception exc) {
            exc.printStackTrace();
            throw  new ServletException(exc);
        }
    }

}
