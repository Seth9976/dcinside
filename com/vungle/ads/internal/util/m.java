package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;

public final class m {
    @l
    public static final m INSTANCE;

    static {
        m.INSTANCE = new m();
    }

    @l
    public final String convertForSending(@l String s) throws IOException {
        String s1;
        L.p(s, "stringToConvert");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(s.length());
        try {
            GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            try {
                byte[] arr_b = s.getBytes(f.b);
                L.o(arr_b, "this as java.lang.String).getBytes(charset)");
                gZIPOutputStream0.write(arr_b);
                gZIPOutputStream0.close();
                s1 = Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
                L.o(s1, "encodeToString(compressed, Base64.NO_WRAP)");
            }
            catch(Throwable throwable1) {
                c.a(gZIPOutputStream0, throwable1);
                throw throwable1;
            }
            c.a(gZIPOutputStream0, null);
        }
        catch(Throwable throwable0) {
            c.a(byteArrayOutputStream0, throwable0);
            throw throwable0;
        }
        c.a(byteArrayOutputStream0, null);
        return s1;
    }
}

