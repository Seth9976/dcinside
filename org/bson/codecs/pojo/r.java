package org.bson.codecs.pojo;

import org.bson.codecs.configuration.a;

final class r {
    private final J a;
    private final p b;

    private r(J j0, p p0) {
        this.a = j0;
        this.b = p0;
    }

    static r a(Class class0, J j0, p p0) {
        if(j0 == null && p0 != null) {
            throw new a(String.format("Invalid IdGenerator. There is no IdProperty set for: %s", class0));
        }
        if(p0 != null && !j0.j().getType().isAssignableFrom(p0.getType())) {
            throw new a(String.format("Invalid IdGenerator. Mismatching types, the IdProperty type is: %s but the IdGenerator type is: %s", j0.j().getType(), p0.getType()));
        }
        return new r(j0, p0);
    }

    static r b(b b0, J j0) {
        return r.a(b0.l(), j0, b0.e().c());
    }

    p c() {
        return this.b;
    }

    J d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(r.class == class0) {
                J j0 = this.a;
                if(j0 != null) {
                    if(!j0.equals(((r)object0).a)) {
                        return false;
                    }
                }
                else if(((r)object0).a != null) {
                    return false;
                }
                p p0 = ((r)object0).b;
                return this.b == null ? p0 == null : this.b.equals(p0);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        p p0 = this.b;
        if(p0 != null) {
            v = p0.hashCode();
        }
        return v1 * 0x1F + v;
    }
}

