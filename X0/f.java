package X0;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.n;

@s0({"SMAP\nImageFormatCheckerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageFormatCheckerUtils.kt\ncom/facebook/imageformat/ImageFormatCheckerUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n2632#2,3:109\n*S KotlinDebug\n*F\n+ 1 ImageFormatCheckerUtils.kt\ncom/facebook/imageformat/ImageFormatCheckerUtils\n*L\n57#1:109,3\n*E\n"})
public final class f {
    @l
    public static final f a;

    static {
        f.a = new f();
    }

    @l
    @n
    public static final byte[] a(@l String s) {
        L.p(s, "value");
        try {
            Charset charset0 = Charset.forName("ASCII");
            L.o(charset0, "forName(...)");
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "getBytes(...)");
            return arr_b;
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException("ASCII not found!", unsupportedEncodingException0);
        }
    }

    @n
    public static final boolean b(@l byte[] arr_b, @l byte[] arr_b1, int v) {
        L.p(arr_b, "byteArray");
        L.p(arr_b1, "pattern");
        if(arr_b1.length + v > arr_b.length) {
            return false;
        }
        kotlin.ranges.l l0 = kotlin.collections.l.he(arr_b1);
        if(!(l0 instanceof Collection) || !((Collection)l0).isEmpty()) {
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                int v1 = ((T)iterator0).b();
                if(arr_b[v + v1] != arr_b1[v1]) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @n
    public static final int c(@l byte[] arr_b, int v, @l byte[] arr_b1, int v1) {
        L.p(arr_b, "byteArray");
        L.p(arr_b1, "pattern");
        if(v1 > v) {
            return -1;
        }
        int v3 = arr_b1[0];
        int v4 = v - v1;
        for(int v2 = 0; v2 <= v4; ++v2) {
            if(arr_b[v2] != v3) {
                while(true) {
                    ++v2;
                    if(v2 > v4 || arr_b[v2] == v3) {
                        break;
                    }
                }
            }
            if(v2 <= v4) {
                int v6 = v2 + 1;
                int v7 = v6 + v1 - 1;
                for(int v5 = 1; v6 < v7 && arr_b[v6] == arr_b1[v5]; ++v5) {
                    ++v6;
                }
                if(v6 == v7) {
                    return v2;
                }
            }
        }
        return -1;
    }

    @n
    public static final boolean d(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "byteArray");
        L.p(arr_b1, "pattern");
        return f.b(arr_b, arr_b1, 0);
    }
}

