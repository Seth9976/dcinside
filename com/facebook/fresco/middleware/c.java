package com.facebook.fresco.middleware;

import S0.b.a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @l
    @n
    public static final a a(@l Map map0, @l Map map1, @m Map map2, @m Map map3, @m Rect rect0, @m String s, @m PointF pointF0, @m Map map4, @m Object object0, boolean z, @m Uri uri0) {
        L.p(map0, "componentAttribution");
        L.p(map1, "shortcutAttribution");
        a b$a0 = new a();
        if(rect0 != null) {
            b$a0.h = rect0.width();
            b$a0.i = rect0.height();
        }
        b$a0.j = s;
        if(pointF0 != null) {
            b$a0.k = pointF0.x;
            b$a0.l = pointF0.y;
        }
        b$a0.f = object0;
        b$a0.m = z;
        b$a0.g = uri0;
        b$a0.c = map2;
        b$a0.d = map4;
        b$a0.b = map1;
        b$a0.a = map0;
        b$a0.e = map3;
        return b$a0;
    }

    public static a b(Map map0, Map map1, Map map2, Map map3, Rect rect0, String s, PointF pointF0, Map map4, Object object0, boolean z, Uri uri0, int v, Object object1) {
        return (v & 0x200) == 0 ? c.a(map0, map1, map2, map3, rect0, s, pointF0, map4, object0, z, uri0) : c.a(map0, map1, map2, map3, rect0, s, pointF0, map4, object0, false, uri0);
    }
}

