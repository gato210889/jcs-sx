/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacos.com.mx;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author lobo
 */
@Path(value = "/curso")
public class CursoRest {
    
    @GET
    @Produces("application/json")
    @Path("/test")
    public String testRest() {
       
        return "Test servicio Rest";
    }
    
}
