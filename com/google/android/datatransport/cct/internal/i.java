package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class i extends s {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.s.a {
        private r a;

        @Override  // com.google.android.datatransport.cct.internal.s$a
        public s a() {
            return new i(this.a, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.s$a
        public com.google.android.datatransport.cct.internal.s.a b(@Nullable r r0) {
            this.a = r0;
            return this;
        }
    }

    private final r a;

    private i(@Nullable r r0) {
        this.a = r0;
    }

    i(r r0, a i$a0) {
        this(r0);
    }

    @Override  // com.google.android.datatransport.cct.internal.s
    @Nullable
    public r b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof s) {
            r r0 = ((s)object0).b();
            return this.a == null ? r0 == null : this.a.equals(r0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 1000003 : this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}

