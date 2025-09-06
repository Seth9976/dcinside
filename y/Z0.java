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

public final class z0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final Guideline c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ProgressBar e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;
    @NonNull
    public final RecyclerView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final DcToolbar j;

    private z0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull TextView textView0, @NonNull Guideline guideline0, @NonNull TextView textView1, @NonNull ProgressBar progressBar0, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout0, @NonNull RecyclerView recyclerView0, @NonNull TextView textView3, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = textView0;
        this.c = guideline0;
        this.d = textView1;
        this.e = progressBar0;
        this.f = textView2;
        this.g = constraintLayout0;
        this.h = recyclerView0;
        this.i = textView3;
        this.j = dcToolbar0;
    }

    @NonNull
    public static z0 a(@NonNull View view0) {
        int v = 0x7F0B0CE1;  // id:recommend_push_empty_content
        View view1 = ViewBindings.a(view0, 0x7F0B0CE1);  // id:recommend_push_empty_content
        if(((TextView)view1) != null) {
            v = 0x7F0B0CE2;  // id:recommend_push_empty_guideline
            View view2 = ViewBindings.a(view0, 0x7F0B0CE2);  // id:recommend_push_empty_guideline
            if(((Guideline)view2) != null) {
                v = 0x7F0B0CE3;  // id:recommend_push_empty_title
                View view3 = ViewBindings.a(view0, 0x7F0B0CE3);  // id:recommend_push_empty_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0E69;  // id:setting_gallery_list_progress
                    View view4 = ViewBindings.a(view0, 0x7F0B0E69);  // id:setting_gallery_list_progress
                    if(((ProgressBar)view4) != null) {
                        v = 0x7F0B0EA1;  // id:setting_push_count
                        View view5 = ViewBindings.a(view0, 0x7F0B0EA1);  // id:setting_push_count
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0EA2;  // id:setting_push_empty
                            View view6 = ViewBindings.a(view0, 0x7F0B0EA2);  // id:setting_push_empty
                            if(((ConstraintLayout)view6) != null) {
                                v = 0x7F0B0EA3;  // id:setting_push_list
                                View view7 = ViewBindings.a(view0, 0x7F0B0EA3);  // id:setting_push_list
                                if(((RecyclerView)view7) != null) {
                                    v = 0x7F0B0EA4;  // id:setting_push_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B0EA4);  // id:setting_push_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0EA5;  // id:setting_push_toolbar
                                        View view9 = ViewBindings.a(view0, 0x7F0B0EA5);  // id:setting_push_toolbar
                                        if(((DcToolbar)view9) != null) {
                                            return new z0(((CoordinatorLayout)view0), ((TextView)view1), ((Guideline)view2), ((TextView)view3), ((ProgressBar)view4), ((TextView)view5), ((ConstraintLayout)view6), ((RecyclerView)view7), ((TextView)view8), ((DcToolbar)view9));
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
    public static z0 c(@NonNull LayoutInflater layoutInflater0) {
        return z0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E006A, viewGroup0, false);  // layout:activity_setting_push_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return z0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

