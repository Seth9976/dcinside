package com.bykv.vk.openvk.preload.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class l extends d {
    public static final class a {
        List a;

        public a() {
            this.a = new ArrayList();
        }

        public final a a(h h0) {
            this.a.add(h0);
            return this;
        }

        public final a a(List list0) {
            this.a.addAll(list0);
            return this;
        }
    }

    public static final class b {
        private Map a;
        private com.bykv.vk.openvk.preload.b.b.a b;

        public b() {
            this.a = new HashMap();
        }

        public final h a(Class class0) {
            return com.bykv.vk.openvk.preload.b.h.a.a().a(class0).a(new Object[]{this.a}).a(this.b).b();
        }

        public final a a(String s) {
            if(this.a.containsKey(s)) {
                throw new IllegalArgumentException("duplicated branch name");
            }
            a l$a0 = new a();
            this.a.put(s, l$a0);
            return l$a0;
        }
    }

    private Map d;

    // 去混淆评级： 低(20)
    static boolean a(List list0) {
        return list0.isEmpty() ? false : ((h)list0.get(list0.size() - 1)).a == f.class;
    }

    final Map a() {
        return this.d;
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        if(arr_object != null && arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(object0 != null) {
                try {
                    this.d = (Map)object0;
                    return;
                }
                catch(ClassCastException classCastException0) {
                    throw new IllegalArgumentException(classCastException0);
                }
            }
        }
        throw new IllegalStateException("args error");
    }
}

