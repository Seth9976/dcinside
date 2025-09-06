package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class k3 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;

    private k3(@NonNull ConstraintLayout constraintLayout0) {
        this.a = constraintLayout0;
    }

    @NonNull
    public static k3 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new k3(((ConstraintLayout)view0));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static k3 c(@NonNull LayoutInflater layoutInflater0) {
        return k3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0192, viewGroup0, false);  // layout:view_all_gallery_desc
        if(z) {
            viewGroup0.addView(view0);
        }
        return k3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

