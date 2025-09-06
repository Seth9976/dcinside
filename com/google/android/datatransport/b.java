package com.google.android.datatransport;

import androidx.annotation.Nullable;
import java.util.Arrays;

final class b extends g {
    static class a {
    }

    static final class com.google.android.datatransport.b.b extends com.google.android.datatransport.g.a {
        private String a;
        private byte[] b;
        private byte[] c;

        @Override  // com.google.android.datatransport.g$a
        public g a() {
            return new b(this.a, this.b, this.c, null);
        }

        @Override  // com.google.android.datatransport.g$a
        public com.google.android.datatransport.g.a b(byte[] arr_b) {
            this.b = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.g$a
        public com.google.android.datatransport.g.a c(byte[] arr_b) {
            this.c = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.g$a
        public com.google.android.datatransport.g.a d(String s) {
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final byte[] b;
    private final byte[] c;

    private b(@Nullable String s, @Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        this.a = s;
        this.b = arr_b;
        this.c = arr_b1;
    }

    b(String s, byte[] arr_b, byte[] arr_b1, a b$a0) {
        this(s, arr_b, arr_b1);
    }

    @Override  // com.google.android.datatransport.g
    @Nullable
    public byte[] b() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.g
    @Nullable
    public byte[] c() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.g
    @Nullable
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof g) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((g)object0).d())) {
                label_8:
                    byte[] arr_b = ((g)object0) instanceof b ? ((b)(((g)object0))).b : ((g)object0).b();
                    if(Arrays.equals(this.b, arr_b)) {
                        byte[] arr_b1 = ((g)object0) instanceof b ? ((b)(((g)object0))).c : ((g)object0).c();
                        return Arrays.equals(this.c, arr_b1);
                    }
                }
            }
            else if(((g)object0).d() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? (0xD5009D89 ^ Arrays.hashCode(this.b)) * 1000003 ^ Arrays.hashCode(this.c) : ((this.a.hashCode() ^ 1000003) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        return "EventContext{pseudonymousId=" + this.a + ", experimentIdsClear=" + Arrays.toString(this.b) + ", experimentIdsEncrypted=" + Arrays.toString(this.c) + "}";
    }
}

