package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.a.d;
import com.bykv.vk.openvk.preload.a.c.a;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class c implements s, Cloneable {
    public static final c a;
    private double b;
    private int c;
    private boolean d;
    private List e;
    private List f;

    static {
        c.a = new c();
    }

    public c() {
        this.b = -1.0;
        this.c = 0x88;
        this.d = true;
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    private c a() {
        try {
            return (c)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.c c0) {
        return c0 == null || c0.a() <= this.b;
    }

    // 去混淆评级： 低(20)
    private boolean a(com.bykv.vk.openvk.preload.a.a.c c0, d d0) {
        return this.a(c0) && this.a(d0);
    }

    private boolean a(d d0) {
        return d0 == null || d0.a() > this.b;
    }

    private boolean a(Class class0) {
        if(this.b != -1.0 && !this.a(((com.bykv.vk.openvk.preload.a.a.c)class0.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class)), ((d)class0.getAnnotation(d.class)))) {
            return true;
        }
        return this.d || !c.c(class0) ? c.b(class0) : true;
    }

    private boolean a(boolean z) {
        for(Object object0: (z ? this.e : this.f)) {
            if(((com.bykv.vk.openvk.preload.geckox.a.a.c)object0).c()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // com.bykv.vk.openvk.preload.a.s
    public final r a(com.bykv.vk.openvk.preload.a.d d0, a a0) {
        boolean z = this.a(a0.a());
        boolean z1 = z || this.a(true);
        boolean z2 = z || this.a(false);
        return !z1 && !z2 ? null : new r() {
            private r a;
            private c f;

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final Object a(com.bykv.vk.openvk.preload.a.d.a a0) throws IOException {
                if(z2) {
                    a0.n();
                    return null;
                }
                return this.b().a(a0);
            }

            @Override  // com.bykv.vk.openvk.preload.a.r
            public final void a(com.bykv.vk.openvk.preload.a.d.c c0, Object object0) throws IOException {
                if(z1) {
                    c0.h();
                    return;
                }
                this.b().a(c0, object0);
            }

            private r b() {
                r r0 = this.a;
                if(r0 != null) {
                    return r0;
                }
                r r1 = d0.a(c.this, a0);
                this.a = r1;
                return r1;
            }
        };
    }

    // 去混淆评级： 低(20)
    public final boolean a(Class class0, boolean z) {
        return this.a(class0) || this.a(z);
    }

    public final boolean a(Field field0, boolean z) {
        if((this.c & field0.getModifiers()) != 0) {
            return true;
        }
        if(this.b != -1.0 && !this.a(((com.bykv.vk.openvk.preload.a.a.c)field0.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class)), ((d)field0.getAnnotation(d.class)))) {
            return true;
        }
        if(field0.isSynthetic()) {
            return true;
        }
        if(!this.d && c.c(field0.getType())) {
            return true;
        }
        if(c.b(field0.getType())) {
            return true;
        }
        List list0 = z ? this.e : this.f;
        if(!list0.isEmpty()) {
            new com.bykv.vk.openvk.preload.geckox.a.c(field0);
            for(Object object0: list0) {
                if(((com.bykv.vk.openvk.preload.geckox.a.a.c)object0).b()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    private static boolean b(Class class0) {
        return !Enum.class.isAssignableFrom(class0) && (class0.isAnonymousClass() || class0.isLocalClass());
    }

    // 去混淆评级： 低(20)
    private static boolean c(Class class0) {
        return class0.isMemberClass() && !c.d(class0);
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        return this.a();
    }

    private static boolean d(Class class0) {
        return (class0.getModifiers() & 8) != 0;
    }
}

