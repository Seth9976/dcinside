package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public final class e implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ViewPager b;
    @NonNull
    public final RecyclerView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final AppCompatSpinner f;
    @NonNull
    public final ClearableEditText g;
    @NonNull
    public final TabLayout h;
    @NonNull
    public final AppBarLayout i;
    @NonNull
    public final DcToolbar j;

    private e(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ViewPager viewPager0, @NonNull RecyclerView recyclerView0, @NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull AppCompatSpinner appCompatSpinner0, @NonNull ClearableEditText clearableEditText0, @NonNull TabLayout tabLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = viewPager0;
        this.c = recyclerView0;
        this.d = constraintLayout0;
        this.e = imageView0;
        this.f = appCompatSpinner0;
        this.g = clearableEditText0;
        this.h = tabLayout0;
        this.i = appBarLayout0;
        this.j = dcToolbar0;
    }

    @NonNull
    public static e a(@NonNull View view0) {
        int v = 0x7F0B0A17;  // id:post_archive_pager
        View view1 = ViewBindings.a(view0, 0x7F0B0A17);  // id:post_archive_pager
        if(((ViewPager)view1) != null) {
            v = 0x7F0B0A19;  // id:post_archive_recent
            View view2 = ViewBindings.a(view0, 0x7F0B0A19);  // id:post_archive_recent
            if(((RecyclerView)view2) != null) {
                v = 0x7F0B0A1A;  // id:post_archive_search_bar
                View view3 = ViewBindings.a(view0, 0x7F0B0A1A);  // id:post_archive_search_bar
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0A1B;  // id:post_archive_search_confirm
                    View view4 = ViewBindings.a(view0, 0x7F0B0A1B);  // id:post_archive_search_confirm
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0A1C;  // id:post_archive_search_dropdown
                        View view5 = ViewBindings.a(view0, 0x7F0B0A1C);  // id:post_archive_search_dropdown
                        if(((AppCompatSpinner)view5) != null) {
                            v = 0x7F0B0A1D;  // id:post_archive_search_text
                            View view6 = ViewBindings.a(view0, 0x7F0B0A1D);  // id:post_archive_search_text
                            if(((ClearableEditText)view6) != null) {
                                v = 0x7F0B0A1E;  // id:post_archive_tab
                                View view7 = ViewBindings.a(view0, 0x7F0B0A1E);  // id:post_archive_tab
                                if(((TabLayout)view7) != null) {
                                    v = 0x7F0B0A1F;  // id:post_archive_tab_bar
                                    View view8 = ViewBindings.a(view0, 0x7F0B0A1F);  // id:post_archive_tab_bar
                                    if(((AppBarLayout)view8) != null) {
                                        v = 0x7F0B0A20;  // id:post_archive_toolbar
                                        View view9 = ViewBindings.a(view0, 0x7F0B0A20);  // id:post_archive_toolbar
                                        if(((DcToolbar)view9) != null) {
                                            return new e(((CoordinatorLayout)view0), ((ViewPager)view1), ((RecyclerView)view2), ((ConstraintLayout)view3), ((ImageView)view4), ((AppCompatSpinner)view5), ((ClearableEditText)view6), ((TabLayout)view7), ((AppBarLayout)view8), ((DcToolbar)view9));
                                        }
                                    }
                                }
                            }
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
    public static e c(@NonNull LayoutInflater layoutInflater0) {
        return e.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0020, viewGroup0, false);  // layout:activity_archive_search
        if(z) {
            viewGroup0.addView(view0);
        }
        return e.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

