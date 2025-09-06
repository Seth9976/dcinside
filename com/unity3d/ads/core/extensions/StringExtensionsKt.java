package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import okio.o;
import y4.l;
import y4.m;

public final class StringExtensionsKt {
    @l
    public static final String getSHA256Hash(@l String s) {
        L.p(s, "<this>");
        byte[] arr_b = s.getBytes(f.b);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        String s1 = o.U(Arrays.copyOf(arr_b, arr_b.length)).f0().z();
        L.o(s1, "bytes.sha256().hex()");
        return s1;
    }

    @m
    public static final String guessMimeType(@l String s) {
        L.p(s, "<this>");
        return URLConnection.guessContentTypeFromName(s);
    }
}

