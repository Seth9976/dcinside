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

public final class j0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final Guideline d;
    @NonNull
    public final TextView e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final ProgressBar g;
    @NonNull
    public final TextView h;
    @NonNull
    public final DcToolbar i;

    private j0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout0, @NonNull Guideline guideline0, @NonNull TextView textView1, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0, @NonNull TextView textView2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = constraintLayout0;
        this.d = guideline0;
        this.e = textView1;
        this.f = recyclerView0;
        this.g = progressBar0;
        this.h = textView2;
        this.i = dcToolbar0;
    }

    @NonNull
    public static j0 a(@NonNull View view0) {
        int v = 0x7F0B0156;  // id:article_post_count
        View view1 = ViewBindings.a(view0, 0x7F0B0156);  // id:article_post_count
        if(((TextView)view1) != null) {
            v = 0x7F0B0157;  // id:article_post_empty
            View view2 = ViewBindings.a(view0, 0x7F0B0157);  // id:article_post_empty
            if(((ConstraintLayout)view2) != null) {
                v = 0x7F0B0158;  // id:article_post_empty_guideline
                View view3 = ViewBindings.a(view0, 0x7F0B0158);  // id:article_post_empty_guideline
                if(((Guideline)view3) != null) {
                    v = 0x7F0B0159;  // id:article_post_empty_title
                    View view4 = ViewBindings.a(view0, 0x7F0B0159);  // id:article_post_empty_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B015A;  // id:article_post_list
                        View view5 = ViewBindings.a(view0, 0x7F0B015A);  // id:article_post_list
                        if(((RecyclerView)view5) != null) {
                            v = 0x7F0B015B;  // id:article_post_progress
                            View view6 = ViewBindings.a(view0, 0x7F0B015B);  // id:article_post_progress
                            if(((ProgressBar)view6) != null) {
                                v = 0x7F0B015C;  // id:article_post_title
                                View view7 = ViewBindings.a(view0, 0x7F0B015C);  // id:article_post_title
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B015D;  // id:article_post_toolbar
                                    View view8 = ViewBindings.a(view0, 0x7F0B015D);  // id:article_post_toolbar
                                    if(((DcToolbar)view8) != null) {
                                        return new j0(((CoordinatorLayout)view0), ((TextView)view1), ((ConstraintLayout)view2), ((Guideline)view3), ((TextView)view4), ((RecyclerView)view5), ((ProgressBar)view6), ((TextView)view7), ((DcToolbar)view8));
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
    public static j0 c(@NonNull LayoutInflater layoutInflater0) {
        return j0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005A, viewGroup0, false);  // layout:activity_setting_article_post
        if(z) {
            viewGroup0.addView(view0);
        }
        return j0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

