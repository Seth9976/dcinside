package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k1.n.a;
import k1.n;

@n(a.a)
public class i extends ArrayList {
    private i(int v) {
        super(v);
    }

    private i(List list0) {
        super(list0);
    }

    public static i a(List list0) {
        return new i(list0);
    }

    public static i b(Object[] arr_object) {
        i i0 = new i(arr_object.length);
        Collections.addAll(i0, arr_object);
        return i0;
    }
}

