package com.betha.agendaempresas.agenda.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoaJuridica is a Querydsl query type for PessoaJuridica
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPessoaJuridica extends EntityPathBase<PessoaJuridica> {

    private static final long serialVersionUID = 1651943788L;

    public static final QPessoaJuridica pessoaJuridica = new QPessoaJuridica("pessoaJuridica");

    public final com.betha.agendaempresas.agenda.enterprise.QAbstractID _super = new com.betha.agendaempresas.agenda.enterprise.QAbstractID(this);

    public final StringPath cnpj = createString("cnpj");

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nomeFantasia = createString("nomeFantasia");

    public final StringPath senha = createString("senha");

    public final StringPath telefone = createString("telefone");

    public QPessoaJuridica(String variable) {
        super(PessoaJuridica.class, forVariable(variable));
    }

    public QPessoaJuridica(Path<? extends PessoaJuridica> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoaJuridica(PathMetadata metadata) {
        super(PessoaJuridica.class, metadata);
    }

}

