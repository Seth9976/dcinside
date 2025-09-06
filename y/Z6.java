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
import com.dcinside.app.view.ClearableEditText;

public final class z6 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final FrameLayout c;
    @NonNull
    public final ClearableEditText d;

    private z6(@NonNull FrameLayout frameLayout0, @NonNull ImageView imageView0, @NonNull FrameLayout frameLayout1, @NonNull ClearableEditText clearableEditText0) {
        this.a = frameLayout0;
        this.b = imageView0;
        this.c = frameLayout1;
        this.d = clearableEditText0;
    }

    @NonNull
    public static z6 a(@NonNull View view0) {
        int v = 0x7F0B0AF8;  // id:post_search_confirm
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0AF8);  // id:post_search_confirm
        if(imageView0 != null) {
            ClearableEditText clearableEditText0 = (ClearableEditText)ViewBindings.a(view0, 0x7F0B0B07);  // id:post_search_text
            if(clearableEditText0 != null) {
                return new z6(((FrameLayout)view0), imageView0, ((FrameLayout)view0), clearableEditText0);
            }
            v = 0x7F0B0B07;  // id:post_search_text
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static z6 c(@NonNull LayoutInflater layoutInflater0) {
        return z6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E023D, viewGroup0, false);  // layout:view_post_search_input_tone0
        if(z) {
            viewGroup0.addView(view0);
        }
        return z6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

