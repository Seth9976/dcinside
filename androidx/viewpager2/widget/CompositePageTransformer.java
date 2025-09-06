package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class CompositePageTransformer implements PageTransformer {
    private final List a;

    public CompositePageTransformer() {
        this.a = new ArrayList();
    }

    @Override  // androidx.viewpager2.widget.ViewPager2$PageTransformer
    public void a(@NonNull View view0, float f) {
        for(Object object0: this.a) {
            ((PageTransformer)object0).a(view0, f);
        }
    }

    public void b(@NonNull PageTransformer viewPager2$PageTransformer0) {
        this.a.add(viewPager2$PageTransformer0);
    }

    public void c(@NonNull PageTransformer viewPager2$PageTransformer0) {
        this.a.remove(viewPager2$PageTransformer0);
    }
}

