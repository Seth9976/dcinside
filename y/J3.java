package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class j3 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final ListView b;
    @NonNull
    public final TextView c;

    private j3(@NonNull LinearLayout linearLayout0, @NonNull ListView listView0, @NonNull TextView textView0) {
        this.a = linearLayout0;
        this.b = listView0;
        this.c = textView0;
    }

    @NonNull
    public static j3 a(@NonNull View view0) {
        int v = 0x7F0B010C;  // id:alert_choice_with_msg_list
        ListView listView0 = (ListView)ViewBindings.a(view0, 0x7F0B010C);  // id:alert_choice_with_msg_list
        if(listView0 != null) {
            v = 0x7F0B010D;  // id:alert_choice_with_msg_txt
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B010D);  // id:alert_choice_with_msg_txt
            if(textView0 != null) {
                return new j3(((LinearLayout)view0), listView0, textView0);
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static j3 c(@NonNull LayoutInflater layoutInflater0) {
        return j3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static j3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0191, viewGroup0, false);  // layout:view_alert_choice_with_msg
        if(z) {
            viewGroup0.addView(view0);
        }
        return j3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

