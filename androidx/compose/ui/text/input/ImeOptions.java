package androidx.compose.ui.text.input;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class ImeOptions {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ImeOptions a() {
            return ImeOptions.h;
        }
    }

    private final boolean a;
    private final int b;
    private final boolean c;
    private final int d;
    private final int e;
    @l
    public static final Companion f;
    public static final int g;
    @l
    private static final ImeOptions h;

    static {
        ImeOptions.f = new Companion(null);
        ImeOptions.h = new ImeOptions(false, 0, false, 0, 0, 0x1F, null);
    }

    private ImeOptions(boolean z, int v, boolean z1, int v1, int v2) {
        this.a = z;
        this.b = v;
        this.c = z1;
        this.d = v1;
        this.e = v2;
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, int v3, w w0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 8) != 0) {
            v1 = 1;
        }
        if((v3 & 16) != 0) {
            v2 = 1;
        }
        this(((v3 & 1) == 0 ? z : false), v, ((v3 & 4) == 0 ? z1 : true), v1, v2, null);
    }

    public ImeOptions(boolean z, int v, boolean z1, int v1, int v2, w w0) {
        this(z, v, z1, v1, v2);
    }

    @l
    public final ImeOptions b(boolean z, int v, boolean z1, int v1, int v2) {
        return new ImeOptions(z, v, z1, v1, v2, null);
    }

    public static ImeOptions c(ImeOptions imeOptions0, boolean z, int v, boolean z1, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            z = imeOptions0.a;
        }
        if((v3 & 2) != 0) {
            v = imeOptions0.b;
        }
        if((v3 & 4) != 0) {
            z1 = imeOptions0.c;
        }
        if((v3 & 8) != 0) {
            v1 = imeOptions0.d;
        }
        if((v3 & 16) != 0) {
            v2 = imeOptions0.e;
        }
        return imeOptions0.b(z, v, z1, v1, v2);
    }

    public final boolean d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImeOptions)) {
            return false;
        }
        if(this.a != ((ImeOptions)object0).a) {
            return false;
        }
        if(!KeyboardCapitalization.h(this.b, ((ImeOptions)object0).b)) {
            return false;
        }
        if(this.c != ((ImeOptions)object0).c) {
            return false;
        }
        return KeyboardType.m(this.d, ((ImeOptions)object0).d) ? ImeAction.l(this.e, ((ImeOptions)object0).e) : false;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.d;
    }

    public final boolean h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (((c.a(this.a) * 0x1F + this.b) * 0x1F + c.a(this.c)) * 0x1F + this.d) * 0x1F + this.e;
    }

    @Override
    @l
    public String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + KeyboardCapitalization.j(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + KeyboardType.o(this.d) + ", imeAction=" + ImeAction.n(this.e) + ')';
    }
}

