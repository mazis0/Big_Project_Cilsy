package step_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.Mailing;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"step_definitions"},
        features = {"src/test/resources/features"},
        plugin = {"json:target/cucumber.json"}
)
public class RunCukesTest {
//
//    @AfterClass
//    public static void SendingMail() throws AddressException, IOException, MessagingException {
//
//        Runtime r=Runtime.getRuntime();
//        r.addShutdownHook(new Thread(){
//                              public void run(){
//                                  Mailing sm = new Mailing();
//                                  try {
//                                      sm.mail();
//                                      System.out.println("Report has been sent");
//                                  } catch (IOException | MessagingException e) {
//                                      e.printStackTrace();
//                                  }
//
//                              }
//                          }
//        );
//        try{Thread.sleep(5000);}catch (Exception e)
//        {
//            System.out.println(e);
//        }
//
//
//    }
}
