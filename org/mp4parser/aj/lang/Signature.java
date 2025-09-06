package org.mp4parser.aj.lang;

public interface Signature {
    Class getDeclaringType();

    String getDeclaringTypeName();

    int getModifiers();

    String getName();

    String toLongString();

    String toShortString();

    @Override
    String toString();
}

