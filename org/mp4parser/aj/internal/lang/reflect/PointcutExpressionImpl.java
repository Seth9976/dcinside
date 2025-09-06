package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.PointcutExpression;

public class PointcutExpressionImpl implements PointcutExpression {
    private String expression;

    public PointcutExpressionImpl(String s) {
        this.expression = s;
    }

    @Override  // org.mp4parser.aj.lang.reflect.PointcutExpression
    public String asString() {
        return this.expression;
    }

    @Override
    public String toString() {
        return this.asString();
    }
}

