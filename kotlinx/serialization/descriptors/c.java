package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import y4.l;
import y4.m;

final class c implements f {
    @l
    private final f a;
    @l
    @z3.f
    public final d b;
    @l
    private final String c;

    public c(@l f f0, @l d d0) {
        L.p(f0, "original");
        L.p(d0, "kClass");
        super();
        this.a = f0;
        this.b = d0;
        this.c = f0.h() + '<' + d0.u() + '>';
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

    // 去混淆评级： 低(25)
    @Override
    public boolean equals(@m Object object0) {
        c c0 = object0 instanceof c ? ((c)object0) : null;
        return c0 == null ? false : L.g(this.a, c0.a) && L.g(c0.b, this.b);
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

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public String h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.h().hashCode();
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

    @Override
    @l
    public String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}

