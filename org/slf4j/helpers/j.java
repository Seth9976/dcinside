package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.a;
import org.slf4j.b;

abstract class j implements Serializable, a {
    protected String a;
    private static final long b = 0x68929DC81C4E557DL;

    @Override  // org.slf4j.a
    public String getName() {
        return this.a;
    }

    protected Object n0() throws ObjectStreamException {
        return b.j(this.getName());
    }
}

