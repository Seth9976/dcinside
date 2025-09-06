package org.mp4parser.aj.lang.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public interface InterTypeMethodDeclaration extends InterTypeDeclaration {
    AjType[] getExceptionTypes();

    Type[] getGenericParameterTypes();

    Type getGenericReturnType();

    String getName();

    AjType[] getParameterTypes();

    AjType getReturnType();

    TypeVariable[] getTypeParameters();
}

