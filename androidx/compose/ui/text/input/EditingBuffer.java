package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
public final class EditingBuffer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final PartialGapBuffer a;
    private int b;
    private int c;
    private int d;
    private int e;
    @l
    public static final Companion f = null;
    public static final int g = 0;
    public static final int h = -1;

    static {
        EditingBuffer.f = new Companion(null);
        EditingBuffer.g = 8;
    }

    private EditingBuffer(AnnotatedString annotatedString0, long v) {
        this.a = new PartialGapBuffer(annotatedString0.j());
        this.b = TextRange.l(v);
        this.c = TextRange.k(v);
        this.d = -1;
        this.e = -1;
        int v1 = TextRange.l(v);
        int v2 = TextRange.k(v);
        if(v1 < 0 || v1 > annotatedString0.length()) {
            throw new IndexOutOfBoundsException("start (" + v1 + ") offset is outside of text region " + annotatedString0.length());
        }
        if(v2 < 0 || v2 > annotatedString0.length()) {
            throw new IndexOutOfBoundsException("end (" + v2 + ") offset is outside of text region " + annotatedString0.length());
        }
        if(v1 > v2) {
            throw new IllegalArgumentException("Do not set reversed range: " + v1 + " > " + v2);
        }
    }

    public EditingBuffer(AnnotatedString annotatedString0, long v, w w0) {
        this(annotatedString0, v);
    }

    private EditingBuffer(String s, long v) {
        this(new AnnotatedString(s, null, null, 6, null), v, null);
    }

    public EditingBuffer(String s, long v, w w0) {
        this(s, v);
    }

    public final void a() {
        this.o(this.d, this.e, "");
        this.d = -1;
        this.e = -1;
    }

    public final void b() {
        this.d = -1;
        this.e = -1;
    }

    public final void c(int v, int v1) {
        long v2 = TextRangeKt.b(v, v1);
        this.a.d(v, v1, "");
        long v3 = EditingBufferKt.a(TextRangeKt.b(this.b, this.c), v2);
        this.t(TextRange.l(v3));
        this.s(TextRange.k(v3));
        if(this.m()) {
            long v4 = EditingBufferKt.a(TextRangeKt.b(this.d, this.e), v2);
            if(TextRange.h(v4)) {
                this.b();
                return;
            }
            this.d = TextRange.l(v4);
            this.e = TextRange.k(v4);
        }
    }

    public final char d(int v) {
        return this.a.a(v);
    }

    // 去混淆评级： 低(20)
    @m
    public final TextRange e() {
        return this.m() ? TextRange.b(TextRangeKt.b(this.d, this.e)) : null;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.d;
    }

    public final int h() {
        return this.b == this.c ? this.c : -1;
    }

    public final int i() {
        return this.a.b();
    }

    public final long j() {
        return TextRangeKt.b(this.b, this.c);
    }

    public final int k() {
        return this.c;
    }

    public final int l() {
        return this.b;
    }

    public final boolean m() {
        return this.d != -1;
    }

    public final void n(int v, int v1, @l AnnotatedString annotatedString0) {
        L.p(annotatedString0, "text");
        this.o(v, v1, annotatedString0.j());
    }

    public final void o(int v, int v1, @l String s) {
        L.p(s, "text");
        if(v < 0 || v > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.a.b());
        }
        if(v1 < 0 || v1 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.a.b());
        }
        if(v > v1) {
            throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
        }
        this.a.d(v, v1, s);
        this.t(s.length() + v);
        this.s(v + s.length());
        this.d = -1;
        this.e = -1;
    }

    public final void p(int v, int v1) {
        if(v < 0 || v > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.a.b());
        }
        if(v1 < 0 || v1 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.a.b());
        }
        if(v >= v1) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + v + " > " + v1);
        }
        this.d = v;
        this.e = v1;
    }

    public final void q(int v) {
        this.r(v, v);
    }

    public final void r(int v, int v1) {
        if(v < 0 || v > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.a.b());
        }
        if(v1 < 0 || v1 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.a.b());
        }
        if(v > v1) {
            throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
        }
        this.t(v);
        this.s(v1);
    }

    private final void s(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + v).toString());
        }
        this.c = v;
    }

    private final void t(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + v).toString());
        }
        this.b = v;
    }

    @Override
    @l
    public String toString() {
        return this.a.toString();
    }

    @l
    public final AnnotatedString u() {
        return new AnnotatedString(this.toString(), null, null, 6, null);
    }
}

