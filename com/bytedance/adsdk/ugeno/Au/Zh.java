package com.bytedance.adsdk.ugeno.Au;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class Zh {
    private final DataSetObservable PjT;
    private DataSetObserver Zh;

    public Zh() {
        this.PjT = new DataSetObservable();
    }

    public float PjT(int v) {
        return 1.0f;
    }

    public abstract int PjT();

    public int PjT(Object object0) {
        return -1;
    }

    @Deprecated
    public Object PjT(View view0, int v) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object PjT(ViewGroup viewGroup0, int v) {
        return this.PjT(viewGroup0, v);
    }

    void PjT(DataSetObserver dataSetObserver0) {
        synchronized(this) {
            this.Zh = dataSetObserver0;
        }
    }

    @Deprecated
    public void PjT(View view0, int v, Object object0) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void PjT(ViewGroup viewGroup0, int v, Object object0) {
        this.PjT(viewGroup0, v, object0);
    }

    public abstract boolean PjT(View arg1, Object arg2);

    public void ReZ() {
        synchronized(this) {
            DataSetObserver dataSetObserver0 = this.Zh;
            if(dataSetObserver0 != null) {
                dataSetObserver0.onChanged();
            }
        }
        this.PjT.notifyChanged();
    }

    public Parcelable Zh() [...] // Inlined contents
}

