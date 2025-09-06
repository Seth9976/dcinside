package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

public abstract class a {
    public static final class kotlinx.serialization.modules.a.a extends a {
        @l
        private final i a;

        public kotlinx.serialization.modules.a.a(@l i i0) {
            L.p(i0, "serializer");
            super(null);
            this.a = i0;
        }

        @Override  // kotlinx.serialization.modules.a
        @l
        public i a(@l List list0) {
            L.p(list0, "typeArgumentsSerializers");
            return this.a;
        }

        @l
        public final i b() {
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof kotlinx.serialization.modules.a.a && L.g(((kotlinx.serialization.modules.a.a)object0).a, this.a);
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends a {
        @l
        private final Function1 a;

        public b(@l Function1 function10) {
            L.p(function10, "provider");
            super(null);
            this.a = function10;
        }

        @Override  // kotlinx.serialization.modules.a
        @l
        public i a(@l List list0) {
            L.p(list0, "typeArgumentsSerializers");
            return (i)this.a.invoke(list0);
        }

        @l
        public final Function1 b() {
            return this.a;
        }
    }

    private a() {
    }

    public a(w w0) {
    }

    @l
    public abstract i a(@l List arg1);
}

