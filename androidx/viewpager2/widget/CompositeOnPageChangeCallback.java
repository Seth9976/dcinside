package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

final class CompositeOnPageChangeCallback extends OnPageChangeCallback {
    @NonNull
    private final List a;

    CompositeOnPageChangeCallback(int v) {
        this.a = new ArrayList(v);
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void a(int v) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).a(v);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            this.f(concurrentModificationException0);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void b(int v, float f, @Px int v1) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).b(v, f, v1);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            this.f(concurrentModificationException0);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void c(int v) {
        try {
            for(Object object0: this.a) {
                ((OnPageChangeCallback)object0).c(v);
            }
        }
        catch(ConcurrentModificationException concurrentModificationException0) {
            this.f(concurrentModificationException0);
        }
    }

    void d(OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.a.add(viewPager2$OnPageChangeCallback0);
    }

    void e(OnPageChangeCallback viewPager2$OnPageChangeCallback0) {
        this.a.remove(viewPager2$OnPageChangeCallback0);
    }

    private void f(ConcurrentModificationException concurrentModificationException0) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException0);
    }
}

