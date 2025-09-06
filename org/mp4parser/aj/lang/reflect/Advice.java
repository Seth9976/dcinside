package org.mp4parser.aj.lang.reflect;

import java.lang.reflect.Type;

public interface Advice {
    AjType getDeclaringType();

    AjType[] getExceptionTypes();

    Type[] getGenericParameterTypes();

    AdviceKind getKind();

    String getName();

    AjType[] getParameterTypes();

    PointcutExpression getPointcutExpression();
}

