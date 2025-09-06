package org.mp4parser.aj.lang.reflect;

public interface Pointcut {
    AjType getDeclaringType();

    int getModifiers();

    String getName();

    String[] getParameterNames();

    AjType[] getParameterTypes();

    PointcutExpression getPointcutExpression();
}

