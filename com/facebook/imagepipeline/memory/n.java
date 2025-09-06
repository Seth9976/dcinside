package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.j;
import com.facebook.common.memory.m;
import k1.n.a;
import k1.n;
import o3.h;
import p3.c;

@n(a.a)
@c
public class N {
    private final L a;
    @h
    private D b;
    @h
    private k c;
    @h
    private D d;
    @h
    private y e;
    @h
    private D f;
    @h
    private j g;
    @h
    private m h;
    @h
    private Q i;
    @h
    private com.facebook.common.memory.a j;

    public N(L l0) {
        this.a = (L)com.facebook.common.internal.n.i(l0);
    }

    @h
    private D a() {
        if(this.b == null) {
            this.b = new AshmemMemoryChunkPool(this.a.i(), this.a.g(), this.a.h());
            return this.b;
        }
        return this.b;
    }

    public k b() {
        if(this.c == null) {
            switch(this.a.e()) {
                case "dummy": {
                    break;
                }
                case "dummy_with_tracking": {
                    this.c = new x();
                    return this.c;
                }
                case "experimental": {
                    I i0 = I.h();
                    this.c = new A(this.a.b(), this.a.a(), i0, (this.a.m() ? this.a.i() : null));
                    return this.c;
                }
                case "legacy": {
                    this.c = new q(this.a.i(), this.a.c(), this.a.d(), this.a.l());
                    return this.c;
                }
                case "legacy_default_params": {
                    O o0 = s.a();
                    this.c = new q(this.a.i(), o0, this.a.d(), this.a.l());
                    return this.c;
                }
                default: {
                    this.c = new q(this.a.i(), this.a.c(), this.a.d(), this.a.l());
                    return this.c;
                }
            }
            this.c = new w();
        }
        return this.c;
    }

    @h
    public D c() {
        if(this.d == null) {
            this.d = new BufferMemoryChunkPool(this.a.i(), this.a.g(), this.a.h());
            return this.d;
        }
        return this.d;
    }

    public y d() {
        if(this.e == null) {
            this.e = new y(this.a.i(), this.a.f());
        }
        return this.e;
    }

    public int e() {
        return this.a.f().g;
    }

    @h
    private D f(int v) {
        switch(v) {
            case 0: {
                return this.g();
            }
            case 1: {
                return this.c();
            }
            case 2: {
                return this.a();
            }
            default: {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
        }
    }

    @h
    public D g() {
        if(this.f == null) {
            this.f = new NativeMemoryChunkPool(this.a.i(), this.a.g(), this.a.h());
            return this.f;
        }
        return this.f;
    }

    // 去混淆评级： 低(20)
    public j h() {
        return this.i(false);
    }

    public j i(int v) {
        if(this.g == null) {
            D d0 = this.f(v);
            com.facebook.common.internal.n.j(d0, "failed to get pool for chunk type: " + v);
            this.g = new G(d0, this.j());
        }
        return this.g;
    }

    public m j() {
        if(this.h == null) {
            this.h = new m(this.l());
        }
        return this.h;
    }

    public Q k() {
        if(this.i == null) {
            this.i = new Q(this.a.i(), this.a.f());
        }
        return this.i;
    }

    public com.facebook.common.memory.a l() {
        if(this.j == null) {
            O o0 = this.a.j();
            P p0 = this.a.k();
            this.j = new z(this.a.i(), o0, p0);
        }
        return this.j;
    }
}

