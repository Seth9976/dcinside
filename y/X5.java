package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class x5 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final ImageView b;

    private x5(@NonNull FrameLayout frameLayout0, @NonNull ImageView imageView0) {
        this.a = frameLayout0;
        this.b = imageView0;
    }

    @NonNull
    public static x5 a(@NonNull View view0) {
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0183);  // id:backpress_img
        if(imageView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0183));  // id:backpress_img
        }
        return new x5(((FrameLayout)view0), imageView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static x5 c(@NonNull LayoutInflater layoutInflater0) {
        return x5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0207, viewGroup0, false);  // layout:view_main_backpress
        if(z) {
            viewGroup0.addView(view0);
        }
        return x5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

