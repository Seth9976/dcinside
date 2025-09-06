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
import com.facebook.drawee.view.SimpleDraweeView;

public final class c4 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final SimpleDraweeView c;
    @NonNull
    public final FrameLayout d;
    @NonNull
    public final TextView e;

    private c4(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = simpleDraweeView0;
        this.d = frameLayout0;
        this.e = textView0;
    }

    @NonNull
    public static c4 a(@NonNull View view0) {
        int v = 0x7F0B0350;  // id:dccon_picker_detail_close
        View view1 = ViewBindings.a(view0, 0x7F0B0350);  // id:dccon_picker_detail_close
        if(((ImageView)view1) != null) {
            v = 0x7F0B0351;  // id:dccon_picker_detail_img
            View view2 = ViewBindings.a(view0, 0x7F0B0351);  // id:dccon_picker_detail_img
            if(((SimpleDraweeView)view2) != null) {
                v = 0x7F0B0352;  // id:dccon_picker_detail_img_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B0352);  // id:dccon_picker_detail_img_wrap
                if(((FrameLayout)view3) != null) {
                    v = 0x7F0B0353;  // id:dccon_picker_detail_tag
                    View view4 = ViewBindings.a(view0, 0x7F0B0353);  // id:dccon_picker_detail_tag
                    if(((TextView)view4) != null) {
                        return new c4(((ConstraintLayout)view0), ((ImageView)view1), ((SimpleDraweeView)view2), ((FrameLayout)view3), ((TextView)view4));
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
    public static c4 c(@NonNull LayoutInflater layoutInflater0) {
        return c4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01BE, viewGroup0, false);  // layout:view_dccon_picker_detail
        if(z) {
            viewGroup0.addView(view0);
        }
        return c4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

