package br.edu.lpoocardgame.lpoo.cardgame.model;

import br.edu.lpoocardgame.lpoo.cardgame.model.Categoria;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-11T16:44:03", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carta.class)
public class Carta_ { 

    public static volatile SingularAttribute<Carta, Integer> ataque;
    public static volatile SingularAttribute<Carta, Integer> raridade;
    public static volatile SingularAttribute<Carta, Categoria> categoria;
    public static volatile SingularAttribute<Carta, String> nome;
    public static volatile SingularAttribute<Carta, Integer> id;
    public static volatile SingularAttribute<Carta, Integer> defesa;

}