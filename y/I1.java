package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.colorpicker.DcColorPickerView;

public final class i1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final DcColorPickerView d;

    private i1(@NonNull ConstraintLayout constraintLayout0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull DcColorPickerView dcColorPickerView0) {
        this.a = constraintLayout0;
        this.b = frameLayout0;
        this.c = textView0;
        this.d = dcColorPickerView0;
    }

    @NonNull
    public static i1 a(@NonNull View view0) {
        int v = 0x7F0B02C8;  // id:color_picker_close
        FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B02C8);  // id:color_picker_close
        if(frameLayout0 != null) {
            v = 0x7F0B02CA;  // id:color_picker_dialog_title
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B02CA);  // id:color_picker_dialog_title
            if(textView0 != null) {
                v = 0x7F0B02D1;  // id:color_picker_picker_view
                DcColorPickerView dcColorPickerView0 = (DcColorPickerView)ViewBindings.a(view0, 0x7F0B02D1);  // id:color_picker_picker_view
                if(dcColorPickerView0 != null) {
                    return new i1(((ConstraintLayout)view0), frameLayout0, textView0, dcColorPickerView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static i1 c(@NonNull LayoutInflater layoutInflater0) {
        return i1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C8, viewGroup0, false);  // layout:dialog_fragment_color_picker
        if(z) {
            viewGroup0.addView(view0);
        }
        return i1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

