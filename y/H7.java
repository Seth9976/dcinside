package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class h7 implements ViewBinding {
    @NonNull
    private final TextView a;

    private h7(@NonNull TextView textView0) {
        this.a = textView0;
    }

    @NonNull
    public static h7 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new h7(((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static h7 c(@NonNull LayoutInflater layoutInflater0) {
        return h7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E025F, viewGroup0, false);  // layout:view_recommend_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return h7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

