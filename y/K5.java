package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class k5 implements ViewBinding {
    @NonNull
    private final View a;

    private k5(@NonNull View view0) {
        this.a = view0;
    }

    @NonNull
    public static k5 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new k5(view0);
    }

    @NonNull
    public static k5 b(@NonNull LayoutInflater layoutInflater0) {
        return k5.c(layoutInflater0, null, false);
    }

    @NonNull
    public static k5 c(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01FA, viewGroup0, false);  // layout:view_item_recent_gallery_divider
        if(z) {
            viewGroup0.addView(view0);
        }
        return k5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

