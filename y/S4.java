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

public final class s4 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final TextView c;

    private s4(@NonNull LinearLayout linearLayout0, @NonNull ImageView imageView0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = imageView0;
        this.c = textView0;
    }

    @NonNull
    public static s4 a(@NonNull View view0) {
        int v = 0x7F0B0434;  // id:down_section_delete
        ImageView imageView0 = (ImageView)ViewBindings.a(view0, 0x7F0B0434);  // id:down_section_delete
        if(imageView0 != null) {
            v = 0x7F0B0435;  // id:down_section_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0435);  // id:down_section_text
            if(textView0 != null) {
                return new s4(((LinearLayout)view0), imageView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static s4 c(@NonNull LayoutInflater layoutInflater0) {
        return s4.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s4 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E01CE, viewGroup0, false);  // layout:view_down_section
        if(z) {
            viewGroup0.addView(view0);
        }
        return s4.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

