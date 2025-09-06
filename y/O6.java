package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class o6 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;

    private o6(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = textView0;
    }

    @NonNull
    public static o6 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B08BC);  // id:must_read_subject
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B08BC));  // id:must_read_subject
        }
        return new o6(((LinearLayout)view0), textView0);
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static o6 c(@NonNull LayoutInflater layoutInflater0) {
        return o6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0232, viewGroup0, false);  // layout:view_post_list_manager_only
        if(z) {
            viewGroup0.addView(view0);
        }
        return o6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

