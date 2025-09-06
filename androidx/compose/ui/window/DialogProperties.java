package androidx.compose.ui.window;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class DialogProperties {
    private final boolean a;
    private final boolean b;
    @l
    private final SecureFlagPolicy c;
    private final boolean d;
    private final boolean e;
    public static final int f;

    static {
    }

    public DialogProperties() {
        this(false, false, null, false, false, 0x1F, null);
    }

    public DialogProperties(boolean z, boolean z1, @l SecureFlagPolicy secureFlagPolicy0) {
        L.p(secureFlagPolicy0, "securePolicy");
        this(z, z1, secureFlagPolicy0, true, true);
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.a;
        }
        this(z, z1, secureFlagPolicy0);
    }

    public DialogProperties(boolean z, boolean z1, @l SecureFlagPolicy secureFlagPolicy0, boolean z2, boolean z3) {
        L.p(secureFlagPolicy0, "securePolicy");
        super();
        this.a = z;
        this.b = z1;
        this.c = secureFlagPolicy0;
        this.d = z2;
        this.e = z3;
    }

    public DialogProperties(boolean z, boolean z1, SecureFlagPolicy secureFlagPolicy0, boolean z2, boolean z3, int v, w w0) {
        if((v & 4) != 0) {
            secureFlagPolicy0 = SecureFlagPolicy.a;
        }
        this(((v & 1) == 0 ? z : true), ((v & 2) == 0 ? z1 : true), secureFlagPolicy0, ((v & 8) == 0 ? z2 : true), ((v & 16) == 0 ? z3 : true));
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    @l
    public final SecureFlagPolicy d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DialogProperties)) {
            return false;
        }
        if(this.a != ((DialogProperties)object0).a) {
            return false;
        }
        if(this.b != ((DialogProperties)object0).b) {
            return false;
        }
        if(this.c != ((DialogProperties)object0).c) {
            return false;
        }
        return this.d == ((DialogProperties)object0).d ? this.e == ((DialogProperties)object0).e : false;
    }

    @Override
    public int hashCode() {
        return (((c.a(this.a) * 0x1F + c.a(this.b)) * 0x1F + this.c.hashCode()) * 0x1F + c.a(this.d)) * 0x1F + c.a(this.e);
    }
}

