package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.TypePattern;

public class TypePatternImpl implements TypePattern {
    private String typePattern;

    public TypePatternImpl(String s) {
        this.typePattern = s;
    }

    @Override  // org.mp4parser.aj.lang.reflect.TypePattern
    public String asString() {
        return this.typePattern;
    }

    @Override
    public String toString() {
        return this.asString();
    }
}

