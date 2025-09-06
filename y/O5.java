package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class o5 implements ViewBinding {
    @NonNull
    private final TextView a;

    private o5(@NonNull TextView textView0) {
        this.a = textView0;
    }

    @NonNull
    public static o5 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new o5(((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static o5 c(@NonNull LayoutInflater layoutInflater0) {
        return o5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01FE, viewGroup0, false);  // layout:view_item_year
        if(z) {
            viewGroup0.addView(view0);
        }
        return o5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

