package com.vungle.ads.internal.util;

import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlinx.serialization.json.y;
import y4.l;
import y4.m;

public final class n {
    @l
    public static final n INSTANCE;

    static {
        n.INSTANCE = new n();
    }

    @m
    public final String getContentStringValue(@l y y0, @l String s) {
        L.p(y0, "json");
        L.p(s, "key");
        try {
            return kotlinx.serialization.json.n.r(((kotlinx.serialization.json.l)Y.K(y0, s))).a();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

