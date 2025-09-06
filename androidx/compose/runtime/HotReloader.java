package androidx.compose.runtime;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

final class HotReloader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final void a() {
            Recomposer.w.d();
        }

        @l
        public final List b() {
            return Recomposer.w.e();
        }

        public final void c(int v) {
            Recomposer.w.g(v);
        }

        private final void d(Object object0) {
            Recomposer.w.h(object0);
        }

        private final Object e(Object object0) {
            return Recomposer.w.j();
        }

        public final void f(@l Object object0) {
            L.p(object0, "context");
            this.d(this.e(object0));
        }
    }

    @l
    public static final Companion a;

    static {
        HotReloader.a = new Companion(null);
    }
}

