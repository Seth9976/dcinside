package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class b7 implements ViewBinding {
    @NonNull
    private final TextView a;
    @NonNull
    public final TextView b;

    private b7(@NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = textView0;
        this.b = textView1;
    }

    @NonNull
    public static b7 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new b7(((TextView)view0), ((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static b7 c(@NonNull LayoutInflater layoutInflater0) {
        return b7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0259, viewGroup0, false);  // layout:view_recent_item_basic
        if(z) {
            viewGroup0.addView(view0);
        }
        return b7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

