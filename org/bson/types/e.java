package org.bson.types;

import org.bson.i;

public class e extends d {
    private final i c;
    private static final long d = 0xA8C7CA5820F0637EL;

    public e(String s, i i0) {
        super(s);
        this.c = i0;
    }

    public i b() {
        return this.c;
    }

    @Override  // org.bson.types.d
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? this.a().equals(((e)object0).a()) && this.c.equals(((e)object0).c) : false;
    }

    @Override  // org.bson.types.d
    public int hashCode() {
        return this.a().hashCode() ^ this.c.hashCode();
    }
}

