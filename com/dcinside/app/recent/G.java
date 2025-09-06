package com.dcinside.app.recent;

import com.dcinside.app.realm.m;

public final class g implements h {
    private m a;

    g(m m0) {
        this.a = m0;
    }

    @Override  // com.dcinside.app.recent.h
    public String a() {
        return this.a.S5();
    }

    public m b() {
        return this.a;
    }

    @Override  // com.dcinside.app.recent.h
    public Object getItem() {
        return this.b();
    }
}

