package g3;

import java.net.SocketException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import y4.l;
import y4.m;

public final class a {
    @l
    private final String a;
    private final boolean b;
    private final boolean c;
    @l
    private final String d;
    @l
    private final String e;
    @l
    private final String f;
    @l
    private final String g;
    @l
    private final String h;
    @l
    private final String i;
    @l
    private final String j;
    @l
    private final String k;

    private a(String s, boolean z, boolean z1, String s1, String s2, String s3, String s4, String s5) {
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = "ce0fac19508f6c8f20066d345d360fd0";
        this.j = "Run";
        this.k = "{\n  \"event\": \"%EVENT%\",\n  \"properties\": {\n      \"token\": \"%TOKEN%\",\n      \"distinct_id\": \"%USER_ID%\",\n      \"Anonymized MAC Address\": \"%USER_ID%\",\n      \"Anonymized Bundle ID\": \"%APP_ID%\",\n      \"Binding\": \"java\",\n      \"Target\": \"%TARGET%\",\n      \"Language\": \"%LANGUAGE%\",\n      \"Sync Version\": %SYNC_VERSION%,\n      \"Realm Version\": \"%REALM_VERSION%\",\n      \"Host OS Type\": \"%OS_TYPE%\",\n      \"Host OS Version\": \"%OS_VERSION%\",\n      \"Target OS Type\": \"android\",\n      \"Target OS Version\": \"%TARGET_SDK%\",\n      \"Target OS Minimum Version\": \"%MIN_SDK%\",\n      \"Gradle version\": \"%GRADLE_VERSION%\",\n      \"Android Gradle Plugin Version\": \"%AGP_VERSION%\"\n  }\n}";
    }

    public a(String s, boolean z, boolean z1, String s1, String s2, String s3, String s4, String s5, w w0) {
        this(s, z, z1, s1, s2, s3, s4, s5);
    }

    @l
    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @l
    public final String d() {
        return this.d;
    }

    @l
    public final String e() {
        return this.e;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!c.e(this.a, ((a)object0).a)) {
            return false;
        }
        if(this.b != ((a)object0).b) {
            return false;
        }
        if(this.c != ((a)object0).c) {
            return false;
        }
        if(!L.g(this.d, ((a)object0).d)) {
            return false;
        }
        if(!L.g(this.e, ((a)object0).e)) {
            return false;
        }
        if(!L.g(this.f, ((a)object0).f)) {
            return false;
        }
        return L.g(this.g, ((a)object0).g) ? L.g(this.h, ((a)object0).h) : false;
    }

    @l
    public final String f() {
        return this.f;
    }

    @l
    public final String g() {
        return this.g;
    }

    @l
    public final String h() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = c.g(this.a);
        int v1 = this.b;
        int v2 = 1;
        if(v1) {
            v1 = 1;
        }
        if(!this.c) {
            v2 = false;
        }
        return ((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode()) * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @l
    public final a i(@l String s, boolean z, boolean z1, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5) {
        L.p(s, "appId");
        L.p(s1, "targetSdk");
        L.p(s2, "minSdk");
        L.p(s3, "target");
        L.p(s4, "gradleVersion");
        L.p(s5, "agpVersion");
        return new a(s, z, z1, s1, s2, s3, s4, s5, null);
    }

    public static a j(a a0, String s, boolean z, boolean z1, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
        String s6 = (v & 1) == 0 ? s : a0.a;
        boolean z2 = (v & 2) == 0 ? z : a0.b;
        boolean z3 = (v & 4) == 0 ? z1 : a0.c;
        String s7 = (v & 8) == 0 ? s1 : a0.d;
        String s8 = (v & 16) == 0 ? s2 : a0.e;
        String s9 = (v & 0x20) == 0 ? s3 : a0.f;
        String s10 = (v & 0x40) == 0 ? s4 : a0.g;
        return (v & 0x80) == 0 ? a0.i(s6, z2, z3, s7, s8, s9, s10, s5) : a0.i(s6, z2, z3, s7, s8, s9, s10, a0.h);
    }

    @l
    public final String k() throws SocketException, NoSuchAlgorithmException {
        String s = new r("%EVENT%").m(this.k, this.j);
        String s1 = new r("%TOKEN%").m(s, this.i);
        String s2 = new r("%USER_ID%").m(s1, "unknown");
        String s3 = new r("%APP_ID%").m(s2, c.a(this.a));
        String s4 = new r("%TARGET%").m(s3, this.f);
        String s5 = new r("%LANGUAGE%").m(s4, (this.b ? "kotlin" : "java"));
        String s6 = new r("%SYNC_VERSION%").m(s5, (this.c ? "\"13.26.0\"" : "null"));
        String s7 = new r("%REALM_VERSION%").m(s6, "10.19.0");
        r r0 = new r("%OS_TYPE%");
        L.o("Linux", "getProperty(\"os.name\")");
        String s8 = r0.m(s7, "Linux");
        r r1 = new r("%OS_VERSION%");
        L.o("4.14.295-g84b42e6a786c-ab9578266", "getProperty(\"os.version\")");
        String s9 = r1.m(s8, "4.14.295-g84b42e6a786c-ab9578266");
        String s10 = new r("%TARGET_SDK%").m(s9, this.d);
        String s11 = new r("%MIN_SDK%").m(s10, this.e);
        String s12 = new r("%GRADLE_VERSION%").m(s11, this.g);
        return new r("%AGP_VERSION%").m(s12, this.h);
    }

    @l
    public final String l() {
        return this.h;
    }

    @l
    public final String m() {
        return this.a;
    }

    @l
    public final String n() {
        return this.g;
    }

    @l
    public final String o() {
        return this.e;
    }

    @l
    public final String p() {
        return this.f;
    }

    @l
    public final String q() {
        return this.d;
    }

    public final boolean r() {
        return this.b;
    }

    public final boolean s() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "AnalyticsData(appId=" + ("PublicAppId(id=" + this.a + ")") + ", usesKotlin=" + this.b + ", usesSync=" + this.c + ", targetSdk=" + this.d + ", minSdk=" + this.e + ", target=" + this.f + ", gradleVersion=" + this.g + ", agpVersion=" + this.h + ")";
    }
}

