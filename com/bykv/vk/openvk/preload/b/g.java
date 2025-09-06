package com.bykv.vk.openvk.preload.b;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class g extends d {
    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        CountDownLatch countDownLatch0 = new CountDownLatch(((List)object0).size());
        CopyOnWriteArrayList copyOnWriteArrayList0 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList1 = new CopyOnWriteArrayList();
        for(Object object1: ((List)object0)) {
            com.bykv.vk.openvk.preload.geckox.b.t().execute(new Runnable() {
                private g f;

                @Override
                public final void run() {
                    try {
                        Object object0 = b0.a(object1);
                        copyOnWriteArrayList0.add(object0);
                        goto label_15;
                    }
                    catch(a i$a0) {
                    }
                    catch(Throwable throwable0) {
                        goto label_9;
                    }
                    try {
                        Throwable throwable2 = i$a0.getCause();
                        copyOnWriteArrayList1.add(throwable2);
                        g.this.d(throwable2);
                        goto label_15;
                    label_9:
                        copyOnWriteArrayList1.add(throwable0);
                        g.this.d(throwable0);
                    }
                    catch(Throwable throwable1) {
                        countDownLatch0.countDown();
                        throw throwable1;
                    }
                label_15:
                    countDownLatch0.countDown();
                }
            });
        }
        countDownLatch0.await();
        if(!copyOnWriteArrayList1.isEmpty()) {
            throw new com.bykv.vk.openvk.preload.b.a.a(copyOnWriteArrayList1);
        }
        return copyOnWriteArrayList0;
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        if(arr_object != null) {
            if(arr_object.length != 1) {
                throw new IllegalArgumentException("ParallelInterceptor only need one param");
            }
            if(!(arr_object[0] instanceof Executor)) {
                throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
            }
        }
    }
}

