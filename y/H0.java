package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.leinardi.android.speeddial.SpeedDialOverlayLayout;
import com.leinardi.android.speeddial.SpeedDialView;

public final class h0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final SpeedDialOverlayLayout c;
    @NonNull
    public final SpeedDialView d;
    @NonNull
    public final FloatingActionButton e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final TextView h;
    @NonNull
    public final View i;
    @NonNull
    public final TextView j;
    @NonNull
    public final View k;
    @NonNull
    public final RecyclerView l;
    @NonNull
    public final ProgressBar m;
    @NonNull
    public final TextView n;
    @NonNull
    public final ImageView o;
    @NonNull
    public final ImageView p;
    @NonNull
    public final EditText q;
    @NonNull
    public final ConstraintLayout r;
    @NonNull
    public final DcToolbar s;

    private h0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull SpeedDialOverlayLayout speedDialOverlayLayout0, @NonNull SpeedDialView speedDialView0, @NonNull FloatingActionButton floatingActionButton0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView1, @NonNull View view0, @NonNull TextView textView2, @NonNull View view1, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView3, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull EditText editText0, @NonNull ConstraintLayout constraintLayout1, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = speedDialOverlayLayout0;
        this.d = speedDialView0;
        this.e = floatingActionButton0;
        this.f = textView0;
        this.g = constraintLayout0;
        this.h = textView1;
        this.i = view0;
        this.j = textView2;
        this.k = view1;
        this.l = recyclerView0;
        this.m = progressBar0;
        this.n = textView3;
        this.o = imageView0;
        this.p = imageView1;
        this.q = editText0;
        this.r = constraintLayout1;
        this.s = dcToolbar0;
    }

    @NonNull
    public static h0 a(@NonNull View view0) {
        int v = 0x7F0B0BF4;  // id:progress_wrap
        View view1 = ViewBindings.a(view0, 0x7F0B0BF4);  // id:progress_wrap
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0E25;  // id:series_manage_add_background
            View view2 = ViewBindings.a(view0, 0x7F0B0E25);  // id:series_manage_add_background
            if(((SpeedDialOverlayLayout)view2) != null) {
                v = 0x7F0B0E26;  // id:series_manage_add_post_dial
                View view3 = ViewBindings.a(view0, 0x7F0B0E26);  // id:series_manage_add_post_dial
                if(((SpeedDialView)view3) != null) {
                    v = 0x7F0B0E27;  // id:series_manage_add_post_floating
                    View view4 = ViewBindings.a(view0, 0x7F0B0E27);  // id:series_manage_add_post_floating
                    if(((FloatingActionButton)view4) != null) {
                        v = 0x7F0B0E28;  // id:series_manage_apply
                        View view5 = ViewBindings.a(view0, 0x7F0B0E28);  // id:series_manage_apply
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0E29;  // id:series_manage_empty
                            View view6 = ViewBindings.a(view0, 0x7F0B0E29);  // id:series_manage_empty
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B0E2A;  // id:series_manage_guide_title
                                View view7 = ViewBindings.a(view0, 0x7F0B0E2A);  // id:series_manage_guide_title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0E2B;  // id:series_manage_keyboard_hide
                                    View view8 = ViewBindings.a(view0, 0x7F0B0E2B);  // id:series_manage_keyboard_hide
                                    if(view8 != null) {
                                        v = 0x7F0B0E2C;  // id:series_manage_post_count
                                        View view9 = ViewBindings.a(view0, 0x7F0B0E2C);  // id:series_manage_post_count
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0E2D;  // id:series_manage_post_divider
                                            View view10 = ViewBindings.a(view0, 0x7F0B0E2D);  // id:series_manage_post_divider
                                            if(view10 != null) {
                                                v = 0x7F0B0E2E;  // id:series_manage_post_list
                                                View view11 = ViewBindings.a(view0, 0x7F0B0E2E);  // id:series_manage_post_list
                                                if(((RecyclerView)view11) != null) {
                                                    v = 0x7F0B0E2F;  // id:series_manage_progress
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0E2F);  // id:series_manage_progress
                                                    if(((ProgressBar)view12) != null) {
                                                        v = 0x7F0B0E30;  // id:series_manage_save
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0E30);  // id:series_manage_save
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0E31;  // id:series_manage_sort
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0E31);  // id:series_manage_sort
                                                            if(((ImageView)view14) != null) {
                                                                v = 0x7F0B0E32;  // id:series_manage_subject_clear_icon
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0E32);  // id:series_manage_subject_clear_icon
                                                                if(((ImageView)view15) != null) {
                                                                    v = 0x7F0B0E33;  // id:series_manage_subject_input
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0E33);  // id:series_manage_subject_input
                                                                    if(((EditText)view16) != null) {
                                                                        v = 0x7F0B0E34;  // id:series_manage_title_wrap
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0E34);  // id:series_manage_title_wrap
                                                                        if(((ConstraintLayout)view17) != null) {
                                                                            v = 0x7F0B0E35;  // id:series_manage_toolbar
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0E35);  // id:series_manage_toolbar
                                                                            if(((DcToolbar)view18) != null) {
                                                                                return new h0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((SpeedDialOverlayLayout)view2), ((SpeedDialView)view3), ((FloatingActionButton)view4), ((TextView)view5), ((ConstraintLayout)view6), ((TextView)view7), view8, ((TextView)view9), view10, ((RecyclerView)view11), ((ProgressBar)view12), ((TextView)view13), ((ImageView)view14), ((ImageView)view15), ((EditText)view16), ((ConstraintLayout)view17), ((DcToolbar)view18));
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
    public static h0 c(@NonNull LayoutInflater layoutInflater0) {
        return h0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0058, viewGroup0, false);  // layout:activity_series_manage
        if(z) {
            viewGroup0.addView(view0);
        }
        return h0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

