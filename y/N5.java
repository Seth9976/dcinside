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

public final class n5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final View d;

    private n5(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull View view0) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = view0;
    }

    @NonNull
    public static n5 a(@NonNull View view0) {
        int v = 0x7F0B0689;  // id:item_ai_style_default
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0689);  // id:item_ai_style_default
        if(textView0 != null) {
            v = 0x7F0B068A;  // id:item_ai_style_image
            ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B068A);  // id:item_ai_style_image
            if(imageView0 != null) {
                v = 0x7F0B068B;  // id:item_ai_style_image_border
                View view1 = ViewBindings.a(view0, 0x7F0B068B);  // id:item_ai_style_image_border
                if(view1 != null) {
                    return new n5(((ConstraintLayout)view0), textView0, imageView0, view1);
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
    public static n5 c(@NonNull LayoutInflater layoutInflater0) {
        return n5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01FD, viewGroup0, false);  // layout:view_item_style_ai
        if(z) {
            viewGroup0.addView(view0);
        }
        return n5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

