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
    private String tipo;

    ProcessaMensagens(final String tipo) {
       this.tipo = tipo;
    }

    public Object build() {
        if ( tipo.equals("loc.txt") ) {
            return new ProcessaLocaisAtendimento();
        } else {
            return new ProcessaAgentes();
        }
    }

}
