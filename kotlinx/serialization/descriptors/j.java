package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.w;
import kotlinx.serialization.f;
import y4.l;

@f
public abstract class j {
    @f
    public static final class a extends j {
        @l
        public static final a a;

        static {
            a.a = new a();
        }

        private a() {
            super(null);
        }
    }

    @f
    public static final class b extends j {
        @l
        public static final b a;

        static {
            b.a = new b();
        }

        private b() {
            super(null);
        }
    }

    private j() {
    }

    public j(w w0) {
    }

    // 去混淆评级： 低(30)
    @Override
    public int hashCode() {
        return 106;
    }

    @Override
    @l
    public String toString() [...] // 潜在的解密器
}

