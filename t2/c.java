package T2;

import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class c {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a c$a0 = new a();
            a.INSTANCE = c$a0;
            w0 w00 = new w0("com.vungle.ads.fpd.FirstPartyData", c$a0, 5);
            w00.k("session_context", true);
            w00.k("demographic", true);
            w00.k("location", true);
            w00.k("revenue", true);
            w00.k("custom_data", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(T2.i.a.INSTANCE), P3.a.u(T2.b.a.INSTANCE), P3.a.u(T2.e.a.INSTANCE), P3.a.u(T2.h.a.INSTANCE), P3.a.u(new b0(N0.a, N0.a))};
        }

        @l
        public c deserialize(@l e e0) {
            int v;
            Object object5;
            Object object4;
            Object object3;
            Object object2;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.j(f0, 0, T2.i.a.INSTANCE, null);
                object2 = c0.j(f0, 1, T2.b.a.INSTANCE, null);
                object3 = c0.j(f0, 2, T2.e.a.INSTANCE, null);
                object4 = c0.j(f0, 3, T2.h.a.INSTANCE, null);
                object5 = c0.j(f0, 4, new b0(N0.a, N0.a), null);
                v = 0x1F;
            }
            else {
                Object object6 = null;
                Object object7 = null;
                Object object8 = null;
                Object object9 = null;
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
                            object0 = c0.j(f0, 0, T2.i.a.INSTANCE, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object6 = c0.j(f0, 1, T2.b.a.INSTANCE, object6);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object7 = c0.j(f0, 2, T2.e.a.INSTANCE, object7);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object8 = c0.j(f0, 3, T2.h.a.INSTANCE, object8);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            object9 = c0.j(f0, 4, new b0(N0.a, N0.a), object9);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                object2 = object6;
                object3 = object7;
                object4 = object8;
                object5 = object9;
                v = v1;
                object1 = object0;
            }
            c0.c(f0);
            return new c(v, ((T2.i)object1), ((b)object2), ((T2.e)object3), ((h)object4), ((Map)object5), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l c c0) {
            L.p(g0, "encoder");
            L.p(c0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            c.write$Self(c0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((c)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class T2.c.b {
        private T2.c.b() {
        }

        public T2.c.b(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final T2.c.b Companion;
    @y4.m
    private Map _customData;
    @y4.m
    private volatile b _demographic;
    @y4.m
    private volatile T2.e _location;
    @y4.m
    private volatile h _revenue;
    @y4.m
    private volatile T2.i _sessionContext;

    static {
        c.Companion = new T2.c.b(null);
    }

    public c() {
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public c(int v, @t("session_context") T2.i i0, @t("demographic") b b0, @t("location") T2.e e0, @t("revenue") h h0, @t("custom_data") Map map0, H0 h00) {
        this._sessionContext = (v & 1) == 0 ? null : i0;
        this._demographic = (v & 2) == 0 ? null : b0;
        this._location = (v & 4) == 0 ? null : e0;
        this._revenue = (v & 8) == 0 ? null : h0;
        if((v & 16) == 0) {
            this._customData = null;
            return;
        }
        this._customData = map0;
    }

    public final void clearAll() {
        synchronized(this) {
            this._sessionContext = null;
            this._demographic = null;
            this._location = null;
            this._revenue = null;
            Map map0 = this._customData;
            if(map0 != null) {
                map0.clear();
            }
            this._customData = null;
        }
    }

    @l
    public final Map getCustomData() {
        synchronized(this) {
            Map map0 = this._customData;
            if(map0 == null) {
                map0 = new ConcurrentHashMap();
                this._customData = map0;
            }
            return map0;
        }
    }

    @l
    public final b getDemographic() {
        synchronized(this) {
            b b0 = this._demographic;
            if(b0 == null) {
                b0 = new b();
                this._demographic = b0;
            }
            return b0;
        }
    }

    @l
    public final T2.e getLocation() {
        synchronized(this) {
            T2.e e0 = this._location;
            if(e0 == null) {
                e0 = new T2.e();
                this._location = e0;
            }
            return e0;
        }
    }

    @l
    public final h getRevenue() {
        synchronized(this) {
            h h0 = this._revenue;
            if(h0 == null) {
                h0 = new h();
                this._revenue = h0;
            }
            return h0;
        }
    }

    @l
    public final T2.i getSessionContext() {
        synchronized(this) {
            T2.i i0 = this._sessionContext;
            if(i0 == null) {
                i0 = new T2.i();
                this._sessionContext = i0;
            }
            return i0;
        }
    }

    @t("custom_data")
    private static void get_customData$annotations() {
    }

    @t("demographic")
    private static void get_demographic$annotations() {
    }

    @t("location")
    private static void get_location$annotations() {
    }

    @t("revenue")
    private static void get_revenue$annotations() {
    }

    @t("session_context")
    private static void get_sessionContext$annotations() {
    }

    @n
    public static final void write$Self(@l c c0, @l d d0, @l f f0) {
        L.p(c0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || c0._sessionContext != null) {
            d0.y(f0, 0, T2.i.a.INSTANCE, c0._sessionContext);
        }
        if(d0.q(f0, 1) || c0._demographic != null) {
            d0.y(f0, 1, T2.b.a.INSTANCE, c0._demographic);
        }
        if(d0.q(f0, 2) || c0._location != null) {
            d0.y(f0, 2, T2.e.a.INSTANCE, c0._location);
        }
        if(d0.q(f0, 3) || c0._revenue != null) {
            d0.y(f0, 3, T2.h.a.INSTANCE, c0._revenue);
        }
        if(d0.q(f0, 4) || c0._customData != null) {
            d0.y(f0, 4, new b0(N0.a, N0.a), c0._customData);
        }
    }
}

