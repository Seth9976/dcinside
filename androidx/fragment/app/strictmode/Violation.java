package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public abstract class Violation extends RuntimeException {
    @l
    private final Fragment a;

    public Violation(@l Fragment fragment0, @m String s) {
        L.p(fragment0, "fragment");
        super(s);
        this.a = fragment0;
    }

    public Violation(Fragment fragment0, String s, int v, w w0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(fragment0, s);
    }

    @l
    public final Fragment a() {
        return this.a;
    }
}

