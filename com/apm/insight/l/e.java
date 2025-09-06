package com.apm.insight.l;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class e extends PrintWriter {
    public static class a {
        public boolean a(String s) {
            return true;
        }
    }

    private MessageDigest a;
    private Charset b;
    private a c;

    public e(@NonNull OutputStream outputStream0, MessageDigest messageDigest0, a e$a0) {
        super(outputStream0);
        this.b = null;
        this.a = messageDigest0;
        this.c = e$a0;
        if(messageDigest0 != null) {
            this.b = Charset.defaultCharset();
        }
    }

    @Override
    public final void write(int v) {
        super.write(v);
        MessageDigest messageDigest0 = this.a;
        if(messageDigest0 != null) {
            messageDigest0.update(((byte)v));
        }
    }

    @Override
    public final void write(@NonNull String s, int v, int v1) {
        super.write(s, v, v1);
        if(this.a != null && (this.c == null || this.c.a(s))) {
            this.a.update(this.b.encode(CharBuffer.wrap(s, v, v1 + v)).array());
        }
    }

    @Override
    public final void write(@NonNull char[] arr_c, int v, int v1) {
        super.write(arr_c, v, v1);
        MessageDigest messageDigest0 = this.a;
        if(messageDigest0 != null) {
            messageDigest0.update(this.b.encode(CharBuffer.wrap(arr_c)).array());
        }
    }
}

