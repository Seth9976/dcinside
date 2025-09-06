package j0;

import com.dcinside.app.model.f0;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e extends f0 {
    @c("imgInfo")
    @l
    private final List e;

    public e() {
        this(null, 1, null);
    }

    public e(@l List list0) {
        L.p(list0, "images");
        super();
        this.e = list0;
    }

    public e(List list0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = u.H();
        }
        this(list0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? L.g(this.e, ((e)object0).e) : false;
    }

    @l
    public final List g() {
        return this.e;
    }

    @l
    public final e h(@l List list0) {
        L.p(list0, "images");
        return new e(list0);
    }

    @Override
    public int hashCode() {
        return this.e.hashCode();
    }

    public static e i(e e0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = e0.e;
        }
        return e0.h(list0);
    }

    @l
    public final List l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "MyAutoImageInfo(images=" + this.e + ")";
    }
}

