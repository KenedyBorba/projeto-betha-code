package com.betha.agendaempresas.agenda.enterprise;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractID is a Querydsl query type for AbstractID
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractID extends EntityPathBase<AbstractID> {

    private static final long serialVersionUID = -914778833L;

    public static final QAbstractID abstractID = new QAbstractID("abstractID");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAbstractID(String variable) {
        super(AbstractID.class, forVariable(variable));
    }

    public QAbstractID(Path<? extends AbstractID> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractID(PathMetadata metadata) {
        super(AbstractID.class, metadata);
    }

}

