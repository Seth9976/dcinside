package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class e5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final AppCompatTextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final View e;
    @NonNull
    public final FrameLayout f;

    private e5(@NonNull ConstraintLayout constraintLayout0, @NonNull AppCompatTextView appCompatTextView0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull View view0, @NonNull FrameLayout frameLayout0) {
        this.a = constraintLayout0;
        this.b = appCompatTextView0;
        this.c = textView0;
        this.d = imageView0;
        this.e = view0;
        this.f = frameLayout0;
    }

    @NonNull
    public static e5 a(@NonNull View view0) {
        int v = 0x7F0B067A;  // id:item_ai_lora_default
        View view1 = ViewBindings.a(view0, 0x7F0B067A);  // id:item_ai_lora_default
        if(((AppCompatTextView)view1) != null) {
            v = 0x7F0B067B;  // id:item_ai_lora_edit
            View view2 = ViewBindings.a(view0, 0x7F0B067B);  // id:item_ai_lora_edit
            if(((TextView)view2) != null) {
                v = 0x7F0B067C;  // id:item_ai_lora_image
                View view3 = ViewBindings.a(view0, 0x7F0B067C);  // id:item_ai_lora_image
                if(((ImageView)view3) != null) {
                    v = 0x7F0B068B;  // id:item_ai_style_image_border
                    View view4 = ViewBindings.a(view0, 0x7F0B068B);  // id:item_ai_style_image_border
                    if(view4 != null) {
                        v = 0x7F0B068C;  // id:item_ai_style_image_selected
                        View view5 = ViewBindings.a(view0, 0x7F0B068C);  // id:item_ai_style_image_selected
                        if(((FrameLayout)view5) != null) {
                            return new e5(((ConstraintLayout)view0), ((AppCompatTextView)view1), ((TextView)view2), ((ImageView)view3), view4, ((FrameLayout)view5));
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
    public static e5 c(@NonNull LayoutInflater layoutInflater0) {
        return e5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F4, viewGroup0, false);  // layout:view_item_lora_type_ai
        if(z) {
            viewGroup0.addView(view0);
        }
        return e5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

