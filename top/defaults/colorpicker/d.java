package top.defaults.colorpicker;

import java.util.ArrayList;
import java.util.List;

class d implements c {
    private List a;
    private int b;

    d() {
        this.a = new ArrayList();
    }

    void a(int v, boolean z, boolean z1) {
        this.b = v;
        for(Object object0: this.a) {
            ((e)object0).e(v, z, z1);
        }
    }

    @Override  // top.defaults.colorpicker.c
    public void c(e e0) {
        if(e0 == null) {
            return;
        }
        this.a.remove(e0);
    }

    @Override  // top.defaults.colorpicker.c
    public int getColor() {
        return this.b;
    }

    @Override  // top.defaults.colorpicker.c
    public void m(e e0) {
        if(e0 == null) {
            return;
        }
        this.a.add(e0);
    }
}

