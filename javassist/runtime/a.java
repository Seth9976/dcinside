package javassist.runtime;

public class a extends ThreadLocal {
    public static class javassist.runtime.a.a {
        private int a;

        javassist.runtime.a.a() {
            this.a = 0;
        }

        void a() {
            --this.a;
        }

        void b() {
            ++this.a;
        }

        int c() {
            return this.a;
        }
    }

    public void a() {
        ((javassist.runtime.a.a)this.get()).b();
    }

    public void b() {
        ((javassist.runtime.a.a)this.get()).a();
    }

    protected javassist.runtime.a.a c() {
        synchronized(this) {
            return new javassist.runtime.a.a();
        }
    }

    public int d() {
        return ((javassist.runtime.a.a)this.get()).c();
    }

    @Override
    protected Object initialValue() {
        return this.c();
    }
}

