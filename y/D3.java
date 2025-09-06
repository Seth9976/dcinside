package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class d3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final FrameLayout d;

    private d3(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull FrameLayout frameLayout0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = textView0;
        this.d = frameLayout0;
    }

    @NonNull
    public static d3 a(@NonNull View view0) {
        int v = 0x7F0B00C6;  // id:ai_image_load_item_delete
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B00C6);  // id:ai_image_load_item_delete
        if(imageView0 != null) {
            v = 0x7F0B00C7;  // id:ai_image_load_item_title
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B00C7);  // id:ai_image_load_item_title
            if(textView0 != null) {
                v = 0x7F0B00C8;  // id:ai_image_load_item_wrap
                FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B00C8);  // id:ai_image_load_item_wrap
                if(frameLayout0 != null) {
                    return new d3(((ConstraintLayout)view0), imageView0, textView0, frameLayout0);
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
    public static d3 c(@NonNull LayoutInflater layoutInflater0) {
        return d3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E018B, viewGroup0, false);  // layout:view_ai_load_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return d3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

