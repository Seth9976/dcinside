package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class w5 implements ViewBinding {
    @NonNull
    private final RelativeLayout a;

    private w5(@NonNull RelativeLayout relativeLayout0) {
        this.a = relativeLayout0;
    }

    @NonNull
    public static w5 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new w5(((RelativeLayout)view0));
    }

    @NonNull
    public RelativeLayout b() {
        return this.a;
    }

    @NonNull
    public static w5 c(@NonNull LayoutInflater layoutInflater0) {
        return w5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0206, viewGroup0, false);  // layout:view_loading_video
        if(z) {
            viewGroup0.addView(view0);
        }
        return w5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

