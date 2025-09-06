package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class q0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ClearableEditText e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ImageView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final View k;
    @NonNull
    public final TextView l;
    @NonNull
    public final LinearLayout m;
    @NonNull
    public final SwitchCompat n;
    @NonNull
    public final TextView o;
    @NonNull
    public final Guideline p;
    @NonNull
    public final RecyclerView q;
    @NonNull
    public final LinearLayout r;
    @NonNull
    public final DcToolbar s;
    @NonNull
    public final LinearLayout t;
    @NonNull
    public final SwitchCompat u;
    @NonNull
    public final LinearLayout v;
    @NonNull
    public final TextView w;
    @NonNull
    public final ConstraintLayout x;
    @NonNull
    public final ProgressBar y;
    @NonNull
    public final ConstraintLayout z;

    private q0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ClearableEditText clearableEditText0, @NonNull TextView textView2, @NonNull ImageView imageView0, @NonNull TextView textView3, @NonNull ImageView imageView1, @NonNull TextView textView4, @NonNull View view0, @NonNull TextView textView5, @NonNull LinearLayout linearLayout1, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView6, @NonNull Guideline guideline0, @NonNull RecyclerView recyclerView0, @NonNull LinearLayout linearLayout2, @NonNull DcToolbar dcToolbar0, @NonNull LinearLayout linearLayout3, @NonNull SwitchCompat switchCompat1, @NonNull LinearLayout linearLayout4, @NonNull TextView textView7, @NonNull ConstraintLayout constraintLayout0, @NonNull ProgressBar progressBar0, @NonNull ConstraintLayout constraintLayout1) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = textView1;
        this.e = clearableEditText0;
        this.f = textView2;
        this.g = imageView0;
        this.h = textView3;
        this.i = imageView1;
        this.j = textView4;
        this.k = view0;
        this.l = textView5;
        this.m = linearLayout1;
        this.n = switchCompat0;
        this.o = textView6;
        this.p = guideline0;
        this.q = recyclerView0;
        this.r = linearLayout2;
        this.s = dcToolbar0;
        this.t = linearLayout3;
        this.u = switchCompat1;
        this.v = linearLayout4;
        this.w = textView7;
        this.x = constraintLayout0;
        this.y = progressBar0;
        this.z = constraintLayout1;
    }

    @NonNull
    public static q0 a(@NonNull View view0) {
        int v = 0x7F0B04D1;  // id:gallery_article_push_enable
        View view1 = ViewBindings.a(view0, 0x7F0B04D1);  // id:gallery_article_push_enable
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B04D2;  // id:gallery_article_push_value
            View view2 = ViewBindings.a(view0, 0x7F0B04D2);  // id:gallery_article_push_value
            if(((TextView)view2) != null) {
                v = 0x7F0B04D3;  // id:gallery_input_keyword
                View view3 = ViewBindings.a(view0, 0x7F0B04D3);  // id:gallery_input_keyword
                if(((TextView)view3) != null) {
                    v = 0x7F0B04D4;  // id:gallery_input_keyword_text
                    View view4 = ViewBindings.a(view0, 0x7F0B04D4);  // id:gallery_input_keyword_text
                    if(((ClearableEditText)view4) != null) {
                        v = 0x7F0B04D6;  // id:gallery_keyword_all
                        View view5 = ViewBindings.a(view0, 0x7F0B04D6);  // id:gallery_keyword_all
                        if(((TextView)view5) != null) {
                            v = 0x7F0B04D7;  // id:gallery_keyword_all_icon
                            View view6 = ViewBindings.a(view0, 0x7F0B04D7);  // id:gallery_keyword_all_icon
                            if(((ImageView)view6) != null) {
                                v = 0x7F0B04D8;  // id:gallery_keyword_count
                                View view7 = ViewBindings.a(view0, 0x7F0B04D8);  // id:gallery_keyword_count
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B04D9;  // id:gallery_keyword_count_remove_all
                                    View view8 = ViewBindings.a(view0, 0x7F0B04D9);  // id:gallery_keyword_count_remove_all
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B04DA;  // id:gallery_keyword_count_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B04DA);  // id:gallery_keyword_count_title
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B04DB;  // id:gallery_keyword_divider
                                            View view10 = ViewBindings.a(view0, 0x7F0B04DB);  // id:gallery_keyword_divider
                                            if(view10 != null) {
                                                v = 0x7F0B04DC;  // id:gallery_keyword_title
                                                View view11 = ViewBindings.a(view0, 0x7F0B04DC);  // id:gallery_keyword_title
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B04F3;  // id:gallery_notice_push
                                                    View view12 = ViewBindings.a(view0, 0x7F0B04F3);  // id:gallery_notice_push
                                                    if(((LinearLayout)view12) != null) {
                                                        v = 0x7F0B04F4;  // id:gallery_notice_push_switch
                                                        View view13 = ViewBindings.a(view0, 0x7F0B04F4);  // id:gallery_notice_push_switch
                                                        if(((SwitchCompat)view13) != null) {
                                                            v = 0x7F0B04FC;  // id:gallery_push_keyword_empty
                                                            View view14 = ViewBindings.a(view0, 0x7F0B04FC);  // id:gallery_push_keyword_empty
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B04FD;  // id:gallery_push_keyword_guide
                                                                View view15 = ViewBindings.a(view0, 0x7F0B04FD);  // id:gallery_push_keyword_guide
                                                                if(((Guideline)view15) != null) {
                                                                    v = 0x7F0B04FE;  // id:gallery_push_keyword_list
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B04FE);  // id:gallery_push_keyword_list
                                                                    if(((RecyclerView)view16) != null) {
                                                                        v = 0x7F0B04FF;  // id:gallery_push_setting_content
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B04FF);  // id:gallery_push_setting_content
                                                                        if(((LinearLayout)view17) != null) {
                                                                            v = 0x7F0B0500;  // id:gallery_push_setting_toolbar
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0500);  // id:gallery_push_setting_toolbar
                                                                            if(((DcToolbar)view18) != null) {
                                                                                v = 0x7F0B0501;  // id:gallery_recommend_push
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0501);  // id:gallery_recommend_push
                                                                                if(((LinearLayout)view19) != null) {
                                                                                    v = 0x7F0B0502;  // id:gallery_recommend_push_switch
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0502);  // id:gallery_recommend_push_switch
                                                                                    if(((SwitchCompat)view20) != null) {
                                                                                        v = 0x7F0B0510;  // id:gallery_user_push_enable
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0510);  // id:gallery_user_push_enable
                                                                                        if(((LinearLayout)view21) != null) {
                                                                                            v = 0x7F0B0511;  // id:gallery_user_push_value
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B0511);  // id:gallery_user_push_value
                                                                                            if(((TextView)view22) != null) {
                                                                                                v = 0x7F0B06D3;  // id:keyword_count_wrapper
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B06D3);  // id:keyword_count_wrapper
                                                                                                if(((ConstraintLayout)view23) != null) {
                                                                                                    v = 0x7F0B06D9;  // id:keyword_list_progress
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B06D9);  // id:keyword_list_progress
                                                                                                    if(((ProgressBar)view24) != null) {
                                                                                                        v = 0x7F0B06DA;  // id:keyword_push_all
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B06DA);  // id:keyword_push_all
                                                                                                        if(((ConstraintLayout)view25) != null) {
                                                                                                            return new q0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((TextView)view3), ((ClearableEditText)view4), ((TextView)view5), ((ImageView)view6), ((TextView)view7), ((ImageView)view8), ((TextView)view9), view10, ((TextView)view11), ((LinearLayout)view12), ((SwitchCompat)view13), ((TextView)view14), ((Guideline)view15), ((RecyclerView)view16), ((LinearLayout)view17), ((DcToolbar)view18), ((LinearLayout)view19), ((SwitchCompat)view20), ((LinearLayout)view21), ((TextView)view22), ((ConstraintLayout)view23), ((ProgressBar)view24), ((ConstraintLayout)view25));
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
    public static q0 c(@NonNull LayoutInflater layoutInflater0) {
        return q0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0061, viewGroup0, false);  // layout:activity_setting_gallery_push
        if(z) {
            viewGroup0.addView(view0);
        }
        return q0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

