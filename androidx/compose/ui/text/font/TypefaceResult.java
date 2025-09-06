package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public interface TypefaceResult extends State {
    @StabilityInferred(parameters = 0)
    public static final class Async implements State, TypefaceResult {
        @l
        private final AsyncFontListLoader a;
        public static final int b;

        static {
        }

        public Async(@l AsyncFontListLoader asyncFontListLoader0) {
            L.p(asyncFontListLoader0, "current");
            super();
            this.a = asyncFontListLoader0;
        }

        @l
        public final AsyncFontListLoader b() {
            return this.a;
        }

        @Override  // androidx.compose.ui.text.font.TypefaceResult
        public boolean c() {
            return this.a.d();
        }

        @Override  // androidx.compose.runtime.State
        @l
        public Object getValue() {
            return this.a.getValue();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class Immutable implements TypefaceResult {
        @l
        private final Object a;
        private final boolean b;
        public static final int c;

        static {
        }

        public Immutable(@l Object object0, boolean z) {
            L.p(object0, "value");
            super();
            this.a = object0;
            this.b = z;
        }

        public Immutable(Object object0, boolean z, int v, w w0) {
            if((v & 2) != 0) {
                z = true;
            }
            this(object0, z);
        }

        @Override  // androidx.compose.ui.text.font.TypefaceResult
        public boolean c() {
            return this.b;
        }

        @Override  // androidx.compose.runtime.State
        @l
        public Object getValue() {
            return this.a;
        }
    }

    boolean c();
}

