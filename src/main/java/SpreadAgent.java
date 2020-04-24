import javax.management.*;
import java.lang.management.*;
import com.sun.jdmk.comm.HtmlAdaptorServer;


public class SpreadAgent {
    private MBeanServer mbs;

    public SpreadAgent() {

        //Get the platform MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();


        //Unique identification of MBeans
        Spread spreadBean = new Spread();
        ObjectName adapterName;
        ObjectName report ;

        try {
            //Uniquely identify the MBeans and register them with the platform MBeanServer
            report = new ObjectName("SpreadAgent:name=add");
            mbs.registerMBean(spreadBean, report);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    //Utility method: so that the application continues to run
    private static void waitForEnterPressed() {
        try {
            System.out.println("Press <enter> to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String argv[])  {
        SpreadAgent agent = new SpreadAgent();
        System.out.println("SpreadAgent is running...");
        SpreadAgent.waitForEnterPressed();

    }
}