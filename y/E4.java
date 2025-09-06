package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;

public final class e4 implements ViewBinding {
    @NonNull
    private final AppCompatImageView a;
    @NonNull
    public final AppCompatImageView b;

    private e4(@NonNull AppCompatImageView appCompatImageView0, @NonNull AppCompatImageView appCompatImageView1) {
        this.a = appCompatImageView0;
        this.b = appCompatImageView1;
    }

    @NonNull
    public static e4 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new e4(((AppCompatImageView)view0), ((AppCompatImageView)view0));
    }

    @NonNull
    public AppCompatImageView b() {
        return this.a;
    }

    @NonNull
    public static e4 c(@NonNull LayoutInflater layoutInflater0) {
        return e4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01C0, viewGroup0, false);  // layout:view_dccon_tab_recent
        if(z) {
            viewGroup0.addView(view0);
        }
        return e4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

