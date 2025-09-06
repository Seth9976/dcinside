package com.dcinside.app.recent;

import com.dcinside.app.realm.s0;

public final class f implements h {
    private s0 a;

    f(s0 s00) {
        this.a = s00;
    }

    @Override  // com.dcinside.app.recent.h
    public String a() {
        return this.a.S5();
    }

    public s0 b() {
        return this.a;
    }

    @Override  // com.dcinside.app.recent.h
    public Object getItem() {
        return this.b();
    }
}

