package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public final class b2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final SubsamplingScaleImageView c;
    @NonNull
    public final RecyclerView d;
    @NonNull
    public final ProgressBar e;

    private b2(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull SubsamplingScaleImageView subsamplingScaleImageView0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = subsamplingScaleImageView0;
        this.d = recyclerView0;
        this.e = progressBar0;
    }

    @NonNull
    public static b2 a(@NonNull View view0) {
        int v = 0x7F0B05AD;  // id:image_edit_menu_div
        View view1 = ViewBindings.a(view0, 0x7F0B05AD);  // id:image_edit_menu_div
        if(view1 != null) {
            v = 0x7F0B05AE;  // id:image_edit_menu_img
            View view2 = ViewBindings.a(view0, 0x7F0B05AE);  // id:image_edit_menu_img
            if(((SubsamplingScaleImageView)view2) != null) {
                v = 0x7F0B05B1;  // id:image_edit_menu_list
                View view3 = ViewBindings.a(view0, 0x7F0B05B1);  // id:image_edit_menu_list
                if(((RecyclerView)view3) != null) {
                    v = 0x7F0B05B2;  // id:image_edit_menu_progress
                    View view4 = ViewBindings.a(view0, 0x7F0B05B2);  // id:image_edit_menu_progress
                    if(((ProgressBar)view4) != null) {
                        return new b2(((ConstraintLayout)view0), view1, ((SubsamplingScaleImageView)view2), ((RecyclerView)view3), ((ProgressBar)view4));
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
    public static b2 c(@NonNull LayoutInflater layoutInflater0) {
        return b2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0102, viewGroup0, false);  // layout:fragment_image_edit_menu
        if(z) {
            viewGroup0.addView(view0);
        }
        return b2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

