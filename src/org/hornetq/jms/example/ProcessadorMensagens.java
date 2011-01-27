/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

/**
 *
 * @author dwildt
 */
public class ProcessadorMensagens {

    public static DadoProcessado processa(final String tipo) {
        if ( tipo.equals("loc.txt") ) {
            return new ProcessaLocaisAtendimento().processa(tipo);
        } else {
            return new ProcessaAgentes().processa(tipo);
        }
    }

}
