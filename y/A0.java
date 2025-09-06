package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class a0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final CheckBox e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final View h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final FrameLayout k;
    @NonNull
    public final View l;
    @NonNull
    public final FrameLayout m;
    @NonNull
    public final TextView n;
    @NonNull
    public final RecyclerView o;
    @NonNull
    public final TextView p;
    @NonNull
    public final Guideline q;
    @NonNull
    public final DcToolbar r;

    private a0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull CheckBox checkBox0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull View view0, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull FrameLayout frameLayout0, @NonNull View view1, @NonNull FrameLayout frameLayout1, @NonNull TextView textView5, @NonNull RecyclerView recyclerView0, @NonNull TextView textView6, @NonNull Guideline guideline0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = imageView0;
        this.c = constraintLayout0;
        this.d = textView0;
        this.e = checkBox0;
        this.f = textView1;
        this.g = textView2;
        this.h = view0;
        this.i = textView3;
        this.j = textView4;
        this.k = frameLayout0;
        this.l = view1;
        this.m = frameLayout1;
        this.n = textView5;
        this.o = recyclerView0;
        this.p = textView6;
        this.q = guideline0;
        this.r = dcToolbar0;
    }

    @NonNull
    public static a0 a(@NonNull View view0) {
        int v = 0x7F0B0B1A;  // id:post_temp_auto_save_enable
        View view1 = ViewBindings.a(view0, 0x7F0B0B1A);  // id:post_temp_auto_save_enable
        if(((ImageView)view1) != null) {
            v = 0x7F0B0B1B;  // id:post_temp_auto_save_enable_wrap
            View view2 = ViewBindings.a(view0, 0x7F0B0B1B);  // id:post_temp_auto_save_enable_wrap
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B0B1C;  // id:post_temp_auto_save_title
                View view3 = ViewBindings.a(view0, 0x7F0B0B1C);  // id:post_temp_auto_save_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0B1F;  // id:post_temp_check_all
                    View view4 = ViewBindings.a(view0, 0x7F0B0B1F);  // id:post_temp_check_all
                    if(((CheckBox)view4) != null) {
                        v = 0x7F0B0B20;  // id:post_temp_check_all_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0B20);  // id:post_temp_check_all_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0B22;  // id:post_temp_delete_all_text
                            View view6 = ViewBindings.a(view0, 0x7F0B0B22);  // id:post_temp_delete_all_text
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0B24;  // id:post_temp_div
                                View view7 = ViewBindings.a(view0, 0x7F0B0B24);  // id:post_temp_div
                                if(view7 != null) {
                                    v = 0x7F0B0B25;  // id:post_temp_edit
                                    View view8 = ViewBindings.a(view0, 0x7F0B0B25);  // id:post_temp_edit
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0B26;  // id:post_temp_empty
                                        View view9 = ViewBindings.a(view0, 0x7F0B0B26);  // id:post_temp_empty
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0B27;  // id:post_temp_max_count
                                            View view10 = ViewBindings.a(view0, 0x7F0B0B27);  // id:post_temp_max_count
                                            if(((FrameLayout)view10) != null) {
                                                v = 0x7F0B0B28;  // id:post_temp_max_count_back
                                                View view11 = ViewBindings.a(view0, 0x7F0B0B28);  // id:post_temp_max_count_back
                                                if(view11 != null) {
                                                    v = 0x7F0B0B2A;  // id:post_temp_max_count_remove
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0B2A);  // id:post_temp_max_count_remove
                                                    if(((FrameLayout)view12) != null) {
                                                        v = 0x7F0B0B2B;  // id:post_temp_max_count_text
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0B2B);  // id:post_temp_max_count_text
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0B2C;  // id:post_temp_recycler
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0B2C);  // id:post_temp_recycler
                                                            if(((RecyclerView)view14) != null) {
                                                                v = 0x7F0B0B31;  // id:post_temp_toast
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0B31);  // id:post_temp_toast
                                                                if(((TextView)view15) != null) {
                                                                    v = 0x7F0B0B32;  // id:post_temp_toast_guide
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0B32);  // id:post_temp_toast_guide
                                                                    if(((Guideline)view16) != null) {
                                                                        v = 0x7F0B0B33;  // id:post_temp_toolbar
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0B33);  // id:post_temp_toolbar
                                                                        if(((DcToolbar)view17) != null) {
                                                                            return new a0(((CoordinatorLayout)view0), ((ImageView)view1), ((ConstraintLayout)view2), ((TextView)view3), ((CheckBox)view4), ((TextView)view5), ((TextView)view6), view7, ((TextView)view8), ((TextView)view9), ((FrameLayout)view10), view11, ((FrameLayout)view12), ((TextView)view13), ((RecyclerView)view14), ((TextView)view15), ((Guideline)view16), ((DcToolbar)view17));
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
    public static a0 c(@NonNull LayoutInflater layoutInflater0) {
        return a0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0051, viewGroup0, false);  // layout:activity_post_temp
        if(z) {
            viewGroup0.addView(view0);
        }
        return a0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

