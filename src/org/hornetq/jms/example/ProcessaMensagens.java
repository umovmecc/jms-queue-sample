/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

/**
 *
 * @author dwildt
 */
public class ProcessaMensagens {

    public static Object build(final String tipo) {
        if ( tipo.equals("loc.txt") ) {
            return new ProcessaLocaisAtendimento();
        } else {
            return new ProcessaAgentes();
        }
    }

}
