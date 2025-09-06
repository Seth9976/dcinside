package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.browser.views.ShadowLayout;
import com.dcinside.app.view.DcToolbar;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import kr.better.widget.BetterTextView;

public final class z implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final CoordinatorLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final BetterTextView d;
    @NonNull
    public final ShadowLayout e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final BetterTextView g;
    @NonNull
    public final ShadowLayout h;
    @NonNull
    public final Group i;
    @NonNull
    public final TextView j;
    @NonNull
    public final ConstraintLayout k;
    @NonNull
    public final ProgressBar l;
    @NonNull
    public final RecyclerViewPager m;
    @NonNull
    public final DcToolbar n;
    @NonNull
    public final X4 o;

    private z(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull TextView textView0, @NonNull BetterTextView betterTextView0, @NonNull ShadowLayout shadowLayout0, @NonNull LinearLayout linearLayout0, @NonNull BetterTextView betterTextView1, @NonNull ShadowLayout shadowLayout1, @NonNull Group group0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout0, @NonNull ProgressBar progressBar0, @NonNull RecyclerViewPager recyclerViewPager0, @NonNull DcToolbar dcToolbar0, @NonNull X4 x40) {
        this.a = coordinatorLayout0;
        this.b = coordinatorLayout1;
        this.c = textView0;
        this.d = betterTextView0;
        this.e = shadowLayout0;
        this.f = linearLayout0;
        this.g = betterTextView1;
        this.h = shadowLayout1;
        this.i = group0;
        this.j = textView1;
        this.k = constraintLayout0;
        this.l = progressBar0;
        this.m = recyclerViewPager0;
        this.n = dcToolbar0;
        this.o = x40;
    }

    @NonNull
    public static z a(@NonNull View view0) {
        int v = 0x7F0B0617;  // id:image_viewer_appbar
        View view1 = ViewBindings.a(view0, 0x7F0B0617);  // id:image_viewer_appbar
        if(((CoordinatorLayout)view1) != null) {
            v = 0x7F0B0618;  // id:image_viewer_block_image
            View view2 = ViewBindings.a(view0, 0x7F0B0618);  // id:image_viewer_block_image
            if(((TextView)view2) != null) {
                v = 0x7F0B0619;  // id:image_viewer_down_all
                View view3 = ViewBindings.a(view0, 0x7F0B0619);  // id:image_viewer_down_all
                if(((BetterTextView)view3) != null) {
                    v = 0x7F0B061A;  // id:image_viewer_down_all_wrap
                    View view4 = ViewBindings.a(view0, 0x7F0B061A);  // id:image_viewer_down_all_wrap
                    if(((ShadowLayout)view4) != null) {
                        v = 0x7F0B061B;  // id:image_viewer_down_one
                        View view5 = ViewBindings.a(view0, 0x7F0B061B);  // id:image_viewer_down_one
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B061C;  // id:image_viewer_down_one_text
                            View view6 = ViewBindings.a(view0, 0x7F0B061C);  // id:image_viewer_down_one_text
                            if(((BetterTextView)view6) != null) {
                                v = 0x7F0B061D;  // id:image_viewer_down_one_wrap
                                View view7 = ViewBindings.a(view0, 0x7F0B061D);  // id:image_viewer_down_one_wrap
                                if(((ShadowLayout)view7) != null) {
                                    v = 0x7F0B061E;  // id:image_viewer_down_wrap
                                    View view8 = ViewBindings.a(view0, 0x7F0B061E);  // id:image_viewer_down_wrap
                                    if(((Group)view8) != null) {
                                        v = 0x7F0B0625;  // id:image_viewer_manager_block_image
                                        View view9 = ViewBindings.a(view0, 0x7F0B0625);  // id:image_viewer_manager_block_image
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0626;  // id:image_viewer_overlays
                                            View view10 = ViewBindings.a(view0, 0x7F0B0626);  // id:image_viewer_overlays
                                            if(((ConstraintLayout)view10) != null) {
                                                v = 0x7F0B0628;  // id:image_viewer_progress
                                                View view11 = ViewBindings.a(view0, 0x7F0B0628);  // id:image_viewer_progress
                                                if(((ProgressBar)view11) != null) {
                                                    v = 0x7F0B0629;  // id:image_viewer_recycler
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0629);  // id:image_viewer_recycler
                                                    if(((RecyclerViewPager)view12) != null) {
                                                        v = 0x7F0B062A;  // id:image_viewer_toolbar
                                                        View view13 = ViewBindings.a(view0, 0x7F0B062A);  // id:image_viewer_toolbar
                                                        if(((DcToolbar)view13) != null) {
                                                            v = 0x7F0B062F;  // id:include_view_image_viewer_panel
                                                            View view14 = ViewBindings.a(view0, 0x7F0B062F);  // id:include_view_image_viewer_panel
                                                            if(view14 != null) {
                                                                return new z(((CoordinatorLayout)view0), ((CoordinatorLayout)view1), ((TextView)view2), ((BetterTextView)view3), ((ShadowLayout)view4), ((LinearLayout)view5), ((BetterTextView)view6), ((ShadowLayout)view7), ((Group)view8), ((TextView)view9), ((ConstraintLayout)view10), ((ProgressBar)view11), ((RecyclerViewPager)view12), ((DcToolbar)view13), X4.a(view14));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static z c(@NonNull LayoutInflater layoutInflater0) {
        return z.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0037, viewGroup0, false);  // layout:activity_image_viewer
        if(z) {
            viewGroup0.addView(view0);
        }
        return z.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

