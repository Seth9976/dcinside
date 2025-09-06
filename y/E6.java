package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerLinearLayout;

public final class e6 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;
    @NonNull
    public final TextView b;

    private e6(@NonNull DividerLinearLayout dividerLinearLayout0, @NonNull TextView textView0) {
        this.a = dividerLinearLayout0;
        this.b = textView0;
    }

    @NonNull
    public static e6 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0A5F);  // id:post_history_item_msg
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0A5F));  // id:post_history_item_msg
        }
        return new e6(((DividerLinearLayout)view0), textView0);
    }

    @NonNull
    public DividerLinearLayout b() {
        return this.a;
    }

    @NonNull
    public static e6 c(@NonNull LayoutInflater layoutInflater0) {
        return e6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0228, viewGroup0, false);  // layout:view_post_history_item_msg
        if(z) {
            viewGroup0.addView(view0);
        }
        return e6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

