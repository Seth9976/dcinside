package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.tabs.TabLayout;

public final class n implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final DcToolbar b;
    @NonNull
    public final ViewPager2 c;
    @NonNull
    public final TabLayout d;

    private n(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull DcToolbar dcToolbar0, @NonNull ViewPager2 viewPager20, @NonNull TabLayout tabLayout0) {
        this.a = coordinatorLayout0;
        this.b = dcToolbar0;
        this.c = viewPager20;
        this.d = tabLayout0;
    }

    @NonNull
    public static n a(@NonNull View view0) {
        int v = 0x7F0B0244;  // id:block_setting_toolbar
        DcToolbar dcToolbar0 = (DcToolbar)ViewBindings.a(view0, 0x7F0B0244);  // id:block_setting_toolbar
        if(dcToolbar0 != null) {
            v = 0x7F0B0E47;  // id:setting_block_pager
            ViewPager2 viewPager20 = (ViewPager2)ViewBindings.a(view0, 0x7F0B0E47);  // id:setting_block_pager
            if(viewPager20 != null) {
                v = 0x7F0B0E48;  // id:setting_block_tabs
                TabLayout tabLayout0 = (TabLayout)ViewBindings.a(view0, 0x7F0B0E48);  // id:setting_block_tabs
                if(tabLayout0 != null) {
                    return new n(((CoordinatorLayout)view0), dcToolbar0, viewPager20, tabLayout0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static n c(@NonNull LayoutInflater layoutInflater0) {
        return n.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0029, viewGroup0, false);  // layout:activity_block_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return n.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

