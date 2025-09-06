package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

@b
public class h extends l {
    public static final h g;

    static {
        h.g = new h();
    }

    public h() {
        this(null, null);
    }

    public h(Boolean boolean0, DateFormat dateFormat0) {
        super(Calendar.class, boolean0, dateFormat0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    protected long S(Object object0) {
        return this.U(((Calendar)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    public l T(Boolean boolean0, DateFormat dateFormat0) {
        return this.W(boolean0, dateFormat0);
    }

    protected long U(Calendar calendar0) {
        return calendar0 == null ? 0L : calendar0.getTimeInMillis();
    }

    public void V(Calendar calendar0, k k0, I i0) throws IOException {
        if(this.Q(i0)) {
            k0.N3(this.U(calendar0));
            return;
        }
        this.R(calendar0.getTime(), k0, i0);
    }

    public h W(Boolean boolean0, DateFormat dateFormat0) {
        return new h(boolean0, dateFormat0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.l
    public void m(Object object0, k k0, I i0) throws IOException {
        this.V(((Calendar)object0), k0, i0);
    }
}

