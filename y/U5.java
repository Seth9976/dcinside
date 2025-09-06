package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class u5 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;

    private u5(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = textView0;
    }

    @NonNull
    public static u5 a(@NonNull View view0) {
        int v = 0x7F0B0729;  // id:live_best_message_close
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0729);  // id:live_best_message_close
        if(imageView0 != null) {
            v = 0x7F0B072A;  // id:live_best_message_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B072A);  // id:live_best_message_text
            if(textView0 != null) {
                return new u5(((ConstraintLayout)view0), imageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static u5 c(@NonNull LayoutInflater layoutInflater0) {
        return u5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0204, viewGroup0, false);  // layout:view_live_best_message
        if(z) {
            viewGroup0.addView(view0);
        }
        return u5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

