package com.google.firebase.components;

import h2.b;

public final class u implements b {
    public final ComponentRegistrar a;

    public u(ComponentRegistrar componentRegistrar0) {
        this.a = componentRegistrar0;
    }

    @Override  // h2.b
    public final Object get() {
        return com.google.firebase.components.t.b.a(this.a);
    }
}

