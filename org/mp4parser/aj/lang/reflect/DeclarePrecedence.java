package org.mp4parser.aj.lang.reflect;

public interface DeclarePrecedence {
    AjType getDeclaringType();

    TypePattern[] getPrecedenceOrder();
}

