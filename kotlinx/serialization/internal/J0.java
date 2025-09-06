package kotlinx.serialization.internal;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.serialization.descriptors.f.a;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j;
import kotlinx.serialization.descriptors.k.c;
import y4.l;
import y4.m;

public abstract class j0 implements f {
    @l
    private final String a;
    @l
    private final f b;
    @l
    private final f c;
    private final int d;

    private j0(String s, f f0, f f1) {
        this.a = s;
        this.b = f0;
        this.c = f1;
        this.d = 2;
    }

    public j0(String s, f f0, f f1, w w0) {
        this(s, f0, f1);
    }

    @l
    public final f a() {
        return this.b;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean b() {
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public int c(@l String s) {
        L.p(s, "name");
        Integer integer0 = v.b1(s);
        if(integer0 == null) {
            throw new IllegalArgumentException(s + " is not a valid map index");
        }
        return (int)integer0;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public f d(int v) {
        if(v >= 0) {
            switch(v % 2) {
                case 0: {
                    return this.b;
                }
                case 1: {
                    return this.c;
                }
                default: {
                    throw new IllegalStateException("Unreached");
                }
            }
        }
        throw new IllegalArgumentException(("Illegal index " + v + ", " + this.h() + " expects only non-negative indices").toString());
    }

    @Override  // kotlinx.serialization.descriptors.f
    public int e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j0)) {
            return false;
        }
        if(!L.g(this.h(), ((j0)object0).h())) {
            return false;
        }
        return L.g(this.b, ((j0)object0).b) ? L.g(this.c, ((j0)object0).c) : false;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public String f(int v) {
        return String.valueOf(v);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public List g(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Illegal index " + v + ", " + this.h() + " expects only non-negative indices").toString());
        }
        return u.H();
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public List getAnnotations() {
        return a.a(this);
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public j getKind() {
        return c.a;
    }

    @Override  // kotlinx.serialization.descriptors.f
    @l
    public String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (this.h().hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean i(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Illegal index " + v + ", " + this.h() + " expects only non-negative indices").toString());
        }
        return false;
    }

    @Override  // kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return false;
    }

    @l
    public final f j() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return this.h() + '(' + this.b + ", " + this.c + ')';
    }
}

