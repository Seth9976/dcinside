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
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;

public final class t implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final View e;
    @NonNull
    public final TextView f;
    @NonNull
    public final View g;
    @NonNull
    public final View h;
    @NonNull
    public final ConstraintLayout i;
    @NonNull
    public final TextView j;
    @NonNull
    public final Guideline k;
    @NonNull
    public final TextView l;
    @NonNull
    public final RecyclerView m;
    @NonNull
    public final ImageView n;
    @NonNull
    public final ClearableEditText o;
    @NonNull
    public final ConstraintLayout p;
    @NonNull
    public final TextView q;
    @NonNull
    public final ConstraintLayout r;
    @NonNull
    public final DcToolbar s;

    private t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView1, @NonNull View view0, @NonNull TextView textView2, @NonNull View view1, @NonNull View view2, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView3, @NonNull Guideline guideline0, @NonNull TextView textView4, @NonNull RecyclerView recyclerView0, @NonNull ImageView imageView0, @NonNull ClearableEditText clearableEditText0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView5, @NonNull ConstraintLayout constraintLayout2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = frameLayout0;
        this.d = textView1;
        this.e = view0;
        this.f = textView2;
        this.g = view1;
        this.h = view2;
        this.i = constraintLayout0;
        this.j = textView3;
        this.k = guideline0;
        this.l = textView4;
        this.m = recyclerView0;
        this.n = imageView0;
        this.o = clearableEditText0;
        this.p = constraintLayout1;
        this.q = textView5;
        this.r = constraintLayout2;
        this.s = dcToolbar0;
    }

    @NonNull
    public static t a(@NonNull View view0) {
        int v = 0x7F0B04DE;  // id:gallery_manage_filter_my_contents
        View view1 = ViewBindings.a(view0, 0x7F0B04DE);  // id:gallery_manage_filter_my_contents
        if(((TextView)view1) != null) {
            v = 0x7F0B04DF;  // id:gallery_manage_filter_wrapper
            View view2 = ViewBindings.a(view0, 0x7F0B04DF);  // id:gallery_manage_filter_wrapper
            if(((FrameLayout)view2) != null) {
                v = 0x7F0B04E0;  // id:gallery_manage_history_block
                View view3 = ViewBindings.a(view0, 0x7F0B04E0);  // id:gallery_manage_history_block
                if(((TextView)view3) != null) {
                    v = 0x7F0B04E1;  // id:gallery_manage_history_block_divider
                    View view4 = ViewBindings.a(view0, 0x7F0B04E1);  // id:gallery_manage_history_block_divider
                    if(view4 != null) {
                        v = 0x7F0B04E2;  // id:gallery_manage_history_delete
                        View view5 = ViewBindings.a(view0, 0x7F0B04E2);  // id:gallery_manage_history_delete
                        if(((TextView)view5) != null) {
                            v = 0x7F0B04E3;  // id:gallery_manage_history_delete_divider
                            View view6 = ViewBindings.a(view0, 0x7F0B04E3);  // id:gallery_manage_history_delete_divider
                            if(view6 != null) {
                                v = 0x7F0B04E4;  // id:gallery_manage_history_divider
                                View view7 = ViewBindings.a(view0, 0x7F0B04E4);  // id:gallery_manage_history_divider
                                if(view7 != null) {
                                    v = 0x7F0B04E5;  // id:gallery_manage_history_empty
                                    View view8 = ViewBindings.a(view0, 0x7F0B04E5);  // id:gallery_manage_history_empty
                                    if(((ConstraintLayout)view8) != null) {
                                        v = 0x7F0B04E6;  // id:gallery_manage_history_empty_content
                                        View view9 = ViewBindings.a(view0, 0x7F0B04E6);  // id:gallery_manage_history_empty_content
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B04E7;  // id:gallery_manage_history_empty_guide
                                            View view10 = ViewBindings.a(view0, 0x7F0B04E7);  // id:gallery_manage_history_empty_guide
                                            if(((Guideline)view10) != null) {
                                                v = 0x7F0B04E8;  // id:gallery_manage_history_empty_title
                                                View view11 = ViewBindings.a(view0, 0x7F0B04E8);  // id:gallery_manage_history_empty_title
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B04E9;  // id:gallery_manage_history_list
                                                    View view12 = ViewBindings.a(view0, 0x7F0B04E9);  // id:gallery_manage_history_list
                                                    if(((RecyclerView)view12) != null) {
                                                        v = 0x7F0B04EA;  // id:gallery_manage_history_search_confirm
                                                        View view13 = ViewBindings.a(view0, 0x7F0B04EA);  // id:gallery_manage_history_search_confirm
                                                        if(((ImageView)view13) != null) {
                                                            v = 0x7F0B04EB;  // id:gallery_manage_history_search_text
                                                            View view14 = ViewBindings.a(view0, 0x7F0B04EB);  // id:gallery_manage_history_search_text
                                                            if(((ClearableEditText)view14) != null) {
                                                                v = 0x7F0B04EC;  // id:gallery_manage_history_search_wrapper
                                                                View view15 = ViewBindings.a(view0, 0x7F0B04EC);  // id:gallery_manage_history_search_wrapper
                                                                if(((ConstraintLayout)view15) != null) {
                                                                    v = 0x7F0B04ED;  // id:gallery_manage_history_setting
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B04ED);  // id:gallery_manage_history_setting
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B04EE;  // id:gallery_manage_history_tab_wrapper
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B04EE);  // id:gallery_manage_history_tab_wrapper
                                                                        if(((ConstraintLayout)view17) != null) {
                                                                            v = 0x7F0B04EF;  // id:gallery_manage_history_toolbar
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B04EF);  // id:gallery_manage_history_toolbar
                                                                            if(((DcToolbar)view18) != null) {
                                                                                return new t(((CoordinatorLayout)view0), ((TextView)view1), ((FrameLayout)view2), ((TextView)view3), view4, ((TextView)view5), view6, view7, ((ConstraintLayout)view8), ((TextView)view9), ((Guideline)view10), ((TextView)view11), ((RecyclerView)view12), ((ImageView)view13), ((ClearableEditText)view14), ((ConstraintLayout)view15), ((TextView)view16), ((ConstraintLayout)view17), ((DcToolbar)view18));
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
    public static t c(@NonNull LayoutInflater layoutInflater0) {
        return t.d(layoutInflater0, null, false);
    }

    @NonNull
    public static t d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0031, viewGroup0, false);  // layout:activity_gallery_manage_history
        if(z) {
            viewGroup0.addView(view0);
        }
        return t.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

