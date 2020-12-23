import com.app.builder.Aircraft;
import com.app.builder.AircraftBuilder;
import com.app.builder.Boeing737Builder;
import com.app.director.Director;

public class Main {

    public static void main(String[] args) {
        AircraftBuilder builder = new Boeing737Builder();
        Director director = new Director(builder);
        Aircraft boeing737 = director.construct();
        System.out.println(boeing737);
    }
}
