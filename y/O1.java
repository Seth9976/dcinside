package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class o1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;

    private o1(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull ConstraintLayout constraintLayout3) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = imageView0;
        this.d = constraintLayout2;
        this.e = imageView1;
        this.f = textView0;
        this.g = constraintLayout3;
    }

    @NonNull
    public static o1 a(@NonNull View view0) {
        int v = 0x7F0B0A89;  // id:post_list_mode_select_subject
        View view1 = ViewBindings.a(view0, 0x7F0B0A89);  // id:post_list_mode_select_subject
        if(((ConstraintLayout)view1) != null) {
            v = 0x7F0B0A8A;  // id:post_list_mode_select_subject_icon
            View view2 = ViewBindings.a(view0, 0x7F0B0A8A);  // id:post_list_mode_select_subject_icon
            if(((ImageView)view2) != null) {
                v = 0x7F0B0A8B;  // id:post_list_mode_select_thumbnail
                View view3 = ViewBindings.a(view0, 0x7F0B0A8B);  // id:post_list_mode_select_thumbnail
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0A8C;  // id:post_list_mode_select_thumbnail_icon
                    View view4 = ViewBindings.a(view0, 0x7F0B0A8C);  // id:post_list_mode_select_thumbnail_icon
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0A8D;  // id:post_list_mode_select_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0A8D);  // id:post_list_mode_select_title
                        if(((TextView)view5) != null) {
                            return new o1(((ConstraintLayout)view0), ((ConstraintLayout)view1), ((ImageView)view2), ((ConstraintLayout)view3), ((ImageView)view4), ((TextView)view5), ((ConstraintLayout)view0));
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
    public static o1 c(@NonNull LayoutInflater layoutInflater0) {
        return o1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00CE, viewGroup0, false);  // layout:dialog_fragment_post_mode_select
        if(z) {
            viewGroup0.addView(view0);
        }
        return o1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

