package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class Locale {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Locale a() {
            return PlatformLocaleKt.a().a().c(0);
        }
    }

    @l
    private final PlatformLocale a;
    @l
    public static final Companion b;
    public static final int c;

    static {
        Locale.b = new Companion(null);
    }

    public Locale(@l PlatformLocale platformLocale0) {
        L.p(platformLocale0, "platformLocale");
        super();
        this.a = platformLocale0;
    }

    public Locale(@l String s) {
        L.p(s, "languageTag");
        this(PlatformLocaleKt.a().b(s));
    }

    @l
    public final String a() {
        return this.a.getLanguage();
    }

    @l
    public final PlatformLocale b() {
        return this.a;
    }

    @l
    public final String c() {
        return this.a.c();
    }

    @l
    public final String d() {
        return this.a.b();
    }

    @l
    public final String e() {
        return this.a.a();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(!(object0 instanceof Locale)) {
            return false;
        }
        return this == object0 ? true : L.g(this.e(), ((Locale)object0).e());
    }

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    @Override
    @l
    public String toString() {
        return this.e();
    }
}

