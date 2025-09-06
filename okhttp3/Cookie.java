package okhttp3;

import androidx.compose.foundation.c;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y4.l;
import y4.m;
import z3.i;
import z3.n;

public final class Cookie {
    @s0({"SMAP\nCookie.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cookie.kt\nokhttp3/Cookie$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class Builder {
        @m
        private String domain;
        private long expiresAt;
        private boolean hostOnly;
        private boolean httpOnly;
        @m
        private String name;
        @l
        private String path;
        private boolean persistent;
        private boolean secure;
        @m
        private String value;

        public Builder() {
            this.expiresAt = 0xE677D21FDBFFL;
            this.path = "/";
        }

        @l
        public final Cookie build() {
            String s = this.name;
            if(s == null) {
                throw new NullPointerException("builder.name == null");
            }
            String s1 = this.value;
            if(s1 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long v = this.expiresAt;
            String s2 = this.domain;
            if(s2 == null) {
                throw new NullPointerException("builder.domain == null");
            }
            return new Cookie(s, s1, v, s2, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
        }

        private final Builder domain(String s, boolean z) {
            String s1 = HostnamesKt.toCanonicalHost(s);
            if(s1 == null) {
                throw new IllegalArgumentException("unexpected domain: " + s);
            }
            this.domain = s1;
            this.hostOnly = z;
            return this;
        }

        @l
        public final Builder domain(@l String s) {
            L.p(s, "domain");
            return this.domain(s, false);
        }

        @l
        public final Builder expiresAt(long v) {
            if(v <= 0L) {
                v = 0x8000000000000000L;
            }
            if(v > 0xE677D21FDBFFL) {
                v = 0xE677D21FDBFFL;
            }
            this.expiresAt = v;
            this.persistent = true;
            return this;
        }

        @l
        public final Builder hostOnlyDomain(@l String s) {
            L.p(s, "domain");
            return this.domain(s, true);
        }

        @l
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @l
        public final Builder name(@l String s) {
            L.p(s, "name");
            if(!L.g(v.G5(s).toString(), s)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = s;
            return this;
        }

        @l
        public final Builder path(@l String s) {
            L.p(s, "path");
            if(!v.v2(s, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with \'/\'");
            }
            this.path = s;
            return this;
        }

        @l
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @l
        public final Builder value(@l String s) {
            L.p(s, "value");
            if(!L.g(v.G5(s).toString(), s)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = s;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final int dateCharacterOffset(String s, int v, int v1, boolean z) {
            while(v < v1) {
                int v2 = s.charAt(v);
                if((v2 < 0x20 && v2 != 9 || v2 >= 0x7F || 0x30 <= v2 && v2 < 58 || 97 <= v2 && v2 < 0x7B || 65 <= v2 && v2 < 91 || v2 == 58 ? 1 : 0) == !z) {
                    return v;
                }
                ++v;
            }
            return v1;
        }

        // 去混淆评级： 低(40)
        private final boolean domainMatch(String s, String s1) {
            return L.g(s, s1) ? true : v.N1(s, s1, false, 2, null) && s.charAt(s.length() - s1.length() - 1) == 46 && !Util.canParseAsIpAddress(s);
        }

        @m
        @n
        public final Cookie parse(@l HttpUrl httpUrl0, @l String s) {
            L.p(httpUrl0, "url");
            L.p(s, "setCookie");
            return this.parse$okhttp(System.currentTimeMillis(), httpUrl0, s);
        }

        @m
        public final Cookie parse$okhttp(long v, @l HttpUrl httpUrl0, @l String s) {
            String s8;
            long v10;
            L.p(httpUrl0, "url");
            L.p(s, "setCookie");
            int v1 = Util.delimiterOffset$default(s, ';', 0, 0, 6, null);
            int v2 = Util.delimiterOffset$default(s, '=', 0, v1, 2, null);
            if(v2 == v1) {
                return null;
            }
            String s1 = Util.trimSubstring$default(s, 0, v2, 1, null);
            if(s1.length() == 0 || Util.indexOfControlOrNonAscii(s1) != -1) {
                return null;
            }
            String s2 = Util.trimSubstring(s, v2 + 1, v1);
            if(Util.indexOfControlOrNonAscii(s2) != -1) {
                return null;
            }
            int v3 = v1 + 1;
            int v4 = s.length();
            String s3 = null;
            String s4 = null;
            long v5 = -1L;
            boolean z = false;
            boolean z1 = false;
            boolean z2 = false;
            boolean z3 = true;
            long v6 = 0xE677D21FDBFFL;
            while(v3 < v4) {
                int v7 = Util.delimiterOffset(s, ';', v3, v4);
                int v8 = Util.delimiterOffset(s, '=', v3, v7);
                String s5 = Util.trimSubstring(s, v3, v8);
                String s6 = v8 >= v7 ? "" : Util.trimSubstring(s, v8 + 1, v7);
                if(v.O1(s5, "expires", true)) {
                    try {
                        v6 = this.parseExpires(s6, 0, s6.length());
                        goto label_32;
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                else if(v.O1(s5, "max-age", true)) {
                    try {
                        v5 = this.parseMaxAge(s6);
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_46;
                    }
                label_32:
                    z2 = true;
                }
                else if(v.O1(s5, "domain", true)) {
                    try {
                        s3 = this.parseDomain(s6);
                        z3 = false;
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                }
                else if(v.O1(s5, "path", true)) {
                    s4 = s6;
                }
                else if(v.O1(s5, "secure", true)) {
                    z = true;
                }
                else if(v.O1(s5, "httponly", true)) {
                    z1 = true;
                }
            label_46:
                v3 = v7 + 1;
            }
            if(v5 == 0x8000000000000000L) {
                v10 = 0x8000000000000000L;
            }
            else if(v5 != -1L) {
                long v9 = v + (v5 > 0x20C49BA5E353F7L ? 0x7FFFFFFFFFFFFFFFL : v5 * 1000L);
                v10 = v9 < v || v9 > 0xE677D21FDBFFL ? 0xE677D21FDBFFL : v9;
            }
            else {
                v10 = v6;
            }
            String s7 = httpUrl0.host();
            if(s3 == null) {
                s8 = s7;
            }
            else {
                if(!this.domainMatch(s7, s3)) {
                    return null;
                }
                s8 = s3;
            }
            String s9 = "/";
            if(s7.length() != s8.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(s8) == null) {
                return null;
            }
            if(s4 != null && v.v2(s4, "/", false, 2, null)) {
                return new Cookie(s1, s2, v10, s8, s4, z, z1, z2, z3, null);
            }
            String s10 = httpUrl0.encodedPath();
            int v11 = v.G3(s10, '/', 0, false, 6, null);
            if(v11 != 0) {
                s9 = s10.substring(0, v11);
                L.o(s9, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            return new Cookie(s1, s2, v10, s8, s9, z, z1, z2, z3, null);
        }

        @l
        @n
        public final List parseAll(@l HttpUrl httpUrl0, @l Headers headers0) {
            L.p(httpUrl0, "url");
            L.p(headers0, "headers");
            List list0 = headers0.values("Set-Cookie");
            int v = list0.size();
            List list1 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                Cookie cookie0 = this.parse(httpUrl0, ((String)list0.get(v1)));
                if(cookie0 != null) {
                    if(list1 == null) {
                        list1 = new ArrayList();
                    }
                    list1.add(cookie0);
                }
            }
            if(list1 != null) {
                List list2 = DesugarCollections.unmodifiableList(list1);
                L.o(list2, "{\n        Collections.un…ableList(cookies)\n      }");
                return list2;
            }
            return u.H();
        }

        private final String parseDomain(String s) {
            if(v.N1(s, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String s1 = HostnamesKt.toCanonicalHost(v.e4(s, "."));
            if(s1 == null) {
                throw new IllegalArgumentException();
            }
            return s1;
        }

        private final long parseExpires(String s, int v, int v1) {
            int v2 = this.dateCharacterOffset(s, v, v1, false);
            Matcher matcher0 = Cookie.TIME_PATTERN.matcher(s);
            int v3 = -1;
            int v4 = -1;
            int v5 = -1;
            int v6 = -1;
            int v7 = -1;
            int v8 = -1;
            while(v2 < v1) {
                int v9 = this.dateCharacterOffset(s, v2 + 1, v1, true);
                matcher0.region(v2, v9);
                if(v4 == -1 && matcher0.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String s1 = matcher0.group(1);
                    L.o(s1, "matcher.group(1)");
                    v4 = Integer.parseInt(s1);
                    String s2 = matcher0.group(2);
                    L.o(s2, "matcher.group(2)");
                    v7 = Integer.parseInt(s2);
                    String s3 = matcher0.group(3);
                    L.o(s3, "matcher.group(3)");
                    v8 = Integer.parseInt(s3);
                }
                else if(v5 == -1 && matcher0.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String s4 = matcher0.group(1);
                    L.o(s4, "matcher.group(1)");
                    v5 = Integer.parseInt(s4);
                }
                else if(v6 == -1 && matcher0.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String s5 = matcher0.group(1);
                    L.o(s5, "matcher.group(1)");
                    Locale locale0 = Locale.US;
                    L.o(locale0, "US");
                    String s6 = s5.toLowerCase(locale0);
                    L.o(s6, "this as java.lang.String).toLowerCase(locale)");
                    L.o("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*", "MONTH_PATTERN.pattern()");
                    v6 = v.s3("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*", s6, 0, false, 6, null) / 4;
                }
                else if(v3 == -1 && matcher0.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String s7 = matcher0.group(1);
                    L.o(s7, "matcher.group(1)");
                    v3 = Integer.parseInt(s7);
                }
                v2 = this.dateCharacterOffset(s, v9 + 1, v1, false);
            }
            if(70 <= v3 && v3 < 100) {
                v3 += 1900;
            }
            if(v3 >= 0 && v3 < 70) {
                v3 += 2000;
            }
            if(v3 < 1601 || v6 == -1 || 1 > v5 || v5 >= 0x20 || v4 < 0 || v4 >= 24 || v7 < 0 || v7 >= 60 || v8 < 0 || v8 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar0 = new GregorianCalendar(Util.UTC);
            gregorianCalendar0.setLenient(false);
            gregorianCalendar0.set(1, v3);
            gregorianCalendar0.set(2, v6 - 1);
            gregorianCalendar0.set(5, v5);
            gregorianCalendar0.set(11, v4);
            gregorianCalendar0.set(12, v7);
            gregorianCalendar0.set(13, v8);
            gregorianCalendar0.set(14, 0);
            return gregorianCalendar0.getTimeInMillis();
        }

        private final long parseMaxAge(String s) {
            try {
                long v = Long.parseLong(s);
                return v <= 0L ? 0x8000000000000000L : v;
            }
            catch(NumberFormatException numberFormatException0) {
                if(!new r("-?\\d+").k(s)) {
                    throw numberFormatException0;
                }
                return v.v2(s, "-", false, 2, null) ? 0x8000000000000000L : 0x7FFFFFFFFFFFFFFFL;
            }
        }

        private final boolean pathMatch(HttpUrl httpUrl0, String s) {
            String s1 = httpUrl0.encodedPath();
            if(L.g(s1, s)) {
                return true;
            }
            if(v.v2(s1, s, false, 2, null)) {
                return v.N1(s, "/", false, 2, null) ? true : s1.charAt(s.length()) == 0x2F;
            }
            return false;
        }
    }

    @l
    public static final Companion Companion;
    private static final Pattern DAY_OF_MONTH_PATTERN;
    private static final Pattern MONTH_PATTERN;
    private static final Pattern TIME_PATTERN;
    private static final Pattern YEAR_PATTERN;
    @l
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    @l
    private final String name;
    @l
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    @l
    private final String value;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "domain", imports = {}))
    @l
    @i(name = "-deprecated_domain")
    public final String -deprecated_domain() {
        return this.domain;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "expiresAt", imports = {}))
    @i(name = "-deprecated_expiresAt")
    public final long -deprecated_expiresAt() {
        return this.expiresAt;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "hostOnly", imports = {}))
    @i(name = "-deprecated_hostOnly")
    public final boolean -deprecated_hostOnly() {
        return this.hostOnly;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "httpOnly", imports = {}))
    @i(name = "-deprecated_httpOnly")
    public final boolean -deprecated_httpOnly() {
        return this.httpOnly;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "name", imports = {}))
    @l
    @i(name = "-deprecated_name")
    public final String -deprecated_name() {
        return this.name;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "path", imports = {}))
    @l
    @i(name = "-deprecated_path")
    public final String -deprecated_path() {
        return this.path;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "persistent", imports = {}))
    @i(name = "-deprecated_persistent")
    public final boolean -deprecated_persistent() {
        return this.persistent;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "secure", imports = {}))
    @i(name = "-deprecated_secure")
    public final boolean -deprecated_secure() {
        return this.secure;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "value", imports = {}))
    @l
    @i(name = "-deprecated_value")
    public final String -deprecated_value() {
        return this.value;
    }

    static {
        Cookie.Companion = new Companion(null);
        Cookie.YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
        Cookie.MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        Cookie.DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
        Cookie.TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    private Cookie(String s, String s1, long v, String s2, String s3, boolean z, boolean z1, boolean z2, boolean z3) {
        this.name = s;
        this.value = s1;
        this.expiresAt = v;
        this.domain = s2;
        this.path = s3;
        this.secure = z;
        this.httpOnly = z1;
        this.persistent = z2;
        this.hostOnly = z3;
    }

    public Cookie(String s, String s1, long v, String s2, String s3, boolean z, boolean z1, boolean z2, boolean z3, w w0) {
        this(s, s1, v, s2, s3, z, z1, z2, z3);
    }

    @l
    @i(name = "domain")
    public final String domain() {
        return this.domain;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof Cookie && L.g(((Cookie)object0).name, this.name) && L.g(((Cookie)object0).value, this.value) && ((Cookie)object0).expiresAt == this.expiresAt && L.g(((Cookie)object0).domain, this.domain) && L.g(((Cookie)object0).path, this.path) && ((Cookie)object0).secure == this.secure && ((Cookie)object0).httpOnly == this.httpOnly && ((Cookie)object0).persistent == this.persistent && ((Cookie)object0).hostOnly == this.hostOnly;
    }

    @i(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @Override
    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((this.name.hashCode() + 0x20F) * 0x1F + this.value.hashCode()) * 0x1F + ((int)(this.expiresAt ^ this.expiresAt >>> 0x20))) * 0x1F + this.domain.hashCode()) * 0x1F + this.path.hashCode()) * 0x1F + c.a(this.secure)) * 0x1F + c.a(this.httpOnly)) * 0x1F + c.a(this.persistent)) * 0x1F + c.a(this.hostOnly);
    }

    @i(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @i(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@l HttpUrl httpUrl0) {
        L.p(httpUrl0, "url");
        if(!(this.hostOnly ? L.g(httpUrl0.host(), this.domain) : Cookie.Companion.domainMatch(httpUrl0.host(), this.domain))) {
            return false;
        }
        return Cookie.Companion.pathMatch(httpUrl0, this.path) ? !this.secure || httpUrl0.isHttps() : false;
    }

    @l
    @i(name = "name")
    public final String name() {
        return this.name;
    }

    @m
    @n
    public static final Cookie parse(@l HttpUrl httpUrl0, @l String s) {
        return Cookie.Companion.parse(httpUrl0, s);
    }

    @l
    @n
    public static final List parseAll(@l HttpUrl httpUrl0, @l Headers headers0) {
        return Cookie.Companion.parseAll(httpUrl0, headers0);
    }

    @l
    @i(name = "path")
    public final String path() {
        return this.path;
    }

    @i(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @i(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @Override
    @l
    public String toString() {
        return this.toString$okhttp(false);
    }

    @l
    public final String toString$okhttp(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.name);
        stringBuilder0.append('=');
        stringBuilder0.append(this.value);
        if(this.persistent) {
            if(this.expiresAt == 0x8000000000000000L) {
                stringBuilder0.append("; max-age=0");
            }
            else {
                stringBuilder0.append("; expires=");
                stringBuilder0.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if(!this.hostOnly) {
            stringBuilder0.append("; domain=");
            if(z) {
                stringBuilder0.append(".");
            }
            stringBuilder0.append(this.domain);
        }
        stringBuilder0.append("; path=");
        stringBuilder0.append(this.path);
        if(this.secure) {
            stringBuilder0.append("; secure");
        }
        if(this.httpOnly) {
            stringBuilder0.append("; httponly");
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString()");
        return s;
    }

    @l
    @i(name = "value")
    public final String value() {
        return this.value;
    }
}

