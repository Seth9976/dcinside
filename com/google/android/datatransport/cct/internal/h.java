package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class h extends r {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.r.a {
        private Integer a;

        @Override  // com.google.android.datatransport.cct.internal.r$a
        public r a() {
            return new h(this.a, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.r$a
        public com.google.android.datatransport.cct.internal.r.a b(@Nullable Integer integer0) {
            this.a = integer0;
            return this;
        }
    }

    private final Integer a;

    private h(@Nullable Integer integer0) {
        this.a = integer0;
    }

    h(Integer integer0, a h$a0) {
        this(integer0);
    }

    @Override  // com.google.android.datatransport.cct.internal.r
    @Nullable
    public Integer b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof r) {
            Integer integer0 = ((r)object0).b();
            return this.a == null ? integer0 == null : this.a.equals(integer0);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? 1000003 : this.a.hashCode() ^ 1000003;
    }

    @Override
    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}

