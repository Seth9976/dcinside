package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerLinearLayout;

public final class d6 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final ImageView d;

    private d6(@NonNull DividerLinearLayout dividerLinearLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull ImageView imageView1) {
        this.a = dividerLinearLayout0;
        this.b = imageView0;
        this.c = textView0;
        this.d = imageView1;
    }

    @NonNull
    public static d6 a(@NonNull View view0) {
        int v = 0x7F0B0A5C;  // id:post_history_item_head_down
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0A5C);  // id:post_history_item_head_down
        if(imageView0 != null) {
            v = 0x7F0B0A5D;  // id:post_history_item_head_title
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0A5D);  // id:post_history_item_head_title
            if(textView0 != null) {
                v = 0x7F0B0A5E;  // id:post_history_item_head_up
                ImageView imageView1 = (ImageView)ViewBindings.a(view0, 0x7F0B0A5E);  // id:post_history_item_head_up
                if(imageView1 != null) {
                    return new d6(((DividerLinearLayout)view0), imageView0, textView0, imageView1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public DividerLinearLayout b() {
        return this.a;
    }

    @NonNull
    public static d6 c(@NonNull LayoutInflater layoutInflater0) {
        return d6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0227, viewGroup0, false);  // layout:view_post_history_item_head
        if(z) {
            viewGroup0.addView(view0);
        }
        return d6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

