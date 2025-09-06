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

public final class m5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final View c;

    private m5(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull View view0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = view0;
    }

    @NonNull
    public static m5 a(@NonNull View view0) {
        int v = 0x7F0B0685;  // id:item_ai_sampling_image
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0685);  // id:item_ai_sampling_image
        if(imageView0 != null) {
            v = 0x7F0B0686;  // id:item_ai_sampling_image_border
            View view1 = ViewBindings.a(view0, 0x7F0B0686);  // id:item_ai_sampling_image_border
            if(view1 != null) {
                return new m5(((ConstraintLayout)view0), imageView0, view1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static m5 c(@NonNull LayoutInflater layoutInflater0) {
        return m5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01FC, viewGroup0, false);  // layout:view_item_sampling_ai
        if(z) {
            viewGroup0.addView(view0);
        }
        return m5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

