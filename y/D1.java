package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import top.defaults.colorpicker.ColorPickerView;

public final class d1 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ColorPickerView b;
    @NonNull
    public final View c;

    private d1(@NonNull LinearLayout linearLayout0, @NonNull ColorPickerView colorPickerView0, @NonNull View view0) {
        this.a = linearLayout0;
        this.b = colorPickerView0;
        this.c = view0;
    }

    @NonNull
    public static d1 a(@NonNull View view0) {
        int v = 0x7F0B02D0;  // id:color_picker_palette
        ColorPickerView colorPickerView0 = (ColorPickerView)ViewBindings.a(view0, 0x7F0B02D0);  // id:color_picker_palette
        if(colorPickerView0 != null) {
            v = 0x7F0B02D5;  // id:color_picker_selected
            View view1 = ViewBindings.a(view0, 0x7F0B02D5);  // id:color_picker_selected
            if(view1 != null) {
                return new d1(((LinearLayout)view0), colorPickerView0, view1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static d1 c(@NonNull LayoutInflater layoutInflater0) {
        return d1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C1, viewGroup0, false);  // layout:dialog_color_picker
        if(z) {
            viewGroup0.addView(view0);
        }
        return d1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

