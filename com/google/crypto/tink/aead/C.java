package com.google.crypto.tink.aead;

import com.google.crypto.tink.E;
import com.google.crypto.tink.o;
import com.google.crypto.tink.util.a;

public abstract class c extends o {
    @Override  // com.google.crypto.tink.o
    public E c() {
        return this.f();
    }

    public abstract a d();

    public abstract e f();
}

