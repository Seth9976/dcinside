package com.facebook.cache.common;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class f {
    @l
    public static final f a;

    static {
        f.a = new f();
    }

    @l
    @n
    public static final String a(@l e e0) {
        L.p(e0, "key");
        try {
            if(e0 instanceof i) {
                List list0 = ((i)e0).d();
                L.o(list0, "getCacheKeys(...)");
                Object object0 = list0.get(0);
                L.o(object0, "get(...)");
                return f.a.c(((e)object0));
            }
            return f.a.c(e0);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
        }
        throw new RuntimeException(unsupportedEncodingException0);
    }

    @l
    @n
    public static final List b(@l e e0) {
        List list0;
        L.p(e0, "key");
        try {
            if(!(e0 instanceof i)) {
                list0 = new ArrayList(1);
                ((ArrayList)list0).add((e0.b() ? e0.a() : f.a.c(e0)));
                return list0;
            }
            List list1 = ((i)e0).d();
            L.o(list1, "getCacheKeys(...)");
            list0 = new ArrayList(list1.size());
            int v = list1.size();
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    return list0;
                }
                Object object0 = list1.get(v1);
                L.o(object0, "get(...)");
                ((ArrayList)list0).add(f.a.c(((e)object0)));
            }
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
        }
        throw new RuntimeException(unsupportedEncodingException0);
    }

    private final String c(e e0) throws UnsupportedEncodingException {
        String s = e0.a();
        L.o(s, "getUriString(...)");
        Charset charset0 = Charset.forName("UTF-8");
        L.o(charset0, "forName(...)");
        byte[] arr_b = s.getBytes(charset0);
        L.o(arr_b, "getBytes(...)");
        String s1 = com.facebook.common.util.e.i(arr_b);
        L.o(s1, "makeSHA1HashBase64(...)");
        return s1;
    }
}

