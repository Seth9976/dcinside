package com.coupang.ads.clog;

import B3.h;
import android.os.Build.VERSION;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import y4.l;

public final class f implements h, Set {
    @l
    private final Set a;
    @l
    private final ReentrantReadWriteLock b;

    public f() {
        this.a = new LinkedHashSet();
        this.b = new ReentrantReadWriteLock();
    }

    public final void a(@l Function1 function10) {
        L.p(function10, "action");
        this.b.readLock().lock();
        try {
            if(Build.VERSION.SDK_INT >= 24) {
                for(Object object0: this.a) {
                    function10.invoke(object0);
                }
            }
            else {
                for(Object object1: this) {
                    function10.invoke(object1);
                }
            }
        }
        finally {
            this.b.readLock().unlock();
        }
    }

    @Override
    public boolean add(Object object0) {
        this.b.writeLock().lock();
        try {
            return this.a.add(object0);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.b.writeLock().lock();
        try {
            return this.a.addAll(collection0);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    public int b() {
        this.b.readLock().lock();
        try {
        }
        finally {
            this.b.readLock().unlock();
        }
        return this.a.size();
    }

    @Override
    public void clear() {
        this.b.writeLock().lock();
        try {
            this.a.clear();
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    @Override
    public boolean contains(Object object0) {
        this.b.readLock().lock();
        try {
            return this.a.contains(object0);
        }
        finally {
            this.b.readLock().unlock();
        }
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.b.readLock().lock();
        try {
            return this.a.containsAll(collection0);
        }
        finally {
            this.b.readLock().unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        this.b.readLock().lock();
        try {
        }
        finally {
            this.b.readLock().unlock();
        }
        return this.a.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override
    public boolean remove(Object object0) {
        this.b.writeLock().lock();
        try {
            return this.a.remove(object0);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.b.writeLock().lock();
        try {
            return this.a.removeAll(collection0);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.b.writeLock().lock();
        try {
            return this.a.retainAll(collection0);
        }
        finally {
            this.b.writeLock().unlock();
        }
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }
}

