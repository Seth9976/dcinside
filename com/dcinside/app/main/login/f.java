package com.dcinside.app.main.login;

import A3.a;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.realm.B;
import rx.functions.b;

public final class f implements b {
    public final AppCompatActivity a;
    public final String b;
    public final String c;
    public final B d;
    public final a e;

    public f(AppCompatActivity appCompatActivity0, String s, String s1, B b0, a a0) {
        this.a = appCompatActivity0;
        this.b = s;
        this.c = s1;
        this.d = b0;
        this.e = a0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        com.dcinside.app.main.login.g.a.e(this.a, this.b, this.c, this.d, this.e, ((Throwable)object0));
    }
}

