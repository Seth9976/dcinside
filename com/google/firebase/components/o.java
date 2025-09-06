package com.google.firebase.components;

import h2.b;

public final class o implements b {
    public final ComponentRegistrar a;

    public o(ComponentRegistrar componentRegistrar0) {
        this.a = componentRegistrar0;
    }

    @Override  // h2.b
    public final Object get() {
        return t.n(this.a);
    }
}

