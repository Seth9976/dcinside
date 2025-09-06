package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.SignaturePattern;

public class SignaturePatternImpl implements SignaturePattern {
    private String sigPattern;

    public SignaturePatternImpl(String s) {
        this.sigPattern = s;
    }

    @Override  // org.mp4parser.aj.lang.reflect.SignaturePattern
    public String asString() {
        return this.sigPattern;
    }

    @Override
    public String toString() {
        return this.asString();
    }
}

