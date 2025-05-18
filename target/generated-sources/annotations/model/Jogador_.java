package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Carta;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-18T13:37:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Jogador.class)
public class Jogador_ { 

    public static volatile SingularAttribute<Jogador, Integer> level;
    public static volatile SingularAttribute<Jogador, String> nickname;
    public static volatile ListAttribute<Jogador, Carta> baralho;
    public static volatile SingularAttribute<Jogador, Integer> id;

}