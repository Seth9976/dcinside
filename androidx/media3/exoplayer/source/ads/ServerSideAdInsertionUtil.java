package androidx.media3.exoplayer.source.ads;

import androidx.annotation.CheckResult;
import androidx.media3.common.AdPlaybackState.AdGroup;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;

@UnstableApi
public final class ServerSideAdInsertionUtil {
    @CheckResult
    public static AdPlaybackState a(AdPlaybackState adPlaybackState0, long v, long v1, long[] arr_v) {
        long v2 = ServerSideAdInsertionUtil.f(v, -1, adPlaybackState0);
        int v3;
        for(v3 = adPlaybackState0.e; v3 < adPlaybackState0.b && adPlaybackState0.e(v3).a != 0x8000000000000000L && adPlaybackState0.e(v3).a <= v2; ++v3) {
        }
        AdPlaybackState adPlaybackState1 = adPlaybackState0.z(v3, v2).w(v3, true).l(v3, arr_v.length).m(v3, arr_v).v(v3, v1);
        for(int v4 = 0; v4 < arr_v.length && arr_v[v4] == 0L; ++v4) {
            adPlaybackState1 = adPlaybackState1.E(v3, v4);
        }
        return ServerSideAdInsertionUtil.b(adPlaybackState1, v3, Util.r2(arr_v), v1);
    }

    private static AdPlaybackState b(AdPlaybackState adPlaybackState0, int v, long v1, long v2) {
        while(true) {
            ++v;
            if(v >= adPlaybackState0.b) {
                break;
            }
            long v3 = adPlaybackState0.e(v).a;
            if(v3 != 0x8000000000000000L) {
                adPlaybackState0 = adPlaybackState0.o(v, v3 + (v2 - v1));
            }
        }
        return adPlaybackState0;
    }

    public static int c(AdPlaybackState adPlaybackState0, int v) {
        int v1 = adPlaybackState0.e(v).b;
        return v1 == -1 ? 0 : v1;
    }

    // 去混淆评级： 低(20)
    public static long d(long v, MediaPeriodId mediaSource$MediaPeriodId0, AdPlaybackState adPlaybackState0) {
        return mediaSource$MediaPeriodId0.c() ? ServerSideAdInsertionUtil.e(v, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c, adPlaybackState0) : ServerSideAdInsertionUtil.f(v, mediaSource$MediaPeriodId0.e, adPlaybackState0);
    }

    public static long e(long v, int v1, int v2, AdPlaybackState adPlaybackState0) {
        int v5;
        AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v1);
        long v3 = v - adPlaybackState$AdGroup0.a;
        for(int v4 = adPlaybackState0.e; true; ++v4) {
            v5 = 0;
            if(v4 >= v1) {
                break;
            }
            AdGroup adPlaybackState$AdGroup1 = adPlaybackState0.e(v4);
            while(v5 < ServerSideAdInsertionUtil.c(adPlaybackState0, v4)) {
                v3 -= adPlaybackState$AdGroup1.g[v5];
                ++v5;
            }
            v3 += adPlaybackState$AdGroup1.h;
        }
        if(v2 < ServerSideAdInsertionUtil.c(adPlaybackState0, v1)) {
            while(v5 < v2) {
                v3 -= adPlaybackState$AdGroup0.g[v5];
                ++v5;
            }
        }
        return v3;
    }

    public static long f(long v, int v1, AdPlaybackState adPlaybackState0) {
        if(v1 == -1) {
            v1 = adPlaybackState0.b;
        }
        int v2 = adPlaybackState0.e;
        long v3 = 0L;
        while(v2 < v1) {
            AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v2);
            if(adPlaybackState$AdGroup0.a == 0x8000000000000000L || adPlaybackState$AdGroup0.a > v - v3) {
                break;
            }
            for(int v4 = 0; v4 < ServerSideAdInsertionUtil.c(adPlaybackState0, v2); ++v4) {
                v3 += adPlaybackState$AdGroup0.g[v4];
            }
            v3 -= adPlaybackState$AdGroup0.h;
            long v5 = adPlaybackState$AdGroup0.a;
            long v6 = v - v3;
            if(adPlaybackState$AdGroup0.h + v5 > v6) {
                return Math.max(v5, v6);
            }
            ++v2;
        }
        return v - v3;
    }

    // 去混淆评级： 低(20)
    public static long g(long v, MediaPeriodId mediaSource$MediaPeriodId0, AdPlaybackState adPlaybackState0) {
        return mediaSource$MediaPeriodId0.c() ? ServerSideAdInsertionUtil.i(v, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c, adPlaybackState0) : ServerSideAdInsertionUtil.j(v, mediaSource$MediaPeriodId0.e, adPlaybackState0);
    }

    public static long h(Player player0, AdPlaybackState adPlaybackState0) {
        Timeline timeline0 = player0.O1();
        if(timeline0.w()) {
            return 0x8000000000000001L;
        }
        Period timeline$Period0 = timeline0.j(player0.L0(), new Period());
        if(!Util.g(timeline$Period0.k(), adPlaybackState0.a)) {
            return 0x8000000000000001L;
        }
        if(player0.W()) {
            int v = player0.u0();
            int v1 = player0.N0();
            return ServerSideAdInsertionUtil.i(Util.F1(player0.getCurrentPosition()), v, v1, adPlaybackState0);
        }
        return ServerSideAdInsertionUtil.j(Util.F1(player0.getCurrentPosition()) - timeline$Period0.r(), -1, adPlaybackState0);
    }

    public static long i(long v, int v1, int v2, AdPlaybackState adPlaybackState0) {
        int v5;
        AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v1);
        long v3 = v + adPlaybackState$AdGroup0.a;
        for(int v4 = adPlaybackState0.e; true; ++v4) {
            v5 = 0;
            if(v4 >= v1) {
                break;
            }
            AdGroup adPlaybackState$AdGroup1 = adPlaybackState0.e(v4);
            while(v5 < ServerSideAdInsertionUtil.c(adPlaybackState0, v4)) {
                v3 += adPlaybackState$AdGroup1.g[v5];
                ++v5;
            }
            v3 -= adPlaybackState$AdGroup1.h;
        }
        if(v2 < ServerSideAdInsertionUtil.c(adPlaybackState0, v1)) {
            while(v5 < v2) {
                v3 += adPlaybackState$AdGroup0.g[v5];
                ++v5;
            }
        }
        return v3;
    }

    public static long j(long v, int v1, AdPlaybackState adPlaybackState0) {
        if(v1 == -1) {
            v1 = adPlaybackState0.b;
        }
        int v2 = adPlaybackState0.e;
        long v3 = 0L;
        while(v2 < v1) {
            AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v2);
            long v4 = adPlaybackState$AdGroup0.a;
            if(v4 == 0x8000000000000000L || v4 > v) {
                break;
            }
            long v5 = v4 + v3;
            for(int v6 = 0; v6 < ServerSideAdInsertionUtil.c(adPlaybackState0, v2); ++v6) {
                v3 += adPlaybackState$AdGroup0.g[v6];
            }
            v3 -= adPlaybackState$AdGroup0.h;
            if(adPlaybackState$AdGroup0.a + adPlaybackState$AdGroup0.h > v) {
                return Math.max(v5, v + v3);
            }
            ++v2;
        }
        return v + v3;
    }
}

