package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlinx.serialization.f;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

public interface d {
    public static final class a {
        @f
        public static boolean a(@l d d0, @l kotlinx.serialization.descriptors.f f0, int v) {
            L.p(f0, "descriptor");
            return true;
        }
    }

    void D(@l kotlinx.serialization.descriptors.f arg1, int arg2, float arg3);

    void G(@l kotlinx.serialization.descriptors.f arg1, int arg2, @l w arg3, Object arg4);

    void H(@l kotlinx.serialization.descriptors.f arg1, int arg2, double arg3);

    @l
    kotlinx.serialization.modules.f a();

    void c(@l kotlinx.serialization.descriptors.f arg1);

    void i(@l kotlinx.serialization.descriptors.f arg1, int arg2, char arg3);

    void j(@l kotlinx.serialization.descriptors.f arg1, int arg2, byte arg3);

    void n(@l kotlinx.serialization.descriptors.f arg1, int arg2, int arg3);

    void o(@l kotlinx.serialization.descriptors.f arg1, int arg2, boolean arg3);

    void p(@l kotlinx.serialization.descriptors.f arg1, int arg2, @l String arg3);

    @f
    boolean q(@l kotlinx.serialization.descriptors.f arg1, int arg2);

    void t(@l kotlinx.serialization.descriptors.f arg1, int arg2, short arg3);

    void u(@l kotlinx.serialization.descriptors.f arg1, int arg2, long arg3);

    @l
    g w(@l kotlinx.serialization.descriptors.f arg1, int arg2);

    @f
    void y(@l kotlinx.serialization.descriptors.f arg1, int arg2, @l w arg3, @m Object arg4);
}

