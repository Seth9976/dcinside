package T2;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class e {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a e$a0 = new a();
            a.INSTANCE = e$a0;
            w0 w00 = new w0("com.vungle.ads.fpd.Location", e$a0, 3);
            w00.k("country", true);
            w00.k("region_state", true);
            w00.k("dma", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(W.a)};
        }

        @l
        public e deserialize(@l kotlinx.serialization.encoding.e e0) {
            int v;
            Object object3;
            Object object2;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                Object object1 = c0.j(f0, 0, N0.a, null);
                object2 = c0.j(f0, 1, N0.a, null);
                object3 = c0.j(f0, 2, W.a, null);
                object0 = object1;
                v = 7;
            }
            else {
                Object object4 = null;
                Object object5 = null;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            object0 = c0.j(f0, 0, N0.a, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object4 = c0.j(f0, 1, N0.a, object4);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object5 = c0.j(f0, 2, W.a, object5);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                v = v1;
                object2 = object4;
                object3 = object5;
            }
            c0.c(f0);
            return new e(v, ((String)object0), ((String)object2), ((Integer)object3), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(kotlinx.serialization.encoding.e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l e e0) {
            L.p(g0, "encoder");
            L.p(e0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            e.write$Self(e0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((e)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final b Companion;
    @y4.m
    private String country;
    @y4.m
    private Integer dma;
    @y4.m
    private String regionState;

    static {
        e.Companion = new b(null);
    }

    public e() {
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public e(int v, @t("country") String s, @t("region_state") String s1, @t("dma") Integer integer0, H0 h00) {
        this.country = (v & 1) == 0 ? null : s;
        this.regionState = (v & 2) == 0 ? null : s1;
        if((v & 4) == 0) {
            this.dma = null;
            return;
        }
        this.dma = integer0;
    }

    @t("country")
    private static void getCountry$annotations() {
    }

    @t("dma")
    private static void getDma$annotations() {
    }

    @t("region_state")
    private static void getRegionState$annotations() {
    }

    @l
    public final e setCountry(@l String s) {
        L.p(s, "country");
        this.country = s;
        return this;
    }

    @l
    public final e setDma(int v) {
        this.dma = v;
        return this;
    }

    @l
    public final e setRegionState(@l String s) {
        L.p(s, "regionState");
        this.regionState = s;
        return this;
    }

    @n
    public static final void write$Self(@l e e0, @l d d0, @l f f0) {
        L.p(e0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || e0.country != null) {
            d0.y(f0, 0, N0.a, e0.country);
        }
        if(d0.q(f0, 1) || e0.regionState != null) {
            d0.y(f0, 1, N0.a, e0.regionState);
        }
        if(d0.q(f0, 2) || e0.dma != null) {
            d0.y(f0, 2, W.a, e0.dma);
        }
    }
}

