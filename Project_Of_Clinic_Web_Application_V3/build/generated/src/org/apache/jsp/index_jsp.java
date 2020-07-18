package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Dreamtemplatestudio</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table width=\"881\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"white\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td width=\"292\"><img src=\"images/logo.jpg\" width=\"292\" height=\"79\" alt=\"\"/></td>\n");
      out.write("\t\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td class=\"tab\"><a href=\"index.jsp\" class=\"top\">HOME</a></td>\n");
      out.write("\t\t\t\t<td class=\"tab\"><a href=\"Services_List.jsp\" class=\"top\">SERVICES</a></td>\n");
      out.write("\t\t\t\t<td class=\"tab\"><a href=\"Doctors_List.jsp\" class=\"top\">DOCTORS</a></td>\n");
      out.write("\t\t\t\t<td class=\"tab\"><a href=\"List_All_Appointments_In_The_System.jsp\" class=\"top\">APPOINTMENTS</a></td>\n");
      out.write("\t\t\t\t<td class=\"tab\"><a href=\"mail.jsp\" class=\"top\">CONTACT US</a></td>\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\" style=\"border-top:2px solid #10ADBE;\" ><a href=\"#\" ><img src=\"images/banner.jpg\" width=\"881\" height=\"329\" border=\"0\" alt=\"\"/></a></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\" style=\"padding-top:8px; padding-left:4px;\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t<tr><div class=\"inner_copy\"><div class=\"inner_copy\">All <a href=\"http://www.magentothemesworld.com\" title=\"Best Magento Templates\">premium Magento themes</a> at magentothemesworld.com!</div></div>\n");
      out.write("\t\t\t\t<td width=\"225\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                   \n");
      out.write("        \n");
      out.write("      <form method=\"post\" action=\"Entrance_Screen_Of_A_Doctor.jsp\">\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"heading_2\">LogIn</td>\n");
      out.write("                    </tr>\n");
      out.write("                                        \n");
      out.write("                     \n");
      out.write("                    <tr> \n");
      out.write("                            <td class=\"left_link\"><a href=\"#\" class=\"leftlink\">UserName  <input type=\"text\" name=\"txtdrname\"/></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"#\" class=\"leftlink\">Password  <input type=\"text\" name=\"txtdrsurname\"/> </a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"#\" class=\"leftlink\"><input type=\"submit\" name=\"btnentry\" value=\"Entry\" /></a></td>\n");
      out.write("                    </tr>\n");
      out.write("          </form>                               \n");
      out.write("                     \n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"heading_2\">More</td>\n");
      out.write("                    </tr>\n");
      out.write("                                       \n");
      out.write("                                        \n");
      out.write("                <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"aboutus.jsp\" class=\"leftlink\">About Us</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"Services_List.jsp\" class=\"leftlink\">Services</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"Doctors_List.jsp\" class=\"leftlink\">Doctors</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"List_All_Appointments_In_The_System.jsp\" class=\"leftlink\">Appointments</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td class=\"left_link\"><a href=\"contactus.jsp\" class=\"leftlink\">Contact Us</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</table></td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\t\t\t\t<td align=\"center\" valign=\"top\"><table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td class=\"heafing\">Welcome</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td class=\"text\"><strong>Entrance Screen Of A Doctor</strong><br />\n");
      out.write("\t\t\t\t\t\t\t  ");

       
        Connection connect;
        String drivername = "oracle.jdbc.driver.OracleDriver";
        String serverName = "127.0.0.1";
        String portNumber = "1521";
        String sid = "XE";
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String username = "SYSTEM";
        String password = "sys";
      

        String doctorname = request.getParameter("txtdrname");
        String doctorsurname = request.getParameter("txtdrsurname");
      
        try 
        {  
            Class.forName(drivername);  
            connect = DriverManager.getConnection(url, username, password);
          
            PreparedStatement ps=connect.prepareStatement("select * from tbl_doctors where dr_name=? and  dr_surname=?");
          
            ps.setString(1, doctorname);
            ps.setString(2, doctorsurname);
            
            ResultSet rs = ps.executeQuery ();      
      
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <Br>\n");
      out.write("      <Br>\n");
      out.write("      <Br>\n");
      out.write(" <TABLE BORDER=\"1\" BGCOLOR=\"FFFFFF\" width='75%' cellspacing='1' cellpadding='0' bordercolor=\"black\" border='1'>\n");
      out.write("    <TR>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Id</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Doctor Name</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Doctor Surname</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Certificate No</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Branch</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Address</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Town</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Place Of Birth</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Date Of Birth</TH>\n");
      out.write("        <TH bgcolor='#FFFFFF'><font size='2'>Telephone</TH>\n");
      out.write("    </TR>\n");
      out.write("   \n");
      out.write("    ");
 while(rs.next ()){ 
      out.write("\n");
      out.write("        <TR>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("id") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("dr_name") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("dr_surname") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("certificate_no") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("branch") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("address") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("town") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("place_of_birth") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("date_of_birth") );
      out.write("</center></TD>\n");
      out.write("            <TD> <font size='2'><center>");
      out.print( rs.getString ("telephone") );
      out.write("</center></TD>\n");
      out.write("        </TR>\n");
      out.write("\n");
      out.write("        ");
 }  
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("                                                </td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t");
         ps.close();
            connect.close();
         
        } 
        catch (Exception e) 
        {  
                out.println("Baglantida Hata Bulunmaktadir...");
        } 
      
        
      out.write("\t\t\t\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                       \n");
      out.write("        \n");
      out.write("\t\t\t\t</table></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table></td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\" class=\"copy_bg\" style=\"padding-top:8px;padding-left:4px\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"s_link\">Customer Service</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"s_link\">Create Account</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"s_link\">Career</a>\n");
      out.write("\t\t\t<a href=\"#\" class=\"s_link\">Contact Us</a>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"2\" class=\"copy_bg\" style=\"padding:11px\">\n");
      out.write("\t\t\t<center>\n");
      out.write("\t\t\t\t<div class=\"fleft\"> </div>\n");
      out.write("\t\t\t</center>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
