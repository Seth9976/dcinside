package com.google.android.datatransport;

import androidx.annotation.Nullable;

final class c extends i {
    private final Integer a;

    c(@Nullable Integer integer0) {
        this.a = integer0;
    }

    @Override  // com.google.android.datatransport.i
    @Nullable
    public Integer a() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof i) {
            Integer integer0 = ((i)object0).a();
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
        return "ProductData{productId=" + this.a + "}";
    }
}

