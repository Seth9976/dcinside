package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.r;
import y4.l;
import y4.m;

public abstract class u0 extends K implements Closeable {
    @r
    public static final class a extends b {
        private a() {
            static final class kotlinx.coroutines.u0.a.a extends N implements Function1 {
                public static final kotlinx.coroutines.u0.a.a e;

                static {
                    kotlinx.coroutines.u0.a.a.e = new kotlinx.coroutines.u0.a.a();
                }

                kotlinx.coroutines.u0.a.a() {
                    super(1);
                }

                // 去混淆评级： 低(20)
                @m
                public final u0 a(@l kotlin.coroutines.g.b g$b0) {
                    return g$b0 instanceof u0 ? ((u0)g$b0) : null;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((kotlin.coroutines.g.b)object0));
                }
            }

            super(K.a, kotlinx.coroutines.u0.a.a.e);
        }

        public a(w w0) {
        }
    }

    @l
    public static final a b;

    static {
        u0.b = new a(null);
    }

    @Override
    public abstract void close();

    @l
    public abstract Executor u1();
}

