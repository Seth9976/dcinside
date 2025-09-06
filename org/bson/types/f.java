package org.bson.types;

import org.bson.e0;

public class f extends d {
    private final e0 c;
    private static final long d = 0xA8C7CA5820F0637EL;

    public f(String s, e0 e00) {
        super(s);
        this.c = e00;
    }

    public e0 b() {
        return this.c;
    }

    @Override  // org.bson.types.d
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !super.equals(object0)) {
            return false;
        }
        e0 e00 = ((f)object0).c;
        return this.c == null ? e00 == null : this.c.equals(e00);
    }

    @Override  // org.bson.types.d
    public int hashCode() {
        return this.a().hashCode() ^ this.c.hashCode();
    }
}

