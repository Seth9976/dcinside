package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;

public final class i8 implements ViewBinding {
    @NonNull
    private final AppCompatCheckBox a;
    @NonNull
    public final AppCompatCheckBox b;

    private i8(@NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull AppCompatCheckBox appCompatCheckBox1) {
        this.a = appCompatCheckBox0;
        this.b = appCompatCheckBox1;
    }

    @NonNull
    public static i8 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new i8(((AppCompatCheckBox)view0), ((AppCompatCheckBox)view0));
    }

    @NonNull
    public AppCompatCheckBox b() {
        return this.a;
    }

    @NonNull
    public static i8 c(@NonNull LayoutInflater layoutInflater0) {
        return i8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0294, viewGroup0, false);  // layout:view_toolbar_menu_original
        if(z) {
            viewGroup0.addView(view0);
        }
        return i8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

