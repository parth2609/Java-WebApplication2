
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Welcome extends GenericServlet
{

    

    
    @Override
    public void service(ServletRequest rq, ServletResponse rs){
        rs.setContentType("text");
        int a=Integer.parseInt(rq.getParameter("n1"));
        int b=Integer.parseInt(rq.getParameter("n2"));

        try{
            PrintWriter pw=rs.getWriter();
            pw.println(a+b);
        }
        catch(Exception e)
        {
    }
            }

    
}    