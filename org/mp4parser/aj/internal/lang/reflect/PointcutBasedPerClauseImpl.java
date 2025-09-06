package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.PerClauseKind;
import org.mp4parser.aj.lang.reflect.PointcutBasedPerClause;
import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class PointcutBasedPerClauseImpl extends PerClauseImpl implements PointcutBasedPerClause {
    private final PointcutExpression pointcutExpression;

    public PointcutBasedPerClauseImpl(PerClauseKind perClauseKind0, String s) {
        super(perClauseKind0);
        this.pointcutExpression = new PointcutExpressionImpl(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.PointcutBasedPerClause
    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }

    @Override  // org.mp4parser.aj.internal.lang.reflect.PerClauseImpl
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        switch(this.getKind()) {
            case 1: {
                stringBuffer0.append("percflow(");
                break;
            }
            case 2: {
                stringBuffer0.append("percflowbelow(");
                break;
            }
            case 3: {
                stringBuffer0.append("pertarget(");
                break;
            }
            case 4: {
                stringBuffer0.append("perthis(");
            }
        }
        stringBuffer0.append(this.pointcutExpression.asString());
        stringBuffer0.append(")");
        return stringBuffer0.toString();
    }
}

