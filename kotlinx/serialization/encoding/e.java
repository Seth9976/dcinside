package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlinx.serialization.d;
import kotlinx.serialization.f;
import y4.l;
import y4.m;

public interface e {
    public static final class a {
        @f
        @m
        public static Object a(@l e e0, @l d d0) {
            L.p(d0, "deserializer");
            return !d0.getDescriptor().b() && !e0.D() ? e0.g() : e0.G(d0);
        }

        public static Object b(@l e e0, @l d d0) {
            L.p(d0, "deserializer");
            return d0.deserialize(e0);
        }
    }

    boolean A();

    @f
    boolean D();

    Object G(@l d arg1);

    byte H();

    @f
    @m
    Object I(@l d arg1);

    @l
    kotlinx.serialization.modules.f a();

    @l
    c b(@l kotlinx.serialization.descriptors.f arg1);

    @f
    @m
    Void g();

    long h();

    short m();

    double n();

    char o();

    @l
    String q();

    int s(@l kotlinx.serialization.descriptors.f arg1);

    int u();

    @l
    e x(@l kotlinx.serialization.descriptors.f arg1);

    float y();
}

