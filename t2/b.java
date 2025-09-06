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
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class b {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a b$a0 = new a();
            a.INSTANCE = b$a0;
            w0 w00 = new w0("com.vungle.ads.fpd.Demographic", b$a0, 4);
            w00.k("age_range", true);
            w00.k("length_of_residence", true);
            w00.k("median_home_value_usd", true);
            w00.k("monthly_housing_payment_usd", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(W.a), P3.a.u(W.a), P3.a.u(W.a), P3.a.u(W.a)};
        }

        @l
        public b deserialize(@l e e0) {
            int v;
            Object object5;
            Object object4;
            Object object2;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.j(f0, 0, W.a, null);
                object2 = c0.j(f0, 1, W.a, null);
                Object object3 = c0.j(f0, 2, W.a, null);
                object4 = c0.j(f0, 3, W.a, null);
                object5 = object3;
                v = 15;
            }
            else {
                Object object6 = null;
                object5 = null;
                Object object7 = null;
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
                            object0 = c0.j(f0, 0, W.a, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object6 = c0.j(f0, 1, W.a, object6);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object5 = c0.j(f0, 2, W.a, object5);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object7 = c0.j(f0, 3, W.a, object7);
                            v1 |= 8;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                v = v1;
                object1 = object0;
                object2 = object6;
                object4 = object7;
            }
            c0.c(f0);
            return new b(v, ((Integer)object1), ((Integer)object2), ((Integer)object5), ((Integer)object4), null);
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

        public void serialize(@l g g0, @l b b0) {
            L.p(g0, "encoder");
            L.p(b0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            b.write$Self(b0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((b)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class T2.b.b {
        private T2.b.b() {
        }

        public T2.b.b(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final T2.b.b Companion;
    @y4.m
    private Integer ageRange;
    @y4.m
    private Integer lengthOfResidence;
    @y4.m
    private Integer medianHomeValueUSD;
    @y4.m
    private Integer monthlyHousingPaymentUSD;

    static {
        b.Companion = new T2.b.b(null);
    }

    public b() {
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public b(int v, @t("age_range") Integer integer0, @t("length_of_residence") Integer integer1, @t("median_home_value_usd") Integer integer2, @t("monthly_housing_payment_usd") Integer integer3, H0 h00) {
        this.ageRange = (v & 1) == 0 ? null : integer0;
        this.lengthOfResidence = (v & 2) == 0 ? null : integer1;
        this.medianHomeValueUSD = (v & 4) == 0 ? null : integer2;
        if((v & 8) == 0) {
            this.monthlyHousingPaymentUSD = null;
            return;
        }
        this.monthlyHousingPaymentUSD = integer3;
    }

    @t("age_range")
    private static void getAgeRange$annotations() {
    }

    @t("length_of_residence")
    private static void getLengthOfResidence$annotations() {
    }

    @t("median_home_value_usd")
    private static void getMedianHomeValueUSD$annotations() {
    }

    @t("monthly_housing_payment_usd")
    private static void getMonthlyHousingPaymentUSD$annotations() {
    }

    @l
    public final b setAgeRange(int v) {
        this.ageRange = T2.a.Companion.fromAge$vungle_ads_release(v).getId();
        return this;
    }

    @l
    public final b setLengthOfResidence(int v) {
        this.lengthOfResidence = T2.d.Companion.fromYears$vungle_ads_release(v).getId();
        return this;
    }

    @l
    public final b setMedianHomeValueUSD(int v) {
        this.medianHomeValueUSD = T2.f.Companion.fromPrice$vungle_ads_release(v).getId();
        return this;
    }

    @l
    public final b setMonthlyHousingCosts(int v) {
        this.monthlyHousingPaymentUSD = T2.g.Companion.fromCost$vungle_ads_release(v).getId();
        return this;
    }

    @n
    public static final void write$Self(@l b b0, @l d d0, @l f f0) {
        L.p(b0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || b0.ageRange != null) {
            d0.y(f0, 0, W.a, b0.ageRange);
        }
        if(d0.q(f0, 1) || b0.lengthOfResidence != null) {
            d0.y(f0, 1, W.a, b0.lengthOfResidence);
        }
        if(d0.q(f0, 2) || b0.medianHomeValueUSD != null) {
            d0.y(f0, 2, W.a, b0.medianHomeValueUSD);
        }
        if(d0.q(f0, 3) || b0.monthlyHousingPaymentUSD != null) {
            d0.y(f0, 3, W.a, b0.monthlyHousingPaymentUSD);
        }
    }
}

