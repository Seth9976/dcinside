package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class PagerAdapter {
    private final DataSetObservable a;
    private DataSetObserver b;
    public static final int c = -1;
    public static final int d = -2;

    public PagerAdapter() {
        this.a = new DataSetObservable();
    }

    @Deprecated
    public void a(@NonNull View view0, int v, @NonNull Object object0) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
        this.a(viewGroup0, v, object0);
    }

    @Deprecated
    public void c(@NonNull View view0) {
    }

    public void d(@NonNull ViewGroup viewGroup0) {
    }

    public abstract int e();

    public int f(@NonNull Object object0) [...] // Inlined contents

    @Nullable
    public CharSequence g(int v) {
        return null;
    }

    public float h(int v) [...] // Inlined contents

    @NonNull
    @Deprecated
    public Object i(@NonNull View view0, int v) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @NonNull
    public Object j(@NonNull ViewGroup viewGroup0, int v) {
        return this.i(viewGroup0, v);
    }

    public abstract boolean k(@NonNull View arg1, @NonNull Object arg2);

    public void l() {
        synchronized(this) {
            DataSetObserver dataSetObserver0 = this.b;
            if(dataSetObserver0 != null) {
                dataSetObserver0.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public void m(@NonNull DataSetObserver dataSetObserver0) {
        this.a.registerObserver(dataSetObserver0);
    }

    public void n(@Nullable Parcelable parcelable0, @Nullable ClassLoader classLoader0) {
    }

    @Nullable
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@NonNull View view0, int v, @NonNull Object object0) {
    }

    public void q(@NonNull ViewGroup viewGroup0, int v, @NonNull Object object0) {
    }

    void r(DataSetObserver dataSetObserver0) {
        synchronized(this) {
            this.b = dataSetObserver0;
        }
    }

    @Deprecated
    public void s(@NonNull View view0) {
    }

    public void t(@NonNull ViewGroup viewGroup0) {
    }

    public void u(@NonNull DataSetObserver dataSetObserver0) {
        this.a.unregisterObserver(dataSetObserver0);
    }
}

