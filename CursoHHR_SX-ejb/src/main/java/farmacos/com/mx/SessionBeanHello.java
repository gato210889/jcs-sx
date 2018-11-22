/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacos.com.mx;

import javax.ejb.Stateless;

/**
 *
 * @author lobo
 */
@Stateless
public class SessionBeanHello implements SessionBeanHelloLocal {

    public String saludos() {
     return "hola";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
