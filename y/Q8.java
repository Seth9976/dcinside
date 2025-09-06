package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class q8 implements ViewBinding {
    @NonNull
    private final FrameLayout a;

    private q8(@NonNull FrameLayout frameLayout0) {
        this.a = frameLayout0;
    }

    @NonNull
    public static q8 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new q8(((FrameLayout)view0));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static q8 c(@NonNull LayoutInflater layoutInflater0) {
        return q8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E029C, viewGroup0, false);  // layout:view_total_header_padding
        if(z) {
            viewGroup0.addView(view0);
        }
        return q8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

