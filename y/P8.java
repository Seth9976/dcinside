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

public final class p8 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;

    private p8(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
    }

    @NonNull
    public static p8 a(@NonNull View view0) {
        int v = 0x7F0B0829;  // id:menu_push_delete
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0829);  // id:menu_push_delete
        if(imageView0 != null) {
            v = 0x7F0B082A;  // id:menu_push_setting
            ImageView imageView1 = (ImageView)ViewBindings.a(view0, 0x7F0B082A);  // id:menu_push_setting
            if(imageView1 != null) {
                return new p8(((ConstraintLayout)view0), imageView0, imageView1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static p8 c(@NonNull LayoutInflater layoutInflater0) {
        return p8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E029B, viewGroup0, false);  // layout:view_toolbar_push_menu
        if(z) {
            viewGroup0.addView(view0);
        }
        return p8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

