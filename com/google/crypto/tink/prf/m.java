package com.google.crypto.tink.prf;

import com.google.crypto.tink.E;
import com.google.crypto.tink.o;

public abstract class m extends o {
    @Override  // com.google.crypto.tink.o
    public E c() {
        return this.d();
    }

    public abstract com.google.crypto.tink.prf.o d();
}

