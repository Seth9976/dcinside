package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalTextApi
public final class PartialGapBuffer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private String a;
    @m
    private GapBuffer b;
    private int c;
    private int d;
    @l
    public static final Companion e = null;
    public static final int f = 0;
    public static final int g = 0xFF;
    public static final int h = 0x40;
    public static final int i = -1;

    static {
        PartialGapBuffer.e = new Companion(null);
        PartialGapBuffer.f = 8;
    }

    public PartialGapBuffer(@l String s) {
        L.p(s, "text");
        super();
        this.a = s;
        this.c = -1;
        this.d = -1;
    }

    public final char a(int v) {
        GapBuffer gapBuffer0 = this.b;
        if(gapBuffer0 == null) {
            return this.a.charAt(v);
        }
        if(v < this.c) {
            return this.a.charAt(v);
        }
        int v1 = gapBuffer0.e();
        return v >= v1 + this.c ? this.a.charAt(v - (v1 - this.d + this.c)) : gapBuffer0.d(v - this.c);
    }

    public final int b() {
        return this.b == null ? this.a.length() : this.a.length() - (this.d - this.c) + this.b.e();
    }

    @l
    public final String c() {
        return this.a;
    }

    public final void d(int v, int v1, @l String s) {
        L.p(s, "text");
        if(v > v1) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + v + " > " + v1).toString());
        }
        if(v < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + v).toString());
        }
        GapBuffer gapBuffer0 = this.b;
        if(gapBuffer0 == null) {
            int v2 = Math.max(0xFF, s.length() + 0x80);
            char[] arr_c = new char[v2];
            int v3 = Math.min(v, 0x40);
            int v4 = Math.min(this.a.length() - v1, 0x40);
            int v5 = v - v3;
            GapBuffer_jvmKt.a(this.a, arr_c, 0, v5, v);
            int v6 = v2 - v4;
            int v7 = v4 + v1;
            GapBuffer_jvmKt.a(this.a, arr_c, v6, v1, v7);
            GapBufferKt.b(s, arr_c, v3);
            this.b = new GapBuffer(arr_c, v3 + s.length(), v6);
            this.c = v5;
            this.d = v7;
            return;
        }
        int v8 = v - this.c;
        int v9 = v1 - this.c;
        if(v8 >= 0 && v9 <= gapBuffer0.e()) {
            gapBuffer0.g(v8, v9, s);
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.d(v, v1, s);
    }

    public final void e(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    @Override
    @l
    public String toString() {
        GapBuffer gapBuffer0 = this.b;
        if(gapBuffer0 == null) {
            return this.a;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a, 0, this.c);
        gapBuffer0.a(stringBuilder0);
        stringBuilder0.append(this.a, this.d, this.a.length());
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }
}

