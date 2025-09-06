package io.realm.internal;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class n {
    public interface a {
        void a(b arg1, Object arg2);
    }

    public static abstract class b {
        final WeakReference a;
        protected final Object b;
        boolean c;

        public b(Object object0, Object object1) {
            this.c = false;
            this.b = object1;
            this.a = new WeakReference(object0);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(Object object0) {
            return this == object0 ? true : object0 instanceof b && (this.b.equals(((b)object0).b) && this.a.get() == ((b)object0).a.get());
        }

        @Override
        public int hashCode() {
            Object object0 = this.a.get();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = this.b;
            if(object1 != null) {
                v = object1.hashCode();
            }
            return (v1 + 0x20F) * 0x1F + v;
        }
    }

    private List a;
    private boolean b;

    public n() {
        this.a = new CopyOnWriteArrayList();
        this.b = false;
    }

    public void a(b n$b0) {
        if(!this.a.contains(n$b0)) {
            this.a.add(n$b0);
            n$b0.c = false;
        }
        if(this.b) {
            this.b = false;
        }
    }

    public void b() {
        this.b = true;
        this.a.clear();
    }

    public void c(a n$a0) {
        for(Object object0: this.a) {
            b n$b0 = (b)object0;
            if(this.b) {
                break;
            }
            Object object1 = n$b0.a.get();
            if(object1 == null) {
                this.a.remove(n$b0);
            }
            else if(!n$b0.c) {
                n$a0.a(n$b0, object1);
            }
        }
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    public void e(Object object0, Object object1) {
        for(Object object2: this.a) {
            b n$b0 = (b)object2;
            if(object0 == n$b0.a.get() && object1.equals(n$b0.b)) {
                n$b0.c = true;
                this.a.remove(n$b0);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    void f(Object object0) {
        for(Object object1: this.a) {
            b n$b0 = (b)object1;
            Object object2 = n$b0.a.get();
            if(object2 == null || object2 == object0) {
                n$b0.c = true;
                this.a.remove(n$b0);
            }
        }
    }

    public int g() {
        return this.a.size();
    }
}

