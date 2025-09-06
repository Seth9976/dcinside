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
import com.canhub.cropper.CropImageView;

public final class d2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final CropImageView c;
    @NonNull
    public final RecyclerView d;
    @NonNull
    public final ProgressBar e;

    private d2(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull CropImageView cropImageView0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = cropImageView0;
        this.d = recyclerView0;
        this.e = progressBar0;
    }

    @NonNull
    public static d2 a(@NonNull View view0) {
        int v = 0x7F0B05C2;  // id:image_edit_rotate_div
        View view1 = ViewBindings.a(view0, 0x7F0B05C2);  // id:image_edit_rotate_div
        if(view1 != null) {
            v = 0x7F0B05C3;  // id:image_edit_rotate_img
            View view2 = ViewBindings.a(view0, 0x7F0B05C3);  // id:image_edit_rotate_img
            if(((CropImageView)view2) != null) {
                v = 0x7F0B05C4;  // id:image_edit_rotate_list
                View view3 = ViewBindings.a(view0, 0x7F0B05C4);  // id:image_edit_rotate_list
                if(((RecyclerView)view3) != null) {
                    v = 0x7F0B05C5;  // id:image_edit_rotate_progress
                    View view4 = ViewBindings.a(view0, 0x7F0B05C5);  // id:image_edit_rotate_progress
                    if(((ProgressBar)view4) != null) {
                        return new d2(((ConstraintLayout)view0), view1, ((CropImageView)view2), ((RecyclerView)view3), ((ProgressBar)view4));
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
    public static d2 c(@NonNull LayoutInflater layoutInflater0) {
        return d2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0104, viewGroup0, false);  // layout:fragment_image_edit_rotate
        if(z) {
            viewGroup0.addView(view0);
        }
        return d2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

