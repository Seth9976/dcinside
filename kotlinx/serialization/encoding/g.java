package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

public interface g {
    public static final class a {
        @l
        public static d a(@l g g0, @l f f0, int v) {
            L.p(f0, "descriptor");
            return g0.b(f0);
        }

        @kotlinx.serialization.f
        public static void b(@l g g0) {
        }

        @kotlinx.serialization.f
        public static void c(@l g g0, @l w w0, @m Object object0) {
            L.p(w0, "serializer");
            if(w0.getDescriptor().b()) {
                g0.e(w0, object0);
                return;
            }
            if(object0 == null) {
                g0.C();
                return;
            }
            g0.F();
            g0.e(w0, object0);
        }

        public static void d(@l g g0, @l w w0, Object object0) {
            L.p(w0, "serializer");
            w0.serialize(g0, object0);
        }
    }

    @kotlinx.serialization.f
    void A(@l w arg1, @m Object arg2);

    void B(long arg1);

    @kotlinx.serialization.f
    void C();

    void E(char arg1);

    @kotlinx.serialization.f
    void F();

    @l
    kotlinx.serialization.modules.f a();

    @l
    d b(@l f arg1);

    void e(@l w arg1, Object arg2);

    void f(byte arg1);

    void g(@l f arg1, int arg2);

    @l
    g h(@l f arg1);

    void k(short arg1);

    void l(boolean arg1);

    void m(float arg1);

    void s(int arg1);

    void v(@l String arg1);

    void x(double arg1);

    @l
    d z(@l f arg1, int arg2);
}

