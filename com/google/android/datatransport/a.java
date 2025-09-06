package com.google.android.datatransport;

import androidx.annotation.Nullable;

final class a extends f {
    private final Integer a;
    private final Object b;
    private final h c;
    private final i d;
    private final g e;

    a(@Nullable Integer integer0, Object object0, h h0, @Nullable i i0, @Nullable g g0) {
        this.a = integer0;
        if(object0 == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = object0;
        if(h0 == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = h0;
        this.d = i0;
        this.e = g0;
    }

    @Override  // com.google.android.datatransport.f
    @Nullable
    public Integer a() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.f
    @Nullable
    public g b() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.f
    public Object c() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.f
    public h d() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.f
    @Nullable
    public i e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            Integer integer0 = this.a;
            if(integer0 != null) {
                if(integer0.equals(((f)object0).a())) {
                label_8:
                    Object object1 = ((f)object0).c();
                    if(this.b.equals(object1)) {
                        h h0 = ((f)object0).d();
                        if(this.c.equals(h0)) {
                            i i0 = this.d;
                            if(i0 == null) {
                                if(((f)object0).e() == null) {
                                    return this.e == null ? ((f)object0).b() == null : this.e.equals(((f)object0).b());
                                }
                            }
                            else if(i0.equals(((f)object0).e())) {
                                return this.e == null ? ((f)object0).b() == null : this.e.equals(((f)object0).b());
                            }
                        }
                    }
                }
            }
            else if(((f)object0).a() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b.hashCode();
        int v3 = this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        g g0 = this.e;
        if(g0 != null) {
            v = g0.hashCode();
        }
        return ((((v1 ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=" + this.e + "}";
    }
}

