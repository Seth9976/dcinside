package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class b3 implements ViewBinding {
    @NonNull
    private final View a;

    private b3(@NonNull View view0) {
        this.a = view0;
    }

    @NonNull
    public static b3 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new b3(view0);
    }

    @NonNull
    public static b3 b(@NonNull LayoutInflater layoutInflater0) {
        return b3.c(layoutInflater0, null, false);
    }

    @NonNull
    public static b3 c(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0189, viewGroup0, false);  // layout:total_search_gallery_divider
        if(z) {
            viewGroup0.addView(view0);
        }
        return b3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}

