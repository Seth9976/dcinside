package androidx.navigation;

import y4.l;
import y4.m;

@NavDeepLinkDsl
public final class NavDeepLinkDslBuilder {
    @l
    private final Builder a;
    @m
    private String b;
    @m
    private String c;
    @m
    private String d;

    public NavDeepLinkDslBuilder() {
        this.a = new Builder();
    }

    @l
    public final NavDeepLink a() {
        Builder navDeepLink$Builder0 = this.a;
        String s = this.b;
        if(s == null && this.c == null && this.d == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if(s != null) {
            navDeepLink$Builder0.g(s);
        }
        String s1 = this.c;
        if(s1 != null) {
            navDeepLink$Builder0.e(s1);
        }
        String s2 = this.d;
        if(s2 != null) {
            navDeepLink$Builder0.f(s2);
        }
        return navDeepLink$Builder0.a();
    }

    @m
    public final String b() {
        return this.c;
    }

    @m
    public final String c() {
        return this.d;
    }

    @m
    public final String d() {
        return this.b;
    }

    public final void e(@m String s) {
        if(s != null && s.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.c = s;
    }

    public final void f(@m String s) {
        this.d = s;
    }

    public final void g(@m String s) {
        this.b = s;
    }
}

