package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class ProxyConfig {
    public static final class Builder {
        private List a;
        private List b;
        private boolean c;

        public Builder() {
            this.c = false;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public Builder(@NonNull ProxyConfig proxyConfig0) {
            this.c = false;
            this.a = proxyConfig0.b();
            this.b = proxyConfig0.a();
            this.c = proxyConfig0.c();
        }

        @NonNull
        public Builder a(@NonNull String s) {
            this.b.add(s);
            return this;
        }

        @NonNull
        public Builder b() {
            return this.c("*");
        }

        @NonNull
        public Builder c(@NonNull String s) {
            this.a.add(new ProxyRule(s, "direct://"));
            return this;
        }

        @NonNull
        public Builder d(@NonNull String s) {
            this.a.add(new ProxyRule(s));
            return this;
        }

        @NonNull
        public Builder e(@NonNull String s, @NonNull String s1) {
            this.a.add(new ProxyRule(s1, s));
            return this;
        }

        @NonNull
        public ProxyConfig f() {
            return new ProxyConfig(this.i(), this.g(), this.k());
        }

        @NonNull
        private List g() {
            return this.b;
        }

        @NonNull
        public Builder h() {
            return this.a("<local>");
        }

        @NonNull
        private List i() {
            return this.a;
        }

        @NonNull
        public Builder j() {
            return this.a("<-loopback>");
        }

        private boolean k() {
            return this.c;
        }

        @NonNull
        public Builder l(boolean z) {
            this.c = z;
            return this;
        }
    }

    public static final class ProxyRule {
        private String a;
        private String b;

        @RestrictTo({Scope.a})
        public ProxyRule(@NonNull String s) {
            this("*", s);
        }

        @RestrictTo({Scope.a})
        public ProxyRule(@NonNull String s, @NonNull String s1) {
            this.a = s;
            this.b = s1;
        }

        @NonNull
        public String a() {
            return this.a;
        }

        @NonNull
        public String b() {
            return this.b;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProxyScheme {
    }

    private List a;
    private List b;
    private boolean c;
    public static final String d = "http";
    public static final String e = "https";
    public static final String f = "*";
    private static final String g = "direct://";
    private static final String h = "<local>";
    private static final String i = "<-loopback>";

    @RestrictTo({Scope.a})
    public ProxyConfig(@NonNull List list0, @NonNull List list1, boolean z) {
        this.a = list0;
        this.b = list1;
        this.c = z;
    }

    @NonNull
    public List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @NonNull
    public List b() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public boolean c() {
        return this.c;
    }
}

