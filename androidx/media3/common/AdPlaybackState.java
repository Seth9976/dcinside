package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

@UnstableApi
public final class AdPlaybackState {
    public static final class AdGroup {
        public final long a;
        public final int b;
        public final int c;
        @Deprecated
        public final Uri[] d;
        public final MediaItem[] e;
        public final int[] f;
        public final long[] g;
        public final long h;
        public final boolean i;
        private static final String j;
        private static final String k;
        private static final String l;
        private static final String m;
        private static final String n;
        private static final String o;
        private static final String p;
        private static final String q;
        @VisibleForTesting
        static final String r;

        static {
            AdGroup.j = "0";
            AdGroup.k = "1";
            AdGroup.l = "2";
            AdGroup.m = "3";
            AdGroup.n = "4";
            AdGroup.o = "5";
            AdGroup.p = "6";
            AdGroup.q = "7";
            AdGroup.r = "8";
        }

        public AdGroup(long v) {
            this(v, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false);
        }

        private AdGroup(long v, int v1, int v2, int[] arr_v, MediaItem[] arr_mediaItem, long[] arr_v1, long v3, boolean z) {
            Assertions.a(arr_v.length == arr_mediaItem.length);
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.f = arr_v;
            this.e = arr_mediaItem;
            this.g = arr_v1;
            this.h = v3;
            this.i = z;
            this.d = new Uri[arr_mediaItem.length];
            for(int v4 = 0; true; ++v4) {
                Uri[] arr_uri = this.d;
                if(v4 >= arr_uri.length) {
                    break;
                }
                MediaItem mediaItem0 = arr_mediaItem[v4];
                arr_uri[v4] = mediaItem0 == null ? null : ((LocalConfiguration)Assertions.g(mediaItem0.b)).a;
            }
        }

        AdGroup(long v, int v1, int v2, int[] arr_v, MediaItem[] arr_mediaItem, long[] arr_v1, long v3, boolean z, androidx.media3.common.AdPlaybackState.1 adPlaybackState$10) {
            this(v, v1, v2, arr_v, arr_mediaItem, arr_v1, v3, z);
        }

        @CheckResult
        private static long[] b(long[] arr_v, int v) {
            int v1 = Math.max(v, arr_v.length);
            long[] arr_v1 = Arrays.copyOf(arr_v, v1);
            Arrays.fill(arr_v1, arr_v.length, v1, 0x8000000000000001L);
            return arr_v1;
        }

        @CheckResult
        private static int[] c(int[] arr_v, int v) {
            int v1 = Math.max(v, arr_v.length);
            int[] arr_v1 = Arrays.copyOf(arr_v, v1);
            Arrays.fill(arr_v1, arr_v.length, v1, 0);
            return arr_v1;
        }

        public static AdGroup d(Bundle bundle0) {
            long v = bundle0.getLong(AdGroup.j);
            int v1 = bundle0.getInt(AdGroup.k);
            int v2 = bundle0.getInt(AdGroup.q);
            ArrayList arrayList0 = bundle0.getParcelableArrayList(AdGroup.l);
            ArrayList arrayList1 = bundle0.getParcelableArrayList(AdGroup.r);
            int[] arr_v = bundle0.getIntArray(AdGroup.m);
            long[] arr_v1 = bundle0.getLongArray(AdGroup.n);
            long v3 = bundle0.getLong(AdGroup.o);
            boolean z = bundle0.getBoolean(AdGroup.p);
            if(arr_v == null) {
                arr_v = new int[0];
            }
            MediaItem[] arr_mediaItem = AdGroup.g(arrayList1, arrayList0);
            return arr_v1 == null ? new AdGroup(v, v1, v2, arr_v, arr_mediaItem, new long[0], v3, z) : new AdGroup(v, v1, v2, arr_v, arr_mediaItem, arr_v1, v3, z);
        }

        public int e() {
            return this.h(-1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return AdGroup.class == class0 && (this.a == ((AdGroup)object0).a && this.b == ((AdGroup)object0).b && this.c == ((AdGroup)object0).c && Arrays.equals(this.e, ((AdGroup)object0).e) && Arrays.equals(this.f, ((AdGroup)object0).f) && Arrays.equals(this.g, ((AdGroup)object0).g) && this.h == ((AdGroup)object0).h && this.i == ((AdGroup)object0).i);
            }
            return false;
        }

        private ArrayList f() {
            ArrayList arrayList0 = new ArrayList();
            MediaItem[] arr_mediaItem = this.e;
            for(int v = 0; v < arr_mediaItem.length; ++v) {
                MediaItem mediaItem0 = arr_mediaItem[v];
                arrayList0.add((mediaItem0 == null ? null : mediaItem0.g()));
            }
            return arrayList0;
        }

        private static MediaItem[] g(@Nullable ArrayList arrayList0, @Nullable ArrayList arrayList1) {
            int v = 0;
            if(arrayList0 != null) {
                MediaItem[] arr_mediaItem = new MediaItem[arrayList0.size()];
                while(v < arrayList0.size()) {
                    Bundle bundle0 = (Bundle)arrayList0.get(v);
                    arr_mediaItem[v] = bundle0 == null ? null : MediaItem.b(bundle0);
                    ++v;
                }
                return arr_mediaItem;
            }
            if(arrayList1 != null) {
                MediaItem[] arr_mediaItem1 = new MediaItem[arrayList1.size()];
                while(v < arrayList1.size()) {
                    Uri uri0 = (Uri)arrayList1.get(v);
                    arr_mediaItem1[v] = uri0 == null ? null : MediaItem.c(uri0);
                    ++v;
                }
                return arr_mediaItem1;
            }
            return new MediaItem[0];
        }

        public int h(@IntRange(from = -1L) int v) {
            int v1 = v + 1;
        alab1:
            while(true) {
                int[] arr_v = this.f;
                if(v1 >= arr_v.length || this.i) {
                    break;
                }
                switch(arr_v[v1]) {
                    case 0: 
                    case 1: {
                        break alab1;
                    }
                    default: {
                        ++v1;
                    }
                }
            }
            return v1;
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.e);
            int v1 = Arrays.hashCode(this.f);
            int v2 = Arrays.hashCode(this.g);
            return ((((((this.b * 0x1F + this.c) * 0x1F + ((int)(this.a ^ this.a >>> 0x20))) * 0x1F + v) * 0x1F + v1) * 0x1F + v2) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + this.i;
        }

        public boolean i() {
            if(this.b == -1) {
                return true;
            }
            for(int v = 0; v < this.b; ++v) {
                switch(this.f[v]) {
                    case 0: 
                    case 1: {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean j() {
            return this.i && this.a == 0x8000000000000000L && this.b == -1;
        }

        public boolean k() {
            return this.b == -1 || this.e() < this.b;
        }

        public Bundle l() {
            Bundle bundle0 = new Bundle();
            bundle0.putLong(AdGroup.j, this.a);
            bundle0.putInt(AdGroup.k, this.b);
            bundle0.putInt(AdGroup.q, this.c);
            ArrayList arrayList0 = new ArrayList(Arrays.asList(this.d));
            bundle0.putParcelableArrayList(AdGroup.l, arrayList0);
            ArrayList arrayList1 = this.f();
            bundle0.putParcelableArrayList(AdGroup.r, arrayList1);
            bundle0.putIntArray(AdGroup.m, this.f);
            bundle0.putLongArray(AdGroup.n, this.g);
            bundle0.putLong(AdGroup.o, this.h);
            bundle0.putBoolean(AdGroup.p, this.i);
            return bundle0;
        }

        @CheckResult
        public AdGroup m(int v) {
            int[] arr_v = AdGroup.c(this.f, v);
            long[] arr_v1 = AdGroup.b(this.g, v);
            Object[] arr_object = Arrays.copyOf(this.e, v);
            return new AdGroup(this.a, v, this.c, arr_v, ((MediaItem[])arr_object), arr_v1, this.h, this.i);
        }

        @CheckResult
        public AdGroup n(long[] arr_v) {
            MediaItem[] arr_mediaItem = this.e;
            if(arr_v.length < arr_mediaItem.length) {
                arr_v = AdGroup.b(arr_v, arr_mediaItem.length);
                return new AdGroup(this.a, this.b, this.c, this.f, this.e, arr_v, this.h, this.i);
            }
            if(this.b != -1 && arr_v.length > arr_mediaItem.length) {
                arr_v = Arrays.copyOf(arr_v, arr_mediaItem.length);
                return new AdGroup(this.a, this.b, this.c, this.f, this.e, arr_v, this.h, this.i);
            }
            return new AdGroup(this.a, this.b, this.c, this.f, this.e, arr_v, this.h, this.i);
        }

        @CheckResult
        public AdGroup o(MediaItem mediaItem0, @IntRange(from = 0L) int v) {
            int[] arr_v = AdGroup.c(this.f, v + 1);
            long[] arr_v1 = this.g.length == arr_v.length ? this.g : AdGroup.b(this.g, arr_v.length);
            Object[] arr_object = Arrays.copyOf(this.e, arr_v.length);
            ((MediaItem[])arr_object)[v] = mediaItem0;
            arr_v[v] = 1;
            return new AdGroup(this.a, this.b, this.c, arr_v, ((MediaItem[])arr_object), arr_v1, this.h, this.i);
        }

        @CheckResult
        public AdGroup p(int v, @IntRange(from = 0L) int v1) {
            boolean z = false;
            Assertions.a(this.b == -1 || v1 < this.b);
            int[] arr_v = AdGroup.c(this.f, v1 + 1);
            int v2 = arr_v[v1];
            if(v2 == 0 || v2 == 1 || v2 == v) {
                z = true;
            }
            Assertions.a(z);
            long[] arr_v1 = this.g.length == arr_v.length ? this.g : AdGroup.b(this.g, arr_v.length);
            MediaItem[] arr_mediaItem = this.e.length == arr_v.length ? this.e : ((MediaItem[])Arrays.copyOf(this.e, arr_v.length));
            arr_v[v1] = v;
            return new AdGroup(this.a, this.b, this.c, arr_v, arr_mediaItem, arr_v1, this.h, this.i);
        }

        @CheckResult
        @Deprecated
        public AdGroup q(Uri uri0, @IntRange(from = 0L) int v) {
            return this.o(MediaItem.c(uri0), v);
        }

        @CheckResult
        public AdGroup r() {
            if(this.b == -1) {
                return this;
            }
            int[] arr_v = Arrays.copyOf(this.f, this.f.length);
            for(int v = 0; v < this.f.length; ++v) {
                switch(arr_v[v]) {
                    case 2: 
                    case 3: 
                    case 4: {
                        arr_v[v] = this.e[v] == null ? 0 : 1;
                    }
                }
            }
            return new AdGroup(this.a, this.f.length, this.c, arr_v, this.e, this.g, this.h, this.i);
        }

        @CheckResult
        public AdGroup s() {
            if(this.b == -1) {
                return new AdGroup(this.a, 0, this.c, new int[0], new MediaItem[0], new long[0], this.h, this.i);
            }
            int[] arr_v = Arrays.copyOf(this.f, this.f.length);
            for(int v = 0; v < this.f.length; ++v) {
                switch(arr_v[v]) {
                    case 0: 
                    case 1: {
                        arr_v[v] = 2;
                    }
                }
            }
            return new AdGroup(this.a, this.f.length, this.c, arr_v, this.e, this.g, this.h, this.i);
        }

        @CheckResult
        public AdGroup t(long v) {
            return new AdGroup(this.a, this.b, this.c, this.f, this.e, this.g, v, this.i);
        }

        @CheckResult
        public AdGroup u(boolean z) {
            return new AdGroup(this.a, this.b, this.c, this.f, this.e, this.g, this.h, z);
        }

        public AdGroup v() {
            int v = this.f.length - 1;
            int[] arr_v = Arrays.copyOf(this.f, v);
            Object[] arr_object = Arrays.copyOf(this.e, v);
            long[] arr_v1 = this.g.length <= v ? this.g : Arrays.copyOf(this.g, v);
            long v1 = Util.r2(arr_v1);
            return new AdGroup(this.a, v, this.c, arr_v, ((MediaItem[])arr_object), arr_v1, v1, this.i);
        }

        public AdGroup w(int v) {
            return new AdGroup(this.a, this.b, v, this.f, this.e, this.g, this.h, this.i);
        }

        @CheckResult
        public AdGroup x(long v) {
            return new AdGroup(v, this.b, this.c, this.f, this.e, this.g, this.h, this.i);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface AdState {
    }

    @Nullable
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    private final AdGroup[] f;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final AdPlaybackState l;
    private static final AdGroup m;
    private static final String n;
    private static final String o;
    private static final String p;
    private static final String q;

    static {
        AdPlaybackState.l = new AdPlaybackState(null, new AdGroup[0], 0L, 0x8000000000000001L, 0);
        AdPlaybackState.m = new AdGroup(0L).m(0);
        AdPlaybackState.n = "1";
        AdPlaybackState.o = "2";
        AdPlaybackState.p = "3";
        AdPlaybackState.q = "4";
    }

    public AdPlaybackState(Object object0, long[] arr_v) {
        this(object0, AdPlaybackState.a(arr_v), 0L, 0x8000000000000001L, 0);
    }

    private AdPlaybackState(@Nullable Object object0, AdGroup[] arr_adPlaybackState$AdGroup, long v, long v1, int v2) {
        this.a = object0;
        this.c = v;
        this.d = v1;
        this.b = arr_adPlaybackState$AdGroup.length + v2;
        this.f = arr_adPlaybackState$AdGroup;
        this.e = v2;
    }

    @CheckResult
    public AdPlaybackState A(@IntRange(from = 0L) int v, int v1) {
        int v2 = v - this.e;
        AdGroup[] arr_adPlaybackState$AdGroup = this.f;
        if(arr_adPlaybackState$AdGroup[v2].c == v1) {
            return this;
        }
        Object[] arr_object = Util.L1(arr_adPlaybackState$AdGroup, arr_adPlaybackState$AdGroup.length);
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].w(v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState B(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        int v2 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].p(3, v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState C(@IntRange(from = 0L) int v) {
        int v1 = this.e;
        if(v1 == v) {
            return this;
        }
        Assertions.a(v > v1);
        int v2 = this.b - v;
        AdGroup[] arr_adPlaybackState$AdGroup = new AdGroup[v2];
        System.arraycopy(this.f, v - this.e, arr_adPlaybackState$AdGroup, 0, v2);
        return new AdPlaybackState(this.a, arr_adPlaybackState$AdGroup, this.c, this.d, v);
    }

    @CheckResult
    public AdPlaybackState D(@IntRange(from = 0L) int v) {
        int v1 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v1] = ((AdGroup[])arr_object)[v1].r();
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState E(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        int v2 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].p(2, v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState F(@IntRange(from = 0L) int v) {
        int v1 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v1] = ((AdGroup[])arr_object)[v1].s();
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    private static AdGroup[] a(long[] arr_v) {
        AdGroup[] arr_adPlaybackState$AdGroup = new AdGroup[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_adPlaybackState$AdGroup[v] = new AdGroup(arr_v[v]);
        }
        return arr_adPlaybackState$AdGroup;
    }

    public boolean b() {
        int v = this.b - 1;
        return v >= 0 && this.i(v);
    }

    public static AdPlaybackState c(Object object0, AdPlaybackState adPlaybackState0) {
        int v = adPlaybackState0.b - adPlaybackState0.e;
        AdGroup[] arr_adPlaybackState$AdGroup = new AdGroup[v];
        for(int v1 = 0; v1 < v; ++v1) {
            AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.f[v1];
            int[] arr_v = Arrays.copyOf(adPlaybackState$AdGroup0.f, adPlaybackState$AdGroup0.f.length);
            Object[] arr_object = Arrays.copyOf(adPlaybackState$AdGroup0.e, adPlaybackState$AdGroup0.e.length);
            long[] arr_v1 = Arrays.copyOf(adPlaybackState$AdGroup0.g, adPlaybackState$AdGroup0.g.length);
            arr_adPlaybackState$AdGroup[v1] = new AdGroup(adPlaybackState$AdGroup0.a, adPlaybackState$AdGroup0.b, adPlaybackState$AdGroup0.c, arr_v, ((MediaItem[])arr_object), arr_v1, adPlaybackState$AdGroup0.h, adPlaybackState$AdGroup0.i, null);
        }
        return new AdPlaybackState(object0, arr_adPlaybackState$AdGroup, adPlaybackState0.c, adPlaybackState0.d, adPlaybackState0.e);
    }

    public static AdPlaybackState d(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getParcelableArrayList(AdPlaybackState.n);
        if(arrayList0 == null) {
            return new AdPlaybackState(null, new AdGroup[0], bundle0.getLong(AdPlaybackState.o, AdPlaybackState.l.c), bundle0.getLong(AdPlaybackState.p, AdPlaybackState.l.d), bundle0.getInt(AdPlaybackState.q, AdPlaybackState.l.e));
        }
        AdGroup[] arr_adPlaybackState$AdGroup = new AdGroup[arrayList0.size()];
        for(int v = 0; v < arrayList0.size(); ++v) {
            arr_adPlaybackState$AdGroup[v] = AdGroup.d(((Bundle)arrayList0.get(v)));
        }
        return new AdPlaybackState(null, arr_adPlaybackState$AdGroup, bundle0.getLong(AdPlaybackState.o, AdPlaybackState.l.c), bundle0.getLong(AdPlaybackState.p, AdPlaybackState.l.d), bundle0.getInt(AdPlaybackState.q, AdPlaybackState.l.e));
    }

    public AdGroup e(@IntRange(from = 0L) int v) {
        return v >= this.e ? this.f[v - this.e] : AdPlaybackState.m;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return AdPlaybackState.class == class0 && (Util.g(this.a, ((AdPlaybackState)object0).a) && this.b == ((AdPlaybackState)object0).b && this.c == ((AdPlaybackState)object0).c && this.d == ((AdPlaybackState)object0).d && this.e == ((AdPlaybackState)object0).e && Arrays.equals(this.f, ((AdPlaybackState)object0).f));
        }
        return false;
    }

    public int f(long v, long v1) {
        if(v != 0x8000000000000000L && (v1 == 0x8000000000000001L || v < v1)) {
            int v2;
            for(v2 = this.e; v2 < this.b && (this.e(v2).a != 0x8000000000000000L && this.e(v2).a <= v || !this.e(v2).k()); ++v2) {
            }
            return v2 >= this.b ? -1 : v2;
        }
        return -1;
    }

    public int g(long v, long v1) {
        int v2 = this.i(this.b - 1);
        int v3;
        for(v3 = this.b - 1 - v2; v3 >= 0 && this.j(v, v1, v3); --v3) {
        }
        return v3 >= 0 && this.e(v3).i() ? v3 : -1;
    }

    public boolean h(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        if(v >= this.b) {
            return false;
        }
        AdGroup adPlaybackState$AdGroup0 = this.e(v);
        return adPlaybackState$AdGroup0.b != -1 && v1 < adPlaybackState$AdGroup0.b && adPlaybackState$AdGroup0.f[v1] == 4;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.f);
        return ((((this.b * 0x1F + (this.a == null ? 0 : this.a.hashCode())) * 0x1F + ((int)this.c)) * 0x1F + ((int)this.d)) * 0x1F + this.e) * 0x1F + v;
    }

    // 去混淆评级： 低(20)
    public boolean i(int v) {
        return v == this.b - 1 && this.e(v).j();
    }

    private boolean j(long v, long v1, int v2) {
        if(v == 0x8000000000000000L) {
            return false;
        }
        AdGroup adPlaybackState$AdGroup0 = this.e(v2);
        return adPlaybackState$AdGroup0.a == 0x8000000000000000L ? v1 == 0x8000000000000001L || adPlaybackState$AdGroup0.i && adPlaybackState$AdGroup0.b == -1 || v < v1 : v < adPlaybackState$AdGroup0.a;
    }

    public Bundle k() {
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = new ArrayList();
        AdGroup[] arr_adPlaybackState$AdGroup = this.f;
        for(int v = 0; v < arr_adPlaybackState$AdGroup.length; ++v) {
            arrayList0.add(arr_adPlaybackState$AdGroup[v].l());
        }
        if(!arrayList0.isEmpty()) {
            bundle0.putParcelableArrayList(AdPlaybackState.n, arrayList0);
        }
        long v1 = this.c;
        AdPlaybackState adPlaybackState0 = AdPlaybackState.l;
        if(v1 != adPlaybackState0.c) {
            bundle0.putLong(AdPlaybackState.o, v1);
        }
        long v2 = this.d;
        if(v2 != adPlaybackState0.d) {
            bundle0.putLong(AdPlaybackState.p, v2);
        }
        int v3 = this.e;
        if(v3 != adPlaybackState0.e) {
            bundle0.putInt(AdPlaybackState.q, v3);
        }
        return bundle0;
    }

    @CheckResult
    public AdPlaybackState l(@IntRange(from = 0L) int v, @IntRange(from = 1L) int v1) {
        Assertions.a(v1 > 0);
        int v2 = v - this.e;
        AdGroup[] arr_adPlaybackState$AdGroup = this.f;
        if(arr_adPlaybackState$AdGroup[v2].b == v1) {
            return this;
        }
        Object[] arr_object = Util.L1(arr_adPlaybackState$AdGroup, arr_adPlaybackState$AdGroup.length);
        ((AdGroup[])arr_object)[v2] = this.f[v2].m(v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState m(@IntRange(from = 0L) int v, long[] arr_v) {
        int v1 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v1] = ((AdGroup[])arr_object)[v1].n(arr_v);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState n(long[][] arr2_v) {
        Assertions.i(this.e == 0);
        Object[] arr_object = Util.L1(this.f, this.f.length);
        for(int v = 0; v < this.b; ++v) {
            ((AdGroup[])arr_object)[v] = ((AdGroup[])arr_object)[v].n(arr2_v[v]);
        }
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState o(@IntRange(from = 0L) int v, long v1) {
        int v2 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v2] = this.f[v2].x(v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState p(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        int v2 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].p(4, v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState q(long v) {
        return this.c == v ? this : new AdPlaybackState(this.a, this.f, v, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState r(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1) {
        return this.s(v, v1, MediaItem.c(Uri.EMPTY));
    }

    @CheckResult
    public AdPlaybackState s(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, MediaItem mediaItem0) {
        int v2 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        Assertions.i(((AdGroup[])arr_object)[v2].i || mediaItem0.b != null && !mediaItem0.b.a.equals(Uri.EMPTY));
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].o(mediaItem0, v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    @Deprecated
    public AdPlaybackState t(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, Uri uri0) {
        return this.s(v, v1, MediaItem.c(uri0));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("AdPlaybackState(adsId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", adResumePositionUs=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", adGroups=[");
        for(int v = 0; v < this.f.length; ++v) {
            stringBuilder0.append("adGroup(timeUs=");
            stringBuilder0.append(this.f[v].a);
            stringBuilder0.append(", ads=[");
            for(int v1 = 0; v1 < this.f[v].f.length; ++v1) {
                stringBuilder0.append("ad(state=");
                switch(this.f[v].f[v1]) {
                    case 0: {
                        stringBuilder0.append('_');
                        break;
                    }
                    case 1: {
                        stringBuilder0.append('R');
                        break;
                    }
                    case 2: {
                        stringBuilder0.append('S');
                        break;
                    }
                    case 3: {
                        stringBuilder0.append('P');
                        break;
                    }
                    case 4: {
                        stringBuilder0.append('!');
                        break;
                    }
                    default: {
                        stringBuilder0.append('?');
                    }
                }
                stringBuilder0.append(", durationUs=");
                stringBuilder0.append(this.f[v].g[v1]);
                stringBuilder0.append(')');
                if(v1 < this.f[v].f.length - 1) {
                    stringBuilder0.append(", ");
                }
            }
            stringBuilder0.append("])");
            if(v < this.f.length - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("])");
        return stringBuilder0.toString();
    }

    @CheckResult
    public AdPlaybackState u(long v) {
        return this.d == v ? this : new AdPlaybackState(this.a, this.f, this.c, v, this.e);
    }

    @CheckResult
    public AdPlaybackState v(@IntRange(from = 0L) int v, long v1) {
        int v2 = v - this.e;
        AdGroup[] arr_adPlaybackState$AdGroup = this.f;
        if(arr_adPlaybackState$AdGroup[v2].h == v1) {
            return this;
        }
        Object[] arr_object = Util.L1(arr_adPlaybackState$AdGroup, arr_adPlaybackState$AdGroup.length);
        ((AdGroup[])arr_object)[v2] = ((AdGroup[])arr_object)[v2].t(v1);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState w(@IntRange(from = 0L) int v, boolean z) {
        int v1 = v - this.e;
        AdGroup[] arr_adPlaybackState$AdGroup = this.f;
        if(arr_adPlaybackState$AdGroup[v1].i == z) {
            return this;
        }
        Object[] arr_object = Util.L1(arr_adPlaybackState$AdGroup, arr_adPlaybackState$AdGroup.length);
        ((AdGroup[])arr_object)[v1] = ((AdGroup[])arr_object)[v1].u(z);
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    @CheckResult
    public AdPlaybackState x(@IntRange(from = 0L) int v) {
        int v1 = v - this.e;
        Object[] arr_object = Util.L1(this.f, this.f.length);
        ((AdGroup[])arr_object)[v1] = ((AdGroup[])arr_object)[v1].v();
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    public AdPlaybackState y() {
        return this.z(this.b, 0x8000000000000000L).w(this.b, true);
    }

    @CheckResult
    public AdPlaybackState z(@IntRange(from = 0L) int v, long v1) {
        int v2 = v - this.e;
        AdGroup adPlaybackState$AdGroup0 = new AdGroup(v1);
        Object[] arr_object = Util.J1(this.f, adPlaybackState$AdGroup0);
        System.arraycopy(((AdGroup[])arr_object), v2, ((AdGroup[])arr_object), v2 + 1, this.f.length - v2);
        ((AdGroup[])arr_object)[v2] = adPlaybackState$AdGroup0;
        return new AdPlaybackState(this.a, ((AdGroup[])arr_object), this.c, this.d, this.e);
    }

    class androidx.media3.common.AdPlaybackState.1 {
    }

}

