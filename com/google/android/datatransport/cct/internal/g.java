package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;

final class g extends q {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.q.a {
        private byte[] a;
        private byte[] b;

        @Override  // com.google.android.datatransport.cct.internal.q$a
        public q a() {
            return new g(this.a, this.b, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.q$a
        public com.google.android.datatransport.cct.internal.q.a b(@Nullable byte[] arr_b) {
            this.a = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.q$a
        public com.google.android.datatransport.cct.internal.q.a c(@Nullable byte[] arr_b) {
            this.b = arr_b;
            return this;
        }
    }

    private final byte[] a;
    private final byte[] b;

    private g(@Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        this.a = arr_b;
        this.b = arr_b1;
    }

    g(byte[] arr_b, byte[] arr_b1, a g$a0) {
        this(arr_b, arr_b1);
    }

    @Override  // com.google.android.datatransport.cct.internal.q
    @Nullable
    public byte[] b() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.q
    @Nullable
    public byte[] c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof q) {
            byte[] arr_b = ((q)object0) instanceof g ? ((g)(((q)object0))).a : ((q)object0).b();
            if(Arrays.equals(this.a, arr_b)) {
                byte[] arr_b1 = ((q)object0) instanceof g ? ((g)(((q)object0))).b : ((q)object0).c();
                return Arrays.equals(this.b, arr_b1);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (Arrays.hashCode(this.a) ^ 1000003) * 1000003 ^ Arrays.hashCode(this.b);
    }

    @Override
    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}

