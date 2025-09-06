package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.tabs.TabLayout;
import kr.better.widget.BetterTextView;

public final class c0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final BetterTextView c;
    @NonNull
    public final Guideline d;
    @NonNull
    public final ViewPager2 e;
    @NonNull
    public final ProgressBar f;
    @NonNull
    public final TabLayout g;
    @NonNull
    public final DcToolbar h;

    private c0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull BetterTextView betterTextView0, @NonNull Guideline guideline0, @NonNull ViewPager2 viewPager20, @NonNull ProgressBar progressBar0, @NonNull TabLayout tabLayout0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = view0;
        this.c = betterTextView0;
        this.d = guideline0;
        this.e = viewPager20;
        this.f = progressBar0;
        this.g = tabLayout0;
        this.h = dcToolbar0;
    }

    @NonNull
    public static c0 a(@NonNull View view0) {
        int v = 0x7F0B0BF7;  // id:push_notice_divider
        View view1 = ViewBindings.a(view0, 0x7F0B0BF7);  // id:push_notice_divider
        if(view1 != null) {
            v = 0x7F0B0BF8;  // id:push_notice_like_guide
            View view2 = ViewBindings.a(view0, 0x7F0B0BF8);  // id:push_notice_like_guide
            if(((BetterTextView)view2) != null) {
                v = 0x7F0B0BF9;  // id:push_notice_like_guide_guideline
                View view3 = ViewBindings.a(view0, 0x7F0B0BF9);  // id:push_notice_like_guide_guideline
                if(((Guideline)view3) != null) {
                    v = 0x7F0B0BFA;  // id:push_notice_list_pager
                    View view4 = ViewBindings.a(view0, 0x7F0B0BFA);  // id:push_notice_list_pager
                    if(((ViewPager2)view4) != null) {
                        v = 0x7F0B0BFB;  // id:push_notice_list_progress
                        View view5 = ViewBindings.a(view0, 0x7F0B0BFB);  // id:push_notice_list_progress
                        if(((ProgressBar)view5) != null) {
                            v = 0x7F0B0BFC;  // id:push_notice_list_tab
                            View view6 = ViewBindings.a(view0, 0x7F0B0BFC);  // id:push_notice_list_tab
                            if(((TabLayout)view6) != null) {
                                v = 0x7F0B0BFD;  // id:push_notice_list_toolbar
                                View view7 = ViewBindings.a(view0, 0x7F0B0BFD);  // id:push_notice_list_toolbar
                                if(((DcToolbar)view7) != null) {
                                    return new c0(((CoordinatorLayout)view0), view1, ((BetterTextView)view2), ((Guideline)view3), ((ViewPager2)view4), ((ProgressBar)view5), ((TabLayout)view6), ((DcToolbar)view7));
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
    public static c0 c(@NonNull LayoutInflater layoutInflater0) {
        return c0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0053, viewGroup0, false);  // layout:activity_push_notice_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return c0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

