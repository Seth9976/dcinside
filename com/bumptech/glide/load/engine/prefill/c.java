package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class c {
    private final Map a;
    private final List b;
    private int c;
    private int d;

    public c(Map map0) {
        this.a = map0;
        this.b = new ArrayList(map0.keySet());
        for(Object object0: map0.values()) {
            this.c += (int)(((Integer)object0));
        }
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.c == 0;
    }

    public d c() {
        d d0 = (d)this.b.get(this.d);
        Integer integer0 = (Integer)this.a.get(d0);
        if(((int)integer0) == 1) {
            this.a.remove(d0);
            this.b.remove(this.d);
        }
        else {
            this.a.put(d0, ((int)(((int)integer0) - 1)));
        }
        --this.c;
        this.d = this.b.isEmpty() ? 0 : (this.d + 1) % this.b.size();
        return d0;
    }
}

