package org.mp4parser.aj.lang.reflect;

import java.lang.annotation.Annotation;

public interface DeclareAnnotation {
    public static enum Kind {
        Field,
        Method,
        Constructor,
        Type;

    }

    Annotation getAnnotation();

    String getAnnotationAsText();

    AjType getDeclaringType();

    Kind getKind();

    SignaturePattern getSignaturePattern();

    TypePattern getTypePattern();
}

