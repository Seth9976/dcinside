package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.PerClauseKind;
import org.mp4parser.aj.lang.reflect.TypePattern;
import org.mp4parser.aj.lang.reflect.TypePatternBasedPerClause;

public class TypePatternBasedPerClauseImpl extends PerClauseImpl implements TypePatternBasedPerClause {
    private TypePattern typePattern;

    public TypePatternBasedPerClauseImpl(PerClauseKind perClauseKind0, String s) {
        super(perClauseKind0);
        this.typePattern = new TypePatternImpl(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.TypePatternBasedPerClause
    public TypePattern getTypePattern() {
        return this.typePattern;
    }

    @Override  // org.mp4parser.aj.internal.lang.reflect.PerClauseImpl
    public String toString() {
        return "pertypewithin(" + this.typePattern.asString() + ")";
    }
}

