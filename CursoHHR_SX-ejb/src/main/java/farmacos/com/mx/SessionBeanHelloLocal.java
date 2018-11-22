/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacos.com.mx;

import javax.ejb.Local;

/**
 *
 * @author lobo
 */
@Local
public interface SessionBeanHelloLocal {
    String saludos();
}
