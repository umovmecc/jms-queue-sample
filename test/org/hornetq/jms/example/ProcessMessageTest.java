/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dwildt
 */
public class ProcessMessageTest {

    public ProcessMessageTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void deveProcessarLocaisDeAtendimento() {

        assertTrue(ProcessadorMensagens.processa("loc.txt") instanceof ProcessaLocaisAtendimento);

    }

    @Test
    public void deveProcessarAgentes() {

        assertTrue(ProcessadorMensagens.processa("age.txt") instanceof ProcessaAgentes);

    }



}