package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Comment;

public final class SubWall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ManualCSS.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Sub Wall</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- CORE CSS TEMPLATE - START -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- CORE CSS TEMPLATE - END -->\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            document.getElementById('link').click();\n");
      out.write("        </script>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a style=\"float:right;\" title=\"Home\" id=\"link\" target=\"_parent\" href=\"uploadFile.jsp\"><img src=\"logos/home.png\" height=\"40\" width=\"40\"></a>\n");
      out.write("        \n");
      out.write("       <div style =\"margin: auto;width: 95%; left: 1%;  padding: 1px\">\n");
      out.write("       <a  href=\"Comment.jsp\" title=\"Add Comment\" role=\"button\"><img src=\"logos/addcomment.png\" height=\"40\" width=\"40\"></a>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("       <div style =\"margin: auto;width: 90%;position:absolute; border:1px solid lightgray;top: 12%; left: 5%;  padding: 8px\">\n");
      out.write("       \n");
      out.write("       ");

                 
       
       if(session.getAttribute("srsid")==null){
       response.sendRedirect("message.jsp?message=Sorry, Selected project's comments are not available.");
       }        
       String srsid=(String)session.getAttribute("srsid");       
           
       System.out.println("Output test");
       ArrayList<Comment> comments=Comment.getComment(srsid);
       System.out.println("Output test2");
       int y=0;
       for(int x=0;x<comments.size();x++){
       Comment c;
       c=comments.get(x); 
       
       
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                                        <div class=\"wid-blog\">\n");
      out.write("\n");
      out.write("                                            <div class=\"bg-white wid-blog-content\">\n");
      out.write("\n");
      out.write("                                                <div class=\"pic-wrapper col-md-1 col-sm-1 col-xs-2 text-center\">\n");
      out.write("                                                    <img src=\"data/profile/avatar-5.png\" class=\"\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"info-wrapper col-md-11 col-sm-11 col-xs-10\">\t\t\t\t\t\n");
      out.write("                                                    <div class=\"username\">\n");
      out.write("                                                        <h4 class=\"\">John Smith</h4>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"info text-muted\">\n");
      out.write("                                                        \"Balance\" is a concept based on human perception and the complex nature of the human senses of weight and proportion.\n");
      out.write("                                                    </div>\t\n");
      out.write("                                                    <div class=\"info-details\">\n");
      out.write("                                                        <ul class=\"list-unstyled list-inline\">\n");
      out.write("                                                            <li><a href=\"#\" class=\"text-muted\">12<sup>th</sup> March, 2015</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <table height=\"5%\">\n");
      out.write("       <tr>\n");
      out.write("           <td rowspan=\"3\"><img class=\"img-circle\" src=\"../GetIconByID?id=");
out.print(c.getEmployeeid());
      out.write("\" alt=\"User\" width=\"60\" height=\"60\"></td>\n");
      out.write("       <td> ");
 out.print(c.getEmployeename());
      out.write("</td>        \n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("       <td>");
out.print(c.getCreateddatentime());
      out.write("</td>            \n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("       <td>");
out.print(c.getDescription());
      out.write("</td>            \n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td></td>\n");
      out.write("       </tr>\n");
      out.write("       </table>\n");
      out.write("       ");

       if(session.getAttribute("eid").equals(c.getEmployeeid())){
           y++;
       
      out.write("\n");
      out.write("       <a style=\"float:right;\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal");
out.print(y);
      out.write("\" title=\"Delete Comment\"><img src=\"logos/deletecomment.png\" height=\"30\" width=\"30\"></a>\n");
      out.write("       <a style=\"float:right;\" href=\"CommentEdit.jsp?description=");
out.print(c.getDescription());
      out.write("&commentid=");
out.print(c.getCommentno());
      out.write("&editcomment=edit\" title=\"Edit Comment\"><img src=\"logos/editcomment.png\" height=\"30\" width=\"30\"></a>\n");
      out.write("       \n");
      out.write("       <div class=\"container\">\n");
      out.write("      <!-- Modal -->\n");
      out.write("      <div class=\"modal fade\" id=\"myModal");
out.print(y);
      out.write("\" role=\"dialog\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("          <!-- Modal content-->\n");
      out.write("          <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("              <h4 class=\"modal-title\">Are you sure?</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("              <p>Once the comment is deleted, you will not be able to recover it.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("              <a  href=\"../EditComment?description=");
out.print(c.getDescription());
      out.write("&commentid=");
out.print(c.getCommentno());
      out.write("&editcomment=delete\" class=\"btn btn-default\">Delete</a>\n");
      out.write("              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("       ");
 } 
      out.write("\n");
      out.write("       <hr width=\"95%\">\n");
      out.write("    \n");
      out.write("       ");
 }
      out.write("\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
