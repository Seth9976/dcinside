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
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class o2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final TextView e;
    @NonNull
    public final RecyclerView f;
    @NonNull
    public final Guideline g;
    @NonNull
    public final ProgressBar h;
    @NonNull
    public final SwipeRefreshLayout i;

    private o2(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView2, @NonNull RecyclerView recyclerView0, @NonNull Guideline guideline0, @NonNull ProgressBar progressBar0, @NonNull SwipeRefreshLayout swipeRefreshLayout0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = constraintLayout1;
        this.e = textView2;
        this.f = recyclerView0;
        this.g = guideline0;
        this.h = progressBar0;
        this.i = swipeRefreshLayout0;
    }

    @NonNull
    public static o2 a(@NonNull View view0) {
        int v = 0x7F0B08BD;  // id:my_active_delete
        View view1 = ViewBindings.a(view0, 0x7F0B08BD);  // id:my_active_delete
        if(((TextView)view1) != null) {
            v = 0x7F0B08BE;  // id:my_active_delete_all
            View view2 = ViewBindings.a(view0, 0x7F0B08BE);  // id:my_active_delete_all
            if(((TextView)view2) != null) {
                v = 0x7F0B08BF;  // id:my_active_delete_wrapper
                View view3 = ViewBindings.a(view0, 0x7F0B08BF);  // id:my_active_delete_wrapper
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B08C0;  // id:my_active_empty_text
                    View view4 = ViewBindings.a(view0, 0x7F0B08C0);  // id:my_active_empty_text
                    if(((TextView)view4) != null) {
                        v = 0x7F0B08C1;  // id:my_active_post_list
                        View view5 = ViewBindings.a(view0, 0x7F0B08C1);  // id:my_active_post_list
                        if(((RecyclerView)view5) != null) {
                            v = 0x7F0B08C2;  // id:my_active_post_list_guide
                            View view6 = ViewBindings.a(view0, 0x7F0B08C2);  // id:my_active_post_list_guide
                            if(((Guideline)view6) != null) {
                                v = 0x7F0B08C3;  // id:my_active_post_list_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B08C3);  // id:my_active_post_list_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B08C4;  // id:my_active_post_list_refresh
                                    View view8 = ViewBindings.a(view0, 0x7F0B08C4);  // id:my_active_post_list_refresh
                                    if(((SwipeRefreshLayout)view8) != null) {
                                        return new o2(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((ConstraintLayout)view3), ((TextView)view4), ((RecyclerView)view5), ((Guideline)view6), ((ProgressBar)view7), ((SwipeRefreshLayout)view8));
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
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static o2 c(@NonNull LayoutInflater layoutInflater0) {
        return o2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E010F, viewGroup0, false);  // layout:fragment_my_active_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return o2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

