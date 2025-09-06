package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public final class t2 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final x6 b;
    @NonNull
    public final y6 c;
    @NonNull
    public final C6 d;
    @NonNull
    public final AppBarLayout e;
    @NonNull
    public final CollapsingToolbarLayout f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final CoordinatorLayout h;
    @NonNull
    public final FrameLayout i;
    @NonNull
    public final Button j;
    @NonNull
    public final ClearableEditText k;
    @NonNull
    public final DcToolbar l;

    private t2(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull x6 x60, @NonNull y6 y60, @NonNull C6 c60, @NonNull AppBarLayout appBarLayout0, @NonNull CollapsingToolbarLayout collapsingToolbarLayout0, @NonNull ImageView imageView0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull FrameLayout frameLayout0, @NonNull Button button0, @NonNull ClearableEditText clearableEditText0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = x60;
        this.c = y60;
        this.d = c60;
        this.e = appBarLayout0;
        this.f = collapsingToolbarLayout0;
        this.g = imageView0;
        this.h = coordinatorLayout1;
        this.i = frameLayout0;
        this.j = button0;
        this.k = clearableEditText0;
        this.l = dcToolbar0;
    }

    @NonNull
    public static t2 a(@NonNull View view0) {
        int v = 0x7F0B0630;  // id:include_view_post_search_content
        View view1 = ViewBindings.a(view0, 0x7F0B0630);  // id:include_view_post_search_content
        if(view1 != null) {
            x6 x60 = x6.a(view1);
            v = 0x7F0B0631;  // id:include_view_post_search_head
            View view2 = ViewBindings.a(view0, 0x7F0B0631);  // id:include_view_post_search_head
            if(view2 != null) {
                y6 y60 = y6.a(view2);
                v = 0x7F0B0632;  // id:include_view_post_search_recent_option
                View view3 = ViewBindings.a(view0, 0x7F0B0632);  // id:include_view_post_search_recent_option
                if(view3 != null) {
                    C6 c60 = C6.a(view3);
                    v = 0x7F0B0AF3;  // id:post_search_appbar
                    View view4 = ViewBindings.a(view0, 0x7F0B0AF3);  // id:post_search_appbar
                    if(((AppBarLayout)view4) != null) {
                        v = 0x7F0B0AF7;  // id:post_search_collapsing
                        View view5 = ViewBindings.a(view0, 0x7F0B0AF7);  // id:post_search_collapsing
                        if(((CollapsingToolbarLayout)view5) != null) {
                            v = 0x7F0B0AF8;  // id:post_search_confirm
                            View view6 = ViewBindings.a(view0, 0x7F0B0AF8);  // id:post_search_confirm
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B0AF9;  // id:post_search_content_root
                                View view7 = ViewBindings.a(view0, 0x7F0B0AF9);  // id:post_search_content_root
                                if(((CoordinatorLayout)view7) != null) {
                                    v = 0x7F0B0B02;  // id:post_search_input
                                    View view8 = ViewBindings.a(view0, 0x7F0B0B02);  // id:post_search_input
                                    if(((FrameLayout)view8) != null) {
                                        v = 0x7F0B0B03;  // id:post_search_move_total_search
                                        View view9 = ViewBindings.a(view0, 0x7F0B0B03);  // id:post_search_move_total_search
                                        if(((Button)view9) != null) {
                                            v = 0x7F0B0B07;  // id:post_search_text
                                            View view10 = ViewBindings.a(view0, 0x7F0B0B07);  // id:post_search_text
                                            if(((ClearableEditText)view10) != null) {
                                                v = 0x7F0B0B08;  // id:post_search_toolbar
                                                View view11 = ViewBindings.a(view0, 0x7F0B0B08);  // id:post_search_toolbar
                                                if(((DcToolbar)view11) != null) {
                                                    return new t2(((CoordinatorLayout)view0), x60, y60, c60, ((AppBarLayout)view4), ((CollapsingToolbarLayout)view5), ((ImageView)view6), ((CoordinatorLayout)view7), ((FrameLayout)view8), ((Button)view9), ((ClearableEditText)view10), ((DcToolbar)view11));
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
    public static t2 c(@NonNull LayoutInflater layoutInflater0) {
        return t2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0114, viewGroup0, false);  // layout:fragment_post_search
        if(z) {
            viewGroup0.addView(view0);
        }
        return t2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

