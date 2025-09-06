package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class m extends w {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.w.a {
        private c a;
        private com.google.android.datatransport.cct.internal.w.b b;

        @Override  // com.google.android.datatransport.cct.internal.w$a
        public w a() {
            return new m(this.a, this.b, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.w$a
        public com.google.android.datatransport.cct.internal.w.a b(@Nullable com.google.android.datatransport.cct.internal.w.b w$b0) {
            this.b = w$b0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.w$a
        public com.google.android.datatransport.cct.internal.w.a c(@Nullable c w$c0) {
            this.a = w$c0;
            return this;
        }
    }

    private final c a;
    private final com.google.android.datatransport.cct.internal.w.b b;

    private m(@Nullable c w$c0, @Nullable com.google.android.datatransport.cct.internal.w.b w$b0) {
        this.a = w$c0;
        this.b = w$b0;
    }

    m(c w$c0, com.google.android.datatransport.cct.internal.w.b w$b0, a m$a0) {
        this(w$c0, w$b0);
    }

    @Override  // com.google.android.datatransport.cct.internal.w
    @Nullable
    public com.google.android.datatransport.cct.internal.w.b b() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.w
    @Nullable
    public c c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof w) {
            c w$c0 = this.a;
            if(w$c0 == null) {
                if(((w)object0).c() == null) {
                    return this.b == null ? ((w)object0).b() == null : this.b.equals(((w)object0).b());
                }
            }
            else if(w$c0.equals(((w)object0).c())) {
                return this.b == null ? ((w)object0).b() == null : this.b.equals(((w)object0).b());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        com.google.android.datatransport.cct.internal.w.b w$b0 = this.b;
        if(w$b0 != null) {
            v = w$b0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}

