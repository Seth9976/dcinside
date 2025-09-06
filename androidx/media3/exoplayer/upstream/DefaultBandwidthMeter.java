package androidx.media3.exoplayer.upstream;

import O1.a;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import com.google.common.base.c;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
public final class DefaultBandwidthMeter implements TransferListener, BandwidthMeter {
    public static final class Builder {
        @Nullable
        private final Context a;
        private Map b;
        private int c;
        private Clock d;
        private boolean e;

        public Builder(Context context0) {
            this.a = context0 == null ? null : context0.getApplicationContext();
            this.b = Builder.b(Util.h0(context0));
            this.c = 2000;
            this.d = Clock.a;
            this.e = true;
        }

        public DefaultBandwidthMeter a() {
            return new DefaultBandwidthMeter(this.a, this.b, this.c, this.d, this.e, null);
        }

        private static Map b(String s) {
            int[] arr_v = DefaultBandwidthMeter.l(s);
            Map map0 = new HashMap(8);
            map0.put(0, 1000000L);
            map0.put(2, ((Long)DefaultBandwidthMeter.p.get(arr_v[0])));
            map0.put(3, ((Long)DefaultBandwidthMeter.q.get(arr_v[1])));
            map0.put(4, ((Long)DefaultBandwidthMeter.r.get(arr_v[2])));
            map0.put(5, ((Long)DefaultBandwidthMeter.s.get(arr_v[3])));
            map0.put(10, ((Long)DefaultBandwidthMeter.t.get(arr_v[4])));
            map0.put(9, ((Long)DefaultBandwidthMeter.u.get(arr_v[5])));
            map0.put(7, ((Long)DefaultBandwidthMeter.p.get(arr_v[0])));
            return map0;
        }

        @a
        public Builder c(Clock clock0) {
            this.d = clock0;
            return this;
        }

        @a
        public Builder d(int v, long v1) {
            this.b.put(v, v1);
            return this;
        }

        @a
        public Builder e(long v) {
            for(Object object0: this.b.keySet()) {
                this.d(((int)(((Integer)object0))), v);
            }
            return this;
        }

        @a
        public Builder f(String s) {
            this.b = Builder.b(c.j(s));
            return this;
        }

        @a
        public Builder g(boolean z) {
            this.e = z;
            return this;
        }

        @a
        public Builder h(int v) {
            this.c = v;
            return this;
        }
    }

    private static final int A = 3;
    private static final int B = 4;
    private static final int C = 5;
    @Nullable
    private static DefaultBandwidthMeter D = null;
    private static final int E = 2000;
    private static final int F = 0x80000;
    private final Q2 a;
    private final EventDispatcher b;
    private final Clock c;
    private final boolean d;
    @GuardedBy("this")
    private final SlidingPercentile e;
    @GuardedBy("this")
    private int f;
    @GuardedBy("this")
    private long g;
    @GuardedBy("this")
    private long h;
    @GuardedBy("this")
    private long i;
    @GuardedBy("this")
    private long j;
    @GuardedBy("this")
    private long k;
    @GuardedBy("this")
    private long l;
    private int m;
    private boolean n;
    private int o;
    public static final O2 p = null;
    public static final O2 q = null;
    public static final O2 r = null;
    public static final O2 s = null;
    public static final O2 t = null;
    public static final O2 u = null;
    public static final long v = 1000000L;
    public static final int w = 2000;
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;

    static {
        DefaultBandwidthMeter.p = O2.F(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        DefaultBandwidthMeter.q = O2.F(1500000L, 980000L, 750000L, 520000L, 290000L);
        DefaultBandwidthMeter.r = O2.F(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        DefaultBandwidthMeter.s = O2.F(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        DefaultBandwidthMeter.t = O2.F(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        DefaultBandwidthMeter.u = O2.F(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    }

    private DefaultBandwidthMeter(@Nullable Context context0, Map map0, int v, Clock clock0, boolean z) {
        this.a = Q2.g(map0);
        this.b = new EventDispatcher();
        this.e = new SlidingPercentile(v);
        this.c = clock0;
        this.d = z;
        if(context0 != null) {
            NetworkTypeObserver networkTypeObserver0 = NetworkTypeObserver.d(context0);
            int v1 = networkTypeObserver0.f();
            this.m = v1;
            this.k = this.m(v1);
            networkTypeObserver0.i((int v) -> synchronized(this) {
                int v2 = this.m;
                if(v2 != 0 && !this.d) {
                    return;
                }
                if(this.n) {
                    v = this.o;
                }
                if(v2 == v) {
                    return;
                }
                this.m = v;
                if(v != 0 && v != 1 && v != 8) {
                    this.k = this.m(v);
                    long v3 = this.c.elapsedRealtime();
                    this.p((this.f <= 0 ? 0 : ((int)(v3 - this.g))), this.h, this.k);
                    this.g = v3;
                    this.h = 0L;
                    this.j = 0L;
                    this.i = 0L;
                    this.e.i();
                }
            });
            return;
        }
        this.m = 0;
        this.k = this.m(0);
    }

    DefaultBandwidthMeter(Context context0, Map map0, int v, Clock clock0, boolean z, androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.1 defaultBandwidthMeter$10) {
        this(context0, map0, v, clock0, z);
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void a(EventListener bandwidthMeter$EventListener0) {
        this.b.e(bandwidthMeter$EventListener0);
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
    public long b() {
        return 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void c(Handler handler0, EventListener bandwidthMeter$EventListener0) {
        Assertions.g(handler0);
        Assertions.g(bandwidthMeter$EventListener0);
        this.b.b(handler0, bandwidthMeter$EventListener0);
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
    public long d() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // androidx.media3.datasource.TransferListener
    public void e(DataSource dataSource0, DataSpec dataSpec0, boolean z) {
        synchronized(this) {
            if(!DefaultBandwidthMeter.o(dataSpec0, z)) {
                return;
            }
            if(this.f == 0) {
                this.g = this.c.elapsedRealtime();
            }
            ++this.f;
        }
    }

    @Override  // androidx.media3.datasource.TransferListener
    public void f(DataSource dataSource0, DataSpec dataSpec0, boolean z, int v) {
        synchronized(this) {
            if(!DefaultBandwidthMeter.o(dataSpec0, z)) {
                return;
            }
            this.h += (long)v;
        }
    }

    @Override  // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener g() {
        return this;
    }

    @Override  // androidx.media3.datasource.TransferListener
    public void h(DataSource dataSource0, DataSpec dataSpec0, boolean z) {
        synchronized(this) {
            if(!DefaultBandwidthMeter.o(dataSpec0, z)) {
                return;
            }
            Assertions.i(this.f > 0);
            long v1 = this.c.elapsedRealtime();
            int v2 = (int)(v1 - this.g);
            this.i += (long)v2;
            long v3 = this.h;
            this.j += v3;
            if(v2 > 0) {
                this.e.c(((int)Math.sqrt(v3)), ((float)v3) * 8000.0f / ((float)v2));
                if(this.i >= 2000L || this.j >= 0x80000L) {
                    this.k = (long)this.e.f(0.5f);
                }
                this.p(v2, this.h, this.k);
                this.g = v1;
                this.h = 0L;
            }
            --this.f;
        }
    }

    @Override  // androidx.media3.datasource.TransferListener
    public void i(DataSource dataSource0, DataSpec dataSpec0, boolean z) {
    }

    private static int[] l(String s) {
        s.hashCode();
        switch(s) {
            case "AD": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "AE": {
                return new int[]{1, 4, 2, 3, 4, 1};
            }
            case "AF": {
                return new int[]{4, 4, 3, 4, 2, 2};
            }
            case "AG": {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case "AI": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "AL": {
                return new int[]{1, 1, 1, 2, 2, 2};
            }
            case "AM": {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case "AO": {
                return new int[]{3, 4, 4, 3, 2, 2};
            }
            case "AQ": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "AR": {
                return new int[]{2, 2, 2, 2, 1, 2};
            }
            case "AS": {
                return new int[]{2, 2, 3, 3, 2, 2};
            }
            case "AT": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "AU": {
                return new int[]{0, 3, 1, 1, 3, 0};
            }
            case "AW": {
                return new int[]{2, 2, 3, 4, 2, 2};
            }
            case "AX": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "AZ": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "BA": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "BB": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "BD": {
                return new int[]{2, 1, 3, 2, 4, 2};
            }
            case "BE": {
                return new int[]{0, 0, 1, 0, 1, 2};
            }
            case "BF": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "BG": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "BH": {
                return new int[]{1, 3, 1, 3, 4, 2};
            }
            case "BI": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "BJ": {
                return new int[]{4, 4, 2, 3, 2, 2};
            }
            case "BL": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "BM": {
                return new int[]{0, 2, 0, 0, 2, 2};
            }
            case "BN": {
                return new int[]{3, 2, 0, 0, 2, 2};
            }
            case "BO": {
                return new int[]{1, 2, 4, 4, 2, 2};
            }
            case "BQ": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "BR": {
                return new int[]{1, 1, 1, 1, 2, 4};
            }
            case "BS": {
                return new int[]{3, 2, 1, 1, 2, 2};
            }
            case "BT": {
                return new int[]{3, 1, 2, 2, 3, 2};
            }
            case "BW": {
                return new int[]{3, 2, 1, 0, 2, 2};
            }
            case "BY": {
                return new int[]{1, 2, 3, 3, 2, 2};
            }
            case "BZ": {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case "CA": {
                return new int[]{0, 2, 1, 2, 3, 3};
            }
            case "CD": {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case "CF": {
                return new int[]{4, 2, 4, 2, 2, 2};
            }
            case "CG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "CH": {
                return new int[]{0, 1, 0, 0, 0, 2};
            }
            case "CI": {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case "CK": {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case "CL": {
                return new int[]{0, 1, 2, 2, 2, 2};
            }
            case "CM": {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case "CN": {
                return new int[]{2, 0, 1, 1, 3, 1};
            }
            case "CO": {
                return new int[]{2, 3, 3, 2, 2, 2};
            }
            case "CR": {
                return new int[]{2, 4, 4, 4, 2, 2};
            }
            case "CU": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "CV": {
                return new int[]{2, 3, 0, 1, 2, 2};
            }
            case "CW": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "CX": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "CY": {
                return new int[]{1, 0, 1, 0, 0, 2};
            }
            case "CZ": {
                return new int[]{0, 0, 2, 0, 1, 2};
            }
            case "DE": {
                return new int[]{0, 1, 4, 2, 2, 1};
            }
            case "DJ": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "DK": {
                return new int[]{0, 0, 2, 0, 0, 2};
            }
            case "DM": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "DO": {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case "DZ": {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case "EC": {
                return new int[]{1, 3, 2, 1, 2, 2};
            }
            case "EE": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "EG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "ER": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "ES": {
                return new int[]{0, 0, 0, 0, 1, 0};
            }
            case "ET": {
                return new int[]{4, 3, 4, 4, 4, 2};
            }
            case "FI": {
                return new int[]{0, 0, 0, 1, 0, 2};
            }
            case "FJ": {
                return new int[]{3, 2, 2, 3, 2, 2};
            }
            case "FK": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "FM": {
                return new int[]{4, 2, 4, 0, 2, 2};
            }
            case "FO": {
                return new int[]{0, 2, 2, 0, 2, 2};
            }
            case "FR": {
                return new int[]{1, 1, 1, 1, 0, 2};
            }
            case "GA": {
                return new int[]{3, 4, 0, 0, 2, 2};
            }
            case "GB": {
                return new int[]{1, 1, 3, 2, 2, 2};
            }
            case "GD": {
                return new int[]{2, 2, 0, 0, 2, 2};
            }
            case "GE": {
                return new int[]{1, 1, 0, 2, 2, 2};
            }
            case "GF": {
                return new int[]{3, 2, 3, 3, 2, 2};
            }
            case "GG": {
                return new int[]{0, 2, 1, 1, 2, 2};
            }
            case "GH": {
                return new int[]{3, 3, 3, 2, 2, 2};
            }
            case "GI": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "GL": {
                return new int[]{1, 2, 2, 0, 2, 2};
            }
            case "GM": {
                return new int[]{4, 3, 2, 4, 2, 2};
            }
            case "GN": {
                return new int[]{3, 4, 4, 2, 2, 2};
            }
            case "GP": {
                return new int[]{2, 1, 1, 3, 2, 2};
            }
            case "GQ": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "GR": {
                return new int[]{1, 0, 0, 0, 1, 2};
            }
            case "GT": {
                return new int[]{2, 1, 2, 1, 2, 2};
            }
            case "GU": {
                return new int[]{2, 2, 4, 3, 3, 2};
            }
            case "GW": {
                return new int[]{4, 4, 1, 2, 2, 2};
            }
            case "GY": {
                return new int[]{3, 1, 1, 3, 2, 2};
            }
            case "HK": {
                return new int[]{0, 1, 0, 1, 1, 0};
            }
            case "HR": {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case "HT": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "HU": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "ID": {
                return new int[]{3, 1, 3, 3, 2, 4};
            }
            case "IE": {
                return new int[]{1, 1, 1, 1, 1, 2};
            }
            case "IL": {
                return new int[]{1, 2, 2, 3, 4, 2};
            }
            case "IM": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "IN": {
                return new int[]{1, 1, 3, 2, 2, 3};
            }
            case "IO": {
                return new int[]{3, 2, 2, 0, 2, 2};
            }
            case "IQ": {
                return new int[]{3, 2, 3, 2, 2, 2};
            }
            case "IR": {
                return new int[]{4, 2, 3, 3, 4, 3};
            }
            case "IS": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "IT": {
                return new int[]{0, 1, 1, 2, 1, 2};
            }
            case "JE": {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case "JM": {
                return new int[]{2, 4, 3, 1, 2, 2};
            }
            case "JO": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "JP": {
                return new int[]{0, 3, 2, 3, 4, 2};
            }
            case "KE": {
                return new int[]{3, 2, 1, 1, 1, 2};
            }
            case "KG": {
                return new int[]{2, 1, 1, 2, 2, 2};
            }
            case "KH": {
                return new int[]{1, 0, 4, 2, 2, 2};
            }
            case "KI": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "KM": {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case "KN": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "KR": {
                return new int[]{0, 2, 2, 4, 4, 4};
            }
            case "KW": {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case "KY": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "KZ": {
                return new int[]{2, 1, 2, 2, 3, 2};
            }
            case "LA": {
                return new int[]{1, 2, 1, 3, 2, 2};
            }
            case "LB": {
                return new int[]{3, 1, 1, 2, 2, 2};
            }
            case "LC": {
                return new int[]{2, 2, 1, 1, 2, 2};
            }
            case "LI": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "LK": {
                return new int[]{3, 2, 3, 3, 4, 2};
            }
            case "LR": {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case "LS": {
                return new int[]{4, 3, 3, 3, 2, 2};
            }
            case "LT": {
                return new int[]{0, 1, 0, 1, 0, 2};
            }
            case "LU": {
                return new int[]{4, 0, 3, 2, 1, 3};
            }
            case "LV": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "LY": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "MA": {
                return new int[]{3, 3, 1, 1, 2, 2};
            }
            case "MC": {
                return new int[]{1, 2, 2, 0, 2, 2};
            }
            case "MD": {
                return new int[]{1, 0, 0, 0, 2, 2};
            }
            case "ME": {
                return new int[]{2, 0, 0, 1, 3, 2};
            }
            case "MF": {
                return new int[]{1, 2, 2, 3, 2, 2};
            }
            case "MG": {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case "MH": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "MK": {
                return new int[]{1, 0, 0, 1, 3, 2};
            }
            case "ML": {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case "MM": {
                return new int[]{3, 2, 3, 3, 4, 2};
            }
            case "MN": {
                return new int[]{2, 0, 2, 2, 2, 2};
            }
            case "MO": {
                return new int[]{0, 2, 4, 4, 3, 1};
            }
            case "MP": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "MQ": {
                return new int[]{2, 1, 2, 3, 2, 2};
            }
            case "MR": {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case "MS": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "MT": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "MU": {
                return new int[]{3, 1, 0, 2, 2, 2};
            }
            case "MV": {
                return new int[]{3, 2, 1, 3, 4, 2};
            }
            case "MW": {
                return new int[]{3, 2, 2, 1, 2, 2};
            }
            case "MX": {
                return new int[]{2, 4, 4, 4, 3, 2};
            }
            case "MY": {
                return new int[]{1, 0, 4, 1, 1, 0};
            }
            case "MZ": {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case "NA": {
                return new int[]{3, 4, 3, 2, 2, 2};
            }
            case "NC": {
                return new int[]{2, 3, 3, 4, 2, 2};
            }
            case "NE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "NF": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "NG": {
                return new int[]{3, 4, 2, 1, 2, 2};
            }
            case "NI": {
                return new int[]{2, 4, 4, 4, 2, 2};
            }
            case "NL": {
                return new int[]{2, 1, 4, 3, 0, 4};
            }
            case "NO": {
                return new int[]{0, 0, 3, 0, 0, 2};
            }
            case "NP": {
                return new int[]{2, 2, 4, 3, 2, 2};
            }
            case "NR": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "NU": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "NZ": {
                return new int[]{0, 0, 1, 2, 4, 2};
            }
            case "OM": {
                return new int[]{2, 3, 1, 2, 4, 2};
            }
            case "PA": {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case "PE": {
                return new int[]{1, 2, 4, 4, 3, 2};
            }
            case "PF": {
                return new int[]{2, 2, 3, 1, 2, 2};
            }
            case "PG": {
                return new int[]{4, 3, 3, 3, 2, 2};
            }
            case "PH": {
                return new int[]{2, 1, 2, 3, 2, 1};
            }
            case "PK": {
                return new int[]{3, 3, 3, 3, 2, 2};
            }
            case "PL": {
                return new int[]{1, 0, 2, 2, 4, 4};
            }
            case "PM": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "PR": {
                return new int[]{2, 0, 2, 1, 2, 0};
            }
            case "PS": {
                return new int[]{3, 4, 1, 3, 2, 2};
            }
            case "PT": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "PW": {
                return new int[]{2, 2, 4, 1, 2, 2};
            }
            case "PY": {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case "QA": {
                return new int[]{1, 4, 4, 4, 4, 2};
            }
            case "RE": {
                return new int[]{0, 3, 2, 3, 1, 2};
            }
            case "RO": {
                return new int[]{0, 0, 1, 1, 3, 2};
            }
            case "RS": {
                return new int[]{1, 0, 0, 1, 2, 2};
            }
            case "RU": {
                return new int[]{1, 0, 0, 1, 3, 3};
            }
            case "RW": {
                return new int[]{3, 3, 2, 0, 2, 2};
            }
            case "SA": {
                return new int[]{3, 1, 1, 2, 2, 0};
            }
            case "SB": {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            case "SC": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "SD": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "SE": {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case "SG": {
                return new int[]{2, 3, 3, 3, 1, 1};
            }
            case "SH": {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case "SI": {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case "SJ": {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case "SK": {
                return new int[]{0, 1, 1, 1, 2, 2};
            }
            case "SL": {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case "SM": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "SN": {
                return new int[]{4, 4, 3, 2, 2, 2};
            }
            case "SO": {
                return new int[]{2, 2, 3, 4, 4, 2};
            }
            case "SR": {
                return new int[]{2, 4, 4, 1, 2, 2};
            }
            case "SS": {
                return new int[]{4, 3, 2, 4, 2, 2};
            }
            case "ST": {
                return new int[]{2, 2, 1, 2, 2, 2};
            }
            case "SV": {
                return new int[]{2, 3, 2, 1, 2, 2};
            }
            case "SX": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "SY": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "SZ": {
                return new int[]{4, 4, 3, 4, 2, 2};
            }
            case "TC": {
                return new int[]{3, 2, 1, 2, 2, 2};
            }
            case "TD": {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case "TG": {
                return new int[]{3, 4, 1, 0, 2, 2};
            }
            case "TH": {
                return new int[]{0, 1, 2, 2, 2, 2};
            }
            case "TJ": {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case "TL": {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case "TM": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "TN": {
                return new int[]{3, 1, 1, 1, 2, 2};
            }
            case "TO": {
                return new int[]{3, 2, 4, 3, 2, 2};
            }
            case "TR": {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case "TT": {
                return new int[]{2, 4, 1, 0, 2, 2};
            }
            case "TV": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "TW": {
                return new int[]{0, 0, 0, 0, 0, 0};
            }
            case "TZ": {
                return new int[]{3, 4, 2, 1, 3, 2};
            }
            case "UA": {
                return new int[]{0, 2, 1, 2, 3, 3};
            }
            case "UG": {
                return new int[]{3, 3, 2, 3, 4, 2};
            }
            case "US": {
                return new int[]{2, 2, 4, 1, 3, 1};
            }
            case "UY": {
                return new int[]{2, 1, 1, 2, 1, 2};
            }
            case "UZ": {
                return new int[]{1, 2, 3, 4, 3, 2};
            }
            case "VA": {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case "VC": {
                return new int[]{1, 2, 0, 0, 2, 2};
            }
            case "VE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "VG": {
                return new int[]{2, 2, 1, 1, 2, 4};
            }
            case "VI": {
                return new int[]{0, 2, 1, 2, 2, 2};
            }
            case "VN": {
                return new int[]{0, 0, 1, 2, 2, 2};
            }
            case "VU": {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case "WF": {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case "WS": {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case "XK": {
                return new int[]{1, 2, 1, 1, 2, 2};
            }
            case "YE": {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case "YT": {
                return new int[]{2, 3, 3, 4, 2, 2};
            }
            case "ZA": {
                return new int[]{2, 4, 2, 1, 1, 2};
            }
            case "ZM": {
                return new int[]{4, 4, 4, 3, 2, 2};
            }
            case "ZW": {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            default: {
                return new int[]{2, 2, 2, 2, 2, 2};
            }
        }
    }

    private long m(int v) {
        Long long0 = (Long)this.a.get(v);
        if(long0 == null) {
            long0 = (Long)this.a.get(0);
        }
        if(long0 == null) {
            long0 = 1000000L;
        }
        return (long)long0;
    }

    public static DefaultBandwidthMeter n(Context context0) {
        synchronized(DefaultBandwidthMeter.class) {
            if(DefaultBandwidthMeter.D == null) {
                DefaultBandwidthMeter.D = new Builder(context0).a();
            }
            return DefaultBandwidthMeter.D;
        }
    }

    // 去混淆评级： 低(20)
    private static boolean o(DataSpec dataSpec0, boolean z) {
        return z && !dataSpec0.d(8);
    }

    @GuardedBy("this")
    private void p(int v, long v1, long v2) {
        if(v == 0 && v1 == 0L && v2 == this.l) {
            return;
        }
        this.l = v2;
        this.b.c(v, v1, v2);
    }

    // 检测为 Lambda 实现
    private void q(int v) [...]

    public void r(int v) {
        synchronized(this) {
            this.o = v;
            this.n = true;
            this.q(v);
        }
    }

    class androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.1 {
    }

}

