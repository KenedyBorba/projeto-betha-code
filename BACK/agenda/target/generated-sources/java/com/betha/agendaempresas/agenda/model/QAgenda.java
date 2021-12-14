package com.betha.agendaempresas.agenda.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgenda is a Querydsl query type for Agenda
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAgenda extends EntityPathBase<Agenda> {

    private static final long serialVersionUID = -730834612L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgenda agenda = new QAgenda("agenda");

    public final com.betha.agendaempresas.agenda.enterprise.QAbstractID _super = new com.betha.agendaempresas.agenda.enterprise.QAbstractID(this);

    public final DateTimePath<java.time.LocalDateTime> dataFinal = createDateTime("dataFinal", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> dataInicial = createDateTime("dataInicial", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QServico servico;

    public final StringPath titulo = createString("titulo");

    public QAgenda(String variable) {
        this(Agenda.class, forVariable(variable), INITS);
    }

    public QAgenda(Path<? extends Agenda> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgenda(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgenda(PathMetadata metadata, PathInits inits) {
        this(Agenda.class, metadata, inits);
    }

    public QAgenda(Class<? extends Agenda> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.servico = inits.isInitialized("servico") ? new QServico(forProperty("servico"), inits.get("servico")) : null;
    }

}

