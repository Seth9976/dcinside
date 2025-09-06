package org.mp4parser.aj.lang.reflect;

public interface InterTypeDeclaration {
    AjType getDeclaringType();

    int getModifiers();

    AjType getTargetType() throws ClassNotFoundException;
}

