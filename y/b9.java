package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class b9 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ImageView e;

    private b9(@NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull ImageView imageView2) {
        this.a = frameLayout0;
        this.b = frameLayout1;
        this.c = imageView0;
        this.d = imageView1;
        this.e = imageView2;
    }

    @NonNull
    public static b9 a(@NonNull View view0) {
        int v = 0x7F0B0BC2;  // id:post_write_item_youtube_delete
        View view1 = ViewBindings.a(view0, 0x7F0B0BC2);  // id:post_write_item_youtube_delete
        if(((ImageView)view1) != null) {
            v = 0x7F0B0BC3;  // id:post_write_item_youtube_play
            View view2 = ViewBindings.a(view0, 0x7F0B0BC3);  // id:post_write_item_youtube_play
            if(((ImageView)view2) != null) {
                v = 0x7F0B0BC4;  // id:post_write_item_youtube_thumbnail
                View view3 = ViewBindings.a(view0, 0x7F0B0BC4);  // id:post_write_item_youtube_thumbnail
                if(((ImageView)view3) != null) {
                    return new b9(((FrameLayout)view0), ((FrameLayout)view0), ((ImageView)view1), ((ImageView)view2), ((ImageView)view3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static b9 c(@NonNull LayoutInflater layoutInflater0) {
        return b9.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b9 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02C1, viewGroup0, false);  // layout:view_write_item_youtube
        if(z) {
            viewGroup0.addView(view0);
        }
        return b9.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

