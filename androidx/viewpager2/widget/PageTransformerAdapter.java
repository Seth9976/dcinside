package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

final class PageTransformerAdapter extends OnPageChangeCallback {
    private final LinearLayoutManager a;
    private PageTransformer b;

    PageTransformerAdapter(LinearLayoutManager linearLayoutManager0) {
        this.a = linearLayoutManager0;
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void a(int v) {
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void b(int v, float f, int v1) {
        if(this.b == null) {
            return;
        }
        for(int v2 = 0; v2 < this.a.j0(); ++v2) {
            View view0 = this.a.i0(v2);
            if(view0 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", v2, this.a.j0()));
            }
            int v3 = this.a.K0(view0);
            this.b.a(view0, ((float)(v3 - v)) + -f);
        }
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
    public void c(int v) {
    }

    PageTransformer d() {
        return this.b;
    }

    void e(@Nullable PageTransformer viewPager2$PageTransformer0) {
        this.b = viewPager2$PageTransformer0;
    }
}

