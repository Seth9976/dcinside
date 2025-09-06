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

public final class w4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;

    private w4(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull ImageView imageView0, @NonNull ImageView imageView1) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = imageView0;
        this.d = imageView1;
    }

    @NonNull
    public static w4 a(@NonNull View view0) {
        int v = 0x7F0B0496;  // id:fast_scroll_back
        View view1 = ViewBindings.a(view0, 0x7F0B0496);  // id:fast_scroll_back
        if(view1 != null) {
            v = 0x7F0B0497;  // id:fast_scroll_down
            ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0497);  // id:fast_scroll_down
            if(imageView0 != null) {
                v = 0x7F0B0498;  // id:fast_scroll_up
                ImageView imageView1 = (ImageView)ViewBindings.a(view0, 0x7F0B0498);  // id:fast_scroll_up
                if(imageView1 != null) {
                    return new w4(((ConstraintLayout)view0), view1, imageView0, imageView1);
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
    public static w4 c(@NonNull LayoutInflater layoutInflater0) {
        return w4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01D2, viewGroup0, false);  // layout:view_fastscroll
        if(z) {
            viewGroup0.addView(view0);
        }
        return w4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

