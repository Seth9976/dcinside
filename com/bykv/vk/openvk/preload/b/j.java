package com.bykv.vk.openvk.preload.b;

import java.util.List;

public abstract class j extends l {
    private String d;

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        new m(b0);
        this.d = this.a(object0);
        a l$a0 = (a)this.a().get(this.d);
        while(l$a0 != null) {
            try {
                List list0 = l$a0.a;
                Object object1 = c.a(list0, ((i)b0).a, this).a(object0);
                return l.a(list0) ? b0.a(object1) : object1;
            }
            catch(com.bykv.vk.openvk.preload.b.i.a i$a0) {
                new m(b0);
                this.d = this.a(object0, i$a0.getCause(), this.d);
                l$a0 = (a)this.a().get(this.d);
            }
            catch(Throwable throwable0) {
                new m(b0);
                this.d = this.a(object0, throwable0, this.d);
                l$a0 = (a)this.a().get(this.d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.d);
    }

    protected abstract String a(Object arg1);

    protected abstract String a(Object arg1, Throwable arg2, String arg3);
}

