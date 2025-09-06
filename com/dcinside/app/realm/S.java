package com.dcinside.app.realm;

import androidx.annotation.Nullable;
import h3.e;
import io.realm.d1;
import io.realm.r2;

public class s extends d1 implements r2 {
    @e
    public String d;
    @Nullable
    public byte[] e;
    public long f;

    public s() {
        if(this instanceof io.realm.internal.s) {
            ((io.realm.internal.s)this).m2();
        }
    }

    @Override  // io.realm.r2
    public long H3() {
        return this.f;
    }

    @Override  // io.realm.r2
    public byte[] I3() {
        return this.e;
    }

    @Override  // io.realm.r2
    public String a() {
        return this.d;
    }

    @Override  // io.realm.r2
    public void b(String s) {
        this.d = s;
    }

    @Override  // io.realm.r2
    public void v1(byte[] arr_b) {
        this.e = arr_b;
    }

    @Override  // io.realm.r2
    public void v2(long v) {
        this.f = v;
    }
}

