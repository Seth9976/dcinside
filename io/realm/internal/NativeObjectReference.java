package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class NativeObjectReference extends PhantomReference {
    static class a {
    }

    static class b {
        NativeObjectReference a;

        private b() {
        }

        b(a nativeObjectReference$a0) {
        }

        void a(NativeObjectReference nativeObjectReference0) {
            synchronized(this) {
                nativeObjectReference0.d = null;
                nativeObjectReference0.e = this.a;
                NativeObjectReference nativeObjectReference1 = this.a;
                if(nativeObjectReference1 != null) {
                    nativeObjectReference1.d = nativeObjectReference0;
                }
                this.a = nativeObjectReference0;
            }
        }

        void b(NativeObjectReference nativeObjectReference0) {
            synchronized(this) {
                NativeObjectReference nativeObjectReference1 = nativeObjectReference0.e;
                NativeObjectReference nativeObjectReference2 = nativeObjectReference0.d;
                nativeObjectReference0.e = null;
                nativeObjectReference0.d = null;
                if(nativeObjectReference2 == null) {
                    this.a = nativeObjectReference1;
                }
                else {
                    nativeObjectReference2.e = nativeObjectReference1;
                }
                if(nativeObjectReference1 != null) {
                    nativeObjectReference1.d = nativeObjectReference2;
                }
            }
        }
    }

    private final long a;
    private final long b;
    private final k c;
    private NativeObjectReference d;
    private NativeObjectReference e;
    private static b f;

    static {
        NativeObjectReference.f = new b(null);
    }

    NativeObjectReference(k k0, l l0, ReferenceQueue referenceQueue0) {
        super(l0, referenceQueue0);
        this.a = l0.getNativePtr();
        this.b = l0.getNativeFinalizerPtr();
        this.c = k0;
        NativeObjectReference.f.a(this);
    }

    void e() {
        synchronized(this.c) {
            NativeObjectReference.nativeCleanUp(this.b, this.a);
        }
        NativeObjectReference.f.b(this);
    }

    static native void nativeCleanUp(long arg0, long arg1) {
    }
}

