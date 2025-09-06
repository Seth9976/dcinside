package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.h;
import java.util.Arrays;

final class d extends r {
    static class a {
    }

    static final class b extends com.google.android.datatransport.runtime.r.a {
        private String a;
        private byte[] b;
        private h c;

        @Override  // com.google.android.datatransport.runtime.r$a
        public r a() {
            String s = this.a == null ? " backendName" : "";
            if(this.c == null) {
                s = s + " priority";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new d(this.a, this.b, this.c, null);
        }

        @Override  // com.google.android.datatransport.runtime.r$a
        public com.google.android.datatransport.runtime.r.a b(String s) {
            if(s == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.r$a
        public com.google.android.datatransport.runtime.r.a c(@Nullable byte[] arr_b) {
            this.b = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.r$a
        public com.google.android.datatransport.runtime.r.a d(h h0) {
            if(h0 == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = h0;
            return this;
        }
    }

    private final String a;
    private final byte[] b;
    private final h c;

    private d(String s, @Nullable byte[] arr_b, h h0) {
        this.a = s;
        this.b = arr_b;
        this.c = h0;
    }

    d(String s, byte[] arr_b, h h0, a d$a0) {
        this(s, arr_b, h0);
    }

    @Override  // com.google.android.datatransport.runtime.r
    public String b() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.r
    @Nullable
    public byte[] c() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.r
    @RestrictTo({Scope.b})
    public h d() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r) {
            String s = ((r)object0).b();
            if(this.a.equals(s)) {
                byte[] arr_b = ((r)object0) instanceof d ? ((d)(((r)object0))).b : ((r)object0).c();
                if(Arrays.equals(this.b, arr_b)) {
                    h h0 = ((r)object0).d();
                    return this.c.equals(h0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.b);
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ v) * 1000003 ^ this.c.hashCode();
    }
}

