package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class m8 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final AppCompatCheckBox b;

    private m8(@NonNull FrameLayout frameLayout0, @NonNull AppCompatCheckBox appCompatCheckBox0) {
        this.a = frameLayout0;
        this.b = appCompatCheckBox0;
    }

    @NonNull
    public static m8 a(@NonNull View view0) {
        AppCompatCheckBox appCompatCheckBox0 = (AppCompatCheckBox)ViewBindings.a(view0, 0x7F0B082F);  // id:menu_select_all
        if(appCompatCheckBox0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B082F));  // id:menu_select_all
        }
        return new m8(((FrameLayout)view0), appCompatCheckBox0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static m8 c(@NonNull LayoutInflater layoutInflater0) {
        return m8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0298, viewGroup0, false);  // layout:view_toolbar_menu_select_all
        if(z) {
            viewGroup0.addView(view0);
        }
        return m8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

