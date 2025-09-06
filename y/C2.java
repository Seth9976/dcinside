package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.canhub.cropper.CropImageView;

public final class c2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final View c;
    @NonNull
    public final CropImageView d;
    @NonNull
    public final RecyclerView e;
    @NonNull
    public final ProgressBar f;

    private c2(@NonNull ConstraintLayout constraintLayout0, @NonNull FrameLayout frameLayout0, @NonNull View view0, @NonNull CropImageView cropImageView0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = frameLayout0;
        this.c = view0;
        this.d = cropImageView0;
        this.e = recyclerView0;
        this.f = progressBar0;
    }

    @NonNull
    public static c2 a(@NonNull View view0) {
        int v = 0x7F0B05B6;  // id:image_edit_resize_additional
        View view1 = ViewBindings.a(view0, 0x7F0B05B6);  // id:image_edit_resize_additional
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B05B7;  // id:image_edit_resize_div
            View view2 = ViewBindings.a(view0, 0x7F0B05B7);  // id:image_edit_resize_div
            if(view2 != null) {
                v = 0x7F0B05B8;  // id:image_edit_resize_img
                View view3 = ViewBindings.a(view0, 0x7F0B05B8);  // id:image_edit_resize_img
                if(((CropImageView)view3) != null) {
                    v = 0x7F0B05BA;  // id:image_edit_resize_list
                    View view4 = ViewBindings.a(view0, 0x7F0B05BA);  // id:image_edit_resize_list
                    if(((RecyclerView)view4) != null) {
                        v = 0x7F0B05C1;  // id:image_edit_resize_progress
                        View view5 = ViewBindings.a(view0, 0x7F0B05C1);  // id:image_edit_resize_progress
                        if(((ProgressBar)view5) != null) {
                            return new c2(((ConstraintLayout)view0), ((FrameLayout)view1), view2, ((CropImageView)view3), ((RecyclerView)view4), ((ProgressBar)view5));
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
    public static c2 c(@NonNull LayoutInflater layoutInflater0) {
        return c2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0103, viewGroup0, false);  // layout:fragment_image_edit_resize
        if(z) {
            viewGroup0.addView(view0);
        }
        return c2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

