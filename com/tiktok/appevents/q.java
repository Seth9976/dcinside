package com.tiktok.appevents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class q implements Serializable {
    private List a;
    public static final long b = 1L;

    q() {
        this.a = new ArrayList();
    }

    public void a(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            this.a.addAll(list0);
        }
    }

    public List b() {
        return this.a;
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    public void d(List list0) {
        this.a = list0;
    }

    @Override
    public String toString() {
        return "TTAppEventPersist{appEvents=" + this.a + '}';
    }
}

