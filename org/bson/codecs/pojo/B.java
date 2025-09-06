package org.bson.codecs.pojo;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {
    private final String a;
    private final Class b;
    private final boolean c;
    private final t d;
    private final boolean e;
    private final String f;
    private final String g;
    private final r h;
    private final List i;
    private final Map j;

    b(Class class0, Map map0, t t0, Boolean boolean0, String s, String s1, r r0, List list0) {
        this.a = class0.getSimpleName();
        this.b = class0;
        this.c = class0.getTypeParameters().length > 0;
        this.j = DesugarCollections.unmodifiableMap(new HashMap(map0));
        this.d = t0;
        this.e = boolean0.booleanValue();
        this.f = s;
        this.g = s1;
        this.h = r0;
        this.i = DesugarCollections.unmodifiableList(new ArrayList(list0));
    }

    public static c a(Class class0) {
        return new c(class0);
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.f;
    }

    public J d() {
        return this.h == null ? null : this.h.d();
    }

    r e() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(b.class != class0 || this.e != ((b)object0).e) {
                return false;
            }
            if(!this.l().equals(((b)object0).l())) {
                return false;
            }
            if(!this.g().equals(((b)object0).g())) {
                return false;
            }
            if(this.c() != null) {
                if(!this.c().equals(((b)object0).c())) {
                    return false;
                }
            }
            else if(((b)object0).c() != null) {
                return false;
            }
            if(this.b() != null) {
                if(!this.b().equals(((b)object0).b())) {
                    return false;
                }
            }
            else if(((b)object0).b() != null) {
                return false;
            }
            r r0 = this.h;
            if(r0 != null) {
                if(!r0.equals(((b)object0).h)) {
                    return false;
                }
            }
            else if(((b)object0).h != null) {
                return false;
            }
            return this.j().equals(((b)object0).j()) ? this.k().equals(((b)object0).k()) : false;
        }
        return false;
    }

    s f() {
        return this.d.a();
    }

    t g() {
        return this.d;
    }

    public String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = ((this.l().hashCode() * 0x1F + this.g().hashCode()) * 0x1F + this.e) * 0x1F;
        int v1 = 0;
        int v2 = this.c() == null ? 0 : this.c().hashCode();
        int v3 = this.b() == null ? 0 : this.b().hashCode();
        if(this.e() != null) {
            v1 = this.e().hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.j().hashCode()) * 0x1F + this.k().hashCode();
    }

    public J i(String s) {
        for(Object object0: this.i) {
            J j0 = (J)object0;
            if(j0.f().equals(s)) {
                return j0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List j() {
        return this.i;
    }

    Map k() {
        return this.j;
    }

    public Class l() {
        return this.b;
    }

    public boolean m() {
        return this.c;
    }

    public boolean n() {
        return this.e;
    }

    @Override
    public String toString() {
        return "ClassModel{type=" + this.b + "}";
    }
}

