import com.adarivamsi.service.SpeakerService;
import com.adarivamsi.service.SpeakerServiceImpl;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */
public class Application {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.printf(service.findAll().get(0).getFirstName());

    }

}
