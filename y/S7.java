package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public final class s7 implements ViewBinding {
    @NonNull
    private final LinearLayout a;

    private s7(@NonNull LinearLayout linearLayout0) {
        this.a = linearLayout0;
    }

    @NonNull
    public static s7 a(@NonNull View view0) {
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        return new s7(((LinearLayout)view0));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static s7 c(@NonNull LayoutInflater layoutInflater0) {
        return s7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026A, viewGroup0, false);  // layout:view_reply_more_memo
        if(z) {
            viewGroup0.addView(view0);
        }
        return s7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

