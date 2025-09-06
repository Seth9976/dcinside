package T2;

import com.vungle.ads.internal.util.r;
import java.util.List;
import kotlin.c0;
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
import kotlinx.serialization.internal.L;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class h {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a h$a0 = new a();
            a.INSTANCE = h$a0;
            w0 w00 = new w0("com.vungle.ads.fpd.Revenue", h$a0, 17);
            w00.k("total_earnings_usd", true);
            w00.k("earnings_by_placement_usd", true);
            w00.k("top_n_adomain", true);
            w00.k("is_user_a_purchaser", true);
            w00.k("is_user_a_subscriber", true);
            w00.k("last_7_days_total_spend_usd", true);
            w00.k("last_7_days_median_spend_usd", true);
            w00.k("last_7_days_mean_spend_usd", true);
            w00.k("last_30_days_total_spend_usd", true);
            w00.k("last_30_days_median_spend_usd", true);
            w00.k("last_30_days_mean_spend_usd", true);
            w00.k("last_7_days_user_pltv_usd", true);
            w00.k("last_7_days_user_ltv_usd", true);
            w00.k("last_30_days_user_pltv_usd", true);
            w00.k("last_30_days_user_ltv_usd", true);
            w00.k("last_7_days_placement_fill_rate", true);
            w00.k("last_30_days_placement_fill_rate", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(L.a), P3.a.u(L.a), P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(L.a)};
        }

        @l
        public h deserialize(@l e e0) {
            Object object38;
            Object object20;
            Object object19;
            int v;
            Object object18;
            Object object17;
            Object object16;
            Object object14;
            Object object13;
            Object object12;
            Object object11;
            Object object10;
            Object object9;
            Object object8;
            Object object7;
            Object object6;
            Object object5;
            Object object4;
            Object object3;
            kotlin.jvm.internal.L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                Object object0 = c0.j(f0, 0, L.a, null);
                Object object1 = c0.j(f0, 1, L.a, null);
                Object object2 = c0.j(f0, 2, new kotlinx.serialization.internal.f(N0.a), null);
                object3 = c0.j(f0, 3, kotlinx.serialization.internal.i.a, null);
                object4 = c0.j(f0, 4, kotlinx.serialization.internal.i.a, null);
                object5 = c0.j(f0, 5, L.a, null);
                object6 = c0.j(f0, 6, L.a, null);
                object7 = c0.j(f0, 7, L.a, null);
                object8 = c0.j(f0, 8, L.a, null);
                object9 = c0.j(f0, 9, L.a, null);
                object10 = c0.j(f0, 10, L.a, null);
                object11 = c0.j(f0, 11, L.a, null);
                object12 = c0.j(f0, 12, L.a, null);
                object13 = c0.j(f0, 13, L.a, null);
                object14 = c0.j(f0, 14, L.a, null);
                Object object15 = c0.j(f0, 15, L.a, null);
                object16 = c0.j(f0, 16, L.a, null);
                object17 = object1;
                object18 = object0;
                v = 0x1FFFF;
                object19 = object15;
                object20 = object2;
            }
            else {
                Object object21 = null;
                Object object22 = null;
                Object object23 = null;
                Object object24 = null;
                Object object25 = null;
                Object object26 = null;
                Object object27 = null;
                Object object28 = null;
                Object object29 = null;
                Object object30 = null;
                Object object31 = null;
                Object object32 = null;
                Object object33 = null;
                Object object34 = null;
                Object object35 = null;
                Object object36 = null;
                Object object37 = null;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            continue;
                        }
                        case 0: {
                            v1 |= 1;
                            object37 = c0.j(f0, 0, L.a, object37);
                            continue;
                        }
                        case 1: {
                            v1 |= 2;
                            object25 = c0.j(f0, 1, L.a, object25);
                            continue;
                        }
                        case 2: {
                            object38 = object25;
                            object21 = c0.j(f0, 2, new kotlinx.serialization.internal.f(N0.a), object21);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object38 = object25;
                            object23 = c0.j(f0, 3, kotlinx.serialization.internal.i.a, object23);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            object38 = object25;
                            object22 = c0.j(f0, 4, kotlinx.serialization.internal.i.a, object22);
                            v1 |= 16;
                            break;
                        }
                        case 5: {
                            object38 = object25;
                            object30 = c0.j(f0, 5, L.a, object30);
                            v1 |= 0x20;
                            break;
                        }
                        case 6: {
                            object38 = object25;
                            object31 = c0.j(f0, 6, L.a, object31);
                            v1 |= 0x40;
                            break;
                        }
                        case 7: {
                            object38 = object25;
                            object29 = c0.j(f0, 7, L.a, object29);
                            v1 |= 0x80;
                            break;
                        }
                        case 8: {
                            object38 = object25;
                            object28 = c0.j(f0, 8, L.a, object28);
                            v1 |= 0x100;
                            break;
                        }
                        case 9: {
                            object38 = object25;
                            object27 = c0.j(f0, 9, L.a, object27);
                            v1 |= 0x200;
                            break;
                        }
                        case 10: {
                            object38 = object25;
                            object32 = c0.j(f0, 10, L.a, object32);
                            v1 |= 0x400;
                            break;
                        }
                        case 11: {
                            object38 = object25;
                            object26 = c0.j(f0, 11, L.a, object26);
                            v1 |= 0x800;
                            break;
                        }
                        case 12: {
                            object38 = object25;
                            object33 = c0.j(f0, 12, L.a, object33);
                            v1 |= 0x1000;
                            break;
                        }
                        case 13: {
                            object38 = object25;
                            object34 = c0.j(f0, 13, L.a, object34);
                            v1 |= 0x2000;
                            break;
                        }
                        case 14: {
                            object38 = object25;
                            object35 = c0.j(f0, 14, L.a, object35);
                            v1 |= 0x4000;
                            break;
                        }
                        case 15: {
                            object38 = object25;
                            object36 = c0.j(f0, 15, L.a, object36);
                            v1 |= 0x8000;
                            break;
                        }
                        case 16: {
                            object38 = object25;
                            object24 = c0.j(f0, 16, L.a, object24);
                            v1 |= 0x10000;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                    object25 = object38;
                }
                object17 = object25;
                object18 = object37;
                object3 = object23;
                v = v1;
                object16 = object24;
                object19 = object36;
                object14 = object35;
                object13 = object34;
                object12 = object33;
                object4 = object22;
                object20 = object21;
                object11 = object26;
                object9 = object27;
                object7 = object29;
                object5 = object30;
                object8 = object28;
                object6 = object31;
                object10 = object32;
            }
            c0.c(f0);
            return new h(v, ((Float)object18), ((Float)object17), ((List)object20), ((Boolean)object3), ((Boolean)object4), ((Float)object5), ((Float)object6), ((Float)object7), ((Float)object8), ((Float)object9), ((Float)object10), ((Float)object11), ((Float)object12), ((Float)object13), ((Float)object14), ((Float)object19), ((Float)object16), null);
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

        public void serialize(@l g g0, @l h h0) {
            kotlin.jvm.internal.L.p(g0, "encoder");
            kotlin.jvm.internal.L.p(h0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            h.write$Self(h0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((h)object0));
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
    private Float earningsByPlacementUSD;
    @y4.m
    private Boolean isUserAPurchaser;
    @y4.m
    private Boolean isUserASubscriber;
    @y4.m
    private Float last30DaysMeanSpendUSD;
    @y4.m
    private Float last30DaysMedianSpendUSD;
    @y4.m
    private Float last30DaysPlacementFillRate;
    @y4.m
    private Float last30DaysTotalSpendUSD;
    @y4.m
    private Float last30DaysUserLtvUSD;
    @y4.m
    private Float last30DaysUserPltvUSD;
    @y4.m
    private Float last7DaysMeanSpendUSD;
    @y4.m
    private Float last7DaysMedianSpendUSD;
    @y4.m
    private Float last7DaysPlacementFillRate;
    @y4.m
    private Float last7DaysTotalSpendUSD;
    @y4.m
    private Float last7DaysUserLtvUSD;
    @y4.m
    private Float last7DaysUserPltvUSD;
    @y4.m
    private List topNAdomain;
    @y4.m
    private Float totalEarningsUSD;

    static {
        h.Companion = new b(null);
    }

    public h() {
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public h(int v, @t("total_earnings_usd") Float float0, @t("earnings_by_placement_usd") Float float1, @t("top_n_adomain") List list0, @t("is_user_a_purchaser") Boolean boolean0, @t("is_user_a_subscriber") Boolean boolean1, @t("last_7_days_total_spend_usd") Float float2, @t("last_7_days_median_spend_usd") Float float3, @t("last_7_days_mean_spend_usd") Float float4, @t("last_30_days_total_spend_usd") Float float5, @t("last_30_days_median_spend_usd") Float float6, @t("last_30_days_mean_spend_usd") Float float7, @t("last_7_days_user_pltv_usd") Float float8, @t("last_7_days_user_ltv_usd") Float float9, @t("last_30_days_user_pltv_usd") Float float10, @t("last_30_days_user_ltv_usd") Float float11, @t("last_7_days_placement_fill_rate") Float float12, @t("last_30_days_placement_fill_rate") Float float13, H0 h00) {
        this.totalEarningsUSD = (v & 1) == 0 ? null : float0;
        this.earningsByPlacementUSD = (v & 2) == 0 ? null : float1;
        this.topNAdomain = (v & 4) == 0 ? null : list0;
        this.isUserAPurchaser = (v & 8) == 0 ? null : boolean0;
        this.isUserASubscriber = (v & 16) == 0 ? null : boolean1;
        this.last7DaysTotalSpendUSD = (v & 0x20) == 0 ? null : float2;
        this.last7DaysMedianSpendUSD = (v & 0x40) == 0 ? null : float3;
        this.last7DaysMeanSpendUSD = (v & 0x80) == 0 ? null : float4;
        this.last30DaysTotalSpendUSD = (v & 0x100) == 0 ? null : float5;
        this.last30DaysMedianSpendUSD = (v & 0x200) == 0 ? null : float6;
        this.last30DaysMeanSpendUSD = (v & 0x400) == 0 ? null : float7;
        this.last7DaysUserPltvUSD = (v & 0x800) == 0 ? null : float8;
        this.last7DaysUserLtvUSD = (v & 0x1000) == 0 ? null : float9;
        this.last30DaysUserPltvUSD = (v & 0x2000) == 0 ? null : float10;
        this.last30DaysUserLtvUSD = (v & 0x4000) == 0 ? null : float11;
        this.last7DaysPlacementFillRate = (0x8000 & v) == 0 ? null : float12;
        if((v & 0x10000) == 0) {
            this.last30DaysPlacementFillRate = null;
            return;
        }
        this.last30DaysPlacementFillRate = float13;
    }

    @t("earnings_by_placement_usd")
    private static void getEarningsByPlacementUSD$annotations() {
    }

    @t("last_30_days_mean_spend_usd")
    private static void getLast30DaysMeanSpendUSD$annotations() {
    }

    @t("last_30_days_median_spend_usd")
    private static void getLast30DaysMedianSpendUSD$annotations() {
    }

    @t("last_30_days_placement_fill_rate")
    private static void getLast30DaysPlacementFillRate$annotations() {
    }

    @t("last_30_days_total_spend_usd")
    private static void getLast30DaysTotalSpendUSD$annotations() {
    }

    @t("last_30_days_user_ltv_usd")
    private static void getLast30DaysUserLtvUSD$annotations() {
    }

    @t("last_30_days_user_pltv_usd")
    private static void getLast30DaysUserPltvUSD$annotations() {
    }

    @t("last_7_days_mean_spend_usd")
    private static void getLast7DaysMeanSpendUSD$annotations() {
    }

    @t("last_7_days_median_spend_usd")
    private static void getLast7DaysMedianSpendUSD$annotations() {
    }

    @t("last_7_days_placement_fill_rate")
    private static void getLast7DaysPlacementFillRate$annotations() {
    }

    @t("last_7_days_total_spend_usd")
    private static void getLast7DaysTotalSpendUSD$annotations() {
    }

    @t("last_7_days_user_ltv_usd")
    private static void getLast7DaysUserLtvUSD$annotations() {
    }

    @t("last_7_days_user_pltv_usd")
    private static void getLast7DaysUserPltvUSD$annotations() {
    }

    @t("top_n_adomain")
    private static void getTopNAdomain$annotations() {
    }

    @t("total_earnings_usd")
    private static void getTotalEarningsUSD$annotations() {
    }

    @t("is_user_a_purchaser")
    private static void isUserAPurchaser$annotations() {
    }

    @t("is_user_a_subscriber")
    private static void isUserASubscriber$annotations() {
    }

    @l
    public final h setEarningsByPlacement(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.earningsByPlacementUSD = f;
        }
        return this;
    }

    @l
    public final h setIsUserAPurchaser(boolean z) {
        this.isUserAPurchaser = Boolean.valueOf(z);
        return this;
    }

    @l
    public final h setIsUserASubscriber(boolean z) {
        this.isUserASubscriber = Boolean.valueOf(z);
        return this;
    }

    @l
    public final h setLast30DaysMeanSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last30DaysMeanSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast30DaysMedianSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last30DaysMedianSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast30DaysPlacementFillRate(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.last30DaysPlacementFillRate = f;
        }
        return this;
    }

    @l
    public final h setLast30DaysTotalSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last30DaysTotalSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast30DaysUserLtvUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last30DaysUserLtvUSD = f;
        }
        return this;
    }

    @l
    public final h setLast30DaysUserPltvUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last30DaysUserPltvUSD = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysMeanSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last7DaysMeanSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysMedianSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last7DaysMedianSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysPlacementFillRate(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.last7DaysPlacementFillRate = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysTotalSpendUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last7DaysTotalSpendUSD = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysUserLtvUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last7DaysUserLtvUSD = f;
        }
        return this;
    }

    @l
    public final h setLast7DaysUserPltvUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.last7DaysUserPltvUSD = f;
        }
        return this;
    }

    @l
    public final h setTopNAdomain(@y4.m List list0) {
        this.topNAdomain = list0 == null ? null : kotlin.collections.u.Y5(list0);
        return this;
    }

    @l
    public final h setTotalEarningsUsd(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.totalEarningsUSD = f;
        }
        return this;
    }

    @n
    public static final void write$Self(@l h h0, @l d d0, @l f f0) {
        kotlin.jvm.internal.L.p(h0, "self");
        kotlin.jvm.internal.L.p(d0, "output");
        kotlin.jvm.internal.L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || h0.totalEarningsUSD != null) {
            d0.y(f0, 0, L.a, h0.totalEarningsUSD);
        }
        if(d0.q(f0, 1) || h0.earningsByPlacementUSD != null) {
            d0.y(f0, 1, L.a, h0.earningsByPlacementUSD);
        }
        if(d0.q(f0, 2) || h0.topNAdomain != null) {
            d0.y(f0, 2, new kotlinx.serialization.internal.f(N0.a), h0.topNAdomain);
        }
        if(d0.q(f0, 3) || h0.isUserAPurchaser != null) {
            d0.y(f0, 3, kotlinx.serialization.internal.i.a, h0.isUserAPurchaser);
        }
        if(d0.q(f0, 4) || h0.isUserASubscriber != null) {
            d0.y(f0, 4, kotlinx.serialization.internal.i.a, h0.isUserASubscriber);
        }
        if(d0.q(f0, 5) || h0.last7DaysTotalSpendUSD != null) {
            d0.y(f0, 5, L.a, h0.last7DaysTotalSpendUSD);
        }
        if(d0.q(f0, 6) || h0.last7DaysMedianSpendUSD != null) {
            d0.y(f0, 6, L.a, h0.last7DaysMedianSpendUSD);
        }
        if(d0.q(f0, 7) || h0.last7DaysMeanSpendUSD != null) {
            d0.y(f0, 7, L.a, h0.last7DaysMeanSpendUSD);
        }
        if(d0.q(f0, 8) || h0.last30DaysTotalSpendUSD != null) {
            d0.y(f0, 8, L.a, h0.last30DaysTotalSpendUSD);
        }
        if(d0.q(f0, 9) || h0.last30DaysMedianSpendUSD != null) {
            d0.y(f0, 9, L.a, h0.last30DaysMedianSpendUSD);
        }
        if(d0.q(f0, 10) || h0.last30DaysMeanSpendUSD != null) {
            d0.y(f0, 10, L.a, h0.last30DaysMeanSpendUSD);
        }
        if(d0.q(f0, 11) || h0.last7DaysUserPltvUSD != null) {
            d0.y(f0, 11, L.a, h0.last7DaysUserPltvUSD);
        }
        if(d0.q(f0, 12) || h0.last7DaysUserLtvUSD != null) {
            d0.y(f0, 12, L.a, h0.last7DaysUserLtvUSD);
        }
        if(d0.q(f0, 13) || h0.last30DaysUserPltvUSD != null) {
            d0.y(f0, 13, L.a, h0.last30DaysUserPltvUSD);
        }
        if(d0.q(f0, 14) || h0.last30DaysUserLtvUSD != null) {
            d0.y(f0, 14, L.a, h0.last30DaysUserLtvUSD);
        }
        if(d0.q(f0, 15) || h0.last7DaysPlacementFillRate != null) {
            d0.y(f0, 15, L.a, h0.last7DaysPlacementFillRate);
        }
        if(d0.q(f0, 16) || h0.last30DaysPlacementFillRate != null) {
            d0.y(f0, 16, L.a, h0.last30DaysPlacementFillRate);
        }
    }
}

