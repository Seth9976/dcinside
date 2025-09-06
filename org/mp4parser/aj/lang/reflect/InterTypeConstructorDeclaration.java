package org.mp4parser.aj.lang.reflect;

import java.lang.reflect.Type;

public interface InterTypeConstructorDeclaration extends InterTypeDeclaration {
    AjType[] getExceptionTypes();

    Type[] getGenericParameterTypes();

    AjType[] getParameterTypes();
}

