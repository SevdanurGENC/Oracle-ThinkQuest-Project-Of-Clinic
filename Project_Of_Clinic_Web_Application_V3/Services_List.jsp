<%-- 
    Document   : Doctors_List
    Created on : Mar 29, 2012, 3:15:37 AM
    Author     : Sevdanur GENC
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>  
<%@page import="java.sql.ResultSet"%>  
<%@page import="java.sql.Statement"%>  
<%@page import="java.sql.Connection"%>  
<%@page import="javax.naming.Context"   %>  
<%@page import="javax.naming.InitialContext"   %>  
<%@page import="javax.naming.NamingException"   %>  
<%@page import="javax.sql.DataSource"   %>  
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Dreamtemplatestudio</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table width="881" border="0" align="center" cellpadding="0" cellspacing="0" class="white">
	<tr>
		<td width="292"><img src="images/logo.jpg" width="292" height="79" alt=""/></td>
	
	</tr>
	<tr>
		<td colspan="2"><table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td class="tab"><a href="index.jsp" class="top">HOME</a></td>
				<td class="tab"><a href="Services_List.jsp" class="top">SERVICES</a></td>
				<td class="tab"><a href="Doctors_List.jsp" class="top">DOCTORS</a></td>
				<td class="tab"><a href="List_All_Appointments_In_The_System.jsp" class="top">APPOINTMENTS</a></td>
				<td class="tab"><a href="mail.jsp" class="top">CONTACT US</a></td>
				<td>&nbsp;</td>
			</tr>
		</table></td>
	</tr>
	<tr>
		<td colspan="2" style="border-top:2px solid #10ADBE;" ><a href="#" ><img src="images/banner.jpg" width="881" height="329" border="0" alt=""/></a></td>
	</tr>
	<tr>
		<td colspan="2" style="padding-top:8px; padding-left:4px;"><table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr><div class="inner_copy"><div class="inner_copy">All <a href="http://www.magentothemesworld.com" title="Best Magento Templates">premium Magento themes</a> at magentothemesworld.com!</div></div>
				<td width="225" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
					
                                   
        
      <form method="post" action="Services_List.jsp">
                
                    <tr>
                            <td class="heading_2">LogIn</td>
                    </tr>
                                        
                     
                    <tr> 
                            <td class="left_link"><a href="#" class="leftlink">UserName  <input type="text" name="txtdrname"/></a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="#" class="leftlink">Password  <input type="text" name="txtdrsurname"/> </a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="#" class="leftlink"><input type="submit" name="btnentry" value="Entry" /></a></td>
                    </tr>
          </form>                               
                     
                    <tr>
                            <td class="heading_2">More</td>
                    </tr>
                                       
                                        
                    <tr>
                            <td class="left_link"><a href="aboutus.jsp" class="leftlink">About Us</a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="Services_List.jsp" class="leftlink">Services</a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="Doctors_List.jsp" class="leftlink">Doctors</a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="List_All_Appointments_In_The_System.jsp" class="leftlink">Appointments</a></td>
                    </tr>
                    <tr>
                            <td class="left_link"><a href="contactus.jsp" class="leftlink">Contact Us</a></td>
                    </tr>
                                        
                                        
					
                                        
				</table></td>
                            
                            
				<td align="center" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td class="heafing">Welcome List Of Services</td>
					</tr>
					<tr>
						<td class="text"><strong>Entrance Screen Of A Doctor</strong><br />
							
                                                     &nbsp;
                                                    
                                                    
                                                    
                                                     <%
       
        Connection connect;
        String drivername = "oracle.jdbc.driver.OracleDriver";
        String serverName = "127.0.0.1";
        String portNumber = "1521";
        String sid = "XE";
        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
        String username = "SYSTEM";
        String password = "sys";
       
        try 
        {  
            Class.forName(drivername);  
            connect = DriverManager.getConnection(url, username, password);
          
            PreparedStatement ps=connect.prepareStatement("select * from tbl_doctors");
            ResultSet rs = ps.executeQuery ();
       %>    
         
    <TABLE BORDER="1" BGCOLOR="FFFFFF" width='75%' cellspacing='1' cellpadding='0' bordercolor="black" border='1'>
    <TR>       

        <TH bgcolor='#FFFFFF'><font size='2'>Branch</TH>
    </TR>
   
   
    <% while(rs.next ()){ %>
            <TR>
          
        
                <TD> <font size='2'><%= rs.getString ("BRANCH") %></center></TD>
            </TR>

        <% }  %>
    
    </TABLE>    
         
        
     <%
            ps.close();
            connect.close();
         
        } 
        catch (Exception e) 
        {  
                out.println("Sorry! This link failure...");
        } 
      
        %> 
                                                    
                                                    
                                                    </td>
					</tr>
					
                                        
                                        
                                        
                                        
                                        
                                       
				</table></td>
			</tr>
		</table></td>
	</tr>
	<tr>
		<td colspan="2" class="copy_bg" style="padding-top:8px;padding-left:4px">
			<a href="#" class="s_link">Customer Service</a>
			<a href="#" class="s_link">Create Account</a>
			<a href="#" class="s_link">Career</a>
			<a href="#" class="s_link">Contact Us</a>
		</td>
	</tr>
	<tr>
		<td colspan="2" class="copy_bg" style="padding:11px">
			<center>
				<div class="fleft"> </div>
			</center>
		</td>
	</tr>
</table>
</body>
</html>
