package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@b
public class k extends l {
    public static final k g;

    static {
        k.g = new k();
    }

    public k() {
        this(null, null);
    }

    public k(Boolean boolean0, DateFormat dateFormat0) {
        super(Date.class, boolean0, dateFormat0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    protected long S(Object object0) {
        return this.U(((Date)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    public l T(Boolean boolean0, DateFormat dateFormat0) {
        return this.W(boolean0, dateFormat0);
    }

    protected long U(Date date0) {
        return date0 == null ? 0L : date0.getTime();
    }

    public void V(Date date0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(this.Q(i0)) {
            k0.N3(this.U(date0));
            return;
        }
        this.R(date0, k0, i0);
    }

    public k W(Boolean boolean0, DateFormat dateFormat0) {
        return new k(boolean0, dateFormat0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.V(((Date)object0), k0, i0);
    }
}

