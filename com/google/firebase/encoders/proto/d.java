package com.google.firebase.encoders.proto;

import c2.b;

@b
public @interface d {
    public static enum a {
        DEFAULT,
        SIGNED,
        FIXED;

    }

    a intEncoding() default a.a;

    int tag();
}

