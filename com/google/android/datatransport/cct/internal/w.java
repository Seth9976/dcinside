package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class w {
    @AutoValue.Builder
    public static abstract class a {
        @NonNull
        public abstract w a();

        @NonNull
        public abstract a b(@Nullable b arg1);

        @NonNull
        public abstract a c(@Nullable c arg1);
    }

    public static enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);

        private final int a;
        private static final SparseArray w;

        static {
            SparseArray sparseArray0 = new SparseArray();
            b.w = sparseArray0;
            sparseArray0.put(0, b.b);
            sparseArray0.put(1, b.c);
            sparseArray0.put(2, b.d);
            sparseArray0.put(3, b.e);
            sparseArray0.put(4, b.f);
            sparseArray0.put(5, b.g);
            sparseArray0.put(6, b.h);
            sparseArray0.put(7, b.i);
            sparseArray0.put(8, b.j);
            sparseArray0.put(9, b.k);
            sparseArray0.put(10, b.l);
            sparseArray0.put(11, b.m);
            sparseArray0.put(12, b.n);
            sparseArray0.put(13, b.o);
            sparseArray0.put(14, b.p);
            sparseArray0.put(15, b.q);
            sparseArray0.put(16, b.r);
            sparseArray0.put(17, b.s);
            sparseArray0.put(18, b.t);
            sparseArray0.put(19, b.u);
        }

        private b(int v1) {
            this.a = v1;
        }

        @Nullable
        public static b a(int v) {
            return (b)b.w.get(v);
        }

        public int b() {
            return this.a;
        }
    }

    public static enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);

        private final int a;
        private static final SparseArray u;

        static {
            SparseArray sparseArray0 = new SparseArray();
            c.u = sparseArray0;
            sparseArray0.put(0, c.b);
            sparseArray0.put(1, c.c);
            sparseArray0.put(2, c.d);
            sparseArray0.put(3, c.e);
            sparseArray0.put(4, c.f);
            sparseArray0.put(5, c.g);
            sparseArray0.put(6, c.h);
            sparseArray0.put(7, c.i);
            sparseArray0.put(8, c.j);
            sparseArray0.put(9, c.k);
            sparseArray0.put(10, c.l);
            sparseArray0.put(11, c.m);
            sparseArray0.put(12, c.n);
            sparseArray0.put(13, c.o);
            sparseArray0.put(14, c.p);
            sparseArray0.put(15, c.q);
            sparseArray0.put(16, c.r);
            sparseArray0.put(17, c.s);
            sparseArray0.put(-1, c.t);
        }

        private c(int v1) {
            this.a = v1;
        }

        @Nullable
        public static c a(int v) {
            return (c)c.u.get(v);
        }

        public int b() {
            return this.a;
        }
    }

    @NonNull
    public static a a() {
        return new com.google.android.datatransport.cct.internal.m.b();
    }

    @Nullable
    public abstract b b();

    @Nullable
    public abstract c c();
}

