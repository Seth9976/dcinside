package org.mp4parser.aj.lang.reflect;

public interface DeclareErrorOrWarning {
    AjType getDeclaringType();

    String getMessage();

    PointcutExpression getPointcutExpression();

    boolean isError();
}

