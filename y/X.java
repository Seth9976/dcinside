package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class x implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final View h;
    @NonNull
    public final ConstraintLayout i;
    @NonNull
    public final RecyclerView j;
    @NonNull
    public final TextView k;
    @NonNull
    public final ClearableEditText l;
    @NonNull
    public final DcToolbar m;
    @NonNull
    public final ConstraintLayout n;

    private x(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout0, @NonNull View view0, @NonNull ConstraintLayout constraintLayout1, @NonNull RecyclerView recyclerView0, @NonNull TextView textView4, @NonNull ClearableEditText clearableEditText0, @NonNull DcToolbar dcToolbar0, @NonNull ConstraintLayout constraintLayout2) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = constraintLayout0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
        this.g = linearLayout0;
        this.h = view0;
        this.i = constraintLayout1;
        this.j = recyclerView0;
        this.k = textView4;
        this.l = clearableEditText0;
        this.m = dcToolbar0;
        this.n = constraintLayout2;
    }

    @NonNull
    public static x a(@NonNull View view0) {
        int v = 0x7F0B0562;  // id:hate_word_setting_btn
        View view1 = ViewBindings.a(view0, 0x7F0B0562);  // id:hate_word_setting_btn
        if(((TextView)view1) != null) {
            v = 0x7F0B0563;  // id:hate_word_setting_container
            View view2 = ViewBindings.a(view0, 0x7F0B0563);  // id:hate_word_setting_container
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B0564;  // id:hate_word_setting_copy
                View view3 = ViewBindings.a(view0, 0x7F0B0564);  // id:hate_word_setting_copy
                if(((TextView)view3) != null) {
                    v = 0x7F0B0565;  // id:hate_word_setting_count
                    View view4 = ViewBindings.a(view0, 0x7F0B0565);  // id:hate_word_setting_count
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0566;  // id:hate_word_setting_current_name
                        View view5 = ViewBindings.a(view0, 0x7F0B0566);  // id:hate_word_setting_current_name
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0567;  // id:hate_word_setting_current_wrap
                            View view6 = ViewBindings.a(view0, 0x7F0B0567);  // id:hate_word_setting_current_wrap
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B0568;  // id:hate_word_setting_divider
                                View view7 = ViewBindings.a(view0, 0x7F0B0568);  // id:hate_word_setting_divider
                                if(view7 != null) {
                                    v = 0x7F0B0569;  // id:hate_word_setting_line
                                    View view8 = ViewBindings.a(view0, 0x7F0B0569);  // id:hate_word_setting_line
                                    if(((ConstraintLayout)view8) != null) {
                                        v = 0x7F0B056A;  // id:hate_word_setting_recycler
                                        View view9 = ViewBindings.a(view0, 0x7F0B056A);  // id:hate_word_setting_recycler
                                        if(((RecyclerView)view9) != null) {
                                            v = 0x7F0B056B;  // id:hate_word_setting_remove_all
                                            View view10 = ViewBindings.a(view0, 0x7F0B056B);  // id:hate_word_setting_remove_all
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B056C;  // id:hate_word_setting_text
                                                View view11 = ViewBindings.a(view0, 0x7F0B056C);  // id:hate_word_setting_text
                                                if(((ClearableEditText)view11) != null) {
                                                    v = 0x7F0B056D;  // id:hate_word_setting_toolbar
                                                    View view12 = ViewBindings.a(view0, 0x7F0B056D);  // id:hate_word_setting_toolbar
                                                    if(((DcToolbar)view12) != null) {
                                                        v = 0x7F0B056E;  // id:hate_word_setting_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B056E);  // id:hate_word_setting_wrap
                                                        if(((ConstraintLayout)view13) != null) {
                                                            return new x(((CoordinatorLayout)view0), ((TextView)view1), ((ConstraintLayout)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((LinearLayout)view6), view7, ((ConstraintLayout)view8), ((RecyclerView)view9), ((TextView)view10), ((ClearableEditText)view11), ((DcToolbar)view12), ((ConstraintLayout)view13));
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
    public static x c(@NonNull LayoutInflater layoutInflater0) {
        return x.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0035, viewGroup0, false);  // layout:activity_hate_word_setting
        if(z) {
            viewGroup0.addView(view0);
        }
        return x.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

