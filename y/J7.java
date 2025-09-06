package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class j7 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;

    private j7(@NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = linearLayout0;
        this.b = textView0;
        this.c = textView1;
    }

    @NonNull
    public static j7 a(@NonNull View view0) {
        int v = 0x7F0B0898;  // id:moved_folder_name
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0898);  // id:moved_folder_name
        if(textView0 != null) {
            v = 0x7F0B0899;  // id:moved_folder_title
            TextView textView1 = (TextView)ViewBindings.a(view0, 0x7F0B0899);  // id:moved_folder_title
            if(textView1 != null) {
                return new j7(((LinearLayout)view0), textView0, textView1);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static j7 c(@NonNull LayoutInflater layoutInflater0) {
        return j7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0261, viewGroup0, false);  // layout:view_remove_folder
        if(z) {
            viewGroup0.addView(view0);
        }
        return j7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

