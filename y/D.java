package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public final class d implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ViewPager b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final TabLayout d;
    @NonNull
    public final AppBarLayout e;
    @NonNull
    public final DcToolbar f;

    private d(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ViewPager viewPager0, @NonNull FrameLayout frameLayout0, @NonNull TabLayout tabLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = viewPager0;
        this.c = frameLayout0;
        this.d = tabLayout0;
        this.e = appBarLayout0;
        this.f = dcToolbar0;
    }

    @NonNull
    public static d a(@NonNull View view0) {
        int v = 0x7F0B0A17;  // id:post_archive_pager
        View view1 = ViewBindings.a(view0, 0x7F0B0A17);  // id:post_archive_pager
        if(((ViewPager)view1) != null) {
            v = 0x7F0B0A18;  // id:post_archive_progress
            View view2 = ViewBindings.a(view0, 0x7F0B0A18);  // id:post_archive_progress
            if(((FrameLayout)view2) != null) {
                v = 0x7F0B0A1E;  // id:post_archive_tab
                View view3 = ViewBindings.a(view0, 0x7F0B0A1E);  // id:post_archive_tab
                if(((TabLayout)view3) != null) {
                    v = 0x7F0B0A1F;  // id:post_archive_tab_bar
                    View view4 = ViewBindings.a(view0, 0x7F0B0A1F);  // id:post_archive_tab_bar
                    if(((AppBarLayout)view4) != null) {
                        v = 0x7F0B0A20;  // id:post_archive_toolbar
                        View view5 = ViewBindings.a(view0, 0x7F0B0A20);  // id:post_archive_toolbar
                        if(((DcToolbar)view5) != null) {
                            return new d(((CoordinatorLayout)view0), ((ViewPager)view1), ((FrameLayout)view2), ((TabLayout)view3), ((AppBarLayout)view4), ((DcToolbar)view5));
                        }
                    }
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
    public static d c(@NonNull LayoutInflater layoutInflater0) {
        return d.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E001F, viewGroup0, false);  // layout:activity_archive_main
        if(z) {
            viewGroup0.addView(view0);
        }
        return d.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

