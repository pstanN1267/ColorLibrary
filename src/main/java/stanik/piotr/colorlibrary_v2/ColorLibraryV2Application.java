package stanik.piotr.colorlibrary_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:db.properties")
@SpringBootApplication
public class ColorLibraryV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ColorLibraryV2Application.class, args);
    }

}
