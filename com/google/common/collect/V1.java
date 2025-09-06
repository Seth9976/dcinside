package com.google.common.collect;

import J1.b;
import java.io.Serializable;
import o3.a;

@b
@C1
final class v1 implements Serializable {
    private int a;

    v1(int v) {
        this.a = v;
    }

    public void a(int v) {
        this.a += v;
    }

    public int b(int v) {
        int v1 = this.a + v;
        this.a = v1;
        return v1;
    }

    public int c() {
        return this.a;
    }

    public int d(int v) {
        int v1 = this.a;
        this.a = v;
        return v1;
    }

    public void e(int v) {
        this.a = v;
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof v1 && ((v1)object0).a == this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    public String toString() {
        return Integer.toString(this.a);
    }
}

