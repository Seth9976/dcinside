package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class d5 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;

    private d5(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0) {
        this.a = frameLayout0;
        this.b = textView0;
    }

    @NonNull
    public static d5 a(@NonNull View view0) {
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0368);  // id:dccon_recent_text
        if(textView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0B0368));  // id:dccon_recent_text
        }
        return new d5(((FrameLayout)view0), textView0);
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static d5 c(@NonNull LayoutInflater layoutInflater0) {
        return d5.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d5 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01F3, viewGroup0, false);  // layout:view_item_dccon_tag_recent
        if(z) {
            viewGroup0.addView(view0);
        }
        return d5.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

