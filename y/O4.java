package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class o4 implements ViewBinding {
    @NonNull
    private final TextView a;

    private o4(@NonNull TextView textView0) {
        this.a = textView0;
    }

    @NonNull
    public static o4 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new o4(((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static o4 c(@NonNull LayoutInflater layoutInflater0) {
        return o4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01CA, viewGroup0, false);  // layout:view_def_img_list_item_guide
        if(z) {
            viewGroup0.addView(view0);
        }
        return o4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

