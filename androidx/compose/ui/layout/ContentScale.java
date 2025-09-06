package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import y4.l;

@Stable
public interface ContentScale {
    public static final class Companion {
        static final Companion a;
        @l
        private static final ContentScale b;
        @l
        private static final ContentScale c;
        @l
        private static final ContentScale d;
        @l
        private static final ContentScale e;
        @l
        private static final ContentScale f;
        @l
        private static final FixedScale g;
        @l
        private static final ContentScale h;

        static {
            Companion.a = new Companion();
            Companion.b = new ContentScale.Companion.Crop.1();
            Companion.c = new ContentScale.Companion.Fit.1();
            Companion.d = new ContentScale.Companion.FillHeight.1();
            Companion.e = new ContentScale.Companion.FillWidth.1();
            Companion.f = new ContentScale.Companion.Inside.1();
            Companion.g = new FixedScale(1.0f);
            Companion.h = new ContentScale.Companion.FillBounds.1();
        }

        @l
        public final ContentScale a() {
            return Companion.b;
        }

        @Stable
        public static void b() {
        }

        @l
        public final ContentScale c() {
            return Companion.h;
        }

        @Stable
        public static void d() {
        }

        @l
        public final ContentScale e() {
            return Companion.d;
        }

        @Stable
        public static void f() {
        }

        @l
        public final ContentScale g() {
            return Companion.e;
        }

        @Stable
        public static void h() {
        }

        @l
        public final ContentScale i() {
            return Companion.c;
        }

        @Stable
        public static void j() {
        }

        @l
        public final ContentScale k() {
            return Companion.f;
        }

        @Stable
        public static void l() {
        }

        @l
        public final FixedScale m() {
            return Companion.g;
        }

        @Stable
        public static void n() {
        }
    }

    @l
    public static final Companion a;

    static {
        ContentScale.a = Companion.a;
    }

    long a(long arg1, long arg2);
}

