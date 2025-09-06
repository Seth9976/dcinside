package com.google.common.cache;

import J1.c;
import com.google.common.collect.D3;
import com.google.common.collect.Q2;
import com.google.common.util.concurrent.f1;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

@c
@i
public abstract class b extends a implements l {
    @Override  // com.google.common.cache.l
    @O1.a
    public Object D(Object object0) {
        try {
            return this.get(object0);
        }
        catch(ExecutionException executionException0) {
            throw new f1(executionException0.getCause());
        }
    }

    @Override  // com.google.common.cache.l
    public Q2 F(Iterable iterable0) throws ExecutionException {
        LinkedHashMap linkedHashMap0 = D3.c0();
        for(Object object0: iterable0) {
            if(!linkedHashMap0.containsKey(object0)) {
                linkedHashMap0.put(object0, this.get(object0));
            }
        }
        return Q2.g(linkedHashMap0);
    }

    @Override  // com.google.common.cache.l
    public void I(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.l
    public final Object apply(Object object0) {
        return this.D(object0);
    }
}

