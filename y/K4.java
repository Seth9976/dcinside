package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class k4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;

    private k4(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
    }

    @NonNull
    public static k4 a(@NonNull View view0) {
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0392);  // id:def_img_item_empty_bg
        if(imageView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0392));  // id:def_img_item_empty_bg
        }
        return new k4(((ConstraintLayout)view0), imageView0);
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static k4 c(@NonNull LayoutInflater layoutInflater0) {
        return k4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C6, viewGroup0, false);  // layout:view_def_img_item_empty
        if(z) {
            viewGroup0.addView(view0);
        }
        return k4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

