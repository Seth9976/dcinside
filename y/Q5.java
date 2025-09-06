package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class q5 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;

    private q5(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = textView0;
    }

    @NonNull
    public static q5 a(@NonNull View view0) {
        int v = 0x7F0B06EB;  // id:like_post_item_image
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B06EB);  // id:like_post_item_image
        if(imageView0 != null) {
            v = 0x7F0B06EC;  // id:like_post_item_subject
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B06EC);  // id:like_post_item_subject
            if(textView0 != null) {
                return new q5(((LinearLayout)view0), imageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static q5 c(@NonNull LayoutInflater layoutInflater0) {
        return q5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static q5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0200, viewGroup0, false);  // layout:view_like_post_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return q5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

