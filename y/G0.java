package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class g0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final View f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final RecyclerView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final CoordinatorLayout j;
    @NonNull
    public final FrameLayout k;
    @NonNull
    public final DcToolbar l;
    @NonNull
    public final ConstraintLayout m;
    @NonNull
    public final ConstraintLayout n;
    @NonNull
    public final View o;

    private g0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull View view1, @NonNull ConstraintLayout constraintLayout0, @NonNull RecyclerView recyclerView0, @NonNull TextView textView2, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull FrameLayout frameLayout0, @NonNull DcToolbar dcToolbar0, @NonNull ConstraintLayout constraintLayout1, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2) {
        this.a = coordinatorLayout0;
        this.b = view0;
        this.c = imageView0;
        this.d = textView0;
        this.e = textView1;
        this.f = view1;
        this.g = constraintLayout0;
        this.h = recyclerView0;
        this.i = textView2;
        this.j = coordinatorLayout1;
        this.k = frameLayout0;
        this.l = dcToolbar0;
        this.m = constraintLayout1;
        this.n = constraintLayout2;
        this.o = view2;
    }

    @NonNull
    public static g0 a(@NonNull View view0) {
        int v = 0x7F0B0E05;  // id:series_add_divider
        View view1 = ViewBindings.a(view0, 0x7F0B0E05);  // id:series_add_divider
        if(view1 != null) {
            v = 0x7F0B0E06;  // id:series_add_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0E06);  // id:series_add_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0E08;  // id:series_add_text
                View view3 = ViewBindings.a(view0, 0x7F0B0E08);  // id:series_add_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B0E0F;  // id:series_current_count
                    View view4 = ViewBindings.a(view0, 0x7F0B0E0F);  // id:series_current_count
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0E10;  // id:series_current_count_divider
                        View view5 = ViewBindings.a(view0, 0x7F0B0E10);  // id:series_current_count_divider
                        if(view5 != null) {
                            v = 0x7F0B0E11;  // id:series_current_count_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B0E11);  // id:series_current_count_wrap
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B0E12;  // id:series_current_list
                                View view7 = ViewBindings.a(view0, 0x7F0B0E12);  // id:series_current_list
                                if(((RecyclerView)view7) != null) {
                                    v = 0x7F0B0E13;  // id:series_current_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B0E13);  // id:series_current_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0E21;  // id:series_list_quick_place
                                        View view9 = ViewBindings.a(view0, 0x7F0B0E21);  // id:series_list_quick_place
                                        if(((FrameLayout)view9) != null) {
                                            v = 0x7F0B0E22;  // id:series_list_toolbar
                                            View view10 = ViewBindings.a(view0, 0x7F0B0E22);  // id:series_list_toolbar
                                            if(((DcToolbar)view10) != null) {
                                                v = 0x7F0B0E23;  // id:series_list_wrap
                                                View view11 = ViewBindings.a(view0, 0x7F0B0E23);  // id:series_list_wrap
                                                if(((ConstraintLayout)view11) != null) {
                                                    v = 0x7F0B0E24;  // id:series_make_new
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0E24);  // id:series_make_new
                                                    if(((ConstraintLayout)view12) != null) {
                                                        v = 0x7F0B0E38;  // id:series_popup_menu_hider
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0E38);  // id:series_popup_menu_hider
                                                        if(view13 != null) {
                                                            return new g0(((CoordinatorLayout)view0), view1, ((ImageView)view2), ((TextView)view3), ((TextView)view4), view5, ((ConstraintLayout)view6), ((RecyclerView)view7), ((TextView)view8), ((CoordinatorLayout)view0), ((FrameLayout)view9), ((DcToolbar)view10), ((ConstraintLayout)view11), ((ConstraintLayout)view12), view13);
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
    public static g0 c(@NonNull LayoutInflater layoutInflater0) {
        return g0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0057, viewGroup0, false);  // layout:activity_series_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return g0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

