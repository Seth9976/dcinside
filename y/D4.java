package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.facebook.drawee.view.SimpleDraweeView;

public final class d4 implements ViewBinding {
    @NonNull
    private final SimpleDraweeView a;
    @NonNull
    public final SimpleDraweeView b;

    private d4(@NonNull SimpleDraweeView simpleDraweeView0, @NonNull SimpleDraweeView simpleDraweeView1) {
        this.a = simpleDraweeView0;
        this.b = simpleDraweeView1;
    }

    @NonNull
    public static d4 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new d4(((SimpleDraweeView)view0), ((SimpleDraweeView)view0));
    }

    @NonNull
    public SimpleDraweeView b() {
        return this.a;
    }

    @NonNull
    public static d4 c(@NonNull LayoutInflater layoutInflater0) {
        return d4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01BF, viewGroup0, false);  // layout:view_dccon_tab_ic
        if(z) {
            viewGroup0.addView(view0);
        }
        return d4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

