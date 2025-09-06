package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class UndoManager {
    static final class Entry {
        @m
        private Entry a;
        @l
        private TextFieldValue b;

        public Entry(@m Entry undoManager$Entry0, @l TextFieldValue textFieldValue0) {
            L.p(textFieldValue0, "value");
            super();
            this.a = undoManager$Entry0;
            this.b = textFieldValue0;
        }

        public Entry(Entry undoManager$Entry0, TextFieldValue textFieldValue0, int v, w w0) {
            if((v & 1) != 0) {
                undoManager$Entry0 = null;
            }
            this(undoManager$Entry0, textFieldValue0);
        }

        @m
        public final Entry a() {
            return this.a;
        }

        @l
        public final TextFieldValue b() {
            return this.b;
        }

        public final void c(@m Entry undoManager$Entry0) {
            this.a = undoManager$Entry0;
        }

        public final void d(@l TextFieldValue textFieldValue0) {
            L.p(textFieldValue0, "<set-?>");
            this.b = textFieldValue0;
        }
    }

    private final int a;
    @m
    private Entry b;
    @m
    private Entry c;
    private int d;
    @m
    private Long e;
    private boolean f;

    public UndoManager() {
        this(0, 1, null);
    }

    public UndoManager(int v) {
        this.a = v;
    }

    public UndoManager(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 100000;
        }
        this(v);
    }

    public final void a() {
        this.f = true;
    }

    public final int b() {
        return this.a;
    }

    public final void c(@l TextFieldValue textFieldValue0) {
        String s1;
        L.p(textFieldValue0, "value");
        this.f = false;
        if(L.g(textFieldValue0, (this.b == null ? null : this.b.b()))) {
            return;
        }
        String s = textFieldValue0.i();
        Entry undoManager$Entry0 = this.b;
        if(undoManager$Entry0 == null) {
            s1 = null;
        }
        else {
            TextFieldValue textFieldValue1 = undoManager$Entry0.b();
            s1 = textFieldValue1 == null ? null : textFieldValue1.i();
        }
        if(L.g(s, s1)) {
            Entry undoManager$Entry1 = this.b;
            if(undoManager$Entry1 != null) {
                undoManager$Entry1.d(textFieldValue0);
            }
            return;
        }
        this.b = new Entry(this.b, textFieldValue0);
        this.c = null;
        int v = this.d + textFieldValue0.i().length();
        this.d = v;
        if(v > this.a) {
            this.e();
        }
    }

    @m
    public final TextFieldValue d() {
        Entry undoManager$Entry0 = this.c;
        if(undoManager$Entry0 != null) {
            this.c = undoManager$Entry0.a();
            this.b = new Entry(this.b, undoManager$Entry0.b());
            this.d += undoManager$Entry0.b().i().length();
            return undoManager$Entry0.b();
        }
        return null;
    }

    private final void e() {
        Entry undoManager$Entry2;
        Entry undoManager$Entry0 = this.b;
        if((undoManager$Entry0 == null ? null : undoManager$Entry0.a()) == null) {
            return;
        }
        while(true) {
            if(undoManager$Entry0 == null) {
                undoManager$Entry2 = null;
            }
            else {
                Entry undoManager$Entry1 = undoManager$Entry0.a();
                if(undoManager$Entry1 != null) {
                    undoManager$Entry2 = undoManager$Entry1.a();
                }
            }
            if(undoManager$Entry2 == null) {
                break;
            }
            undoManager$Entry0 = undoManager$Entry0.a();
        }
        if(undoManager$Entry0 != null) {
            undoManager$Entry0.c(null);
        }
    }

    public final void f(@l TextFieldValue textFieldValue0, long v) {
        L.p(textFieldValue0, "value");
        if(this.f || v > (this.e == null ? 0L : ((long)this.e)) + 5000L) {
            this.e = v;
            this.c(textFieldValue0);
        }
    }

    public static void g(UndoManager undoManager0, TextFieldValue textFieldValue0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 1757087952229L;
        }
        undoManager0.f(textFieldValue0, v);
    }

    @m
    public final TextFieldValue h() {
        Entry undoManager$Entry0 = this.b;
        if(undoManager$Entry0 != null) {
            Entry undoManager$Entry1 = undoManager$Entry0.a();
            if(undoManager$Entry1 != null) {
                this.b = undoManager$Entry1;
                this.d -= undoManager$Entry0.b().i().length();
                this.c = new Entry(this.c, undoManager$Entry0.b());
                return undoManager$Entry1.b();
            }
        }
        return null;
    }
}

