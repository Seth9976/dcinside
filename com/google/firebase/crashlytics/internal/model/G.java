package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

final class g extends b {
    static class a {
    }

    static final class com.google.firebase.crashlytics.internal.model.g.b extends com.google.firebase.crashlytics.internal.model.F.e.b.a {
        private String a;
        private byte[] b;

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$b$a
        public b a() {
            String s = this.a;
            if(s != null) {
                byte[] arr_b = this.b;
                if(arr_b != null) {
                    return new g(s, arr_b, null);
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a == null) {
                stringBuilder0.append(" filename");
            }
            if(this.b == null) {
                stringBuilder0.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.e.b.a b(byte[] arr_b) {
            if(arr_b == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = arr_b;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$e$b$a
        public com.google.firebase.crashlytics.internal.model.F.e.b.a c(String s) {
            if(s == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = s;
            return this;
        }
    }

    private final String a;
    private final byte[] b;

    private g(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    g(String s, byte[] arr_b, a g$a0) {
        this(s, arr_b);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$e$b
    @NonNull
    public byte[] b() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$e$b
    @NonNull
    public String c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof b) {
            String s = ((b)object0).c();
            if(this.a.equals(s)) {
                byte[] arr_b = ((b)object0) instanceof g ? ((g)(((b)object0))).b : ((b)object0).b();
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
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}

