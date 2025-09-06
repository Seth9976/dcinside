package javassist;

public final class w extends l {
    private char o;
    private String p;
    private String q;
    private String r;
    private int s;
    private int t;
    private int u;

    w(String s, char c, String s1, String s2, String s3, int v, int v1, int v2) {
        super(s);
        this.o = c;
        this.p = s1;
        this.q = s2;
        this.r = s3;
        this.s = v;
        this.t = v1;
        this.u = v2;
    }

    public int U0() {
        return this.t;
    }

    public int V0() {
        return this.u;
    }

    @Override  // javassist.l
    public int W() {
        return 17;
    }

    public char W0() {
        return this.o;
    }

    public String X0() {
        return this.r;
    }

    public String Y0() {
        return this.q;
    }

    public int Z0() {
        return this.s;
    }

    public String a1() {
        return this.p;
    }

    @Override  // javassist.l
    public boolean p0() {
        return true;
    }
}

