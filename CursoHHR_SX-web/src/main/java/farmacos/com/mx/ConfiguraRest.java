package farmacos.com.mx;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author lobo
 */
public class ConfiguraRest extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(CursoRest.class);
        return s;
    }

}
