package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class c9 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final AppCompatImageView b;

    private c9(@NonNull FrameLayout frameLayout0, @NonNull AppCompatImageView appCompatImageView0) {
        this.a = frameLayout0;
        this.b = appCompatImageView0;
    }

    @NonNull
    public static c9 a(@NonNull View view0) {
        AppCompatImageView appCompatImageView0 = (AppCompatImageView)ViewBindings.a(view0, 0x7F0B1102);  // id:write_menu_icon
        if(appCompatImageView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B1102));  // id:write_menu_icon
        }
        return new c9(((FrameLayout)view0), appCompatImageView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static c9 c(@NonNull LayoutInflater layoutInflater0) {
        return c9.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c9 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02C2, viewGroup0, false);  // layout:view_write_menu_icon
        if(z) {
            viewGroup0.addView(view0);
        }
        return c9.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

