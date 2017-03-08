/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ExamenPruebaTest {
    
    public ExamenPruebaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mo method, of class ExamenPrueba.
     */
    @Test
    public void testMo() {
        System.out.println("mo");
        int[] v = new int[4];
        CambiaLongitud instance = new CambiaLongitud();
        instance.modificar(v, 0, 1, this);
        
    }

    /**
     * Test of bo method, of class ExamenPrueba.
     */
    @Test
    public void testBo() {
        System.out.println("bo");
        int[] v = new int[4];
        CambiaLongitud instance = new CambiaLongitud();
        instance.borrar(v, 0);
    
    }

    /**
     * Test of in method, of class ExamenPrueba.
     */
    @Test
    public void testIn() {
        System.out.println("in");
        int[] v = new int[4];
        CambiaLongitud instance = new CambiaLongitud();
        instance.insertar(v, 0);
        
    }

    /**
     * Test of BorraElemento method, of class ExamenPrueba.
     */
    @Test
    public void testBorraElemento() {
        System.out.println("BorraElemento");
        int[] v = null;
        int p = 0;
        int i = 0;
        CambiaLongitud instance = new CambiaLongitud();
        System.out.println("Elemento a borrar=" + v[p]);
        for (i = p; i < v.length - 1; i++) {
            v[i] = v[i + 1];
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertaElemento method, of class ExamenPrueba.
     */
    @Test
    public void testInsertaElemento() {
        System.out.println("InsertaElemento");
        int i = 0;
        int[] v = null;
        int p = 0;
        CambiaLongitud instance = new CambiaLongitud();
        System.out.println("Elemento a insertar=" + instance.getValor());
        for (i = v.length - 1; i > p; i--) {
            v[i] = v[i - 1];
        }
        v[p] = instance.getValor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificaElemento method, of class ExamenPrueba.
     */
    @Test
    public void testModificaElemento() {
        System.out.println("ModificaElemento");
        int[] v = null;
        int p = 0;
        CambiaLongitud instance = new CambiaLongitud();
        System.out.println("Elemento a modificar=" + v[p]);
        v[p] = instance.getValor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ExamenPrueba.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CambiaLongitud.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
