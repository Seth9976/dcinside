package com.google.common.collect;

import J1.b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

@b(emulated = true)
@C1
public abstract class u2 extends m2 implements M4 {
    public abstract class a extends A1 {
        final u2 d;

        @Override  // com.google.common.collect.A1
        M4 G0() {
            return u2.this;
        }
    }

    public class com.google.common.collect.u2.b extends com.google.common.collect.P4.b {
    }

    @Override  // com.google.common.collect.M4
    public M4 B3(@d4 Object object0, y y0) {
        return this.D0().B3(object0, y0);
    }

    protected abstract M4 D0();

    @o3.a
    protected com.google.common.collect.S3.a F0() {
        Iterator iterator0 = this.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        return T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
    }

    @o3.a
    protected com.google.common.collect.S3.a G0() {
        Iterator iterator0 = this.Y0().entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        return T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
    }

    @o3.a
    protected com.google.common.collect.S3.a H0() {
        Iterator iterator0 = this.entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        com.google.common.collect.S3.a s3$a0 = T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
        iterator0.remove();
        return s3$a0;
    }

    @o3.a
    protected com.google.common.collect.S3.a I0() {
        Iterator iterator0 = this.Y0().entrySet().iterator();
        if(!iterator0.hasNext()) {
            return null;
        }
        Object object0 = iterator0.next();
        com.google.common.collect.S3.a s3$a0 = T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
        iterator0.remove();
        return s3$a0;
    }

    protected M4 J0(@d4 Object object0, y y0, @d4 Object object1, y y1) {
        return this.B3(object0, y0).t1(object1, y1);
    }

    @Override  // com.google.common.collect.m2
    protected Object K() {
        return this.D0();
    }

    @Override  // com.google.common.collect.m2
    protected Collection M() {
        return this.D0();
    }

    @Override  // com.google.common.collect.M4
    public M4 Y0() {
        return this.D0().Y0();
    }

    @Override  // com.google.common.collect.M4
    public M4 Y2(@d4 Object object0, y y0, @d4 Object object1, y y1) {
        return this.D0().Y2(object0, y0, object1, y1);
    }

    @Override  // com.google.common.collect.M4
    public Comparator comparator() {
        return this.D0().comparator();
    }

    @Override  // com.google.common.collect.M4
    public NavigableSet f() {
        return this.D0().f();
    }

    @Override  // com.google.common.collect.m2, com.google.common.collect.M4
    public Set f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    public SortedSet f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    @o3.a
    public com.google.common.collect.S3.a firstEntry() {
        return this.D0().firstEntry();
    }

    @Override  // com.google.common.collect.M4
    @o3.a
    public com.google.common.collect.S3.a lastEntry() {
        return this.D0().lastEntry();
    }

    @Override  // com.google.common.collect.M4
    @o3.a
    public com.google.common.collect.S3.a pollFirstEntry() {
        return this.D0().pollFirstEntry();
    }

    @Override  // com.google.common.collect.M4
    @o3.a
    public com.google.common.collect.S3.a pollLastEntry() {
        return this.D0().pollLastEntry();
    }

    @Override  // com.google.common.collect.m2
    protected S3 s0() {
        return this.D0();
    }

    @Override  // com.google.common.collect.M4
    public M4 t1(@d4 Object object0, y y0) {
        return this.D0().t1(object0, y0);
    }
}

