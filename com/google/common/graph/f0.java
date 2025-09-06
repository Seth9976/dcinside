package com.google.common.graph;

@x
final class f0 extends A implements W {
    private final Y a;

    f0(g g0) {
        this.a = new h0(g0);
    }

    @Override  // com.google.common.graph.W
    public boolean E(y y0) {
        this.P(y0);
        return this.J(y0.d(), y0.g());
    }

    @Override  // com.google.common.graph.W
    public boolean J(Object object0, Object object1) {
        return this.a.x(object0, object1, a.a) == null;
    }

    @Override  // com.google.common.graph.A
    o Q() {
        return this.a;
    }

    @Override  // com.google.common.graph.W
    public boolean o(Object object0) {
        return this.a.o(object0);
    }

    @Override  // com.google.common.graph.W
    public boolean p(Object object0) {
        return this.a.p(object0);
    }

    @Override  // com.google.common.graph.W
    public boolean r(Object object0, Object object1) {
        return this.a.r(object0, object1) != null;
    }

    @Override  // com.google.common.graph.W
    public boolean s(y y0) {
        this.P(y0);
        return this.r(y0.d(), y0.g());
    }
}

