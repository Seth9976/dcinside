package kotlin.io.path;

import A3.o;
import java.nio.file.FileVisitor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@r
public final class t implements s {
    @m
    private o a;
    @m
    private o b;
    @m
    private o c;
    @m
    private o d;
    private boolean e;

    @Override  // kotlin.io.path.s
    public void a(@l o o0) {
        L.p(o0, "function");
        this.f();
        this.g(this.b, "onVisitFile");
        this.b = o0;
    }

    @Override  // kotlin.io.path.s
    public void b(@l o o0) {
        L.p(o0, "function");
        this.f();
        this.g(this.c, "onVisitFileFailed");
        this.c = o0;
    }

    @Override  // kotlin.io.path.s
    public void c(@l o o0) {
        L.p(o0, "function");
        this.f();
        this.g(this.a, "onPreVisitDirectory");
        this.a = o0;
    }

    @Override  // kotlin.io.path.s
    public void d(@l o o0) {
        L.p(o0, "function");
        this.f();
        this.g(this.d, "onPostVisitDirectory");
        this.d = o0;
    }

    @l
    public final FileVisitor e() {
        this.f();
        this.e = true;
        return h.a(new v(this.a, this.b, this.c, this.d));
    }

    private final void f() {
        if(this.e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void g(Object object0, String s) {
        if(object0 != null) {
            throw new IllegalStateException(s + " was already defined");
        }
    }
}

