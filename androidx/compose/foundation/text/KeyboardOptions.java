package androidx.compose.foundation.text;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class KeyboardOptions {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final KeyboardOptions a() {
            return KeyboardOptions.g;
        }

        @Stable
        public static void b() {
        }
    }

    private final int a;
    private final boolean b;
    private final int c;
    private final int d;
    @l
    public static final Companion e;
    public static final int f;
    @l
    private static final KeyboardOptions g;

    static {
        KeyboardOptions.e = new Companion(null);
        KeyboardOptions.g = new KeyboardOptions(0, false, 0, 0, 15, null);
    }

    private KeyboardOptions(int v, boolean z, int v1, int v2) {
        this.a = v;
        this.b = z;
        this.c = v1;
        this.d = v2;
    }

    public KeyboardOptions(int v, boolean z, int v1, int v2, int v3, w w0) {
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 1;
        }
        if((v3 & 8) != 0) {
            v2 = 1;
        }
        this(v, ((v3 & 2) == 0 ? z : true), v1, v2, null);
    }

    public KeyboardOptions(int v, boolean z, int v1, int v2, w w0) {
        this(v, z, v1, v2);
    }

    @l
    public final KeyboardOptions b(int v, boolean z, int v1, int v2) {
        return new KeyboardOptions(v, z, v1, v2, null);
    }

    public static KeyboardOptions c(KeyboardOptions keyboardOptions0, int v, boolean z, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = keyboardOptions0.a;
        }
        if((v3 & 2) != 0) {
            z = keyboardOptions0.b;
        }
        if((v3 & 4) != 0) {
            v1 = keyboardOptions0.c;
        }
        if((v3 & 8) != 0) {
            v2 = keyboardOptions0.d;
        }
        return keyboardOptions0.b(v, z, v1, v2);
    }

    public final boolean d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KeyboardOptions)) {
            return false;
        }
        if(!KeyboardCapitalization.h(this.a, ((KeyboardOptions)object0).a)) {
            return false;
        }
        if(this.b != ((KeyboardOptions)object0).b) {
            return false;
        }
        return KeyboardType.m(this.c, ((KeyboardOptions)object0).c) ? ImeAction.l(this.d, ((KeyboardOptions)object0).d) : false;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.c;
    }

    @l
    public final ImeOptions h(boolean z) {
        return new ImeOptions(z, this.a, this.b, this.c, this.d, null);
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + c.a(this.b)) * 0x1F + this.c) * 0x1F + this.d;
    }

    public static ImeOptions i(KeyboardOptions keyboardOptions0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = ImeOptions.f.a().h();
        }
        return keyboardOptions0.h(z);
    }

    @Override
    @l
    public String toString() {
        return "KeyboardOptions(capitalization=" + KeyboardCapitalization.j(this.a) + ", autoCorrect=" + this.b + ", keyboardType=" + KeyboardType.o(this.c) + ", imeAction=" + ImeAction.n(this.d) + ')';
    }
}

