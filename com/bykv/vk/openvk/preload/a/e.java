package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.b.a.m;
import com.bykv.vk.openvk.preload.a.b.c;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e {
    private c a;
    private q b;
    private com.bykv.vk.openvk.preload.a.c c;
    private final Map d;
    private final List e;
    private final List f;
    private String g;
    private int h;
    private int i;
    private boolean j;

    public e() {
        this.a = c.a;
        this.b = q.a;
        this.c = b.a;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 2;
        this.j = true;
    }

    public final d a() {
        a a2;
        a a1;
        a a0;
        ArrayList arrayList0 = new ArrayList(this.e.size() + this.f.size() + 3);
        arrayList0.addAll(this.e);
        Collections.reverse(arrayList0);
        ArrayList arrayList1 = new ArrayList(this.f);
        Collections.reverse(arrayList1);
        arrayList0.addAll(arrayList1);
        String s = this.g;
        int v = this.h;
        int v1 = this.i;
        Class class0 = Date.class;
        Class class1 = Timestamp.class;
        Class class2 = java.util.Date.class;
        if(s != null && !"".equals(s.trim())) {
            a0 = new a(class2, s);
            a1 = new a(class1, s);
            a2 = new a(class0, s);
            arrayList0.add(m.a(class2, a0));
            arrayList0.add(m.a(class1, a1));
            arrayList0.add(m.a(class0, a2));
            return new d(this.a, this.c, this.d, this.j, this.b, arrayList0);
        }
        else if(v != 2 && v1 != 2) {
            a0 = new a(class2, v, v1);
            a1 = new a(class1, v, v1);
            a2 = new a(class0, v, v1);
            arrayList0.add(m.a(class2, a0));
            arrayList0.add(m.a(class1, a1));
            arrayList0.add(m.a(class0, a2));
        }
        return new d(this.a, this.c, this.d, this.j, this.b, arrayList0);
    }

    public final e a(Type type0, Object object0) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(true);
        s s0 = m.a(com.bykv.vk.openvk.preload.a.c.a.a(type0), ((r)object0));
        this.e.add(s0);
        return this;
    }
}

