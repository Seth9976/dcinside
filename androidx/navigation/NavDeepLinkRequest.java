package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import y4.l;
import y4.m;
import z3.n;

public class NavDeepLinkRequest {
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
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.e(s);
                return navDeepLinkRequest$Builder0;
            }

            @l
            @n
            public final Builder b(@l String s) {
                L.p(s, "mimeType");
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.f(s);
                return navDeepLinkRequest$Builder0;
            }

            @l
            @n
            public final Builder c(@l Uri uri0) {
                L.p(uri0, "uri");
                Builder navDeepLinkRequest$Builder0 = new Builder(null);
                navDeepLinkRequest$Builder0.g(uri0);
                return navDeepLinkRequest$Builder0;
            }
        }

        @m
        private Uri a;
        @m
        private String b;
        @m
        private String c;
        @l
        public static final Companion d;

        static {
            Builder.d = new Companion(null);
        }

        private Builder() {
        }

        public Builder(w w0) {
        }

        @l
        public final NavDeepLinkRequest a() {
            return new NavDeepLinkRequest(this.a, this.b, this.c);
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
        public static final Builder d(@l Uri uri0) {
            return Builder.d.c(uri0);
        }

        @l
        public final Builder e(@l String s) {
            L.p(s, "action");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.b = s;
            return this;
        }

        @l
        public final Builder f(@l String s) {
            L.p(s, "mimeType");
            if(!new r("^[-\\w*.]+/[-\\w+*.]+$").k(s)) {
                throw new IllegalArgumentException(("The given mimeType " + s + " does not match to required \"type/subtype\" format").toString());
            }
            this.c = s;
            return this;
        }

        @l
        public final Builder g(@l Uri uri0) {
            L.p(uri0, "uri");
            this.a = uri0;
            return this;
        }
    }

    @m
    private final Uri a;
    @m
    private final String b;
    @m
    private final String c;

    @RestrictTo({Scope.b})
    public NavDeepLinkRequest(@l Intent intent0) {
        L.p(intent0, "intent");
        this(intent0.getData(), intent0.getAction(), intent0.getType());
    }

    @RestrictTo({Scope.b})
    public NavDeepLinkRequest(@m Uri uri0, @m String s, @m String s1) {
        this.a = uri0;
        this.b = s;
        this.c = s1;
    }

    @m
    public String a() {
        return this.b;
    }

    @m
    public String b() {
        return this.c;
    }

    @m
    public Uri c() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("NavDeepLinkRequest");
        stringBuilder0.append("{");
        if(this.c() != null) {
            stringBuilder0.append(" uri=");
            stringBuilder0.append(String.valueOf(this.c()));
        }
        if(this.a() != null) {
            stringBuilder0.append(" action=");
            stringBuilder0.append(this.a());
        }
        if(this.b() != null) {
            stringBuilder0.append(" mimetype=");
            stringBuilder0.append(this.b());
        }
        stringBuilder0.append(" }");
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }
}

