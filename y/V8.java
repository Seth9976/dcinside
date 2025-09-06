package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class v8 implements ViewBinding {
    @NonNull
    private final TextView a;
    @NonNull
    public final TextView b;

    private v8(@NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = textView0;
        this.b = textView1;
    }

    @NonNull
    public static v8 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new v8(((TextView)view0), ((TextView)view0));
    }

    @NonNull
    public TextView b() {
        return this.a;
    }

    @NonNull
    public static v8 c(@NonNull LayoutInflater layoutInflater0) {
        return v8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
        if(z) {
            viewGroup0.addView(view0);
        }
        return v8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

