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
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.L;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class i {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a i$a0 = new a();
            a.INSTANCE = i$a0;
            w0 w00 = new w0("com.vungle.ads.fpd.SessionContext", i$a0, 12);
            w00.k("level_percentile", true);
            w00.k("page", true);
            w00.k("time_spent", true);
            w00.k("signup_date", true);
            w00.k("user_score_percentile", true);
            w00.k("user_id", true);
            w00.k("friends", true);
            w00.k("user_level_percentile", true);
            w00.k("health_percentile", true);
            w00.k("session_start_time", true);
            w00.k("session_duration", true);
            w00.k("in_game_purchases_usd", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public kotlinx.serialization.i[] childSerializers() {
            return new kotlinx.serialization.i[]{P3.a.u(L.a), P3.a.u(N0.a), P3.a.u(W.a), P3.a.u(W.a), P3.a.u(L.a), P3.a.u(N0.a), P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(L.a), P3.a.u(L.a), P3.a.u(W.a), P3.a.u(W.a), P3.a.u(L.a)};
        }

        @l
        public i deserialize(@l e e0) {
            Object object24;
            int v;
            Object object14;
            Object object13;
            Object object12;
            Object object11;
            Object object10;
            Object object9;
            Object object8;
            Object object7;
            Object object6;
            Object object4;
            Object object3;
            Object object1;
            kotlin.jvm.internal.L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.j(f0, 0, L.a, null);
                Object object2 = c0.j(f0, 1, N0.a, null);
                object3 = c0.j(f0, 2, W.a, null);
                object4 = c0.j(f0, 3, W.a, null);
                Object object5 = c0.j(f0, 4, L.a, null);
                object6 = c0.j(f0, 5, N0.a, null);
                object7 = c0.j(f0, 6, new kotlinx.serialization.internal.f(N0.a), null);
                object8 = c0.j(f0, 7, L.a, null);
                object9 = c0.j(f0, 8, L.a, null);
                object10 = c0.j(f0, 9, W.a, null);
                object11 = c0.j(f0, 10, W.a, null);
                object12 = c0.j(f0, 11, L.a, null);
                object13 = object2;
                object14 = object5;
                v = 0xFFF;
            }
            else {
                Object object15 = null;
                Object object16 = null;
                Object object17 = null;
                object10 = null;
                Object object18 = null;
                Object object19 = null;
                Object object20 = null;
                Object object21 = null;
                Object object22 = null;
                object14 = null;
                Object object23 = null;
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
                            object0 = c0.j(f0, 0, L.a, object0);
                            continue;
                        }
                        case 1: {
                            object24 = object0;
                            object15 = c0.j(f0, 1, N0.a, object15);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object24 = object0;
                            object16 = c0.j(f0, 2, W.a, object16);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object24 = object0;
                            object23 = c0.j(f0, 3, W.a, object23);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            object24 = object0;
                            object14 = c0.j(f0, 4, L.a, object14);
                            v1 |= 16;
                            break;
                        }
                        case 5: {
                            object24 = object0;
                            object22 = c0.j(f0, 5, N0.a, object22);
                            v1 |= 0x20;
                            break;
                        }
                        case 6: {
                            object24 = object0;
                            object19 = c0.j(f0, 6, new kotlinx.serialization.internal.f(N0.a), object19);
                            v1 |= 0x40;
                            break;
                        }
                        case 7: {
                            object24 = object0;
                            object21 = c0.j(f0, 7, L.a, object21);
                            v1 |= 0x80;
                            break;
                        }
                        case 8: {
                            object24 = object0;
                            object18 = c0.j(f0, 8, L.a, object18);
                            v1 |= 0x100;
                            break;
                        }
                        case 9: {
                            object24 = object0;
                            object10 = c0.j(f0, 9, W.a, object10);
                            v1 |= 0x200;
                            break;
                        }
                        case 10: {
                            object24 = object0;
                            object17 = c0.j(f0, 10, W.a, object17);
                            v1 |= 0x400;
                            break;
                        }
                        case 11: {
                            object24 = object0;
                            object20 = c0.j(f0, 11, L.a, object20);
                            v1 |= 0x800;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                    object0 = object24;
                }
                object13 = object15;
                object12 = object20;
                v = v1;
                object7 = object19;
                object4 = object23;
                object1 = object0;
                object11 = object17;
                object9 = object18;
                object6 = object22;
                object3 = object16;
                object8 = object21;
            }
            c0.c(f0);
            return new i(v, ((Float)object1), ((String)object13), ((Integer)object3), ((Integer)object4), ((Float)object14), ((String)object6), ((List)object7), ((Float)object8), ((Float)object9), ((Integer)object10), ((Integer)object11), ((Float)object12), null);
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

        public void serialize(@l g g0, @l i i0) {
            kotlin.jvm.internal.L.p(g0, "encoder");
            kotlin.jvm.internal.L.p(i0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            i.write$Self(i0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((i)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public kotlinx.serialization.i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        public final kotlinx.serialization.i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final b Companion;
    @y4.m
    private List friends;
    @y4.m
    private Float healthPercentile;
    @y4.m
    private Float inGamePurchasesUSD;
    @y4.m
    private Float levelPercentile;
    @y4.m
    private String page;
    @y4.m
    private Integer sessionDuration;
    @y4.m
    private Integer sessionStartTime;
    @y4.m
    private Integer signupDate;
    @y4.m
    private Integer timeSpent;
    @y4.m
    private String userID;
    @y4.m
    private Float userLevelPercentile;
    @y4.m
    private Float userScorePercentile;

    static {
        i.Companion = new b(null);
    }

    public i() {
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public i(int v, @t("level_percentile") Float float0, @t("page") String s, @t("time_spent") Integer integer0, @t("signup_date") Integer integer1, @t("user_score_percentile") Float float1, @t("user_id") String s1, @t("friends") List list0, @t("user_level_percentile") Float float2, @t("health_percentile") Float float3, @t("session_start_time") Integer integer2, @t("session_duration") Integer integer3, @t("in_game_purchases_usd") Float float4, H0 h00) {
        this.levelPercentile = (v & 1) == 0 ? null : float0;
        this.page = (v & 2) == 0 ? null : s;
        this.timeSpent = (v & 4) == 0 ? null : integer0;
        this.signupDate = (v & 8) == 0 ? null : integer1;
        this.userScorePercentile = (v & 16) == 0 ? null : float1;
        this.userID = (v & 0x20) == 0 ? null : s1;
        this.friends = (v & 0x40) == 0 ? null : list0;
        this.userLevelPercentile = (v & 0x80) == 0 ? null : float2;
        this.healthPercentile = (v & 0x100) == 0 ? null : float3;
        this.sessionStartTime = (v & 0x200) == 0 ? null : integer2;
        this.sessionDuration = (v & 0x400) == 0 ? null : integer3;
        if((v & 0x800) == 0) {
            this.inGamePurchasesUSD = null;
            return;
        }
        this.inGamePurchasesUSD = float4;
    }

    @t("friends")
    private static void getFriends$annotations() {
    }

    @t("health_percentile")
    private static void getHealthPercentile$annotations() {
    }

    @t("in_game_purchases_usd")
    private static void getInGamePurchasesUSD$annotations() {
    }

    @t("level_percentile")
    private static void getLevelPercentile$annotations() {
    }

    @t("page")
    private static void getPage$annotations() {
    }

    @t("session_duration")
    private static void getSessionDuration$annotations() {
    }

    @t("session_start_time")
    private static void getSessionStartTime$annotations() {
    }

    @t("signup_date")
    private static void getSignupDate$annotations() {
    }

    @t("time_spent")
    private static void getTimeSpent$annotations() {
    }

    @t("user_id")
    private static void getUserID$annotations() {
    }

    @t("user_level_percentile")
    private static void getUserLevelPercentile$annotations() {
    }

    @t("user_score_percentile")
    private static void getUserScorePercentile$annotations() {
    }

    @l
    public final i setFriends(@y4.m List list0) {
        this.friends = list0 == null ? null : kotlin.collections.u.Y5(list0);
        return this;
    }

    @l
    public final i setHealthPercentile(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.healthPercentile = f;
        }
        return this;
    }

    @l
    public final i setInGamePurchasesUSD(float f) {
        if(r.isInRange$default(r.INSTANCE, f, 0.0f, 0.0f, 4, null)) {
            this.inGamePurchasesUSD = f;
        }
        return this;
    }

    @l
    public final i setLevelPercentile(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.levelPercentile = f;
        }
        return this;
    }

    @l
    public final i setPage(@l String s) {
        kotlin.jvm.internal.L.p(s, "page");
        this.page = s;
        return this;
    }

    @l
    public final i setSessionDuration(int v) {
        this.sessionDuration = v;
        return this;
    }

    @l
    public final i setSessionStartTime(int v) {
        this.sessionStartTime = v;
        return this;
    }

    @l
    public final i setSignupDate(int v) {
        this.signupDate = v;
        return this;
    }

    @l
    public final i setTimeSpent(int v) {
        this.timeSpent = v;
        return this;
    }

    @l
    public final i setUserID(@l String s) {
        kotlin.jvm.internal.L.p(s, "userID");
        this.userID = s;
        return this;
    }

    @l
    public final i setUserLevelPercentile(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.userLevelPercentile = f;
        }
        return this;
    }

    @l
    public final i setUserScorePercentile(float f) {
        if(r.INSTANCE.isInRange(f, 0.0f, 100.0f)) {
            this.userScorePercentile = f;
        }
        return this;
    }

    @n
    public static final void write$Self(@l i i0, @l d d0, @l f f0) {
        kotlin.jvm.internal.L.p(i0, "self");
        kotlin.jvm.internal.L.p(d0, "output");
        kotlin.jvm.internal.L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || i0.levelPercentile != null) {
            d0.y(f0, 0, L.a, i0.levelPercentile);
        }
        if(d0.q(f0, 1) || i0.page != null) {
            d0.y(f0, 1, N0.a, i0.page);
        }
        if(d0.q(f0, 2) || i0.timeSpent != null) {
            d0.y(f0, 2, W.a, i0.timeSpent);
        }
        if(d0.q(f0, 3) || i0.signupDate != null) {
            d0.y(f0, 3, W.a, i0.signupDate);
        }
        if(d0.q(f0, 4) || i0.userScorePercentile != null) {
            d0.y(f0, 4, L.a, i0.userScorePercentile);
        }
        if(d0.q(f0, 5) || i0.userID != null) {
            d0.y(f0, 5, N0.a, i0.userID);
        }
        if(d0.q(f0, 6) || i0.friends != null) {
            d0.y(f0, 6, new kotlinx.serialization.internal.f(N0.a), i0.friends);
        }
        if(d0.q(f0, 7) || i0.userLevelPercentile != null) {
            d0.y(f0, 7, L.a, i0.userLevelPercentile);
        }
        if(d0.q(f0, 8) || i0.healthPercentile != null) {
            d0.y(f0, 8, L.a, i0.healthPercentile);
        }
        if(d0.q(f0, 9) || i0.sessionStartTime != null) {
            d0.y(f0, 9, W.a, i0.sessionStartTime);
        }
        if(d0.q(f0, 10) || i0.sessionDuration != null) {
            d0.y(f0, 10, W.a, i0.sessionDuration);
        }
        if(d0.q(f0, 11) || i0.inGamePurchasesUSD != null) {
            d0.y(f0, 11, L.a, i0.inGamePurchasesUSD);
        }
    }
}

