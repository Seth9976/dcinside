package kotlinx.serialization.json;

import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.x;
import y4.l;

@b0
@x(forClass = c.class)
public final class e implements i {
    static final class a implements f {
        private final f a;
        @l
        public static final a b;
        @l
        private static final String c;

        static {
            a.b = new a();
            a.c = "kotlinx.serialization.json.JsonArray";
        }

        private a() {
            this.a = P3.a.i(o.a).getDescriptor();
        }

        @kotlinx.serialization.f
        public static void a() {
        }

        @Override  // kotlinx.serialization.descriptors.f
        public boolean b() {
            return this.a.b();
        }

        @Override  // kotlinx.serialization.descriptors.f
        @kotlinx.serialization.f
        public int c(@l String s) {
            L.p(s, "name");
            return this.a.c(s);
        }

        @Override  // kotlinx.serialization.descriptors.f
        @kotlinx.serialization.f
        @l
        public f d(int v) {
            return this.a.d(v);
        }

        @Override  // kotlinx.serialization.descriptors.f
        public int e() {
            return this.a.e();
        }

        @Override  // kotlinx.serialization.descriptors.f
        @kotlinx.serialization.f
        @l
        public String f(int v) {
            return this.a.f(v);
        }

        @Override  // kotlinx.serialization.descriptors.f
        @kotlinx.serialization.f
        @l
        public List g(int v) {
            return this.a.g(v);
        }

        @Override  // kotlinx.serialization.descriptors.f
        @l
        public List getAnnotations() {
            return this.a.getAnnotations();
        }

        @Override  // kotlinx.serialization.descriptors.f
        @l
        public j getKind() {
            return this.a.getKind();
        }

        // 去混淆评级： 低(20)
        @Override  // kotlinx.serialization.descriptors.f
        @l
        public String h() {
            return "kotlinx.serialization.json.JsonArray";
        }

        @Override  // kotlinx.serialization.descriptors.f
        @kotlinx.serialization.f
        public boolean i(int v) {
            return this.a.i(v);
        }

        @Override  // kotlinx.serialization.descriptors.f
        public boolean isInline() {
            return this.a.isInline();
        }
    }

    @l
    public static final e a;
    @l
    private static final f b;

    static {
        e.a = new e();
        e.b = a.b;
    }

    @l
    public c a(@l kotlinx.serialization.encoding.e e0) {
        L.p(e0, "decoder");
        p.g(e0);
        return new c(((List)P3.a.i(o.a).deserialize(e0)));
    }

    public void b(@l g g0, @l c c0) {
        L.p(g0, "encoder");
        L.p(c0, "value");
        p.h(g0);
        P3.a.i(o.a).serialize(g0, c0);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(kotlinx.serialization.encoding.e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return e.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((c)object0));
    }
}

