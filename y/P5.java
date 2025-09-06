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

public final class p5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;

    private p5(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull ImageView imageView2) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = imageView2;
    }

    @NonNull
    public static p5 a(@NonNull View view0) {
        int v = 0x7F0B0E85;  // id:setting_launcher_icon_item_chk
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0E85);  // id:setting_launcher_icon_item_chk
        if(imageView0 != null) {
            v = 0x7F0B0E86;  // id:setting_launcher_icon_item_ic
            ImageView imageView1 = (ImageView)ViewBindings.a(view0, 0x7F0B0E86);  // id:setting_launcher_icon_item_ic
            if(imageView1 != null) {
                v = 0x7F0B0E87;  // id:setting_launcher_icon_item_small_chk
                ImageView imageView2 = (ImageView)ViewBindings.a(view0, 0x7F0B0E87);  // id:setting_launcher_icon_item_small_chk
                if(imageView2 != null) {
                    return new p5(((ConstraintLayout)view0), imageView0, imageView1, imageView2);
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
    public static p5 c(@NonNull LayoutInflater layoutInflater0) {
        return p5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01FF, viewGroup0, false);  // layout:view_launcher_icon_setting_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return p5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

