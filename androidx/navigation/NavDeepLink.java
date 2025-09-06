package androidx.navigation;

import A3.a;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.D;
import kotlin.E;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.n;

public final class NavDeepLink {
    public static final class Builder {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            @n
            public final Builder a(@l String s) {
                L.p(s, "action");
                if(s.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.e(s);
                return navDeepLink$Builder0;
            }

            @l
            @n
            public final Builder b(@l String s) {
                L.p(s, "mimeType");
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.f(s);
                return navDeepLink$Builder0;
            }

            @l
            @n
            public final Builder c(@l String s) {
                L.p(s, "uriPattern");
                Builder navDeepLink$Builder0 = new Builder();
                navDeepLink$Builder0.g(s);
                return navDeepLink$Builder0;
            }
        }

        @m
        private String a;
        @m
        private String b;
        @m
        private String c;
        @l
        public static final Companion d;

        static {
            Builder.d = new Companion(null);
        }

        @l
        public final NavDeepLink a() {
            return new NavDeepLink(this.a, this.b, this.c);
        }

        @l
        @n
        public static final Builder b(@l String s) {
            return Builder.d.a(s);
        }

        @l
        @n
        public static final Builder c(@l String s) {
            return Builder.d.b(s);
        }

        @l
        @n
        public static final Builder d(@l String s) {
            return Builder.d.c(s);
        }

        @l
        public final Builder e(@l String s) {
            L.p(s, "action");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.b = s;
            return this;
        }

        @l
        public final Builder f(@l String s) {
            L.p(s, "mimeType");
            this.c = s;
            return this;
        }

        @l
        public final Builder g(@l String s) {
            L.p(s, "uriPattern");
            this.a = s;
            return this;
        }
    }

    static final class androidx.navigation.NavDeepLink.Companion {
        private androidx.navigation.NavDeepLink.Companion() {
        }

        public androidx.navigation.NavDeepLink.Companion(w w0) {
        }
    }

    static final class MimeType implements Comparable {
        @l
        private String a;
        @l
        private String b;

        public MimeType(@l String s) {
            L.p(s, "mimeType");
            List list1;
            super();
            List list0 = new r("/").p(s, 0);
            if(!list0.isEmpty()) {
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(listIterator0.hasPrevious()) {
                    if(((String)listIterator0.previous()).length() == 0) {
                        continue;
                    }
                    list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                    this.a = (String)list1.get(0);
                    this.b = (String)list1.get(1);
                    return;
                }
            }
            list1 = u.H();
            this.a = (String)list1.get(0);
            this.b = (String)list1.get(1);
        }

        public int a(@l MimeType navDeepLink$MimeType0) {
            L.p(navDeepLink$MimeType0, "other");
            int v = L.g(this.a, navDeepLink$MimeType0.a) ? 2 : 0;
            return L.g(this.b, navDeepLink$MimeType0.b) ? v + 1 : v;
        }

        @l
        public final String b() {
            return this.b;
        }

        @l
        public final String c() {
            return this.a;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((MimeType)object0));
        }

        public final void d(@l String s) {
            L.p(s, "<set-?>");
            this.b = s;
        }

        public final void e(@l String s) {
            L.p(s, "<set-?>");
            this.a = s;
        }
    }

    static final class ParamQuery {
        @m
        private String a;
        @l
        private final List b;

        public ParamQuery() {
            this.b = new ArrayList();
        }

        public final void a(@l String s) {
            L.p(s, "name");
            this.b.add(s);
        }

        @l
        public final String b(int v) {
            return (String)this.b.get(v);
        }

        @l
        public final List c() {
            return this.b;
        }

        @m
        public final String d() {
            return this.a;
        }

        public final void e(@m String s) {
            this.a = s;
        }

        public final int f() {
            return this.b.size();
        }
    }

    @m
    private final String a;
    @m
    private final String b;
    @m
    private final String c;
    @l
    private final List d;
    @l
    private final Map e;
    @m
    private String f;
    @l
    private final D g;
    private boolean h;
    private boolean i;
    @m
    private String j;
    @l
    private final D k;
    private boolean l;
    @l
    private static final androidx.navigation.NavDeepLink.Companion m;
    @Deprecated
    private static final Pattern n;

    static {
        NavDeepLink.m = new androidx.navigation.NavDeepLink.Companion(null);
        NavDeepLink.n = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    }

    @RestrictTo({Scope.b})
    public NavDeepLink(@l String s) {
        L.p(s, "uri");
        this(s, null, null);
    }

    public NavDeepLink(@m String s, @m String s1, @m String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.g = E.a(new a() {
            final NavDeepLink e;

            {
                this.e = navDeepLink0;
                super(0);
            }

            @m
            public final Pattern b() {
                String s = this.e.f;
                return s == null ? null : Pattern.compile(s, 2);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.k = E.a(new a() {
            final NavDeepLink e;

            {
                this.e = navDeepLink0;
                super(0);
            }

            @m
            public final Pattern b() {
                String s = this.e.j;
                return s == null ? null : Pattern.compile(s);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            this.h = uri0.getQuery() != null;
            StringBuilder stringBuilder0 = new StringBuilder("^");
            if(!NavDeepLink.n.matcher(s).find()) {
                stringBuilder0.append("http[s]?://");
            }
            Pattern pattern0 = Pattern.compile("\\{(.+?)\\}");
            if(this.h) {
                Matcher matcher0 = Pattern.compile("(\\?)").matcher(s);
                if(matcher0.find()) {
                    String s3 = s.substring(0, matcher0.start());
                    L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                    L.o(pattern0, "fillInPattern");
                    this.l = this.c(s3, stringBuilder0, pattern0);
                }
                for(Object object0: uri0.getQueryParameterNames()) {
                    String s4 = (String)object0;
                    StringBuilder stringBuilder1 = new StringBuilder();
                    String s5 = uri0.getQueryParameter(s4);
                    if(s5 == null) {
                        this.i = true;
                        s5 = s4;
                    }
                    Matcher matcher1 = pattern0.matcher(s5);
                    ParamQuery navDeepLink$ParamQuery0 = new ParamQuery();
                    int v;
                    for(v = 0; matcher1.find(); v = matcher1.end()) {
                        String s6 = matcher1.group(1);
                        if(s6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        navDeepLink$ParamQuery0.a(s6);
                        L.o(s5, "queryParam");
                        String s7 = s5.substring(v, matcher1.start());
                        L.o(s7, "this as java.lang.String…ing(startIndex, endIndex)");
                        stringBuilder1.append(Pattern.quote(s7));
                        stringBuilder1.append("(.+?)?");
                    }
                    if(v < s5.length()) {
                        L.o(s5, "queryParam");
                        String s8 = s5.substring(v);
                        L.o(s8, "this as java.lang.String).substring(startIndex)");
                        stringBuilder1.append(Pattern.quote(s8));
                    }
                    String s9 = stringBuilder1.toString();
                    L.o(s9, "argRegex.toString()");
                    navDeepLink$ParamQuery0.e(v.l2(s9, ".*", "\\E.*\\Q", false, 4, null));
                    L.o(s4, "paramName");
                    this.e.put(s4, navDeepLink$ParamQuery0);
                }
            }
            else {
                L.o(pattern0, "fillInPattern");
                this.l = this.c(s, stringBuilder0, pattern0);
            }
            String s10 = stringBuilder0.toString();
            L.o(s10, "uriRegex.toString()");
            this.f = v.l2(s10, ".*", "\\E.*\\Q", false, 4, null);
        }
        if(this.c != null) {
            if(!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
                throw new IllegalArgumentException(("The given mimeType " + this.c + " does not match to required \"type/subtype\" format").toString());
            }
            MimeType navDeepLink$MimeType0 = new MimeType(this.c);
            this.j = v.l2(("^(" + navDeepLink$MimeType0.c() + "|[*]+)/(" + navDeepLink$MimeType0.b() + "|[*]+)$"), "*|[*]", "[\\s\\S]", false, 4, null);
        }
    }

    private final boolean c(String s, StringBuilder stringBuilder0, Pattern pattern0) {
        Matcher matcher0 = pattern0.matcher(s);
        boolean z = !v.W2(s, ".*", false, 2, null);
        int v = 0;
        while(matcher0.find()) {
            String s1 = matcher0.group(1);
            if(s1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.d.add(s1);
            String s2 = s.substring(v, matcher0.start());
            L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
            stringBuilder0.append(Pattern.quote(s2));
            stringBuilder0.append("([^/]+?)");
            v = matcher0.end();
            z = false;
        }
        if(v < s.length()) {
            String s3 = s.substring(v);
            L.o(s3, "this as java.lang.String).substring(startIndex)");
            stringBuilder0.append(Pattern.quote(s3));
        }
        stringBuilder0.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    @m
    public final String d() {
        return this.b;
    }

    @l
    public final List e() {
        Collection collection0 = this.d;
        Iterable iterable0 = this.e.values();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            u.q0(arrayList0, ((ParamQuery)object0).c());
        }
        return u.D4(collection0, arrayList0);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@m Object object0) {
        return object0 != null && object0 instanceof NavDeepLink && L.g(this.a, ((NavDeepLink)object0).a) && L.g(this.b, ((NavDeepLink)object0).b) && L.g(this.c, ((NavDeepLink)object0).c);
    }

    @RestrictTo({Scope.b})
    @m
    public final Bundle f(@l Uri uri0, @l Map map0) {
        String s5;
        Matcher matcher1;
        L.p(uri0, "deepLink");
        L.p(map0, "arguments");
        Pattern pattern0 = this.j();
        Matcher matcher0 = pattern0 == null ? null : pattern0.matcher(uri0.toString());
        if(matcher0 == null) {
            return null;
        }
        if(!matcher0.matches()) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        int v = this.d.size();
        int v1 = 0;
        while(v1 < v) {
            String s = (String)this.d.get(v1);
            ++v1;
            String s1 = Uri.decode(matcher0.group(v1));
            NavArgument navArgument0 = (NavArgument)map0.get(s);
            try {
                L.o(s1, "value");
                if(this.r(bundle0, s, s1, navArgument0)) {
                    return null;
                }
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
            if(false) {
                break;
            }
        }
        if(this.h) {
            for(Object object0: this.e.keySet()) {
                ParamQuery navDeepLink$ParamQuery0 = (ParamQuery)this.e.get(((String)object0));
                String s2 = uri0.getQueryParameter(((String)object0));
                if(this.i) {
                    String s3 = uri0.toString();
                    L.o(s3, "deepLink.toString()");
                    String s4 = v.q5(s3, '?', null, 2, null);
                    if(!L.g(s4, s3)) {
                        s2 = s4;
                    }
                }
                if(s2 == null) {
                    matcher1 = null;
                }
                else {
                    L.m(navDeepLink$ParamQuery0);
                    matcher1 = Pattern.compile(navDeepLink$ParamQuery0.d(), 0x20).matcher(s2);
                    if(!matcher1.matches()) {
                        return null;
                    }
                }
                Bundle bundle1 = new Bundle();
                try {
                    L.m(navDeepLink$ParamQuery0);
                    int v2 = navDeepLink$ParamQuery0.f();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        if(matcher1 == null) {
                            s5 = null;
                        }
                        else {
                            String s6 = matcher1.group(v3 + 1);
                            s5 = s6 == null ? "" : s6;
                        }
                        String s7 = navDeepLink$ParamQuery0.b(v3);
                        NavArgument navArgument1 = (NavArgument)map0.get(s7);
                        if(s5 != null && !L.g(s5, '{' + s7 + '}') && this.r(bundle1, s7, s5, navArgument1)) {
                            return null;
                        }
                    }
                    bundle0.putAll(bundle1);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
        for(Object object1: map0.entrySet()) {
            String s8 = (String)((Map.Entry)object1).getKey();
            NavArgument navArgument2 = (NavArgument)((Map.Entry)object1).getValue();
            if(navArgument2 != null && !navArgument2.d() && !navArgument2.c() && !bundle0.containsKey(s8)) {
                return null;
            }
            if(false) {
                break;
            }
        }
        return bundle0;
    }

    @m
    public final String g() {
        return this.c;
    }

    @RestrictTo({Scope.b})
    public final int h(@l String s) {
        L.p(s, "mimeType");
        if(this.c != null) {
            Pattern pattern0 = this.i();
            L.m(pattern0);
            return pattern0.matcher(s).matches() ? new MimeType(this.c).a(new MimeType(s)) : -1;
        }
        return -1;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    private final Pattern i() {
        return (Pattern)this.k.getValue();
    }

    private final Pattern j() {
        return (Pattern)this.g.getValue();
    }

    @m
    public final String k() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    public final boolean l() {
        return this.l;
    }

    // 去混淆评级： 低(40)
    private final boolean m(String s) {
        return (s == null ? 1 : 0) == (this.b == null ? 0 : 1) ? false : s == null || L.g(this.b, s);
    }

    private final boolean n(String s) {
        if((s == null ? 1 : 0) == (this.c == null ? 0 : 1)) {
            return false;
        }
        if(s != null) {
            Pattern pattern0 = this.i();
            L.m(pattern0);
            return pattern0.matcher(s).matches();
        }
        return true;
    }

    private final boolean o(Uri uri0) {
        if((uri0 == null ? 1 : 0) == (this.j() == null ? 0 : 1)) {
            return false;
        }
        if(uri0 != null) {
            Pattern pattern0 = this.j();
            L.m(pattern0);
            return pattern0.matcher(uri0.toString()).matches();
        }
        return true;
    }

    public final boolean p(@l Uri uri0) {
        L.p(uri0, "uri");
        return this.q(new NavDeepLinkRequest(uri0, null, null));
    }

    public final boolean q(@l NavDeepLinkRequest navDeepLinkRequest0) {
        L.p(navDeepLinkRequest0, "deepLinkRequest");
        if(!this.o(navDeepLinkRequest0.c())) {
            return false;
        }
        return this.m(navDeepLinkRequest0.a()) ? this.n(navDeepLinkRequest0.b()) : false;
    }

    private final boolean r(Bundle bundle0, String s, String s1, NavArgument navArgument0) {
        if(navArgument0 != null) {
            navArgument0.b().g(bundle0, s, s1);
            return false;
        }
        bundle0.putString(s, s1);
        return false;
    }

    public final void s(boolean z) {
        this.l = z;
    }
}

