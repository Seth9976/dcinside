package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.dcinside.app.view.DividerLinearLayout;

public final class c6 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;

    private c6(@NonNull DividerLinearLayout dividerLinearLayout0) {
        this.a = dividerLinearLayout0;
    }

    @NonNull
    public static c6 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new c6(((DividerLinearLayout)view0));
    }

    @NonNull
    public DividerLinearLayout b() {
        return this.a;
    }

    @NonNull
    public static c6 c(@NonNull LayoutInflater layoutInflater0) {
        return c6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static c6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0226, viewGroup0, false);  // layout:view_post_history_item_empty
        if(z) {
            viewGroup0.addView(view0);
        }
        return c6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

