package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class s8 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final TextView d;

    private s8(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull FrameLayout frameLayout0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = frameLayout0;
        this.d = textView0;
    }

    @NonNull
    public static s8 a(@NonNull View view0) {
        int v = 0x7F0B0FA8;  // id:total_recent_delete_ic
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0FA8);  // id:total_recent_delete_ic
        if(imageView0 != null) {
            v = 0x7F0B0FA9;  // id:total_recent_delete_ic_wrap
            FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0FA9);  // id:total_recent_delete_ic_wrap
            if(frameLayout0 != null) {
                v = 0x7F0B0FAB;  // id:total_recent_subject
                TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0FAB);  // id:total_recent_subject
                if(textView0 != null) {
                    return new s8(((LinearLayout)view0), imageView0, frameLayout0, textView0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static s8 c(@NonNull LayoutInflater layoutInflater0) {
        return s8.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s8 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E029E, viewGroup0, false);  // layout:view_total_recent_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return s8.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

