package com.bykv.vk.openvk.preload.b;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class c {
    public static b a(List list0, e e0) {
        return c.a(list0, e0, null);
    }

    static b a(List list0, e e0, d d0) {
        if(list0 == null) {
            throw new IllegalArgumentException("interceptors == null !");
        }
        if(e0 == null) {
            e0 = new a();
        }
        return new i(DesugarCollections.unmodifiableList(new ArrayList(list0)), 0, e0, d0);
    }
}

