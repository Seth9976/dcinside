package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

public final class c5 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final SimpleDraweeView b;

    private c5(@NonNull FrameLayout frameLayout0, @NonNull SimpleDraweeView simpleDraweeView0) {
        this.a = frameLayout0;
        this.b = simpleDraweeView0;
    }

    @NonNull
    public static c5 a(@NonNull View view0) {
        SimpleDraweeView simpleDraweeView0 = (SimpleDraweeView)ViewBindings.a(view0, 0x7F0B0364);  // id:dccon_preview_item
        if(simpleDraweeView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0364));  // id:dccon_preview_item
        }
        return new c5(((FrameLayout)view0), simpleDraweeView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static c5 c(@NonNull LayoutInflater layoutInflater0) {
        return c5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F2, viewGroup0, false);  // layout:view_item_dccon_preview
        if(z) {
            viewGroup0.addView(view0);
        }
        return c5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

