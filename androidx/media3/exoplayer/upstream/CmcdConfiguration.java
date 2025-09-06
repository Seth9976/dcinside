package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.P2;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class CmcdConfiguration {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface CmcdKey {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DataTransmissionMode {
    }

    public interface Factory {
        public static final Factory a;

        static {
            Factory.a = new c();
        }

        CmcdConfiguration a(MediaItem arg1);

        class androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.1 implements RequestConfig {
            @Override  // androidx.media3.exoplayer.upstream.CmcdConfiguration$RequestConfig
            public boolean a(String s) {
                return true;
            }

            @Override  // androidx.media3.exoplayer.upstream.CmcdConfiguration$RequestConfig
            public P2 b() {
                return e.a(this);
            }

            @Override  // androidx.media3.exoplayer.upstream.CmcdConfiguration$RequestConfig
            public int c(int v) {
                return 0x80000001;
            }
        }

    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface HeaderKey {
    }

    public interface RequestConfig {
        boolean a(String arg1);

        P2 b();

        int c(int arg1);
    }

    public static final String A = "nor";
    public static final String B = "nrr";
    public static final int C = 0;
    public static final int D = 1;
    @Nullable
    public final String a;
    @Nullable
    public final String b;
    public final RequestConfig c;
    public final int d;
    public static final int e = 0x40;
    public static final String f = "CMCD-Object";
    public static final String g = "CMCD-Request";
    public static final String h = "CMCD-Session";
    public static final String i = "CMCD-Status";
    public static final String j = "CMCD";
    public static final String k = "br";
    public static final String l = "bl";
    public static final String m = "cid";
    public static final String n = "sid";
    public static final String o = "rtp";
    public static final String p = "sf";
    public static final String q = "st";
    public static final String r = "v";
    public static final String s = "tb";
    public static final String t = "d";
    public static final String u = "mtp";
    public static final String v = "ot";
    public static final String w = "bs";
    public static final String x = "dl";
    public static final String y = "pr";
    public static final String z = "su";

    public CmcdConfiguration(@Nullable String s, @Nullable String s1, RequestConfig cmcdConfiguration$RequestConfig0) {
        this(s, s1, cmcdConfiguration$RequestConfig0, 0);
    }

    public CmcdConfiguration(@Nullable String s, @Nullable String s1, RequestConfig cmcdConfiguration$RequestConfig0, int v) {
        boolean z = true;
        Assertions.a(s == null || s.length() <= 0x40);
        if(s1 != null && s1.length() > 0x40) {
            z = false;
        }
        Assertions.a(z);
        Assertions.g(cmcdConfiguration$RequestConfig0);
        this.a = s;
        this.b = s1;
        this.c = cmcdConfiguration$RequestConfig0;
        this.d = v;
    }

    public boolean a() {
        return this.c.a("br");
    }

    public boolean b() {
        return this.c.a("bl");
    }

    public boolean c() {
        return this.c.a("bs");
    }

    public boolean d() {
        return this.c.a("cid");
    }

    public boolean e() {
        return this.c.a("dl");
    }

    public boolean f() {
        return this.c.a("rtp");
    }

    public boolean g() {
        return this.c.a("mtp");
    }

    public boolean h() {
        return this.c.a("nor");
    }

    public boolean i() {
        return this.c.a("nrr");
    }

    public boolean j() {
        return this.c.a("d");
    }

    public boolean k() {
        return this.c.a("ot");
    }

    public boolean l() {
        return this.c.a("pr");
    }

    public boolean m() {
        return this.c.a("sid");
    }

    public boolean n() {
        return this.c.a("su");
    }

    public boolean o() {
        return this.c.a("st");
    }

    public boolean p() {
        return this.c.a("sf");
    }

    public boolean q() {
        return this.c.a("tb");
    }
}

