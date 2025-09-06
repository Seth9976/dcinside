package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.L;

public final class l implements f {
    @y4.l
    private final String a;
    private final f b;

    public l(@y4.l String s, @y4.l f f0) {
        L.p(s, "serialName");
        L.p(f0, "original");
        super();
        this.a = s;
        this.b = f0;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean b() {
        return this.b.b();
    }

    @Override  // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.f
    public int c(@y4.l String s) {
        L.p(s, "name");
        return this.b.c(s);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.f
    @y4.l
    public f d(int v) {
        return this.b.d(v);
    }

    @Override  // kotlinx.serialization.descriptors.f
    public int e() {
        return this.b.e();
    }

    @Override  // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.f
    @y4.l
    public String f(int v) {
        return this.b.f(v);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.f
    @y4.l
    public List g(int v) {
        return this.b.g(v);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @y4.l
    public List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override  // kotlinx.serialization.descriptors.f
    @y4.l
    public j getKind() {
        return this.b.getKind();
    }

    @Override  // kotlinx.serialization.descriptors.f
    @y4.l
    public String h() {
        return this.a;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.f
    public boolean i(int v) {
        return this.b.i(v);
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return this.b.isInline();
    }
}

