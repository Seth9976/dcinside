package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class r7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final LinearLayout d;

    private r7(@NonNull ConstraintLayout constraintLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull LinearLayout linearLayout1) {
        this.a = constraintLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = linearLayout1;
    }

    @NonNull
    public static r7 a(@NonNull View view0) {
        int v = 0x7F0B0D4D;  // id:reply_more_block_wrap
        LinearLayout linearLayout0 = (LinearLayout)ViewBindings.a(view0, 0x7F0B0D4D);  // id:reply_more_block_wrap
        if(linearLayout0 != null) {
            v = 0x7F0B0D52;  // id:reply_more_delete_text
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0D52);  // id:reply_more_delete_text
            if(textView0 != null) {
                v = 0x7F0B0D53;  // id:reply_more_delete_wrap
                LinearLayout linearLayout1 = (LinearLayout)ViewBindings.a(view0, 0x7F0B0D53);  // id:reply_more_delete_wrap
                if(linearLayout1 != null) {
                    return new r7(((ConstraintLayout)view0), linearLayout0, textView0, linearLayout1);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static r7 c(@NonNull LayoutInflater layoutInflater0) {
        return r7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0269, viewGroup0, false);  // layout:view_reply_more_delete
        if(z) {
            viewGroup0.addView(view0);
        }
        return r7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

