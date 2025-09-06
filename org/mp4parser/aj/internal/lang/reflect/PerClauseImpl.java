package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.PerClause;
import org.mp4parser.aj.lang.reflect.PerClauseKind;

public class PerClauseImpl implements PerClause {
    private final PerClauseKind kind;

    protected PerClauseImpl(PerClauseKind perClauseKind0) {
        this.kind = perClauseKind0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.PerClause
    public PerClauseKind getKind() {
        return this.kind;
    }

    @Override
    public String toString() {
        return "issingleton()";
    }
}

