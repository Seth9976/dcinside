package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class x4 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;

    private x4(@NonNull FrameLayout frameLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0) {
        this.a = frameLayout0;
        this.b = imageView0;
        this.c = textView0;
    }

    @NonNull
    public static x4 a(@NonNull View view0) {
        int v = 0x7F0B049B;  // id:favorite_setting_item_move
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B049B);  // id:favorite_setting_item_move
        if(imageView0 != null) {
            v = 0x7F0B049C;  // id:favorite_setting_item_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B049C);  // id:favorite_setting_item_text
            if(textView0 != null) {
                return new x4(((FrameLayout)view0), imageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static x4 c(@NonNull LayoutInflater layoutInflater0) {
        return x4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01D3, viewGroup0, false);  // layout:view_favorite_setting_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return x4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

