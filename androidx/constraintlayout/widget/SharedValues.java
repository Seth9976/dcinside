package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SharedValues {
    public interface SharedValuesListener {
        void a(int arg1, int arg2, int arg3);
    }

    private SparseIntArray a;
    private HashMap b;
    public static final int c = -1;

    public SharedValues() {
        this.a = new SparseIntArray();
        this.b = new HashMap();
    }

    public void a(int v, SharedValuesListener sharedValues$SharedValuesListener0) {
        HashSet hashSet0 = (HashSet)this.b.get(v);
        if(hashSet0 == null) {
            hashSet0 = new HashSet();
            this.b.put(v, hashSet0);
        }
        hashSet0.add(new WeakReference(sharedValues$SharedValuesListener0));
    }

    public void b() {
        this.b.clear();
    }

    public void c(int v, int v1) {
        int v2 = this.a.get(v, -1);
        if(v2 == v1) {
            return;
        }
        this.a.put(v, v1);
        HashSet hashSet0 = (HashSet)this.b.get(v);
        if(hashSet0 == null) {
            return;
        }
        boolean z = false;
        for(Object object0: hashSet0) {
            SharedValuesListener sharedValues$SharedValuesListener0 = (SharedValuesListener)((WeakReference)object0).get();
            if(sharedValues$SharedValuesListener0 == null) {
                z = true;
            }
            else {
                sharedValues$SharedValuesListener0.a(v, v1, v2);
            }
        }
        if(z) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: hashSet0) {
                WeakReference weakReference0 = (WeakReference)object1;
                if(((SharedValuesListener)weakReference0.get()) == null) {
                    arrayList0.add(weakReference0);
                }
            }
            hashSet0.removeAll(arrayList0);
        }
    }

    public int d(int v) {
        return this.a.get(v, -1);
    }

    public void e(int v, SharedValuesListener sharedValues$SharedValuesListener0) {
        HashSet hashSet0 = (HashSet)this.b.get(v);
        if(hashSet0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hashSet0) {
            WeakReference weakReference0 = (WeakReference)object0;
            SharedValuesListener sharedValues$SharedValuesListener1 = (SharedValuesListener)weakReference0.get();
            if(sharedValues$SharedValuesListener1 == null || sharedValues$SharedValuesListener1 == sharedValues$SharedValuesListener0) {
                arrayList0.add(weakReference0);
            }
        }
        hashSet0.removeAll(arrayList0);
    }

    public void f(SharedValuesListener sharedValues$SharedValuesListener0) {
        for(Object object0: this.b.keySet()) {
            this.e(((int)(((Integer)object0))), sharedValues$SharedValuesListener0);
        }
    }
}

