import com.adarivamsi.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

/**
 * All Copyrights reserved @ Vamsi Charan Adari
 * Any queries mail me at adarivamsi@gmail.com
 * Created by adari on 4/27/2020
 */

@Configuration
@ComponentScan({"com.adarivamsi"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calendarFactory().getObject();
    }

}
