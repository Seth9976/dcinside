package javassist;

public abstract class p {
    static class a extends p {
        private p c;
        private p d;
        private p e;

        a(m m0) {
            super(m0);
            this.c = this;
            this.d = this;
            this.e = this;
            this.a = this;
        }

        p A() {
            return this.c;
        }

        p B() [...] // Inlined contents

        void C(p p0) {
            p p1 = this;
            p p2;
            while((p2 = p1.a) != this) {
                if(p2 == p0) {
                    p1.a = p2.a;
                    if(p2 == this.c) {
                        this.c = p1;
                    }
                    if(p2 == this.d) {
                        this.d = p1;
                    }
                    if(p2 != this.e) {
                        break;
                    }
                    this.e = p1;
                    return;
                }
                p1 = p2;
            }
        }

        @Override  // javassist.p
        protected void a(StringBuffer stringBuffer0) {
        }

        @Override  // javassist.p
        public Object b(Class class0) throws ClassNotFoundException {
            return null;
        }

        @Override  // javassist.p
        public Object[] c() throws ClassNotFoundException {
            return null;
        }

        @Override  // javassist.p
        public byte[] d(String s) {
            return null;
        }

        @Override  // javassist.p
        public Object[] e() {
            return null;
        }

        @Override  // javassist.p
        public String g() {
            return null;
        }

        @Override  // javassist.p
        public int h() {
            return 0;
        }

        @Override  // javassist.p
        public String i() {
            return null;
        }

        @Override  // javassist.p
        public String j() {
            return null;
        }

        @Override  // javassist.p
        public boolean l(String s) {
            return false;
        }

        @Override  // javassist.p
        public void o(String s, byte[] arr_b) {
        }

        @Override  // javassist.p
        public void p(String s) {
        }

        @Override  // javassist.p
        public void q(int v) {
        }

        void s(p p0) {
            p0.a = this.d.a;
            this.d.a = p0;
            if(this.d == this.e) {
                this.e = p0;
            }
            this.d = p0;
        }

        void t(p p0) {
            p0.a = this;
            this.e.a = p0;
            this.e = p0;
        }

        void u(p p0) {
            p p1 = this.c;
            p0.a = p1.a;
            p1.a = p0;
            if(p1 == this.d) {
                this.d = p0;
                if(p1 == this.e) {
                    this.e = p0;
                }
            }
            this.c = p0;
        }

        p v() {
            return this.c;
        }

        static int w(p p0, p p1) {
            int v = 0;
            while(p0 != p1) {
                ++v;
                p0 = p0.a;
            }
            return v;
        }

        p x() {
            return this.d;
        }

        p y() {
            return this.d;
        }

        p z() {
            return this.e;
        }
    }

    p a;
    protected l b;

    protected p(l l0) {
        this.b = l0;
        this.a = null;
    }

    protected abstract void a(StringBuffer arg1);

    public abstract Object b(Class arg1) throws ClassNotFoundException;

    public abstract Object[] c() throws ClassNotFoundException;

    public abstract byte[] d(String arg1);

    public abstract Object[] e();

    public l f() {
        return this.b;
    }

    public abstract String g();

    public abstract int h();

    public abstract String i();

    public abstract String j();

    public boolean k(Class class0) {
        return this.l(class0.getName());
    }

    public abstract boolean l(String arg1);

    void m() {
    }

    final p n() {
        return this.a;
    }

    public abstract void o(String arg1, byte[] arg2);

    public abstract void p(String arg1);

    public abstract void q(int arg1);

    public boolean r(l l0) {
        int v = this.h();
        boolean z = true;
        if(D.k(v)) {
            return true;
        }
        if(D.i(v)) {
            return l0 == this.b;
        }
        String s = this.b.Z();
        String s1 = l0.Z();
        if(s != null) {
            z = s.equals(s1);
        }
        else if(s1 != null) {
            return D.j(v) ? l0.J0(this.b) : false;
        }
        return z || !D.j(v) ? z : l0.J0(this.b);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer(this.getClass().getName());
        stringBuffer0.append("@");
        stringBuffer0.append(Integer.toHexString(this.hashCode()));
        stringBuffer0.append("[");
        stringBuffer0.append(D.v(this.h()));
        this.a(stringBuffer0);
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }
}

