package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class e extends o {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.o.a {
        private com.google.android.datatransport.cct.internal.o.b a;
        private com.google.android.datatransport.cct.internal.a b;

        @Override  // com.google.android.datatransport.cct.internal.o$a
        public o a() {
            return new e(this.a, this.b, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.o$a
        public com.google.android.datatransport.cct.internal.o.a b(@Nullable com.google.android.datatransport.cct.internal.a a0) {
            this.b = a0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.o$a
        public com.google.android.datatransport.cct.internal.o.a c(@Nullable com.google.android.datatransport.cct.internal.o.b o$b0) {
            this.a = o$b0;
            return this;
        }
    }

    private final com.google.android.datatransport.cct.internal.o.b a;
    private final com.google.android.datatransport.cct.internal.a b;

    private e(@Nullable com.google.android.datatransport.cct.internal.o.b o$b0, @Nullable com.google.android.datatransport.cct.internal.a a0) {
        this.a = o$b0;
        this.b = a0;
    }

    e(com.google.android.datatransport.cct.internal.o.b o$b0, com.google.android.datatransport.cct.internal.a a0, a e$a0) {
        this(o$b0, a0);
    }

    @Override  // com.google.android.datatransport.cct.internal.o
    @Nullable
    public com.google.android.datatransport.cct.internal.a b() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.o
    @Nullable
    public com.google.android.datatransport.cct.internal.o.b c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof o) {
            com.google.android.datatransport.cct.internal.o.b o$b0 = this.a;
            if(o$b0 == null) {
                if(((o)object0).c() == null) {
                    return this.b == null ? ((o)object0).b() == null : this.b.equals(((o)object0).b());
                }
            }
            else if(o$b0.equals(((o)object0).c())) {
                return this.b == null ? ((o)object0).b() == null : this.b.equals(((o)object0).b());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        com.google.android.datatransport.cct.internal.a a0 = this.b;
        if(a0 != null) {
            v = a0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}

