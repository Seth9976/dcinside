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
import com.facebook.drawee.view.SimpleDraweeView;

public final class z3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final SimpleDraweeView c;

    private z3(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull SimpleDraweeView simpleDraweeView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = simpleDraweeView0;
    }

    @NonNull
    public static z3 a(@NonNull View view0) {
        int v = 0x7F0B01E1;  // id:block_dccon_detail_item_delete
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B01E1);  // id:block_dccon_detail_item_delete
        if(imageView0 != null) {
            v = 0x7F0B01E2;  // id:block_dccon_detail_item_image
            SimpleDraweeView simpleDraweeView0 = (SimpleDraweeView)ViewBindings.a(view0, 0x7F0B01E2);  // id:block_dccon_detail_item_image
            if(simpleDraweeView0 != null) {
                return new z3(((ConstraintLayout)view0), imageView0, simpleDraweeView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static z3 c(@NonNull LayoutInflater layoutInflater0) {
        return z3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01A1, viewGroup0, false);  // layout:view_block_dccon_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return z3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

