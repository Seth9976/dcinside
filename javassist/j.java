package javassist;

final class j extends l {
    protected g o;
    private l[] p;

    j(String s, g g0) {
        super(s);
        this.p = null;
        this.o = g0;
    }

    @Override  // javassist.l
    public boolean K0(l l0) throws E {
        if(super.K0(l0)) {
            return true;
        }
        if(l0.X().equals("java.lang.Object")) {
            return true;
        }
        l[] arr_l = this.T();
        for(int v = 0; v < arr_l.length; ++v) {
            if(arr_l[v].K0(l0)) {
                return true;
            }
        }
        return l0.k0() && this.x().K0(l0.x());
    }

    @Override  // javassist.l
    public l[] T() throws E {
        if(this.p == null) {
            Class[] arr_class = Object[].class.getInterfaces();
            this.p = new l[arr_class.length];
            for(int v = 0; v < arr_class.length; ++v) {
                l[] arr_l = this.p;
                arr_l[v] = this.o.s(arr_class[v].getName());
            }
        }
        return this.p;
    }

    @Override  // javassist.l
    public q U(String s, String s1) throws E {
        return this.c0().U(s, s1);
    }

    @Override  // javassist.l
    public q[] V() {
        try {
            return this.c0().V();
        }
        catch(E unused_ex) {
            return super.V();
        }
    }

    @Override  // javassist.l
    public int W() {
        try {
            return 16 | this.x().W() & 7;
        }
        catch(E unused_ex) {
            return 16;
        }
    }

    @Override  // javassist.l
    public l c0() throws E {
        return this.o.s("java.lang.Object");
    }

    @Override  // javassist.l
    public boolean k0() {
        return true;
    }

    @Override  // javassist.l
    public g w() {
        return this.o;
    }

    @Override  // javassist.l
    public l x() throws E {
        String s = this.X();
        return this.o.s(s.substring(0, s.length() - 2));
    }

    @Override  // javassist.l
    public n[] z() {
        try {
            return this.c0().z();
        }
        catch(E unused_ex) {
            return super.z();
        }
    }
}

