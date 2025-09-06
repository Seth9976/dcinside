package androidx.compose.ui.text.font;

import y4.l;
import y4.m;

public interface PlatformResolveInterceptor {
    public static final class Companion {
        static final Companion a;
        @l
        private static final PlatformResolveInterceptor b;

        static {
            Companion.a = new Companion();
            Companion.b = new PlatformResolveInterceptor.Companion.Default.1();
        }

        @l
        public final PlatformResolveInterceptor a() {
            return Companion.b;
        }
    }

    @l
    public static final Companion a;

    static {
        PlatformResolveInterceptor.a = Companion.a;
    }

    @m
    FontFamily a(@m FontFamily arg1);

    @l
    FontWeight b(@l FontWeight arg1);

    int c(int arg1);

    int d(int arg1);
}

