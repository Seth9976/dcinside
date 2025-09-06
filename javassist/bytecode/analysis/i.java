package javassist.bytecode.analysis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class i {
    private List a;
    private Set b;
    private int c;

    public i(int v, int v1) {
        this.a = new ArrayList();
        this.b = new HashSet();
        this.c = v;
        this.a.add(v1);
    }

    public void a(int v) {
        this.b.add(v);
    }

    public Collection b() {
        return this.b;
    }

    public void c(int v) {
        this.a.add(v);
    }

    public Collection d() {
        return this.a;
    }

    public boolean e(int v) {
        return this.b.contains(v);
    }

    public int f() {
        return this.c;
    }

    @Override
    public String toString() {
        return "start = " + this.c + " callers = " + this.a.toString();
    }
}

