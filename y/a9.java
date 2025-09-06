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

public final class a9 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final FrameLayout d;

    private a9(@NonNull FrameLayout frameLayout0, @NonNull FrameLayout frameLayout1, @NonNull ImageView imageView0, @NonNull FrameLayout frameLayout2) {
        this.a = frameLayout0;
        this.b = frameLayout1;
        this.c = imageView0;
        this.d = frameLayout2;
    }

    @NonNull
    public static a9 a(@NonNull View view0) {
        int v = 0x7F0B0B96;  // id:post_write_item_delete
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0B96);  // id:post_write_item_delete
        if(imageView0 != null) {
            v = 0x7F0B0BC1;  // id:post_write_item_voice_container
            FrameLayout frameLayout0 = (FrameLayout)ViewBindings.a(view0, 0x7F0B0BC1);  // id:post_write_item_voice_container
            if(frameLayout0 != null) {
                return new a9(((FrameLayout)view0), ((FrameLayout)view0), imageView0, frameLayout0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static a9 c(@NonNull LayoutInflater layoutInflater0) {
        return a9.d(layoutInflater0, null, false);
    }

    @NonNull
    public static a9 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E02C0, viewGroup0, false);  // layout:view_write_item_voice
        if(z) {
            viewGroup0.addView(view0);
        }
        return a9.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

