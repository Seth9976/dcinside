package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.N0;
import kotlin.V;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nWebpUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n2632#2,3:183\n*S KotlinDebug\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n*L\n144#1:183,3\n*E\n"})
public final class i {
    @l
    public static final i a = null;
    @l
    private static final String b = "VP8 ";
    @l
    private static final String c = "VP8L";
    @l
    private static final String d = "VP8X";

    static {
        i.a = new i();
    }

    private final boolean a(byte[] arr_b, String s) {
        if(arr_b.length != s.length()) {
            return false;
        }
        kotlin.ranges.l l0 = kotlin.collections.l.he(arr_b);
        if(!(l0 instanceof Collection) || !((Collection)l0).isEmpty()) {
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                int v = ((T)iterator0).b();
                if(((byte)s.charAt(v)) != arr_b[v]) {
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
    public static final int b(@l InputStream inputStream0) throws IOException {
        L.p(inputStream0, "stream");
        int v = i.a.e(inputStream0);
        return i.a.e(inputStream0) << 8 | v;
    }

    private final String c(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(((char)(N0.h(arr_b[v]) & 0xFFFF)));
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    private final int d(InputStream inputStream0) throws IOException {
        int v = this.e(inputStream0);
        int v1 = this.e(inputStream0);
        int v2 = this.e(inputStream0);
        return this.e(inputStream0) << 24 | v2 << 16 | v1 << 8 | v;
    }

    private final int e(InputStream inputStream0) throws IOException {
        return inputStream0.read() & 0xFF;
    }

    @m
    @n
    public static final V f(@l InputStream inputStream0) {
        V v2;
        V v1;
        V v0;
        i i0;
        L.p(inputStream0, "stream");
        byte[] arr_b = new byte[4];
        try {
            inputStream0.read(arr_b);
            i0 = i.a;
            if(i0.a(arr_b, "RIFF")) {
                i0.d(inputStream0);
                inputStream0.read(arr_b);
                if(i0.a(arr_b, "WEBP")) {
                    inputStream0.read(arr_b);
                    switch(i0.c(arr_b)) {
                        case "VP8 ": {
                            goto label_12;
                        }
                        case "VP8L": {
                            goto label_18;
                        }
                        case "VP8X": {
                            v2 = i0.i(inputStream0);
                            goto label_39;
                        }
                    }
                }
                goto label_44;
            }
            goto label_49;
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            iOException1.printStackTrace();
        }
        return null;
        try {
        label_12:
            v0 = i0.g(inputStream0);
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException2) {
            iOException2.printStackTrace();
        }
        return v0;
        try {
        label_18:
            v1 = i0.h(inputStream0);
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException3) {
            iOException3.printStackTrace();
        }
        return v1;
        try {
            try {
                v2 = i0.i(inputStream0);
                goto label_39;
            }
            catch(IOException iOException0) {
            }
        label_27:
            iOException0.printStackTrace();
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            iOException1.printStackTrace();
        }
        return null;
        try {
        label_34:
            inputStream0.close();
        }
        catch(IOException iOException4) {
            iOException4.printStackTrace();
        }
        throw throwable0;
        try {
        label_39:
            inputStream0.close();
        }
        catch(IOException iOException5) {
            iOException5.printStackTrace();
        }
        return v2;
        try {
        label_44:
            inputStream0.close();
        }
        catch(IOException iOException6) {
            iOException6.printStackTrace();
        }
        return null;
        try {
        label_49:
            inputStream0.close();
        }
        catch(IOException iOException7) {
            iOException7.printStackTrace();
        }
        return null;
    }

    private final V g(InputStream inputStream0) throws IOException {
        inputStream0.skip(7L);
        return this.e(inputStream0) != 0x9D || this.e(inputStream0) != 1 || this.e(inputStream0) != 42 ? null : new V(i.b(inputStream0), i.b(inputStream0));
    }

    private final V h(InputStream inputStream0) throws IOException {
        this.d(inputStream0);
        if(this.e(inputStream0) != 0x2F) {
            return null;
        }
        int v = inputStream0.read();
        int v1 = inputStream0.read();
        int v2 = inputStream0.read();
        return new V(((int)((v & 0xFF | (v1 & 0x3F) << 8) + 1)), ((int)(((inputStream0.read() & 15) << 10 | (v2 & 0xFF) << 2 | (v1 & 0xC0) >> 6) + 1)));
    }

    private final V i(InputStream inputStream0) throws IOException {
        inputStream0.skip(8L);
        return new V(((int)(this.j(inputStream0) + 1)), ((int)(this.j(inputStream0) + 1)));
    }

    private final int j(InputStream inputStream0) throws IOException {
        int v = this.e(inputStream0);
        int v1 = this.e(inputStream0);
        return this.e(inputStream0) << 16 | v1 << 8 | v;
    }
}

