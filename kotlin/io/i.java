package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i {
    @l
    private final File a;
    @l
    private final List b;

    public i(@l File file0, @l List list0) {
        L.p(file0, "root");
        L.p(list0, "segments");
        super();
        this.a = file0;
        this.b = list0;
    }

    @l
    public final File a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @l
    public final i c(@l File file0, @l List list0) {
        L.p(file0, "root");
        L.p(list0, "segments");
        return new i(file0, list0);
    }

    public static i d(i i0, File file0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            file0 = i0.a;
        }
        if((v & 2) != 0) {
            list0 = i0.b;
        }
        return i0.c(file0, list0);
    }

    @l
    public final File e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return L.g(this.a, ((i)object0).a) ? L.g(this.b, ((i)object0).b) : false;
    }

    @l
    public final String f() {
        String s = this.a.getPath();
        L.o(s, "getPath(...)");
        return s;
    }

    @l
    public final List g() {
        return this.b;
    }

    public final int h() {
        return this.b.size();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    public final boolean i() {
        String s = this.a.getPath();
        L.o(s, "getPath(...)");
        return s.length() > 0;
    }

    @l
    public final File j(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.h()) {
            throw new IllegalArgumentException();
        }
        List list0 = this.b.subList(v, v1);
        L.o("/", "separator");
        return new File(u.m3(list0, "/", null, null, 0, null, null, 62, null));
    }

    @Override
    @l
    public String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}

