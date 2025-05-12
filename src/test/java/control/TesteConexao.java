/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package control;

import br.edu.lpoocardgame.lpoo.cardgame.control.PersistenciaJPA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class TesteConexao {

    public TesteConexao() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {

    }

    private PersistenciaJPA jpa;

    @Before
    public void setUp() {
        jpa = new PersistenciaJPA();
        System.out.println("Iniciando teste de conexão...");
    }

    @After
    public void tearDown() {
        if (jpa != null && jpa.conexaoAberta()) {
            jpa.fecharConexao();
            System.out.println("Conexão fechada com sucesso.");
        }

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testeConexaoAberta() {
        assertNotNull("Instância JPA não pode ser nula", jpa);
        assertTrue("A conexão deveria estar aberta", jpa.conexaoAberta());
        System.out.println("Conexão aberta com sucesso!");
    }
}
