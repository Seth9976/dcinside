package org.bson.codecs.pojo;

final class g implements e {
    @Override  // org.bson.codecs.pojo.e
    public void a(c c0) {
        if(c0.l() == null) {
            c0.g("_t");
        }
        if(c0.k() == null && c0.s() != null) {
            c0.f(c0.s().getName());
        }
        for(Object object0: c0.q()) {
            K k0 = (K)object0;
            if(c0.n() == null) {
                String s = k0.e();
                if(s.equals("_id") || s.equals("id")) {
                    c0.u(s);
                }
            }
        }
    }
}

