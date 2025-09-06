package androidx.media3.common;

import O1.a;
import O1.l;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class MediaItem {
    public static final class AdsConfiguration {
        public static final class Builder {
            private Uri a;
            @Nullable
            private Object b;

            public Builder(Uri uri0) {
                this.a = uri0;
            }

            public AdsConfiguration c() {
                return new AdsConfiguration(this, null);
            }

            @a
            public Builder d(Uri uri0) {
                this.a = uri0;
                return this;
            }

            @a
            public Builder e(@Nullable Object object0) {
                this.b = object0;
                return this;
            }
        }

        public final Uri a;
        @Nullable
        public final Object b;
        private static final String c;

        static {
            AdsConfiguration.c = "0";
        }

        private AdsConfiguration(Builder mediaItem$AdsConfiguration$Builder0) {
            this.a = mediaItem$AdsConfiguration$Builder0.a;
            this.b = mediaItem$AdsConfiguration$Builder0.b;
        }

        AdsConfiguration(Builder mediaItem$AdsConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$AdsConfiguration$Builder0);
        }

        public Builder a() {
            return new Builder(this.a).e(this.b);
        }

        @UnstableApi
        public static AdsConfiguration b(Bundle bundle0) {
            Uri uri0 = (Uri)bundle0.getParcelable(AdsConfiguration.c);
            Assertions.g(uri0);
            return new Builder(uri0).c();
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("0", this.a);
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof AdsConfiguration ? this.a.equals(((AdsConfiguration)object0).a) && Util.g(this.b, ((AdsConfiguration)object0).b) : false;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }
    }

    public static final class androidx.media3.common.MediaItem.Builder {
        @Nullable
        private String a;
        @Nullable
        private Uri b;
        @Nullable
        private String c;
        private androidx.media3.common.MediaItem.ClippingConfiguration.Builder d;
        private androidx.media3.common.MediaItem.DrmConfiguration.Builder e;
        private List f;
        @Nullable
        private String g;
        private O2 h;
        @Nullable
        private AdsConfiguration i;
        @Nullable
        private Object j;
        private long k;
        @Nullable
        private MediaMetadata l;
        private androidx.media3.common.MediaItem.LiveConfiguration.Builder m;
        private RequestMetadata n;

        public androidx.media3.common.MediaItem.Builder() {
            this.d = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            this.e = new androidx.media3.common.MediaItem.DrmConfiguration.Builder(null);
            this.f = Collections.emptyList();
            this.h = O2.A();
            this.m = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            this.n = RequestMetadata.d;
            this.k = 0x8000000000000001L;
        }

        private androidx.media3.common.MediaItem.Builder(MediaItem mediaItem0) {
            this.d = mediaItem0.f.a();
            this.a = mediaItem0.a;
            this.l = mediaItem0.e;
            this.m = mediaItem0.d.a();
            this.n = mediaItem0.h;
            LocalConfiguration mediaItem$LocalConfiguration0 = mediaItem0.b;
            if(mediaItem$LocalConfiguration0 != null) {
                this.g = mediaItem$LocalConfiguration0.f;
                this.c = mediaItem$LocalConfiguration0.b;
                this.b = mediaItem$LocalConfiguration0.a;
                this.f = mediaItem$LocalConfiguration0.e;
                this.h = mediaItem$LocalConfiguration0.g;
                this.j = mediaItem$LocalConfiguration0.i;
                this.e = mediaItem$LocalConfiguration0.c == null ? new androidx.media3.common.MediaItem.DrmConfiguration.Builder(null) : mediaItem$LocalConfiguration0.c.b();
                this.i = mediaItem$LocalConfiguration0.d;
                this.k = mediaItem$LocalConfiguration0.j;
            }
        }

        androidx.media3.common.MediaItem.Builder(MediaItem mediaItem0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem0);
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder A(float f) {
            this.m.h(f);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder B(long v) {
            this.m.i(v);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder C(float f) {
            this.m.j(f);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder D(long v) {
            this.m.k(v);
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder E(String s) {
            this.a = (String)Assertions.g(s);
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder F(MediaMetadata mediaMetadata0) {
            this.l = mediaMetadata0;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder G(@Nullable String s) {
            this.c = s;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder H(RequestMetadata mediaItem$RequestMetadata0) {
            this.n = mediaItem$RequestMetadata0;
            return this;
        }

        @a
        @UnstableApi
        public androidx.media3.common.MediaItem.Builder I(@Nullable List list0) {
            this.f = list0 == null || list0.isEmpty() ? Collections.emptyList() : DesugarCollections.unmodifiableList(new ArrayList(list0));
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder J(List list0) {
            this.h = O2.r(list0);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder K(@Nullable List list0) {
            this.h = list0 == null ? O2.A() : O2.r(list0);
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder L(@Nullable Object object0) {
            this.j = object0;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder M(@Nullable Uri uri0) {
            this.b = uri0;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder N(@Nullable String s) {
            return s == null ? this.M(null) : this.M(Uri.parse(s));
        }

        public MediaItem a() {
            LocalConfiguration mediaItem$LocalConfiguration0;
            Assertions.i(this.e.b == null || this.e.a != null);
            Uri uri0 = this.b;
            DrmConfiguration mediaItem$DrmConfiguration0 = null;
            if(uri0 == null) {
                mediaItem$LocalConfiguration0 = null;
            }
            else {
                String s = this.c;
                if(this.e.a != null) {
                    mediaItem$DrmConfiguration0 = this.e.j();
                }
                mediaItem$LocalConfiguration0 = new LocalConfiguration(uri0, s, mediaItem$DrmConfiguration0, this.i, this.f, this.g, this.h, this.j, this.k, null);
            }
            String s1 = this.a == null ? "" : this.a;
            ClippingProperties mediaItem$ClippingProperties0 = this.d.g();
            LiveConfiguration mediaItem$LiveConfiguration0 = this.m.f();
            MediaMetadata mediaMetadata0 = this.l;
            return mediaMetadata0 == null ? new MediaItem(s1, mediaItem$ClippingProperties0, mediaItem$LocalConfiguration0, mediaItem$LiveConfiguration0, MediaMetadata.W0, this.n, null) : new MediaItem(s1, mediaItem$ClippingProperties0, mediaItem$LocalConfiguration0, mediaItem$LiveConfiguration0, mediaMetadata0, this.n, null);
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder b(@Nullable Uri uri0) {
            return this.c(uri0, null);
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder c(@Nullable Uri uri0, @Nullable Object object0) {
            this.i = uri0 == null ? null : new Builder(uri0).e(object0).c();
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder d(@Nullable String s) {
            return s == null ? this.b(null) : this.b(Uri.parse(s));
        }

        @a
        public androidx.media3.common.MediaItem.Builder e(@Nullable AdsConfiguration mediaItem$AdsConfiguration0) {
            this.i = mediaItem$AdsConfiguration0;
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder f(long v) {
            this.d.h(v);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder g(boolean z) {
            this.d.j(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder h(boolean z) {
            this.d.k(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder i(@IntRange(from = 0L) long v) {
            this.d.l(v);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder j(boolean z) {
            this.d.n(z);
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder k(ClippingConfiguration mediaItem$ClippingConfiguration0) {
            this.d = mediaItem$ClippingConfiguration0.a();
            return this;
        }

        @a
        @UnstableApi
        public androidx.media3.common.MediaItem.Builder l(@Nullable String s) {
            this.g = s;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder m(@Nullable DrmConfiguration mediaItem$DrmConfiguration0) {
            this.e = mediaItem$DrmConfiguration0 == null ? new androidx.media3.common.MediaItem.DrmConfiguration.Builder(null) : mediaItem$DrmConfiguration0.b();
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder n(boolean z) {
            this.e.l(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder o(@Nullable byte[] arr_b) {
            this.e.o(arr_b);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder p(@Nullable Map map0) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder mediaItem$DrmConfiguration$Builder0 = this.e;
            if(map0 == null) {
                map0 = Q2.u();
            }
            mediaItem$DrmConfiguration$Builder0.p(map0);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder q(@Nullable Uri uri0) {
            this.e.q(uri0);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder r(@Nullable String s) {
            this.e.r(s);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder s(boolean z) {
            this.e.s(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder t(boolean z) {
            this.e.u(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder u(boolean z) {
            this.e.m(z);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder v(@Nullable List list0) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder mediaItem$DrmConfiguration$Builder0 = this.e;
            if(list0 == null) {
                list0 = O2.A();
            }
            mediaItem$DrmConfiguration$Builder0.n(list0);
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder w(@Nullable UUID uUID0) {
            this.e.t(uUID0);
            return this;
        }

        @a
        @UnstableApi
        public androidx.media3.common.MediaItem.Builder x(long v) {
            Assertions.a(v > 0L || v == 0x8000000000000001L);
            this.k = v;
            return this;
        }

        @a
        public androidx.media3.common.MediaItem.Builder y(LiveConfiguration mediaItem$LiveConfiguration0) {
            this.m = mediaItem$LiveConfiguration0.a();
            return this;
        }

        @a
        @UnstableApi
        @Deprecated
        public androidx.media3.common.MediaItem.Builder z(long v) {
            this.m.g(v);
            return this;
        }
    }

    public static class ClippingConfiguration {
        public static final class androidx.media3.common.MediaItem.ClippingConfiguration.Builder {
            private long a;
            private long b;
            private boolean c;
            private boolean d;
            private boolean e;

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder() {
                this.b = 0x8000000000000000L;
            }

            private androidx.media3.common.MediaItem.ClippingConfiguration.Builder(ClippingConfiguration mediaItem$ClippingConfiguration0) {
                this.a = mediaItem$ClippingConfiguration0.b;
                this.b = mediaItem$ClippingConfiguration0.d;
                this.c = mediaItem$ClippingConfiguration0.e;
                this.d = mediaItem$ClippingConfiguration0.f;
                this.e = mediaItem$ClippingConfiguration0.g;
            }

            androidx.media3.common.MediaItem.ClippingConfiguration.Builder(ClippingConfiguration mediaItem$ClippingConfiguration0, androidx.media3.common.MediaItem.1 mediaItem$10) {
                this(mediaItem$ClippingConfiguration0);
            }

            public ClippingConfiguration f() {
                return new ClippingConfiguration(this, null);
            }

            @UnstableApi
            @Deprecated
            public ClippingProperties g() {
                return new ClippingProperties(this, null);
            }

            @a
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder h(long v) {
                return this.i(Util.F1(v));
            }

            @a
            @UnstableApi
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder i(long v) {
                Assertions.a(v == 0x8000000000000000L || v >= 0L);
                this.b = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder j(boolean z) {
                this.d = z;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder k(boolean z) {
                this.c = z;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder l(@IntRange(from = 0L) long v) {
                return this.m(Util.F1(v));
            }

            @a
            @UnstableApi
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder m(@IntRange(from = 0L) long v) {
                Assertions.a(v >= 0L);
                this.a = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder n(boolean z) {
                this.e = z;
                return this;
            }
        }

        @IntRange(from = 0L)
        public final long a;
        @IntRange(from = 0L)
        @UnstableApi
        public final long b;
        public final long c;
        @UnstableApi
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public static final ClippingConfiguration h;
        private static final String i;
        private static final String j;
        private static final String k;
        private static final String l;
        private static final String m;
        static final String n;
        static final String o;

        static {
            ClippingConfiguration.h = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().f();
            ClippingConfiguration.i = "0";
            ClippingConfiguration.j = "1";
            ClippingConfiguration.k = "2";
            ClippingConfiguration.l = "3";
            ClippingConfiguration.m = "4";
            ClippingConfiguration.n = "5";
            ClippingConfiguration.o = "6";
        }

        private ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder0) {
            this.a = Util.B2(mediaItem$ClippingConfiguration$Builder0.a);
            this.c = Util.B2(mediaItem$ClippingConfiguration$Builder0.b);
            this.b = mediaItem$ClippingConfiguration$Builder0.a;
            this.d = mediaItem$ClippingConfiguration$Builder0.b;
            this.e = mediaItem$ClippingConfiguration$Builder0.c;
            this.f = mediaItem$ClippingConfiguration$Builder0.d;
            this.g = mediaItem$ClippingConfiguration$Builder0.e;
        }

        ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$ClippingConfiguration$Builder0);
        }

        public androidx.media3.common.MediaItem.ClippingConfiguration.Builder a() {
            return new androidx.media3.common.MediaItem.ClippingConfiguration.Builder(this, null);
        }

        @UnstableApi
        public static ClippingProperties b(Bundle bundle0) {
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder0 = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            ClippingConfiguration mediaItem$ClippingConfiguration0 = ClippingConfiguration.h;
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder1 = mediaItem$ClippingConfiguration$Builder0.l(bundle0.getLong("0", mediaItem$ClippingConfiguration0.a)).h(bundle0.getLong("1", mediaItem$ClippingConfiguration0.c)).k(bundle0.getBoolean("2", mediaItem$ClippingConfiguration0.e)).j(bundle0.getBoolean("3", mediaItem$ClippingConfiguration0.f)).n(bundle0.getBoolean("4", mediaItem$ClippingConfiguration0.g));
            long v = bundle0.getLong("5", mediaItem$ClippingConfiguration0.b);
            if(v != mediaItem$ClippingConfiguration0.b) {
                mediaItem$ClippingConfiguration$Builder1.m(v);
            }
            long v1 = bundle0.getLong("6", mediaItem$ClippingConfiguration0.d);
            if(v1 != mediaItem$ClippingConfiguration0.d) {
                mediaItem$ClippingConfiguration$Builder1.i(v1);
            }
            return mediaItem$ClippingConfiguration$Builder1.g();
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            long v = this.a;
            ClippingConfiguration mediaItem$ClippingConfiguration0 = ClippingConfiguration.h;
            if(v != mediaItem$ClippingConfiguration0.a) {
                bundle0.putLong("0", v);
            }
            long v1 = this.c;
            if(v1 != mediaItem$ClippingConfiguration0.c) {
                bundle0.putLong("1", v1);
            }
            long v2 = this.b;
            if(v2 != mediaItem$ClippingConfiguration0.b) {
                bundle0.putLong("5", v2);
            }
            long v3 = this.d;
            if(v3 != mediaItem$ClippingConfiguration0.d) {
                bundle0.putLong("6", v3);
            }
            boolean z = this.e;
            if(z != mediaItem$ClippingConfiguration0.e) {
                bundle0.putBoolean("2", z);
            }
            boolean z1 = this.f;
            if(z1 != mediaItem$ClippingConfiguration0.f) {
                bundle0.putBoolean("3", z1);
            }
            boolean z2 = this.g;
            if(z2 != mediaItem$ClippingConfiguration0.g) {
                bundle0.putBoolean("4", z2);
            }
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ClippingConfiguration ? this.b == ((ClippingConfiguration)object0).b && this.d == ((ClippingConfiguration)object0).d && this.e == ((ClippingConfiguration)object0).e && this.f == ((ClippingConfiguration)object0).f && this.g == ((ClippingConfiguration)object0).g : false;
        }

        @Override
        public int hashCode() {
            return (((((int)(this.b ^ this.b >>> 0x20)) * 0x1F + ((int)(this.d ^ this.d >>> 0x20))) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g;
        }
    }

    @UnstableApi
    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        public static final ClippingProperties p;

        static {
            ClippingProperties.p = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().g();
        }

        private ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder0) {
            super(mediaItem$ClippingConfiguration$Builder0, null);
        }

        ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder mediaItem$ClippingConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$ClippingConfiguration$Builder0);
        }
    }

    public static final class DrmConfiguration {
        public static final class androidx.media3.common.MediaItem.DrmConfiguration.Builder {
            @Nullable
            private UUID a;
            @Nullable
            private Uri b;
            private Q2 c;
            private boolean d;
            private boolean e;
            private boolean f;
            private O2 g;
            @Nullable
            private byte[] h;

            @Deprecated
            private androidx.media3.common.MediaItem.DrmConfiguration.Builder() {
                this.c = Q2.u();
                this.e = true;
                this.g = O2.A();
            }

            androidx.media3.common.MediaItem.DrmConfiguration.Builder(androidx.media3.common.MediaItem.1 mediaItem$10) {
            }

            private androidx.media3.common.MediaItem.DrmConfiguration.Builder(DrmConfiguration mediaItem$DrmConfiguration0) {
                this.a = mediaItem$DrmConfiguration0.a;
                this.b = mediaItem$DrmConfiguration0.c;
                this.c = mediaItem$DrmConfiguration0.e;
                this.d = mediaItem$DrmConfiguration0.f;
                this.e = mediaItem$DrmConfiguration0.g;
                this.f = mediaItem$DrmConfiguration0.h;
                this.g = mediaItem$DrmConfiguration0.j;
                this.h = mediaItem$DrmConfiguration0.k;
            }

            androidx.media3.common.MediaItem.DrmConfiguration.Builder(DrmConfiguration mediaItem$DrmConfiguration0, androidx.media3.common.MediaItem.1 mediaItem$10) {
                this(mediaItem$DrmConfiguration0);
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder(UUID uUID0) {
                this.a = uUID0;
            }

            public DrmConfiguration j() {
                return new DrmConfiguration(this, null);
            }

            @a
            @l(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            @UnstableApi
            @Deprecated
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder k(boolean z) {
                return this.m(z);
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder l(boolean z) {
                this.f = z;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder m(boolean z) {
                this.n((z ? O2.C(2, 1) : O2.A()));
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder n(List list0) {
                this.g = O2.r(list0);
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder o(@Nullable byte[] arr_b) {
                this.h = arr_b == null ? null : Arrays.copyOf(arr_b, arr_b.length);
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder p(Map map0) {
                this.c = Q2.g(map0);
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder q(@Nullable Uri uri0) {
                this.b = uri0;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder r(@Nullable String s) {
                this.b = s == null ? null : Uri.parse(s);
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder s(boolean z) {
                this.d = z;
                return this;
            }

            @a
            @Deprecated
            private androidx.media3.common.MediaItem.DrmConfiguration.Builder t(@Nullable UUID uUID0) {
                this.a = uUID0;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder u(boolean z) {
                this.e = z;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder v(UUID uUID0) {
                this.a = uUID0;
                return this;
            }
        }

        public final UUID a;
        @UnstableApi
        @Deprecated
        public final UUID b;
        @Nullable
        public final Uri c;
        @UnstableApi
        @Deprecated
        public final Q2 d;
        public final Q2 e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        @UnstableApi
        @Deprecated
        public final O2 i;
        public final O2 j;
        @Nullable
        private final byte[] k;
        private static final String l;
        private static final String m;
        private static final String n;
        private static final String o;
        @VisibleForTesting
        static final String p;
        private static final String q;
        private static final String r;
        private static final String s;

        static {
            DrmConfiguration.l = "0";
            DrmConfiguration.m = "1";
            DrmConfiguration.n = "2";
            DrmConfiguration.o = "3";
            DrmConfiguration.p = "4";
            DrmConfiguration.q = "5";
            DrmConfiguration.r = "6";
            DrmConfiguration.s = "7";
        }

        private DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder mediaItem$DrmConfiguration$Builder0) {
            Assertions.i(!mediaItem$DrmConfiguration$Builder0.f || mediaItem$DrmConfiguration$Builder0.b != null);
            UUID uUID0 = (UUID)Assertions.g(mediaItem$DrmConfiguration$Builder0.a);
            this.a = uUID0;
            this.b = uUID0;
            this.c = mediaItem$DrmConfiguration$Builder0.b;
            this.d = mediaItem$DrmConfiguration$Builder0.c;
            this.e = mediaItem$DrmConfiguration$Builder0.c;
            this.f = mediaItem$DrmConfiguration$Builder0.d;
            this.h = mediaItem$DrmConfiguration$Builder0.f;
            this.g = mediaItem$DrmConfiguration$Builder0.e;
            this.i = mediaItem$DrmConfiguration$Builder0.g;
            this.j = mediaItem$DrmConfiguration$Builder0.g;
            this.k = mediaItem$DrmConfiguration$Builder0.h == null ? null : Arrays.copyOf(mediaItem$DrmConfiguration$Builder0.h, mediaItem$DrmConfiguration$Builder0.h.length);
        }

        DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder mediaItem$DrmConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$DrmConfiguration$Builder0);
        }

        public androidx.media3.common.MediaItem.DrmConfiguration.Builder b() {
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(this, null);
        }

        @UnstableApi
        public static DrmConfiguration c(Bundle bundle0) {
            UUID uUID0 = UUID.fromString(((String)Assertions.g(bundle0.getString(DrmConfiguration.l))));
            Uri uri0 = (Uri)bundle0.getParcelable(DrmConfiguration.m);
            Q2 q20 = BundleCollectionUtil.b(BundleCollectionUtil.f(bundle0, DrmConfiguration.n, Bundle.EMPTY));
            boolean z = bundle0.getBoolean(DrmConfiguration.o, false);
            boolean z1 = bundle0.getBoolean(DrmConfiguration.p, false);
            boolean z2 = bundle0.getBoolean(DrmConfiguration.q, false);
            ArrayList arrayList0 = new ArrayList();
            O2 o20 = O2.r(BundleCollectionUtil.g(bundle0, DrmConfiguration.r, arrayList0));
            byte[] arr_b = bundle0.getByteArray(DrmConfiguration.s);
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(uUID0).q(uri0).p(q20).s(z).l(z2).u(z1).n(o20).o(arr_b).j();
        }

        @Nullable
        public byte[] d() {
            return this.k == null ? null : Arrays.copyOf(this.k, this.k.length);
        }

        @UnstableApi
        public Bundle e() {
            Bundle bundle0 = new Bundle();
            bundle0.putString("0", this.a.toString());
            Uri uri0 = this.c;
            if(uri0 != null) {
                bundle0.putParcelable("1", uri0);
            }
            if(!this.e.isEmpty()) {
                bundle0.putBundle("2", BundleCollectionUtil.h(this.e));
            }
            if(this.f) {
                bundle0.putBoolean("3", true);
            }
            if(this.g) {
                bundle0.putBoolean("4", true);
            }
            if(this.h) {
                bundle0.putBoolean("5", true);
            }
            if(!this.j.isEmpty()) {
                bundle0.putIntegerArrayList("6", new ArrayList(this.j));
            }
            byte[] arr_b = this.k;
            if(arr_b != null) {
                bundle0.putByteArray("7", arr_b);
            }
            return bundle0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DrmConfiguration ? this.a.equals(((DrmConfiguration)object0).a) && Util.g(this.c, ((DrmConfiguration)object0).c) && Util.g(this.e, ((DrmConfiguration)object0).e) && this.f == ((DrmConfiguration)object0).f && this.h == ((DrmConfiguration)object0).h && this.g == ((DrmConfiguration)object0).g && this.j.equals(((DrmConfiguration)object0).j) && Arrays.equals(this.k, ((DrmConfiguration)object0).k) : false;
        }

        @Override
        public int hashCode() {
            int v = Arrays.hashCode(this.k);
            return ((((((this.a.hashCode() * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.e.hashCode()) * 0x1F + this.f) * 0x1F + this.h) * 0x1F + this.g) * 0x1F + this.j.hashCode()) * 0x1F + v;
        }
    }

    public static final class LiveConfiguration {
        public static final class androidx.media3.common.MediaItem.LiveConfiguration.Builder {
            private long a;
            private long b;
            private long c;
            private float d;
            private float e;

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder() {
                this.a = 0x8000000000000001L;
                this.b = 0x8000000000000001L;
                this.c = 0x8000000000000001L;
                this.d = -3.402823E+38f;
                this.e = -3.402823E+38f;
            }

            private androidx.media3.common.MediaItem.LiveConfiguration.Builder(LiveConfiguration mediaItem$LiveConfiguration0) {
                this.a = mediaItem$LiveConfiguration0.a;
                this.b = mediaItem$LiveConfiguration0.b;
                this.c = mediaItem$LiveConfiguration0.c;
                this.d = mediaItem$LiveConfiguration0.d;
                this.e = mediaItem$LiveConfiguration0.e;
            }

            androidx.media3.common.MediaItem.LiveConfiguration.Builder(LiveConfiguration mediaItem$LiveConfiguration0, androidx.media3.common.MediaItem.1 mediaItem$10) {
                this(mediaItem$LiveConfiguration0);
            }

            public LiveConfiguration f() {
                return new LiveConfiguration(this, null);
            }

            @a
            public androidx.media3.common.MediaItem.LiveConfiguration.Builder g(long v) {
                this.c = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.LiveConfiguration.Builder h(float f) {
                this.e = f;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.LiveConfiguration.Builder i(long v) {
                this.b = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.LiveConfiguration.Builder j(float f) {
                this.d = f;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.LiveConfiguration.Builder k(long v) {
                this.a = v;
                return this;
            }
        }

        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;
        public static final LiveConfiguration f;
        private static final String g;
        private static final String h;
        private static final String i;
        private static final String j;
        private static final String k;

        static {
            LiveConfiguration.f = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().f();
            LiveConfiguration.g = "0";
            LiveConfiguration.h = "1";
            LiveConfiguration.i = "2";
            LiveConfiguration.j = "3";
            LiveConfiguration.k = "4";
        }

        @UnstableApi
        @Deprecated
        public LiveConfiguration(long v, long v1, long v2, float f, float f1) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = f;
            this.e = f1;
        }

        private LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder mediaItem$LiveConfiguration$Builder0) {
            this(mediaItem$LiveConfiguration$Builder0.a, mediaItem$LiveConfiguration$Builder0.b, mediaItem$LiveConfiguration$Builder0.c, mediaItem$LiveConfiguration$Builder0.d, mediaItem$LiveConfiguration$Builder0.e);
        }

        LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder mediaItem$LiveConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$LiveConfiguration$Builder0);
        }

        public androidx.media3.common.MediaItem.LiveConfiguration.Builder a() {
            return new androidx.media3.common.MediaItem.LiveConfiguration.Builder(this, null);
        }

        @UnstableApi
        public static LiveConfiguration b(Bundle bundle0) {
            return new androidx.media3.common.MediaItem.LiveConfiguration.Builder().k(bundle0.getLong(LiveConfiguration.g, LiveConfiguration.f.a)).i(bundle0.getLong(LiveConfiguration.h, LiveConfiguration.f.b)).g(bundle0.getLong(LiveConfiguration.i, LiveConfiguration.f.c)).j(bundle0.getFloat(LiveConfiguration.j, LiveConfiguration.f.d)).h(bundle0.getFloat(LiveConfiguration.k, LiveConfiguration.f.e)).f();
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            long v = this.a;
            LiveConfiguration mediaItem$LiveConfiguration0 = LiveConfiguration.f;
            if(v != mediaItem$LiveConfiguration0.a) {
                bundle0.putLong("0", v);
            }
            long v1 = this.b;
            if(v1 != mediaItem$LiveConfiguration0.b) {
                bundle0.putLong("1", v1);
            }
            long v2 = this.c;
            if(v2 != mediaItem$LiveConfiguration0.c) {
                bundle0.putLong("2", v2);
            }
            float f = this.d;
            if(f != mediaItem$LiveConfiguration0.d) {
                bundle0.putFloat("3", f);
            }
            float f1 = this.e;
            if(f1 != mediaItem$LiveConfiguration0.e) {
                bundle0.putFloat("4", f1);
            }
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LiveConfiguration ? this.a == ((LiveConfiguration)object0).a && this.b == ((LiveConfiguration)object0).b && this.c == ((LiveConfiguration)object0).c && this.d == ((LiveConfiguration)object0).d && this.e == ((LiveConfiguration)object0).e : false;
        }

        @Override
        public int hashCode() {
            int v = ((((int)(this.a ^ this.a >>> 0x20)) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F;
            int v1 = 0;
            int v2 = this.d == 0.0f ? 0 : Float.floatToIntBits(this.d);
            float f = this.e;
            if(f != 0.0f) {
                v1 = Float.floatToIntBits(f);
            }
            return (v + v2) * 0x1F + v1;
        }
    }

    public static final class LocalConfiguration {
        public final Uri a;
        @Nullable
        public final String b;
        @Nullable
        public final DrmConfiguration c;
        @Nullable
        public final AdsConfiguration d;
        @UnstableApi
        public final List e;
        @Nullable
        @UnstableApi
        public final String f;
        public final O2 g;
        @UnstableApi
        @Deprecated
        public final List h;
        @Nullable
        public final Object i;
        @UnstableApi
        public final long j;
        private static final String k;
        private static final String l;
        private static final String m;
        private static final String n;
        private static final String o;
        private static final String p;
        private static final String q;
        private static final String r;

        static {
            LocalConfiguration.k = "0";
            LocalConfiguration.l = "1";
            LocalConfiguration.m = "2";
            LocalConfiguration.n = "3";
            LocalConfiguration.o = "4";
            LocalConfiguration.p = "5";
            LocalConfiguration.q = "6";
            LocalConfiguration.r = "7";
        }

        private LocalConfiguration(Uri uri0, @Nullable String s, @Nullable DrmConfiguration mediaItem$DrmConfiguration0, @Nullable AdsConfiguration mediaItem$AdsConfiguration0, List list0, @Nullable String s1, O2 o20, @Nullable Object object0, long v) {
            this.a = uri0;
            this.b = MimeTypes.v(s);
            this.c = mediaItem$DrmConfiguration0;
            this.d = mediaItem$AdsConfiguration0;
            this.e = list0;
            this.f = s1;
            this.g = o20;
            com.google.common.collect.O2.a o2$a0 = O2.n();
            for(int v1 = 0; v1 < o20.size(); ++v1) {
                o2$a0.j(((SubtitleConfiguration)o20.get(v1)).a().j());
            }
            this.h = o2$a0.n();
            this.i = object0;
            this.j = v;
        }

        LocalConfiguration(Uri uri0, String s, DrmConfiguration mediaItem$DrmConfiguration0, AdsConfiguration mediaItem$AdsConfiguration0, List list0, String s1, O2 o20, Object object0, long v, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(uri0, s, mediaItem$DrmConfiguration0, mediaItem$AdsConfiguration0, list0, s1, o20, object0, v);
        }

        @UnstableApi
        public static LocalConfiguration a(Bundle bundle0) {
            Bundle bundle1 = bundle0.getBundle("2");
            AdsConfiguration mediaItem$AdsConfiguration0 = null;
            DrmConfiguration mediaItem$DrmConfiguration0 = bundle1 == null ? null : DrmConfiguration.c(bundle1);
            Bundle bundle2 = bundle0.getBundle("3");
            if(bundle2 != null) {
                mediaItem$AdsConfiguration0 = AdsConfiguration.b(bundle2);
            }
            ArrayList arrayList0 = bundle0.getParcelableArrayList("4");
            O2 o20 = arrayList0 == null ? O2.A() : BundleCollectionUtil.d(new androidx.media3.common.l(), arrayList0);
            ArrayList arrayList1 = bundle0.getParcelableArrayList("6");
            O2 o21 = arrayList1 == null ? O2.A() : BundleCollectionUtil.d(new m(), arrayList1);
            long v = bundle0.getLong("7", 0x8000000000000001L);
            return new LocalConfiguration(((Uri)Assertions.g(((Uri)bundle0.getParcelable("0")))), bundle0.getString("1"), mediaItem$DrmConfiguration0, mediaItem$AdsConfiguration0, o20, bundle0.getString("5"), o21, null, v);
        }

        @UnstableApi
        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("0", this.a);
            String s = this.b;
            if(s != null) {
                bundle0.putString("1", s);
            }
            DrmConfiguration mediaItem$DrmConfiguration0 = this.c;
            if(mediaItem$DrmConfiguration0 != null) {
                bundle0.putBundle("2", mediaItem$DrmConfiguration0.e());
            }
            AdsConfiguration mediaItem$AdsConfiguration0 = this.d;
            if(mediaItem$AdsConfiguration0 != null) {
                bundle0.putBundle("3", mediaItem$AdsConfiguration0.c());
            }
            if(!this.e.isEmpty()) {
                j j0 = new j();
                bundle0.putParcelableArrayList("4", BundleCollectionUtil.i(this.e, j0));
            }
            String s1 = this.f;
            if(s1 != null) {
                bundle0.putString("5", s1);
            }
            if(!this.g.isEmpty()) {
                k k0 = new k();
                bundle0.putParcelableArrayList("6", BundleCollectionUtil.i(this.g, k0));
            }
            long v = this.j;
            if(v != 0x8000000000000001L) {
                bundle0.putLong("7", v);
            }
            return bundle0;
        }

        // 去混淆评级： 低(33)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LocalConfiguration ? this.a.equals(((LocalConfiguration)object0).a) && Util.g(this.b, ((LocalConfiguration)object0).b) && Util.g(this.c, ((LocalConfiguration)object0).c) && Util.g(this.d, ((LocalConfiguration)object0).d) && this.e.equals(((LocalConfiguration)object0).e) && Util.g(this.f, ((LocalConfiguration)object0).f) && this.g.equals(((LocalConfiguration)object0).g) && Util.g(this.i, ((LocalConfiguration)object0).i) && Util.g(this.j, ((LocalConfiguration)object0).j) : false;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d == null ? 0 : this.d.hashCode();
            int v5 = this.e.hashCode();
            int v6 = this.f == null ? 0 : this.f.hashCode();
            int v7 = this.g.hashCode();
            Object object0 = this.i;
            if(object0 != null) {
                v1 = object0.hashCode();
            }
            return (int)(((long)(((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v1)) * 0x1FL + this.j);
        }
    }

    public static final class RequestMetadata {
        public static final class androidx.media3.common.MediaItem.RequestMetadata.Builder {
            @Nullable
            private Uri a;
            @Nullable
            private String b;
            @Nullable
            private Bundle c;

            public androidx.media3.common.MediaItem.RequestMetadata.Builder() {
            }

            private androidx.media3.common.MediaItem.RequestMetadata.Builder(RequestMetadata mediaItem$RequestMetadata0) {
                this.a = mediaItem$RequestMetadata0.a;
                this.b = mediaItem$RequestMetadata0.b;
                this.c = mediaItem$RequestMetadata0.c;
            }

            androidx.media3.common.MediaItem.RequestMetadata.Builder(RequestMetadata mediaItem$RequestMetadata0, androidx.media3.common.MediaItem.1 mediaItem$10) {
                this(mediaItem$RequestMetadata0);
            }

            public RequestMetadata d() {
                return new RequestMetadata(this, null);
            }

            @a
            public androidx.media3.common.MediaItem.RequestMetadata.Builder e(@Nullable Bundle bundle0) {
                this.c = bundle0;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.RequestMetadata.Builder f(@Nullable Uri uri0) {
                this.a = uri0;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.RequestMetadata.Builder g(@Nullable String s) {
                this.b = s;
                return this;
            }
        }

        @Nullable
        public final Uri a;
        @Nullable
        public final String b;
        @Nullable
        public final Bundle c;
        public static final RequestMetadata d;
        private static final String e;
        private static final String f;
        private static final String g;

        static {
            RequestMetadata.d = new androidx.media3.common.MediaItem.RequestMetadata.Builder().d();
            RequestMetadata.e = "0";
            RequestMetadata.f = "1";
            RequestMetadata.g = "2";
        }

        private RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder mediaItem$RequestMetadata$Builder0) {
            this.a = mediaItem$RequestMetadata$Builder0.a;
            this.b = mediaItem$RequestMetadata$Builder0.b;
            this.c = mediaItem$RequestMetadata$Builder0.c;
        }

        RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder mediaItem$RequestMetadata$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$RequestMetadata$Builder0);
        }

        public androidx.media3.common.MediaItem.RequestMetadata.Builder a() {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder(this, null);
        }

        // 去混淆评级： 中等(60)
        @UnstableApi
        public static RequestMetadata b(Bundle bundle0) {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder().f(((Uri)bundle0.getParcelable("0"))).g(bundle0.getString("1")).e(bundle0.getBundle("2")).d();
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            Uri uri0 = this.a;
            if(uri0 != null) {
                bundle0.putParcelable("0", uri0);
            }
            String s = this.b;
            if(s != null) {
                bundle0.putString("1", s);
            }
            Bundle bundle1 = this.c;
            if(bundle1 != null) {
                bundle0.putBundle("2", bundle1);
            }
            return bundle0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RequestMetadata)) {
                return false;
            }
            return !Util.g(this.a, ((RequestMetadata)object0).a) || !Util.g(this.b, ((RequestMetadata)object0).b) ? false : (this.c == null ? 1 : 0) == (((RequestMetadata)object0).c == null ? 1 : 0);
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            if(this.c != null) {
                v = 1;
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }
    }

    @UnstableApi
    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri0, String s, @Nullable String s1) {
            this(uri0, s, s1, 0);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri0, String s, @Nullable String s1, int v) {
            this(uri0, s, s1, v, 0, null);
        }

        @UnstableApi
        @Deprecated
        public Subtitle(Uri uri0, String s, @Nullable String s1, int v, int v1, @Nullable String s2) {
            super(uri0, s, s1, v, v1, s2, null, null);
        }

        private Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder mediaItem$SubtitleConfiguration$Builder0) {
            super(mediaItem$SubtitleConfiguration$Builder0, null);
        }

        Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder mediaItem$SubtitleConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$SubtitleConfiguration$Builder0);
        }
    }

    public static class SubtitleConfiguration {
        public static final class androidx.media3.common.MediaItem.SubtitleConfiguration.Builder {
            private Uri a;
            @Nullable
            private String b;
            @Nullable
            private String c;
            private int d;
            private int e;
            @Nullable
            private String f;
            @Nullable
            private String g;

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(Uri uri0) {
                this.a = uri0;
            }

            private androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(SubtitleConfiguration mediaItem$SubtitleConfiguration0) {
                this.a = mediaItem$SubtitleConfiguration0.a;
                this.b = mediaItem$SubtitleConfiguration0.b;
                this.c = mediaItem$SubtitleConfiguration0.c;
                this.d = mediaItem$SubtitleConfiguration0.d;
                this.e = mediaItem$SubtitleConfiguration0.e;
                this.f = mediaItem$SubtitleConfiguration0.f;
                this.g = mediaItem$SubtitleConfiguration0.g;
            }

            androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(SubtitleConfiguration mediaItem$SubtitleConfiguration0, androidx.media3.common.MediaItem.1 mediaItem$10) {
                this(mediaItem$SubtitleConfiguration0);
            }

            public SubtitleConfiguration i() {
                return new SubtitleConfiguration(this, null);
            }

            private Subtitle j() {
                return new Subtitle(this, null);
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder k(@Nullable String s) {
                this.g = s;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder l(@Nullable String s) {
                this.f = s;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder m(@Nullable String s) {
                this.c = s;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder n(@Nullable String s) {
                this.b = MimeTypes.v(s);
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder o(int v) {
                this.e = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder p(int v) {
                this.d = v;
                return this;
            }

            @a
            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder q(Uri uri0) {
                this.a = uri0;
                return this;
            }
        }

        public final Uri a;
        @Nullable
        public final String b;
        @Nullable
        public final String c;
        public final int d;
        public final int e;
        @Nullable
        public final String f;
        @Nullable
        public final String g;
        private static final String h;
        private static final String i;
        private static final String j;
        private static final String k;
        private static final String l;
        private static final String m;
        private static final String n;

        static {
            SubtitleConfiguration.h = "0";
            SubtitleConfiguration.i = "1";
            SubtitleConfiguration.j = "2";
            SubtitleConfiguration.k = "3";
            SubtitleConfiguration.l = "4";
            SubtitleConfiguration.m = "5";
            SubtitleConfiguration.n = "6";
        }

        private SubtitleConfiguration(Uri uri0, String s, @Nullable String s1, int v, int v1, @Nullable String s2, @Nullable String s3) {
            this.a = uri0;
            this.b = MimeTypes.v(s);
            this.c = s1;
            this.d = v;
            this.e = v1;
            this.f = s2;
            this.g = s3;
        }

        SubtitleConfiguration(Uri uri0, String s, String s1, int v, int v1, String s2, String s3, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(uri0, s, s1, v, v1, s2, s3);
        }

        private SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder mediaItem$SubtitleConfiguration$Builder0) {
            this.a = mediaItem$SubtitleConfiguration$Builder0.a;
            this.b = mediaItem$SubtitleConfiguration$Builder0.b;
            this.c = mediaItem$SubtitleConfiguration$Builder0.c;
            this.d = mediaItem$SubtitleConfiguration$Builder0.d;
            this.e = mediaItem$SubtitleConfiguration$Builder0.e;
            this.f = mediaItem$SubtitleConfiguration$Builder0.f;
            this.g = mediaItem$SubtitleConfiguration$Builder0.g;
        }

        SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder mediaItem$SubtitleConfiguration$Builder0, androidx.media3.common.MediaItem.1 mediaItem$10) {
            this(mediaItem$SubtitleConfiguration$Builder0);
        }

        public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder a() {
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(this, null);
        }

        @UnstableApi
        public static SubtitleConfiguration b(Bundle bundle0) {
            Uri uri0 = (Uri)Assertions.g(((Uri)bundle0.getParcelable("0")));
            String s = bundle0.getString("1");
            String s1 = bundle0.getString("2");
            int v = bundle0.getInt("3", 0);
            int v1 = bundle0.getInt("4", 0);
            String s2 = bundle0.getString("5");
            String s3 = bundle0.getString("6");
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(uri0).n(s).m(s1).p(v).o(v1).l(s2).k(s3).i();
        }

        @UnstableApi
        public Bundle c() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("0", this.a);
            String s = this.b;
            if(s != null) {
                bundle0.putString("1", s);
            }
            String s1 = this.c;
            if(s1 != null) {
                bundle0.putString("2", s1);
            }
            int v = this.d;
            if(v != 0) {
                bundle0.putInt("3", v);
            }
            int v1 = this.e;
            if(v1 != 0) {
                bundle0.putInt("4", v1);
            }
            String s2 = this.f;
            if(s2 != null) {
                bundle0.putString("5", s2);
            }
            String s3 = this.g;
            if(s3 != null) {
                bundle0.putString("6", s3);
            }
            return bundle0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SubtitleConfiguration ? this.a.equals(((SubtitleConfiguration)object0).a) && Util.g(this.b, ((SubtitleConfiguration)object0).b) && Util.g(this.c, ((SubtitleConfiguration)object0).c) && this.d == ((SubtitleConfiguration)object0).d && this.e == ((SubtitleConfiguration)object0).e && Util.g(this.f, ((SubtitleConfiguration)object0).f) && Util.g(this.g, ((SubtitleConfiguration)object0).g) : false;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = ((((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + this.d) * 0x1F + this.e) * 0x1F;
            int v2 = this.f == null ? 0 : this.f.hashCode();
            String s = this.g;
            if(s != null) {
                v = s.hashCode();
            }
            return (v1 + v2) * 0x1F + v;
        }
    }

    public final String a;
    @Nullable
    public final LocalConfiguration b;
    @Nullable
    @UnstableApi
    @Deprecated
    public final LocalConfiguration c;
    public final LiveConfiguration d;
    public final MediaMetadata e;
    public final ClippingConfiguration f;
    @UnstableApi
    @Deprecated
    public final ClippingProperties g;
    public final RequestMetadata h;
    public static final String i = "";
    public static final MediaItem j;
    private static final String k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;
    private static final String p;

    static {
        MediaItem.j = new androidx.media3.common.MediaItem.Builder().a();
        MediaItem.k = "0";
        MediaItem.l = "1";
        MediaItem.m = "2";
        MediaItem.n = "3";
        MediaItem.o = "4";
        MediaItem.p = "5";
    }

    private MediaItem(String s, ClippingProperties mediaItem$ClippingProperties0, @Nullable LocalConfiguration mediaItem$LocalConfiguration0, LiveConfiguration mediaItem$LiveConfiguration0, MediaMetadata mediaMetadata0, RequestMetadata mediaItem$RequestMetadata0) {
        this.a = s;
        this.b = mediaItem$LocalConfiguration0;
        this.c = mediaItem$LocalConfiguration0;
        this.d = mediaItem$LiveConfiguration0;
        this.e = mediaMetadata0;
        this.f = mediaItem$ClippingProperties0;
        this.g = mediaItem$ClippingProperties0;
        this.h = mediaItem$RequestMetadata0;
    }

    MediaItem(String s, ClippingProperties mediaItem$ClippingProperties0, LocalConfiguration mediaItem$LocalConfiguration0, LiveConfiguration mediaItem$LiveConfiguration0, MediaMetadata mediaMetadata0, RequestMetadata mediaItem$RequestMetadata0, androidx.media3.common.MediaItem.1 mediaItem$10) {
        this(s, mediaItem$ClippingProperties0, mediaItem$LocalConfiguration0, mediaItem$LiveConfiguration0, mediaMetadata0, mediaItem$RequestMetadata0);
    }

    public androidx.media3.common.MediaItem.Builder a() {
        return new androidx.media3.common.MediaItem.Builder(this, null);
    }

    @UnstableApi
    public static MediaItem b(Bundle bundle0) {
        Object object0 = Assertions.g(bundle0.getString("0", ""));
        Bundle bundle1 = bundle0.getBundle("1");
        LiveConfiguration mediaItem$LiveConfiguration0 = bundle1 == null ? LiveConfiguration.f : LiveConfiguration.b(bundle1);
        Bundle bundle2 = bundle0.getBundle("2");
        MediaMetadata mediaMetadata0 = bundle2 == null ? MediaMetadata.W0 : MediaMetadata.b(bundle2);
        Bundle bundle3 = bundle0.getBundle("3");
        ClippingProperties mediaItem$ClippingProperties0 = bundle3 == null ? ClippingProperties.p : ClippingConfiguration.b(bundle3);
        Bundle bundle4 = bundle0.getBundle("4");
        RequestMetadata mediaItem$RequestMetadata0 = bundle4 == null ? RequestMetadata.d : RequestMetadata.b(bundle4);
        Bundle bundle5 = bundle0.getBundle("5");
        return bundle5 == null ? new MediaItem(((String)object0), mediaItem$ClippingProperties0, null, mediaItem$LiveConfiguration0, mediaMetadata0, mediaItem$RequestMetadata0) : new MediaItem(((String)object0), mediaItem$ClippingProperties0, LocalConfiguration.a(bundle5), mediaItem$LiveConfiguration0, mediaMetadata0, mediaItem$RequestMetadata0);
    }

    public static MediaItem c(Uri uri0) {
        return new androidx.media3.common.MediaItem.Builder().M(uri0).a();
    }

    public static MediaItem d(String s) {
        return new androidx.media3.common.MediaItem.Builder().N(s).a();
    }

    @UnstableApi
    public Bundle e() {
        return this.f(false);
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MediaItem ? Util.g(this.a, ((MediaItem)object0).a) && this.f.equals(((MediaItem)object0).f) && Util.g(this.b, ((MediaItem)object0).b) && Util.g(this.d, ((MediaItem)object0).d) && Util.g(this.e, ((MediaItem)object0).e) && Util.g(this.h, ((MediaItem)object0).h) : false;
    }

    @UnstableApi
    private Bundle f(boolean z) {
        Bundle bundle0 = new Bundle();
        if(!this.a.equals("")) {
            bundle0.putString("0", this.a);
        }
        if(!this.d.equals(LiveConfiguration.f)) {
            bundle0.putBundle("1", this.d.c());
        }
        if(!this.e.equals(MediaMetadata.W0)) {
            bundle0.putBundle("2", this.e.e());
        }
        if(!this.f.equals(ClippingConfiguration.h)) {
            bundle0.putBundle("3", this.f.c());
        }
        if(!this.h.equals(RequestMetadata.d)) {
            bundle0.putBundle("4", this.h.c());
        }
        if(z) {
            LocalConfiguration mediaItem$LocalConfiguration0 = this.b;
            if(mediaItem$LocalConfiguration0 != null) {
                bundle0.putBundle("5", mediaItem$LocalConfiguration0.b());
            }
        }
        return bundle0;
    }

    @UnstableApi
    public Bundle g() {
        return this.f(true);
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (((v * 961 + this.d.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.h.hashCode() : ((((v * 0x1F + this.b.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.h.hashCode();
    }

    class androidx.media3.common.MediaItem.1 {
    }

}

