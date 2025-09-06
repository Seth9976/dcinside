package androidx.compose.ui.window;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class PopupProperties {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    @l
    private final SecureFlagPolicy d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    public static final int h;

    static {
    }

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, 0x7F, null);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, @l SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4) {
        L.p(secureFlagPolicy0, "securePolicy");
        this(z, z1, z2, secureFlagPolicy0, z3, z4, false);
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        boolean z5 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.a;
        }
        if((v & 0x20) == 0) {
            z5 = z4;
        }
        this(z, ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z5);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z, boolean z1, boolean z2, @l SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5) {
        L.p(secureFlagPolicy0, "securePolicy");
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = secureFlagPolicy0;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public PopupProperties(boolean z, boolean z1, boolean z2, SecureFlagPolicy secureFlagPolicy0, boolean z3, boolean z4, boolean z5, int v, w w0) {
        boolean z6 = true;
        if((v & 8) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.a;
        }
        if((v & 0x20) == 0) {
            z6 = z4;
        }
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : true), ((v & 4) == 0 ? z2 : true), secureFlagPolicy0, ((v & 16) == 0 ? z3 : true), z6, ((v & 0x40) == 0 ? z5 : false));
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PopupProperties)) {
            return false;
        }
        if(this.a != ((PopupProperties)object0).a) {
            return false;
        }
        if(this.b != ((PopupProperties)object0).b) {
            return false;
        }
        if(this.c != ((PopupProperties)object0).c) {
            return false;
        }
        if(this.d != ((PopupProperties)object0).d) {
            return false;
        }
        if(this.e != ((PopupProperties)object0).e) {
            return false;
        }
        return this.f == ((PopupProperties)object0).f ? this.g == ((PopupProperties)object0).g : false;
    }

    @l
    public final SecureFlagPolicy f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return ((((((c.a(this.b) * 0x1F + c.a(this.a)) * 0x1F + c.a(this.b)) * 0x1F + c.a(this.c)) * 0x1F + this.d.hashCode()) * 0x1F + c.a(this.e)) * 0x1F + c.a(this.f)) * 0x1F + c.a(this.g);
    }
}

