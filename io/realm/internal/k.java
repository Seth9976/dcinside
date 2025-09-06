package io.realm.internal;

import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;

public class k {
    static class a extends k {
        private final LinkedList d;

        a() {
            this.d = new LinkedList();
        }

        @Override  // io.realm.internal.k
        public void a(l l0) {
            this.d.add(l0);
        }

        public void c() {
            for(Object object0: this.d) {
                NativeObjectReference.nativeCleanUp(((l)object0).getNativeFinalizerPtr(), ((l)object0).getNativePtr());
            }
        }
    }

    public interface b {
        void a(k arg1);
    }

    private static final ReferenceQueue a;
    private static final Thread b;
    public static final k c;

    static {
        ReferenceQueue referenceQueue0 = new ReferenceQueue();
        k.a = referenceQueue0;
        Thread thread0 = new Thread(new e(referenceQueue0));
        k.b = thread0;
        k.c = new k();
        thread0.setName("RealmFinalizingDaemon");
        thread0.start();
    }

    public void a(l l0) {
        new NativeObjectReference(this, l0, k.a);
    }

    static void b(b k$b0) {
        a k$a0 = new a();
        k$b0.a(k$a0);
        k$a0.c();
    }
}

