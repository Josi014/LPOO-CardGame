/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package control;

import br.edu.lpoocardgame.lpoo.cardgame.control.PersistenciaJPA;
import br.edu.lpoocardgame.lpoo.cardgame.model.Carta;
import br.edu.lpoocardgame.lpoo.cardgame.model.Categoria;
import java.util.ArrayList;
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
public class TestePersistenciaCarta {

    private PersistenciaJPA jpa;

    @Before
    public void setUp() {
        jpa=new PersistenciaJPA();
    }

    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void cadastroCartas() {
        try {
            Carta c = new Carta();
            c.setNome("Escudo Ferro");
            c.setAtaque(0);
            c.setDefesa(50);
            c.setCategoria(Categoria.ARMADURA);
            jpa.persist(c);
        } catch (Exception ex) {
            System.err.println("Erro ao persistir Carta: " + ex);
        }
        ArrayList<Carta> listaCartas = (ArrayList) jpa.getCartas();
        if (listaCartas.isEmpty()) {
            System.out.println("Não há cartas cadastradas");
        }
        for (Carta c : listaCartas) {
            System.out.println(c.getNome() + "- ataque: " + c.getAtaque() + " - defesa: " + c.getDefesa());
        }
    }
}
