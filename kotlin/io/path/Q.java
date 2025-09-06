package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class q {
    private final int a;
    private int b;
    @l
    private final List c;
    @m
    private Path d;

    public q() {
        this(0, 1, null);
    }

    public q(int v) {
        this.a = v;
        this.c = new ArrayList();
    }

    public q(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0x40;
        }
        this(v);
    }

    public final void a(@l Exception exception0) {
        L.p(exception0, "exception");
        ++this.b;
        if(this.c.size() < this.a) {
            if(this.d != null) {
                Throwable throwable0 = o.a(String.valueOf(this.d)).initCause(exception0);
                L.n(throwable0, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception0 = (FileSystemException)throwable0;
            }
            this.c.add(exception0);
        }
    }

    public final void b(@l Path path0) {
        L.p(path0, "name");
        this.d = this.d == null ? null : this.d.resolve(path0);
    }

    public final void c(@l Path path0) {
        L.p(path0, "name");
        Path path1 = null;
        if(!L.g(path0, (this.d == null ? null : this.d.getFileName()))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Path path2 = this.d;
        if(path2 != null) {
            path1 = path2.getParent();
        }
        this.d = path1;
    }

    @l
    public final List d() {
        return this.c;
    }

    @m
    public final Path e() {
        return this.d;
    }

    public final int f() {
        return this.b;
    }

    public final void g(@m Path path0) {
        this.d = path0;
    }
}

