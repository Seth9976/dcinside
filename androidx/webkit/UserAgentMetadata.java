package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class UserAgentMetadata {
    public static final class BrandVersion {
        public static final class Builder {
            private String a;
            private String b;
            private String c;

            public Builder() {
            }

            public Builder(@NonNull BrandVersion userAgentMetadata$BrandVersion0) {
                this.a = userAgentMetadata$BrandVersion0.a();
                this.b = userAgentMetadata$BrandVersion0.c();
                this.c = userAgentMetadata$BrandVersion0.b();
            }

            @NonNull
            public BrandVersion a() {
                if(this.a == null || this.a.trim().isEmpty() || (this.b == null || this.b.trim().isEmpty()) || (this.c == null || this.c.trim().isEmpty())) {
                    throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new BrandVersion(this.a, this.b, this.c, null);
            }

            @NonNull
            public Builder b(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("Brand should not be blank.");
                }
                this.a = s;
                return this;
            }

            @NonNull
            public Builder c(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("FullVersion should not be blank.");
                }
                this.c = s;
                return this;
            }

            @NonNull
            public Builder d(@NonNull String s) {
                if(s.trim().isEmpty()) {
                    throw new IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.b = s;
                return this;
            }
        }

        private final String a;
        private final String b;
        private final String c;

        @RestrictTo({Scope.a})
        private BrandVersion(@NonNull String s, @NonNull String s1, @NonNull String s2) {
            this.a = s;
            this.b = s1;
            this.c = s2;
        }

        BrandVersion(String s, String s1, String s2, androidx.webkit.UserAgentMetadata.1 userAgentMetadata$10) {
            this(s, s1, s2);
        }

        @NonNull
        public String a() {
            return this.a;
        }

        @NonNull
        public String b() {
            return this.c;
        }

        @NonNull
        public String c() {
            return this.b;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BrandVersion ? Objects.equals(this.a, ((BrandVersion)object0).a) && Objects.equals(this.b, ((BrandVersion)object0).b) && Objects.equals(this.c, ((BrandVersion)object0).c) : false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }

        @Override
        @NonNull
        public String toString() {
            return this.a + "," + this.b + "," + this.c;
        }
    }

    public static final class androidx.webkit.UserAgentMetadata.Builder {
        private List a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g;
        private int h;
        private boolean i;

        public androidx.webkit.UserAgentMetadata.Builder() {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
        }

        public androidx.webkit.UserAgentMetadata.Builder(@NonNull UserAgentMetadata userAgentMetadata0) {
            this.a = new ArrayList();
            this.g = true;
            this.h = 0;
            this.i = false;
            this.a = userAgentMetadata0.c();
            this.b = userAgentMetadata0.d();
            this.c = userAgentMetadata0.f();
            this.d = userAgentMetadata0.g();
            this.e = userAgentMetadata0.a();
            this.f = userAgentMetadata0.e();
            this.g = userAgentMetadata0.h();
            this.h = userAgentMetadata0.b();
            this.i = userAgentMetadata0.i();
        }

        @NonNull
        public UserAgentMetadata a() {
            return new UserAgentMetadata(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder b(@Nullable String s) {
            this.e = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder c(int v) {
            this.h = v;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder d(@NonNull List list0) {
            this.a = list0;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder e(@Nullable String s) {
            if(s == null) {
                this.b = null;
                return this;
            }
            if(s.trim().isEmpty()) {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
            this.b = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder f(boolean z) {
            this.g = z;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder g(@Nullable String s) {
            this.f = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder h(@Nullable String s) {
            if(s == null) {
                this.c = null;
                return this;
            }
            if(s.trim().isEmpty()) {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
            this.c = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder i(@Nullable String s) {
            this.d = s;
            return this;
        }

        @NonNull
        public androidx.webkit.UserAgentMetadata.Builder j(boolean z) {
            this.i = z;
            return this;
        }
    }

    private final List a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private boolean g;
    private int h;
    private boolean i;
    public static final int j;

    @RestrictTo({Scope.a})
    private UserAgentMetadata(@NonNull List list0, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, boolean z, int v, boolean z1) {
        this.a = list0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = z;
        this.h = v;
        this.i = z1;
    }

    UserAgentMetadata(List list0, String s, String s1, String s2, String s3, String s4, boolean z, int v, boolean z1, androidx.webkit.UserAgentMetadata.1 userAgentMetadata$10) {
        this(list0, s, s1, s2, s3, s4, z, v, z1);
    }

    @Nullable
    public String a() {
        return this.e;
    }

    public int b() {
        return this.h;
    }

    @NonNull
    public List c() {
        return this.a;
    }

    @Nullable
    public String d() {
        return this.b;
    }

    @Nullable
    public String e() {
        return this.f;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UserAgentMetadata ? this.g == ((UserAgentMetadata)object0).g && this.h == ((UserAgentMetadata)object0).h && this.i == ((UserAgentMetadata)object0).i && Objects.equals(this.a, ((UserAgentMetadata)object0).a) && Objects.equals(this.b, ((UserAgentMetadata)object0).b) && Objects.equals(this.c, ((UserAgentMetadata)object0).c) && Objects.equals(this.d, ((UserAgentMetadata)object0).d) && Objects.equals(this.e, ((UserAgentMetadata)object0).e) && Objects.equals(this.f, ((UserAgentMetadata)object0).f) : false;
    }

    @Nullable
    public String f() {
        return this.c;
    }

    @Nullable
    public String g() {
        return this.d;
    }

    public boolean h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i)});
    }

    public boolean i() {
        return this.i;
    }

    class androidx.webkit.UserAgentMetadata.1 {
    }

}

