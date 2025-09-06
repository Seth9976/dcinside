package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.Z0;
import com.vungle.ads.internal.model.k;
import com.vungle.ads.internal.signals.c;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.J;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.reflect.s;
import kotlin.reflect.u;
import kotlin.text.r;
import kotlinx.serialization.i;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.z;
import y4.l;
import y4.m;

public final class j {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[d.values().length];
            arr_v[d.GET.ordinal()] = 1;
            arr_v[d.POST.ordinal()] = 2;
            b.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String FAILED_GENERIC_TPATS = "FAILED_GENERIC_TPATS";
    @l
    private static final String FAILED_TPATS = "FAILED_TPATS";
    private static final int MAX_RETRIES = 5;
    @l
    private static final String TAG = "TpatSender";
    @l
    private final com.vungle.ads.internal.persistence.b genericTpatFilePreferences;
    @m
    private final o logEntry;
    @m
    private final c signalManager;
    @l
    private final com.vungle.ads.internal.persistence.b tpatFilePreferences;
    @l
    private final com.vungle.ads.internal.network.l vungleApiClient;

    static {
        j.Companion = new a(null);
    }

    public j(@l com.vungle.ads.internal.network.l l0, @m o o0, @l Executor executor0, @l q q0, @m c c0) {
        L.p(l0, "vungleApiClient");
        L.p(executor0, "ioExecutor");
        L.p(q0, "pathProvider");
        super();
        this.vungleApiClient = l0;
        this.logEntry = o0;
        this.signalManager = c0;
        this.tpatFilePreferences = com.vungle.ads.internal.persistence.b.Companion.get(executor0, q0, "failedTpats");
        this.genericTpatFilePreferences = com.vungle.ads.internal.persistence.b.Companion.get(executor0, q0, "failedGenericTpats");
    }

    public j(com.vungle.ads.internal.network.l l0, o o0, Executor executor0, q q0, c c0, int v, w w0) {
        this(l0, ((v & 2) == 0 ? o0 : null), executor0, q0, ((v & 16) == 0 ? c0 : null));
    }

    @m
    public final o getLogEntry() {
        return this.logEntry;
    }

    @m
    public final c getSignalManager() {
        return this.signalManager;
    }

    private final Map getStoredGenericTpats() {
        Object object0;
        String s = this.genericTpatFilePreferences.getString("FAILED_GENERIC_TPATS");
        if(s != null) {
            try {
                f f0 = kotlinx.serialization.json.b.d.a();
                s s1 = m0.A(String.class);
                u u0 = u.c.e(s1);
                s s2 = m0.A(com.vungle.ads.internal.network.c.class);
                u u1 = u.c.e(s2);
                i i0 = z.k(f0, m0.i(m0.C(Map.class, u0, u1)));
                L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                object0 = e0.b(((Map)kotlinx.serialization.json.b.d.d(i0, s)));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            Throwable throwable1 = e0.e(object0);
            if(throwable1 != null) {
                p.Companion.e("TpatSender", "Failed to decode stored generic tpats: " + throwable1);
            }
            if(e0.i(object0)) {
                object0 = null;
            }
            return ((Map)object0) == null ? new LinkedHashMap() : ((Map)object0);
        }
        return new LinkedHashMap();
    }

    private final Map getStoredTpats() {
        Object object0;
        String s = this.tpatFilePreferences.getString("FAILED_TPATS");
        if(s != null) {
            try {
                f f0 = kotlinx.serialization.json.b.d.a();
                s s1 = m0.A(String.class);
                u u0 = u.c.e(s1);
                s s2 = m0.A(Integer.TYPE);
                u u1 = u.c.e(s2);
                i i0 = z.k(f0, m0.i(m0.C(Map.class, u0, u1)));
                L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                object0 = e0.b(((Map)kotlinx.serialization.json.b.d.d(i0, s)));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            Throwable throwable1 = e0.e(object0);
            if(throwable1 != null) {
                p.Companion.e("TpatSender", "Failed to decode stored tpats: " + throwable1);
            }
            if(e0.i(object0)) {
                object0 = null;
            }
            return ((Map)object0) == null ? new LinkedHashMap() : ((Map)object0);
        }
        return new LinkedHashMap();
    }

    @l
    public final com.vungle.ads.internal.network.l getVungleApiClient() {
        return this.vungleApiClient;
    }

    @VisibleForTesting
    @l
    public final String injectSessionIdToUrl(@l String s) {
        String s1;
        L.p(s, "url");
        c c0 = this.signalManager;
        if(c0 == null) {
            s1 = "";
        }
        else {
            s1 = c0.getUuid();
            if(s1 == null) {
                s1 = "";
            }
        }
        if(s1.length() > 0) {
            L.o("\\Q{{{session_id}}}\\E", "quote(Constants.SESSION_ID)");
            return new r("\\Q{{{session_id}}}\\E").m(s, s1);
        }
        return s;
    }

    private final void logTpatError(k k0, String s) {
        p.Companion.e("TpatSender", "Failed with " + k0.getDescription() + ", url:" + s);
        new Z0(k0.getReason(), "Fail to send " + s + ", error: " + k0.getDescription()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
    }

    public final void resendStoredTpats$vungle_ads_release(@l Executor executor0) {
        L.p(executor0, "executor");
        for(Object object0: this.getStoredTpats().entrySet()) {
            this.sendTpat(((String)((Map.Entry)object0).getKey()), executor0);
        }
        for(Object object1: this.getStoredGenericTpats().entrySet()) {
            String s = (String)((Map.Entry)object1).getKey();
            com.vungle.ads.internal.network.c c0 = (com.vungle.ads.internal.network.c)((Map.Entry)object1).getValue();
            this.sendGenericTpat(s, new com.vungle.ads.internal.network.c(c0.getMethod(), c0.getHeaders(), c0.getBody(), 0, 8, null), true, executor0);
        }
    }

    private final void saveStoredGenericTpats(Map map0) {
        S0 s00;
        try {
            f f0 = kotlinx.serialization.json.b.d.a();
            s s0 = m0.A(String.class);
            u u0 = u.c.e(s0);
            s s1 = m0.A(com.vungle.ads.internal.network.c.class);
            u u1 = u.c.e(s1);
            i i0 = z.k(f0, m0.i(m0.C(Map.class, u0, u1)));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s2 = kotlinx.serialization.json.b.d.c(i0, map0);
            this.genericTpatFilePreferences.put("FAILED_GENERIC_TPATS", s2).apply();
            s00 = S0.a;
        }
        catch(Throwable throwable0) {
            s00 = e0.b(f0.a(throwable0));
        }
        if(e0.e(s00) != null) {
            p.Companion.e("TpatSender", "Failed to encode the about to storing generic tpats: " + map0);
        }
    }

    private final void saveStoredTpats(Map map0) {
        S0 s00;
        try {
            f f0 = kotlinx.serialization.json.b.d.a();
            s s0 = m0.A(String.class);
            u u0 = u.c.e(s0);
            s s1 = m0.A(Integer.TYPE);
            u u1 = u.c.e(s1);
            i i0 = z.k(f0, m0.i(m0.C(Map.class, u0, u1)));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String s2 = kotlinx.serialization.json.b.d.c(i0, map0);
            this.tpatFilePreferences.put("FAILED_TPATS", s2).apply();
            s00 = S0.a;
        }
        catch(Throwable throwable0) {
            s00 = e0.b(f0.a(throwable0));
        }
        if(e0.e(s00) != null) {
            p.Companion.e("TpatSender", "Failed to encode the about to storing tpats: " + map0);
        }
    }

    public final void sendGenericTpat(@l String s, @l com.vungle.ads.internal.network.c c0, boolean z, @l Executor executor0) {
        L.p(s, "url");
        L.p(c0, "request");
        L.p(executor0, "executor");
        executor0.execute(() -> {
            k k0;
            L.p(this, "this$0");
            L.p(s, "$url");
            L.p(c0, "$request");
            L.p(this.injectSessionIdToUrl(s), "$urlWithSessionId");
            Map map0 = this.getStoredGenericTpats();
            com.vungle.ads.internal.network.c c1 = (com.vungle.ads.internal.network.c)map0.get(s);
            int v = c1 == null ? 0 : c1.getAttempt();
            switch(c0.getMethod()) {
                case 1: {
                    k0 = com.vungle.ads.internal.network.l.pingTPAT$default(this.vungleApiClient, this.injectSessionIdToUrl(s), c0.getHeaders(), null, null, this.logEntry, 12, null);
                    break;
                }
                case 2: {
                    k0 = this.vungleApiClient.pingTPAT(this.injectSessionIdToUrl(s), c0.getHeaders(), c0.getBody(), d.POST, this.logEntry);
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(k0 != null) {
                if(!k0.getErrorIsTerminal() && z) {
                    if(v >= 5) {
                        map0.remove(s);
                        this.saveStoredGenericTpats(map0);
                        new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_RETRY_FAILED, this.injectSessionIdToUrl(s)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
                    }
                    else {
                        Object object0 = map0.get(s);
                        com.vungle.ads.internal.network.c c2 = ((com.vungle.ads.internal.network.c)object0) == null ? null : com.vungle.ads.internal.network.c.copy$default(((com.vungle.ads.internal.network.c)object0), null, null, null, v + 1, 7, null);
                        if(c2 == null) {
                            c2 = new com.vungle.ads.internal.network.c(c0.getMethod(), c0.getHeaders(), c0.getBody(), v + 1);
                        }
                        map0.put(s, c2);
                        this.saveStoredGenericTpats(map0);
                    }
                }
                this.logTpatError(k0, this.injectSessionIdToUrl(s));
            }
            else if(v != 0) {
                map0.remove(s);
                this.saveStoredGenericTpats(map0);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void sendGenericTpat$lambda-3(j j0, String s, com.vungle.ads.internal.network.c c0, String s1, boolean z) [...]

    public final void sendTpat(@l String s, @l Executor executor0) {
        L.p(s, "url");
        L.p(executor0, "executor");
        executor0.execute(() -> {
            L.p(this, "this$0");
            L.p(s, "$url");
            L.p(this.injectSessionIdToUrl(s), "$urlWithSessionId");
            Map map0 = this.getStoredTpats();
            Integer integer0 = (Integer)map0.get(s);
            int v = integer0 == null ? 0 : ((int)integer0);
            k k0 = com.vungle.ads.internal.network.l.pingTPAT$default(this.vungleApiClient, this.injectSessionIdToUrl(s), null, null, null, this.logEntry, 14, null);
            if(k0 != null) {
                if(!k0.getErrorIsTerminal()) {
                    if(v >= 5) {
                        map0.remove(s);
                        this.saveStoredTpats(map0);
                        new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_RETRY_FAILED, this.injectSessionIdToUrl(s)).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
                    }
                    else {
                        map0.put(s, ((int)(v + 1)));
                        this.saveStoredTpats(map0);
                    }
                }
                this.logTpatError(k0, this.injectSessionIdToUrl(s));
            }
            else if(v != 0) {
                map0.remove(s);
                this.saveStoredTpats(map0);
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void sendTpat$lambda-2(j j0, String s, String s1) [...]

    public final void sendTpats(@l Iterable iterable0, @l Executor executor0) {
        L.p(iterable0, "urls");
        L.p(executor0, "executor");
        for(Object object0: iterable0) {
            this.sendTpat(((String)object0), executor0);
        }
    }

    public final void sendWinNotification(@l String s, @l Executor executor0) {
        L.p(s, "urlString");
        L.p(executor0, "executor");
        executor0.execute(() -> {
            L.p(this, "this$0");
            L.p(this.injectSessionIdToUrl(s), "$url");
            k k0 = com.vungle.ads.internal.network.l.pingTPAT$default(this.vungleApiClient, this.injectSessionIdToUrl(s), null, null, null, this.logEntry, 14, null);
            if(k0 != null) {
                new Z0(com.vungle.ads.internal.protos.Sdk.SDKError.b.AD_WIN_NOTIFICATION_ERROR, "Fail to send " + this.injectSessionIdToUrl(s) + ", error: " + k0.getDescription()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void sendWinNotification$lambda-0(j j0, String s) [...]
}

