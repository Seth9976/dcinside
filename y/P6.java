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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class p6 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ConstraintLayout c;
    @NonNull
    public final Guideline d;
    @NonNull
    public final ProgressBar e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;

    private p6(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout1, @NonNull Guideline guideline0, @NonNull ProgressBar progressBar0, @NonNull TextView textView1, @NonNull TextView textView2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = constraintLayout1;
        this.d = guideline0;
        this.e = progressBar0;
        this.f = textView1;
        this.g = textView2;
    }

    @NonNull
    public static p6 a(@NonNull View view0) {
        int v = 0x7F0B0710;  // id:list_mini_private_button
        View view1 = ViewBindings.a(view0, 0x7F0B0710);  // id:list_mini_private_button
        if(((TextView)view1) != null) {
            v = 0x7F0B0712;  // id:list_mini_private_guideline
            View view2 = ViewBindings.a(view0, 0x7F0B0712);  // id:list_mini_private_guideline
            if(((Guideline)view2) != null) {
                v = 0x7F0B0713;  // id:list_mini_private_progress
                View view3 = ViewBindings.a(view0, 0x7F0B0713);  // id:list_mini_private_progress
                if(((ProgressBar)view3) != null) {
                    v = 0x7F0B0714;  // id:list_mini_private_time_out
                    View view4 = ViewBindings.a(view0, 0x7F0B0714);  // id:list_mini_private_time_out
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0715;  // id:list_mini_private_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0715);  // id:list_mini_private_title
                        if(((TextView)view5) != null) {
                            return new p6(((ConstraintLayout)view0), ((TextView)view1), ((ConstraintLayout)view0), ((Guideline)view2), ((ProgressBar)view3), ((TextView)view4), ((TextView)view5));
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
    public static p6 c(@NonNull LayoutInflater layoutInflater0) {
        return p6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0233, viewGroup0, false);  // layout:view_post_list_mini_private
        if(z) {
            viewGroup0.addView(view0);
        }
        return p6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

