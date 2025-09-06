package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
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

public final class u0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final Guideline e;
    @NonNull
    public final TextView f;
    @NonNull
    public final RecyclerView g;
    @NonNull
    public final ProgressBar h;
    @NonNull
    public final TextView i;
    @NonNull
    public final DcToolbar j;

    private u0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView1, @NonNull Guideline guideline0, @NonNull TextView textView2, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView3, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = constraintLayout0;
        this.d = textView1;
        this.e = guideline0;
        this.f = textView2;
        this.g = recyclerView0;
        this.h = progressBar0;
        this.i = textView3;
        this.j = dcToolbar0;
    }

    @NonNull
    public static u0 a(@NonNull View view0) {
        int v = 0x7F0B06D2;  // id:keyword_count
        View view1 = ViewBindings.a(view0, 0x7F0B06D2);  // id:keyword_count
        if(((TextView)view1) != null) {
            v = 0x7F0B06D4;  // id:keyword_empty
            View view2 = ViewBindings.a(view0, 0x7F0B06D4);  // id:keyword_empty
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B06D5;  // id:keyword_empty_content
                View view3 = ViewBindings.a(view0, 0x7F0B06D5);  // id:keyword_empty_content
                if(((TextView)view3) != null) {
                    v = 0x7F0B06D6;  // id:keyword_empty_guideline
                    View view4 = ViewBindings.a(view0, 0x7F0B06D6);  // id:keyword_empty_guideline
                    if(((Guideline)view4) != null) {
                        v = 0x7F0B06D7;  // id:keyword_empty_title
                        View view5 = ViewBindings.a(view0, 0x7F0B06D7);  // id:keyword_empty_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B06D8;  // id:keyword_list
                            View view6 = ViewBindings.a(view0, 0x7F0B06D8);  // id:keyword_list
                            if(((RecyclerView)view6) != null) {
                                v = 0x7F0B06D9;  // id:keyword_list_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B06D9);  // id:keyword_list_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B06DB;  // id:keyword_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B06DB);  // id:keyword_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B06DC;  // id:keyword_toolbar
                                        View view9 = ViewBindings.a(view0, 0x7F0B06DC);  // id:keyword_toolbar
                                        if(((DcToolbar)view9) != null) {
                                            return new u0(((CoordinatorLayout)view0), ((TextView)view1), ((ConstraintLayout)view2), ((TextView)view3), ((Guideline)view4), ((TextView)view5), ((RecyclerView)view6), ((ProgressBar)view7), ((TextView)view8), ((DcToolbar)view9));
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
    public static u0 c(@NonNull LayoutInflater layoutInflater0) {
        return u0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0065, viewGroup0, false);  // layout:activity_setting_keyword
        if(z) {
            viewGroup0.addView(view0);
        }
        return u0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

