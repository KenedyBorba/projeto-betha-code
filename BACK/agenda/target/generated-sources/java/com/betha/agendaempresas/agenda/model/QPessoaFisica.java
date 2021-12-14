package com.betha.agendaempresas.agenda.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoaFisica is a Querydsl query type for PessoaFisica
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPessoaFisica extends EntityPathBase<PessoaFisica> {

    private static final long serialVersionUID = -25526210L;

    public static final QPessoaFisica pessoaFisica = new QPessoaFisica("pessoaFisica");

    public final com.betha.agendaempresas.agenda.enterprise.QAbstractID _super = new com.betha.agendaempresas.agenda.enterprise.QAbstractID(this);

    public final StringPath cpf = createString("cpf");

    public final DatePath<java.time.LocalDate> dataNascimento = createDate("dataNascimento", java.time.LocalDate.class);

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public final EnumPath<Raca> raca = createEnum("raca", Raca.class);

    public final StringPath rg = createString("rg");

    public final StringPath senha = createString("senha");

    public final EnumPath<Sexo> sexo = createEnum("sexo", Sexo.class);

    public final StringPath telefone = createString("telefone");

    public QPessoaFisica(String variable) {
        super(PessoaFisica.class, forVariable(variable));
    }

    public QPessoaFisica(Path<? extends PessoaFisica> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoaFisica(PathMetadata metadata) {
        super(PessoaFisica.class, metadata);
    }

}

