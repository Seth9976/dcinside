package okhttp3;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public interface CookieJar {
    public static final class Companion {
        static final class NoCookies implements CookieJar {
            @Override  // okhttp3.CookieJar
            @l
            public List loadForRequest(@l HttpUrl httpUrl0) {
                L.p(httpUrl0, "url");
                return u.H();
            }

            @Override  // okhttp3.CookieJar
            public void saveFromResponse(@l HttpUrl httpUrl0, @l List list0) {
                L.p(httpUrl0, "url");
                L.p(list0, "cookies");
            }
        }

        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final CookieJar NO_COOKIES;

    static {
        CookieJar.Companion = Companion.$$INSTANCE;
        CookieJar.NO_COOKIES = new NoCookies();
    }

    @l
    List loadForRequest(@l HttpUrl arg1);

    void saveFromResponse(@l HttpUrl arg1, @l List arg2);
}

