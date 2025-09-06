package androidx.media3.exoplayer.upstream;

import O1.a;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.base.y;
import com.google.common.collect.O2;
import com.google.common.collect.P2;
import com.google.common.collect.Q2.b;
import com.google.common.collect.Q2;
import com.google.common.collect.s;
import com.google.common.collect.u5;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

@UnstableApi
public final class CmcdData {
    static final class CmcdObject {
        public static final class Builder {
            private int a;
            private int b;
            private long c;
            @Nullable
            private String d;
            private O2 e;

            public Builder() {
                this.a = 0x80000001;
                this.b = 0x80000001;
                this.c = 0x8000000000000001L;
                this.e = O2.A();
            }

            public CmcdObject f() {
                return new CmcdObject(this, null);
            }

            @a
            public Builder g(int v) {
                Assertions.a(v >= 0 || v == 0x80000001);
                this.a = v;
                return this;
            }

            @a
            public Builder h(List list0) {
                this.e = O2.r(list0);
                return this;
            }

            @a
            public Builder i(long v) {
                Assertions.a(v >= 0L || v == 0x8000000000000001L);
                this.c = v;
                return this;
            }

            @a
            public Builder j(@Nullable String s) {
                this.d = s;
                return this;
            }

            @a
            public Builder k(int v) {
                Assertions.a(v >= 0 || v == 0x80000001);
                this.b = v;
                return this;
            }
        }

        public final int a;
        public final int b;
        public final long c;
        @Nullable
        public final String d;
        public final O2 e;

        private CmcdObject(Builder cmcdData$CmcdObject$Builder0) {
            this.a = cmcdData$CmcdObject$Builder0.a;
            this.b = cmcdData$CmcdObject$Builder0.b;
            this.c = cmcdData$CmcdObject$Builder0.c;
            this.d = cmcdData$CmcdObject$Builder0.d;
            this.e = cmcdData$CmcdObject$Builder0.e;
        }

        CmcdObject(Builder cmcdData$CmcdObject$Builder0, androidx.media3.exoplayer.upstream.CmcdData.1 cmcdData$10) {
            this(cmcdData$CmcdObject$Builder0);
        }

        public void a(s s0) {
            ArrayList arrayList0 = new ArrayList();
            if(this.a != 0x80000001) {
                arrayList0.add("br=" + this.a);
            }
            if(this.b != 0x80000001) {
                arrayList0.add("tb=" + this.b);
            }
            if(this.c != 0x8000000000000001L) {
                arrayList0.add("d=" + this.c);
            }
            if(!TextUtils.isEmpty(this.d)) {
                arrayList0.add("ot=" + this.d);
            }
            arrayList0.addAll(this.e);
            if(!arrayList0.isEmpty()) {
                s0.G("CMCD-Object", arrayList0);
            }
        }
    }

    static final class CmcdRequest {
        public static final class androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder {
            private long a;
            private long b;
            private long c;
            private boolean d;
            @Nullable
            private String e;
            @Nullable
            private String f;
            private O2 g;

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder() {
                this.a = 0x8000000000000001L;
                this.b = 0xFFFFFFFF80000001L;
                this.c = 0x8000000000000001L;
                this.g = O2.A();
            }

            public CmcdRequest h() {
                return new CmcdRequest(this, null);
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder i(long v) {
                Assertions.a(v >= 0L || v == 0x8000000000000001L);
                this.a = (v + 50L) / 100L * 100L;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder j(List list0) {
                this.g = O2.r(list0);
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder k(long v) {
                Assertions.a(v >= 0L || v == 0x8000000000000001L);
                this.c = (v + 50L) / 100L * 100L;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder l(long v) {
                Assertions.a(v >= 0L || v == 0xFFFFFFFF80000001L);
                this.b = (v + 50L) / 100L * 100L;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder m(@Nullable String s) {
                this.e = s == null ? null : Uri.encode(s);
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder n(@Nullable String s) {
                this.f = s;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder o(boolean z) {
                this.d = z;
                return this;
            }
        }

        public final long a;
        public final long b;
        public final long c;
        public final boolean d;
        @Nullable
        public final String e;
        @Nullable
        public final String f;
        public final O2 g;

        private CmcdRequest(androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder cmcdData$CmcdRequest$Builder0) {
            this.a = cmcdData$CmcdRequest$Builder0.a;
            this.b = cmcdData$CmcdRequest$Builder0.b;
            this.c = cmcdData$CmcdRequest$Builder0.c;
            this.d = cmcdData$CmcdRequest$Builder0.d;
            this.e = cmcdData$CmcdRequest$Builder0.e;
            this.f = cmcdData$CmcdRequest$Builder0.f;
            this.g = cmcdData$CmcdRequest$Builder0.g;
        }

        CmcdRequest(androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder cmcdData$CmcdRequest$Builder0, androidx.media3.exoplayer.upstream.CmcdData.1 cmcdData$10) {
            this(cmcdData$CmcdRequest$Builder0);
        }

        public void a(s s0) {
            ArrayList arrayList0 = new ArrayList();
            if(this.a != 0x8000000000000001L) {
                arrayList0.add("bl=" + this.a);
            }
            if(this.b != 0xFFFFFFFF80000001L) {
                arrayList0.add("mtp=" + this.b);
            }
            if(this.c != 0x8000000000000001L) {
                arrayList0.add("dl=" + this.c);
            }
            if(this.d) {
                arrayList0.add("su");
            }
            if(!TextUtils.isEmpty(this.e)) {
                arrayList0.add(Util.S("%s=\"%s\"", new Object[]{"nor", this.e}));
            }
            if(!TextUtils.isEmpty(this.f)) {
                arrayList0.add(Util.S("%s=\"%s\"", new Object[]{"nrr", this.f}));
            }
            arrayList0.addAll(this.g);
            if(!arrayList0.isEmpty()) {
                s0.G("CMCD-Request", arrayList0);
            }
        }
    }

    static final class CmcdSession {
        public static final class androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder {
            @Nullable
            private String a;
            @Nullable
            private String b;
            @Nullable
            private String c;
            @Nullable
            private String d;
            private float e;
            private O2 f;

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder() {
                this.f = O2.A();
            }

            public CmcdSession g() {
                return new CmcdSession(this, null);
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder h(@Nullable String s) {
                Assertions.a(s == null || s.length() <= 0x40);
                this.a = s;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder i(List list0) {
                this.f = O2.r(list0);
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder j(float f) {
                Assertions.a(f > 0.0f || f == -3.402823E+38f);
                this.e = f;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder k(@Nullable String s) {
                Assertions.a(s == null || s.length() <= 0x40);
                this.b = s;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder l(@Nullable String s) {
                this.d = s;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder m(@Nullable String s) {
                this.c = s;
                return this;
            }
        }

        @Nullable
        public final String a;
        @Nullable
        public final String b;
        @Nullable
        public final String c;
        @Nullable
        public final String d;
        public final float e;
        public final O2 f;
        public static final int g = 1;

        private CmcdSession(androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder cmcdData$CmcdSession$Builder0) {
            this.a = cmcdData$CmcdSession$Builder0.a;
            this.b = cmcdData$CmcdSession$Builder0.b;
            this.c = cmcdData$CmcdSession$Builder0.c;
            this.d = cmcdData$CmcdSession$Builder0.d;
            this.e = cmcdData$CmcdSession$Builder0.e;
            this.f = cmcdData$CmcdSession$Builder0.f;
        }

        CmcdSession(androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder cmcdData$CmcdSession$Builder0, androidx.media3.exoplayer.upstream.CmcdData.1 cmcdData$10) {
            this(cmcdData$CmcdSession$Builder0);
        }

        public void a(s s0) {
            ArrayList arrayList0 = new ArrayList();
            if(!TextUtils.isEmpty(this.a)) {
                arrayList0.add(Util.S("%s=\"%s\"", new Object[]{"cid", this.a}));
            }
            if(!TextUtils.isEmpty(this.b)) {
                arrayList0.add(Util.S("%s=\"%s\"", new Object[]{"sid", this.b}));
            }
            if(!TextUtils.isEmpty(this.c)) {
                arrayList0.add("sf=" + this.c);
            }
            if(!TextUtils.isEmpty(this.d)) {
                arrayList0.add("st=" + this.d);
            }
            float f = this.e;
            if(f != 0xFF7FFFFF && f != 0x3F800000) {
                arrayList0.add(Util.S("%s=%.2f", new Object[]{"pr", f}));
            }
            arrayList0.addAll(this.f);
            if(!arrayList0.isEmpty()) {
                s0.G("CMCD-Session", arrayList0);
            }
        }
    }

    static final class CmcdStatus {
        public static final class androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder {
            private int a;
            private boolean b;
            private O2 c;

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder() {
                this.a = 0x80000001;
                this.c = O2.A();
            }

            public CmcdStatus d() {
                return new CmcdStatus(this, null);
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder e(boolean z) {
                this.b = z;
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder f(List list0) {
                this.c = O2.r(list0);
                return this;
            }

            @a
            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder g(int v) {
                Assertions.a(v >= 0 || v == 0x80000001);
                if(v != 0x80000001) {
                    v = (v + 50) / 100 * 100;
                }
                this.a = v;
                return this;
            }
        }

        public final int a;
        public final boolean b;
        public final O2 c;

        private CmcdStatus(androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder cmcdData$CmcdStatus$Builder0) {
            this.a = cmcdData$CmcdStatus$Builder0.a;
            this.b = cmcdData$CmcdStatus$Builder0.b;
            this.c = cmcdData$CmcdStatus$Builder0.c;
        }

        CmcdStatus(androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder cmcdData$CmcdStatus$Builder0, androidx.media3.exoplayer.upstream.CmcdData.1 cmcdData$10) {
            this(cmcdData$CmcdStatus$Builder0);
        }

        public void a(s s0) {
            ArrayList arrayList0 = new ArrayList();
            if(this.a != 0x80000001) {
                arrayList0.add("rtp=" + this.a);
            }
            if(this.b) {
                arrayList0.add("bs");
            }
            arrayList0.addAll(this.c);
            if(!arrayList0.isEmpty()) {
                s0.G("CMCD-Status", arrayList0);
            }
        }
    }

    public static final class Factory {
        private final CmcdConfiguration a;
        private final ExoTrackSelection b;
        private final long c;
        private final float d;
        private final String e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private long i;
        @Nullable
        private String j;
        @Nullable
        private String k;
        @Nullable
        private String l;
        public static final String m = "d";
        public static final String n = "h";
        public static final String o = "s";
        public static final String p = "v";
        public static final String q = "l";
        public static final String r = "i";
        public static final String s = "a";
        public static final String t = "v";
        public static final String u = "av";
        private static final Pattern v;

        static {
            Factory.v = Pattern.compile(".*-.*");
        }

        public Factory(CmcdConfiguration cmcdConfiguration0, ExoTrackSelection exoTrackSelection0, long v, float f, String s, boolean z, boolean z1, boolean z2) {
            boolean z3 = false;
            Assertions.a(v >= 0L);
            if(f == -3.402823E+38f || f > 0.0f) {
                z3 = true;
            }
            Assertions.a(z3);
            this.a = cmcdConfiguration0;
            this.b = exoTrackSelection0;
            this.c = v;
            this.d = f;
            this.e = s;
            this.f = z;
            this.g = z1;
            this.h = z2;
            this.i = 0x8000000000000001L;
        }

        public CmcdData a() {
            P2 p20 = this.a.c.b();
            u5 u50 = p20.D().i();
            while(u50.hasNext()) {
                Object object0 = u50.next();
                this.h(p20.X(((String)object0)));
            }
            int v = Util.q(this.b.n().i, 1000);
            Builder cmcdData$CmcdObject$Builder0 = new Builder();
            boolean z = false;
            if(!this.b()) {
                if(this.a.a()) {
                    cmcdData$CmcdObject$Builder0.g(v);
                }
                if(this.a.q()) {
                    TrackGroup trackGroup0 = this.b.i();
                    int v1 = this.b.n().i;
                    for(int v2 = 0; v2 < trackGroup0.a; ++v2) {
                        v1 = Math.max(v1, trackGroup0.c(v2).i);
                    }
                    cmcdData$CmcdObject$Builder0.k((v1 + 999) / 1000);
                }
                if(this.a.j()) {
                    cmcdData$CmcdObject$Builder0.i(Util.B2(this.i));
                }
            }
            if(this.a.k()) {
                cmcdData$CmcdObject$Builder0.j(this.j);
            }
            if(p20.containsKey("CMCD-Object")) {
                cmcdData$CmcdObject$Builder0.h(p20.X("CMCD-Object"));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder cmcdData$CmcdRequest$Builder0 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder();
            if(!this.b() && this.a.b()) {
                cmcdData$CmcdRequest$Builder0.i(Util.B2(this.c));
            }
            if(this.a.g() && this.b.a() != 0xFFFFFFFF80000001L) {
                cmcdData$CmcdRequest$Builder0.l(Util.r(this.b.a(), 1000L));
            }
            if(this.a.e()) {
                cmcdData$CmcdRequest$Builder0.k(Util.B2(((long)(((float)this.c) / this.d))));
            }
            if(this.a.n()) {
                if(this.g || this.h) {
                    z = true;
                }
                cmcdData$CmcdRequest$Builder0.o(z);
            }
            if(this.a.h()) {
                cmcdData$CmcdRequest$Builder0.m(this.k);
            }
            if(this.a.i()) {
                cmcdData$CmcdRequest$Builder0.n(this.l);
            }
            if(p20.containsKey("CMCD-Request")) {
                cmcdData$CmcdRequest$Builder0.j(p20.X("CMCD-Request"));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder cmcdData$CmcdSession$Builder0 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder();
            if(this.a.d()) {
                cmcdData$CmcdSession$Builder0.h(this.a.b);
            }
            if(this.a.m()) {
                cmcdData$CmcdSession$Builder0.k(this.a.a);
            }
            if(this.a.p()) {
                cmcdData$CmcdSession$Builder0.m(this.e);
            }
            if(this.a.o()) {
                cmcdData$CmcdSession$Builder0.l((this.f ? "l" : "v"));
            }
            if(this.a.l()) {
                cmcdData$CmcdSession$Builder0.j(this.d);
            }
            if(p20.containsKey("CMCD-Session")) {
                cmcdData$CmcdSession$Builder0.i(p20.X("CMCD-Session"));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder cmcdData$CmcdStatus$Builder0 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder();
            if(this.a.f()) {
                cmcdData$CmcdStatus$Builder0.g(this.a.c.c(v));
            }
            if(this.a.c()) {
                cmcdData$CmcdStatus$Builder0.e(this.g);
            }
            if(p20.containsKey("CMCD-Status")) {
                cmcdData$CmcdStatus$Builder0.f(p20.X("CMCD-Status"));
            }
            return new CmcdData(cmcdData$CmcdObject$Builder0.f(), cmcdData$CmcdRequest$Builder0.h(), cmcdData$CmcdSession$Builder0.g(), cmcdData$CmcdStatus$Builder0.d(), this.a.d, null);
        }

        private boolean b() {
            return this.j != null && this.j.equals("i");
        }

        @Nullable
        public static String c(ExoTrackSelection exoTrackSelection0) {
            Assertions.a(exoTrackSelection0 != null);
            int v = MimeTypes.m(exoTrackSelection0.n().n);
            if(v == -1) {
                v = MimeTypes.m(exoTrackSelection0.n().m);
            }
            if(v == 1) {
                return "a";
            }
            return v == 2 ? "v" : null;
        }

        @a
        public Factory d(long v) {
            Assertions.a(v >= 0L);
            this.i = v;
            return this;
        }

        @a
        public Factory e(@Nullable String s) {
            this.k = s;
            return this;
        }

        @a
        public Factory f(@Nullable String s) {
            this.l = s;
            return this;
        }

        @a
        public Factory g(@Nullable String s) {
            this.j = s;
            return this;
        }

        private void h(List list0) {
            for(Object object0: list0) {
                Assertions.i(Factory.v.matcher(Util.m2(((String)object0), "=")[0]).matches());
            }
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ObjectType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface StreamType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface StreamingFormat {
    }

    private final CmcdObject a;
    private final CmcdRequest b;
    private final CmcdSession c;
    private final CmcdStatus d;
    private final int e;
    private static final y f;

    static {
        CmcdData.f = y.p(",");
    }

    private CmcdData(CmcdObject cmcdData$CmcdObject0, CmcdRequest cmcdData$CmcdRequest0, CmcdSession cmcdData$CmcdSession0, CmcdStatus cmcdData$CmcdStatus0, int v) {
        this.a = cmcdData$CmcdObject0;
        this.b = cmcdData$CmcdRequest0;
        this.c = cmcdData$CmcdSession0;
        this.d = cmcdData$CmcdStatus0;
        this.e = v;
    }

    CmcdData(CmcdObject cmcdData$CmcdObject0, CmcdRequest cmcdData$CmcdRequest0, CmcdSession cmcdData$CmcdSession0, CmcdStatus cmcdData$CmcdStatus0, int v, androidx.media3.exoplayer.upstream.CmcdData.1 cmcdData$10) {
        this(cmcdData$CmcdObject0, cmcdData$CmcdRequest0, cmcdData$CmcdSession0, cmcdData$CmcdStatus0, v);
    }

    public DataSpec a(DataSpec dataSpec0) {
        s s0 = s.Q();
        this.a.a(s0);
        this.b.a(s0);
        this.c.a(s0);
        this.d.a(s0);
        if(this.e == 0) {
            b q2$b0 = Q2.b();
            for(Object object0: s0.keySet()) {
                List list0 = s0.get(((String)object0));
                Collections.sort(list0);
                q2$b0.i(((String)object0), CmcdData.f.k(list0));
            }
            return dataSpec0.g(q2$b0.d());
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: s0.c().values()) {
            arrayList0.addAll(((Collection)object1));
        }
        Collections.sort(arrayList0);
        Uri.Builder uri$Builder0 = dataSpec0.a.buildUpon().appendQueryParameter("CMCD", CmcdData.f.k(arrayList0));
        return dataSpec0.a().j(uri$Builder0.build()).a();
    }

    class androidx.media3.exoplayer.upstream.CmcdData.1 {
    }

}

