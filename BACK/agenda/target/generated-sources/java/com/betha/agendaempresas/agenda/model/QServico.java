package com.betha.agendaempresas.agenda.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServico is a Querydsl query type for Servico
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServico extends EntityPathBase<Servico> {

    private static final long serialVersionUID = 1864118655L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServico servico = new QServico("servico");

    public final com.betha.agendaempresas.agenda.enterprise.QAbstractID _super = new com.betha.agendaempresas.agenda.enterprise.QAbstractID(this);

    public final StringPath descricao = createString("descricao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QPessoaJuridica pessoaJuridica;

    public final NumberPath<Double> valor = createNumber("valor", Double.class);

    public QServico(String variable) {
        this(Servico.class, forVariable(variable), INITS);
    }

    public QServico(Path<? extends Servico> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServico(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServico(PathMetadata metadata, PathInits inits) {
        this(Servico.class, metadata, inits);
    }

    public QServico(Class<? extends Servico> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pessoaJuridica = inits.isInitialized("pessoaJuridica") ? new QPessoaJuridica(forProperty("pessoaJuridica")) : null;
    }

}

