package com.bykv.vk.openvk.preload.b;

import java.util.List;

public abstract class a extends l {
    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        new m(b0);
        String s = this.a(object0);
        com.bykv.vk.openvk.preload.b.l.a l$a0 = (com.bykv.vk.openvk.preload.b.l.a)this.a().get(s);
        if(l$a0 == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：" + s);
        }
        List list0 = l$a0.a;
        Object object1 = c.a(list0, ((i)b0).a, this).a(object0);
        return l.a(list0) ? b0.a(object1) : object1;
    }

    protected abstract String a(Object arg1);
}

