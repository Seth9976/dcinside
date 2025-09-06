package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class f extends p {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.p.a {
        private s a;
        private com.google.android.datatransport.cct.internal.p.b b;

        @Override  // com.google.android.datatransport.cct.internal.p$a
        public p a() {
            return new f(this.a, this.b, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.p$a
        public com.google.android.datatransport.cct.internal.p.a b(@Nullable s s0) {
            this.a = s0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.p$a
        public com.google.android.datatransport.cct.internal.p.a c(@Nullable com.google.android.datatransport.cct.internal.p.b p$b0) {
            this.b = p$b0;
            return this;
        }
    }

    private final s a;
    private final com.google.android.datatransport.cct.internal.p.b b;

    private f(@Nullable s s0, @Nullable com.google.android.datatransport.cct.internal.p.b p$b0) {
        this.a = s0;
        this.b = p$b0;
    }

    f(s s0, com.google.android.datatransport.cct.internal.p.b p$b0, a f$a0) {
        this(s0, p$b0);
    }

    @Override  // com.google.android.datatransport.cct.internal.p
    @Nullable
    public s b() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.p
    @Nullable
    public com.google.android.datatransport.cct.internal.p.b c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof p) {
            s s0 = this.a;
            if(s0 == null) {
                if(((p)object0).b() == null) {
                    return this.b == null ? ((p)object0).c() == null : this.b.equals(((p)object0).c());
                }
            }
            else if(s0.equals(((p)object0).b())) {
                return this.b == null ? ((p)object0).c() == null : this.b.equals(((p)object0).c());
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        com.google.android.datatransport.cct.internal.p.b p$b0 = this.b;
        if(p$b0 != null) {
            v = p$b0.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}

