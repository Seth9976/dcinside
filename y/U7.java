package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;

public final class u7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final SimpleDraweeView c;
    @NonNull
    public final SimpleDraweeView d;

    private u7(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull SimpleDraweeView simpleDraweeView0, @NonNull SimpleDraweeView simpleDraweeView1) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = simpleDraweeView0;
        this.d = simpleDraweeView1;
    }

    @NonNull
    public static u7 a(@NonNull View view0) {
        int v = 0x7F0B0D50;  // id:reply_more_dccon_mention
        TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0D50);  // id:reply_more_dccon_mention
        if(textView0 != null) {
            v = 0x7F0B0D57;  // id:reply_more_left_dccon
            SimpleDraweeView simpleDraweeView0 = (SimpleDraweeView)ViewBindings.a(view0, 0x7F0B0D57);  // id:reply_more_left_dccon
            if(simpleDraweeView0 != null) {
                v = 0x7F0B0D5B;  // id:reply_more_right_dccon
                SimpleDraweeView simpleDraweeView1 = (SimpleDraweeView)ViewBindings.a(view0, 0x7F0B0D5B);  // id:reply_more_right_dccon
                if(simpleDraweeView1 != null) {
                    return new u7(((ConstraintLayout)view0), textView0, simpleDraweeView0, simpleDraweeView1);
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
    public static u7 c(@NonNull LayoutInflater layoutInflater0) {
        return u7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static u7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026C, viewGroup0, false);  // layout:view_reply_more_reply_dccon
        if(z) {
            viewGroup0.addView(view0);
        }
        return u7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

