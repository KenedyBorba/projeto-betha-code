package com.betha.agendaempresas.agenda.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLogin is a Querydsl query type for Login
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLogin extends EntityPathBase<Login> {

    private static final long serialVersionUID = -1952839127L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLogin login1 = new QLogin("login1");

    public final com.betha.agendaempresas.agenda.enterprise.QAbstractID _super = new com.betha.agendaempresas.agenda.enterprise.QAbstractID(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath login = createString("login");

    public final QPessoaFisica pessoaFisica;

    public final QPessoaJuridica pessoaJuridica;

    public final StringPath senha = createString("senha");

    public final StringPath tipoConta = createString("tipoConta");

    public QLogin(String variable) {
        this(Login.class, forVariable(variable), INITS);
    }

    public QLogin(Path<? extends Login> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLogin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLogin(PathMetadata metadata, PathInits inits) {
        this(Login.class, metadata, inits);
    }

    public QLogin(Class<? extends Login> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pessoaFisica = inits.isInitialized("pessoaFisica") ? new QPessoaFisica(forProperty("pessoaFisica")) : null;
        this.pessoaJuridica = inits.isInitialized("pessoaJuridica") ? new QPessoaJuridica(forProperty("pessoaJuridica")) : null;
    }

}

