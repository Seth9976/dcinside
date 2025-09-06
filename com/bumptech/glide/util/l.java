package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class l {
    private Class a;
    private Class b;
    private Class c;

    public l() {
    }

    public l(@NonNull Class class0, @NonNull Class class1) {
        this.a(class0, class1);
    }

    public l(@NonNull Class class0, @NonNull Class class1, @Nullable Class class2) {
        this.b(class0, class1, class2);
    }

    public void a(@NonNull Class class0, @NonNull Class class1) {
        this.b(class0, class1, null);
    }

    public void b(@NonNull Class class0, @NonNull Class class1, @Nullable Class class2) {
        this.a = class0;
        this.b = class1;
        this.c = class2;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.a.equals(((l)object0).a)) {
            return false;
        }
        return this.b.equals(((l)object0).b) ? o.e(this.c, ((l)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}

