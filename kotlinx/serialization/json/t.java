package kotlinx.serialization.json;

import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.internal.j0;
import kotlinx.serialization.json.internal.k0;
import y4.l;
import y4.m;

public final class t extends B {
    private final boolean c;
    @l
    private final String d;

    public t(@l Object object0, boolean z) {
        L.p(object0, "body");
        super(null);
        this.c = z;
        this.d = object0.toString();
    }

    @Override  // kotlinx.serialization.json.B
    @l
    public String a() {
        return this.d;
    }

    @Override  // kotlinx.serialization.json.B
    public boolean b() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && L.g(m0.d(t.class), m0.d(object0.getClass())) && this.b() == ((t)object0).b() ? L.g(this.a(), ((t)object0).a()) : false;
    }

    @Override
    @k0
    public int hashCode() {
        return c.a(this.b()) * 0x1F + this.a().hashCode();
    }

    @Override  // kotlinx.serialization.json.B
    @l
    public String toString() {
        if(this.b()) {
            StringBuilder stringBuilder0 = new StringBuilder();
            j0.e(stringBuilder0, this.a());
            String s = stringBuilder0.toString();
            L.o(s, "StringBuilder().apply(builderAction).toString()");
            return s;
        }
        return this.a();
    }
}

