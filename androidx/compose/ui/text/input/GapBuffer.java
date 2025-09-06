package androidx.compose.ui.text.input;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
final class GapBuffer {
    private int a;
    @l
    private char[] b;
    private int c;
    private int d;

    public GapBuffer(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "initBuffer");
        super();
        this.a = arr_c.length;
        this.b = arr_c;
        this.c = v;
        this.d = v1;
    }

    public final void a(@l StringBuilder stringBuilder0) {
        L.p(stringBuilder0, "builder");
        stringBuilder0.append(this.b, 0, this.c);
        stringBuilder0.append(this.b, this.d, this.a - this.d);
    }

    private final void b(int v, int v1) {
        int v2 = this.c;
        if(v < v2 && v1 <= v2) {
            int v3 = v2 - v1;
            kotlin.collections.l.w0(this.b, this.b, this.d - v3, v1, v2);
            this.c = v;
            this.d -= v3;
            return;
        }
        if(v < v2 && v1 >= v2) {
            this.d = v1 + this.c();
            this.c = v;
            return;
        }
        int v4 = v + this.c();
        int v5 = v4 - this.d;
        kotlin.collections.l.w0(this.b, this.b, this.c, this.d, v4);
        this.c += v5;
        this.d = v1 + this.c();
    }

    private final int c() {
        return this.d - this.c;
    }

    public final char d(int v) {
        return v >= this.c ? this.b[v - this.c + this.d] : this.b[v];
    }

    public final int e() {
        return this.a - this.c();
    }

    private final void f(int v) {
        if(v <= this.c()) {
            return;
        }
        int v1 = this.c();
        int v2 = this.a;
        do {
            v2 *= 2;
        }
        while(v2 - this.a < v - v1);
        char[] arr_c = new char[v2];
        kotlin.collections.l.w0(this.b, arr_c, 0, 0, this.c);
        int v3 = this.a - this.d;
        int v4 = v2 - v3;
        kotlin.collections.l.w0(this.b, arr_c, v4, this.d, v3 + this.d);
        this.b = arr_c;
        this.a = v2;
        this.d = v4;
    }

    public final void g(int v, int v1, @l String s) {
        L.p(s, "text");
        this.f(s.length() - (v1 - v));
        this.b(v, v1);
        GapBufferKt.b(s, this.b, this.c);
        this.c += s.length();
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(stringBuilder0);
        L.o("", "StringBuilder().apply { append(this) }.toString()");
        return "";
    }
}

