package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import okhttp3.internal.Util;
import y4.l;
import y4.m;
import z3.f;
import z3.i;
import z3.n;

public final class CacheControl {
    @s0({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public Builder() {
            this.maxAgeSeconds = -1;
            this.maxStaleSeconds = -1;
            this.minFreshSeconds = -1;
        }

        @l
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        private final int clampToInt(long v) {
            return v <= 0x7FFFFFFFL ? ((int)v) : 0x7FFFFFFF;
        }

        @l
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @l
        public final Builder maxAge(int v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("maxAge < 0: " + v).toString());
            }
            this.maxAgeSeconds = this.clampToInt(timeUnit0.toSeconds(((long)v)));
            return this;
        }

        @l
        public final Builder maxStale(int v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("maxStale < 0: " + v).toString());
            }
            this.maxStaleSeconds = this.clampToInt(timeUnit0.toSeconds(((long)v)));
            return this;
        }

        @l
        public final Builder minFresh(int v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("minFresh < 0: " + v).toString());
            }
            this.minFreshSeconds = this.clampToInt(timeUnit0.toSeconds(((long)v)));
            return this;
        }

        @l
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @l
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @l
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @l
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final int indexOfElement(String s, String s1, int v) {
            int v1 = s.length();
            while(v < v1) {
                if(v.V2(s1, s.charAt(v), false, 2, null)) {
                    return v;
                }
                ++v;
            }
            return s.length();
        }

        static int indexOfElement$default(Companion cacheControl$Companion0, String s, String s1, int v, int v1, Object object0) {
            if((v1 & 2) != 0) {
                v = 0;
            }
            return cacheControl$Companion0.indexOfElement(s, s1, v);
        }

        @l
        @n
        public final CacheControl parse(@l Headers headers0) {
            int v10;
            String s5;
            int v6;
            L.p(headers0, "headers");
            int v = headers0.size();
            int v1 = 0;
            boolean z = true;
            String s = null;
            boolean z1 = false;
            boolean z2 = false;
            int v2 = -1;
            int v3 = -1;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            int v4 = -1;
            int v5 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            while(v1 < v) {
                String s1 = headers0.name(v1);
                String s2 = headers0.value(v1);
                if(v.O1(s1, "Cache-Control", true)) {
                    if(s == null) {
                        s = s2;
                    }
                    else {
                        z = false;
                    }
                    v6 = 0;
                    goto label_30;
                }
                else if(v.O1(s1, "Pragma", true)) {
                    z = false;
                    v6 = 0;
                label_30:
                    while(v6 < s2.length()) {
                        int v7 = this.indexOfElement(s2, "=,;", v6);
                        String s3 = s2.substring(v6, v7);
                        L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                        String s4 = v.G5(s3).toString();
                        if(v7 == s2.length() || s2.charAt(v7) == 44 || s2.charAt(v7) == 59) {
                            v10 = v7 + 1;
                            s5 = null;
                        }
                        else {
                            int v8 = Util.indexOfNonWhitespace(s2, v7 + 1);
                            if(v8 >= s2.length() || s2.charAt(v8) != 34) {
                                v10 = this.indexOfElement(s2, ",;", v8);
                                String s6 = s2.substring(v8, v10);
                                L.o(s6, "this as java.lang.String…ing(startIndex, endIndex)");
                                s5 = v.G5(s6).toString();
                            }
                            else {
                                int v9 = v.r3(s2, '\"', v8 + 1, false, 4, null);
                                s5 = s2.substring(v8 + 1, v9);
                                L.o(s5, "this as java.lang.String…ing(startIndex, endIndex)");
                                v10 = v9 + 1;
                            }
                        }
                        if(v.O1("no-cache", s4, true)) {
                            v6 = v10;
                            z1 = true;
                        }
                        else if(v.O1("no-store", s4, true)) {
                            v6 = v10;
                            z2 = true;
                        }
                        else {
                            if(v.O1("max-age", s4, true)) {
                                v2 = Util.toNonNegativeInt(s5, -1);
                            }
                            else if(v.O1("s-maxage", s4, true)) {
                                v3 = Util.toNonNegativeInt(s5, -1);
                            }
                            else if(v.O1("private", s4, true)) {
                                v6 = v10;
                                z3 = true;
                                continue;
                            }
                            else if(v.O1("public", s4, true)) {
                                v6 = v10;
                                z4 = true;
                                continue;
                            }
                            else if(v.O1("must-revalidate", s4, true)) {
                                v6 = v10;
                                z5 = true;
                                continue;
                            }
                            else if(v.O1("max-stale", s4, true)) {
                                v4 = Util.toNonNegativeInt(s5, 0x7FFFFFFF);
                            }
                            else if(v.O1("min-fresh", s4, true)) {
                                v5 = Util.toNonNegativeInt(s5, -1);
                            }
                            else if(v.O1("only-if-cached", s4, true)) {
                                v6 = v10;
                                z6 = true;
                                continue;
                            }
                            else if(v.O1("no-transform", s4, true)) {
                                v6 = v10;
                                z7 = true;
                                continue;
                            }
                            else if(v.O1("immutable", s4, true)) {
                                v6 = v10;
                                z8 = true;
                                continue;
                            }
                            v6 = v10;
                        }
                    }
                }
                ++v1;
            }
            return z ? new CacheControl(z1, z2, v2, v3, z3, z4, z5, v4, v5, z6, z7, z8, s, null) : new CacheControl(z1, z2, v2, v3, z3, z4, z5, v4, v5, z6, z7, z8, null, null);
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final CacheControl FORCE_CACHE;
    @l
    @f
    public static final CacheControl FORCE_NETWORK;
    @m
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "immutable", imports = {}))
    @i(name = "-deprecated_immutable")
    public final boolean -deprecated_immutable() {
        return this.immutable;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "maxAgeSeconds", imports = {}))
    @i(name = "-deprecated_maxAgeSeconds")
    public final int -deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "maxStaleSeconds", imports = {}))
    @i(name = "-deprecated_maxStaleSeconds")
    public final int -deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "minFreshSeconds", imports = {}))
    @i(name = "-deprecated_minFreshSeconds")
    public final int -deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "mustRevalidate", imports = {}))
    @i(name = "-deprecated_mustRevalidate")
    public final boolean -deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "noCache", imports = {}))
    @i(name = "-deprecated_noCache")
    public final boolean -deprecated_noCache() {
        return this.noCache;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "noStore", imports = {}))
    @i(name = "-deprecated_noStore")
    public final boolean -deprecated_noStore() {
        return this.noStore;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "noTransform", imports = {}))
    @i(name = "-deprecated_noTransform")
    public final boolean -deprecated_noTransform() {
        return this.noTransform;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "onlyIfCached", imports = {}))
    @i(name = "-deprecated_onlyIfCached")
    public final boolean -deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "sMaxAgeSeconds", imports = {}))
    @i(name = "-deprecated_sMaxAgeSeconds")
    public final int -deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    static {
        CacheControl.Companion = new Companion(null);
        CacheControl.FORCE_NETWORK = new Builder().noCache().build();
        CacheControl.FORCE_CACHE = new Builder().onlyIfCached().maxStale(0x7FFFFFFF, TimeUnit.SECONDS).build();
    }

    private CacheControl(boolean z, boolean z1, int v, int v1, boolean z2, boolean z3, boolean z4, int v2, int v3, boolean z5, boolean z6, boolean z7, String s) {
        this.noCache = z;
        this.noStore = z1;
        this.maxAgeSeconds = v;
        this.sMaxAgeSeconds = v1;
        this.isPrivate = z2;
        this.isPublic = z3;
        this.mustRevalidate = z4;
        this.maxStaleSeconds = v2;
        this.minFreshSeconds = v3;
        this.onlyIfCached = z5;
        this.noTransform = z6;
        this.immutable = z7;
        this.headerValue = s;
    }

    public CacheControl(boolean z, boolean z1, int v, int v1, boolean z2, boolean z3, boolean z4, int v2, int v3, boolean z5, boolean z6, boolean z7, String s, w w0) {
        this(z, z1, v, v1, z2, z3, z4, v2, v3, z5, z6, z7, s);
    }

    @i(name = "immutable")
    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    @i(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @i(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @i(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @i(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    @i(name = "noCache")
    public final boolean noCache() {
        return this.noCache;
    }

    @i(name = "noStore")
    public final boolean noStore() {
        return this.noStore;
    }

    @i(name = "noTransform")
    public final boolean noTransform() {
        return this.noTransform;
    }

    @i(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    @l
    @n
    public static final CacheControl parse(@l Headers headers0) {
        return CacheControl.Companion.parse(headers0);
    }

    @i(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @Override
    @l
    public String toString() {
        String s = this.headerValue;
        if(s == null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.noCache) {
                stringBuilder0.append("no-cache, ");
            }
            if(this.noStore) {
                stringBuilder0.append("no-store, ");
            }
            if(this.maxAgeSeconds != -1) {
                stringBuilder0.append("max-age=");
                stringBuilder0.append(this.maxAgeSeconds);
                stringBuilder0.append(", ");
            }
            if(this.sMaxAgeSeconds != -1) {
                stringBuilder0.append("s-maxage=");
                stringBuilder0.append(this.sMaxAgeSeconds);
                stringBuilder0.append(", ");
            }
            if(this.isPrivate) {
                stringBuilder0.append("private, ");
            }
            if(this.isPublic) {
                stringBuilder0.append("public, ");
            }
            if(this.mustRevalidate) {
                stringBuilder0.append("must-revalidate, ");
            }
            if(this.maxStaleSeconds != -1) {
                stringBuilder0.append("max-stale=");
                stringBuilder0.append(this.maxStaleSeconds);
                stringBuilder0.append(", ");
            }
            if(this.minFreshSeconds != -1) {
                stringBuilder0.append("min-fresh=");
                stringBuilder0.append(this.minFreshSeconds);
                stringBuilder0.append(", ");
            }
            if(this.onlyIfCached) {
                stringBuilder0.append("only-if-cached, ");
            }
            if(this.noTransform) {
                stringBuilder0.append("no-transform, ");
            }
            if(this.immutable) {
                stringBuilder0.append("immutable, ");
            }
            if(stringBuilder0.length() == 0) {
                return "";
            }
            stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
            s = stringBuilder0.toString();
            L.o(s, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = s;
        }
        return s;
    }
}

