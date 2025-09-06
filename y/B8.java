package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class b8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final View d;

    private b8(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull FrameLayout frameLayout0, @NonNull View view0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = frameLayout0;
        this.d = view0;
    }

    @NonNull
    public static b8 a(@NonNull View view0) {
        int v = 0x7F0B0F8A;  // id:thumbnail_item_image
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0F8A);  // id:thumbnail_item_image
        if(imageView0 != null) {
            v = 0x7F0B0F8B;  // id:thumbnail_item_image_show
            FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0F8B);  // id:thumbnail_item_image_show
            if(frameLayout0 != null) {
                v = 0x7F0B0F8C;  // id:thumbnail_item_selected_border
                View view1 = ViewBindings.a(view0, 0x7F0B0F8C);  // id:thumbnail_item_selected_border
                if(view1 != null) {
                    return new b8(((ConstraintLayout)view0), imageView0, frameLayout0, view1);
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
    public static b8 c(@NonNull LayoutInflater layoutInflater0) {
        return b8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E028D, viewGroup0, false);  // layout:view_thumbnail_image_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return b8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

