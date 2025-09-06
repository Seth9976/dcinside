package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import java.util.Arrays;

final class a extends g {
    static class com.google.android.datatransport.runtime.backends.a.a {
    }

    static final class b extends com.google.android.datatransport.runtime.backends.g.a {
        private Iterable a;
        private byte[] b;

        @Override  // com.google.android.datatransport.runtime.backends.g$a
        public g a() {
            String s = this.a == null ? " events" : "";
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new a(this.a, this.b, null);
        }

        @Override  // com.google.android.datatransport.runtime.backends.g$a
        public com.google.android.datatransport.runtime.backends.g.a b(Iterable iterable0) {
            if(iterable0 == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.backends.g$a
        public com.google.android.datatransport.runtime.backends.g.a c(@Nullable byte[] arr_b) {
            this.b = arr_b;
            return this;
        }
    }

    private final Iterable a;
    private final byte[] b;

    private a(Iterable iterable0, @Nullable byte[] arr_b) {
        this.a = iterable0;
        this.b = arr_b;
    }

    a(Iterable iterable0, byte[] arr_b, com.google.android.datatransport.runtime.backends.a.a a$a0) {
        this(iterable0, arr_b);
    }

    @Override  // com.google.android.datatransport.runtime.backends.g
    public Iterable c() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.backends.g
    @Nullable
    public byte[] d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof g) {
            Iterable iterable0 = ((g)object0).c();
            if(this.a.equals(iterable0)) {
                byte[] arr_b = ((g)object0) instanceof a ? ((a)(((g)object0))).b : ((g)object0).d();
                return Arrays.equals(this.b, arr_b);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}

