import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tcon")
public class tcon extends HttpServlet {
private static final long serialVersionUID = 1L;
      
    public tcon() {
        super();
        // TODO Auto-generated constructor stub
    }


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


response.setContentType("text/html");

String []access1={};
access1=request.getParameterValues("accessories");

String tag = request.getParameter("tag");
String type=request.getParameter("type");
String color = request.getParameter("color");

String ans="";
for(String x : access1)
{
ans+=x;
}

try {


Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

Statement stmt;
stmt=con.createStatement();
String sql = "insert into tshirt(access,tag,type,color) values('"+ans+"','"+tag+"','"+type+"','"+color+"');";
stmt.executeUpdate(sql);


PrintWriter out = response.getWriter();
out.println("<html><body>");
out.println("<table border=2><tr>");
out.println("<td>OrderNO</td>");
out.println("<td>access</td>");
out.println("<td>tag</td>");
out.println("<td>type</td>");
out.println("<td>color</td></tr>");

String query = "select * from tshirt;";
ResultSet rs = stmt.executeQuery(query);

while(rs.next())
{
out.println("<tr><td>"+rs.getInt(1)+"</td>");
out.println("<td>"+rs.getString(2)+"</td>");
out.println("<td>"+rs.getString(3)+"</td>");
out.println("<td>"+rs.getString(4)+"</td>");
out.println("<td>"+rs.getString(5)+"</td></tr>");
}
out.println("</table></body></html>");


} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}