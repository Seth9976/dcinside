package androidx.viewpager2.widget;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    @NonNull
    public WindowInsetsCompat a(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0) {
        WindowInsetsCompat windowInsetsCompat1 = ViewCompat.m1(((ViewPager2)view0), windowInsetsCompat0);
        if(windowInsetsCompat1.A()) {
            return windowInsetsCompat1;
        }
        RecyclerView recyclerView0 = ((ViewPager2)view0).j;
        int v = recyclerView0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            ViewCompat.q(recyclerView0.getChildAt(v1), new WindowInsetsCompat(windowInsetsCompat1));
        }
        return this.b(windowInsetsCompat1);
    }

    private WindowInsetsCompat b(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        return WindowInsetsCompat.c.K() == null ? windowInsetsCompat0.c().b() : WindowInsetsCompat.c;
    }

    public static boolean c(@NonNull ViewPager2 viewPager20) {
        viewPager20.getContext().getApplicationInfo();
        if(Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        ViewCompat.m2(viewPager20, new WindowInsetsApplier());
        return true;
    }
}

