package com.dcinside.app.post.fragments;

import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.c;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class j extends ViewHolder {
    static final class a {
        private final float a;
        private final float b;
        private final boolean c;
        private final boolean d;

        public a() {
            this(0.0f, 0.0f, false, false, 15, null);
        }

        public a(float f, float f1, boolean z, boolean z1) {
            this.a = f;
            this.b = f1;
            this.c = z;
            this.d = z1;
        }

        public a(float f, float f1, boolean z, boolean z1, int v, w w0) {
            if((v & 1) != 0) {
                f = 1.0f;
            }
            if((v & 2) != 0) {
                f1 = 1.0f;
            }
            if((v & 4) != 0) {
                z = false;
            }
            if((v & 8) != 0) {
                z1 = false;
            }
            this(f, f1, z, z1);
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        @l
        public final a e(float f, float f1, boolean z, boolean z1) {
            return new a(f, f1, z, z1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(Float.compare(this.a, ((a)object0).a) != 0) {
                return false;
            }
            if(Float.compare(this.b, ((a)object0).b) != 0) {
                return false;
            }
            return this.c == ((a)object0).c ? this.d == ((a)object0).d : false;
        }

        public static a f(a j$a0, float f, float f1, boolean z, boolean z1, int v, Object object0) {
            if((v & 1) != 0) {
                f = j$a0.a;
            }
            if((v & 2) != 0) {
                f1 = j$a0.b;
            }
            if((v & 4) != 0) {
                z = j$a0.c;
            }
            if((v & 8) != 0) {
                z1 = j$a0.d;
            }
            return j$a0.e(f, f1, z, z1);
        }

        public final float g() {
            return this.b;
        }

        public final float h() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + c.a(this.c)) * 0x1F + c.a(this.d);
        }

        public final boolean i() {
            return this.d;
        }

        public final boolean j() {
            return this.c;
        }

        @Override
        @l
        public String toString() {
            return "ApplyColor(subjectAlpha=" + this.a + ", descAlpha=" + this.b + ", isSelected=" + this.c + ", isActivated=" + this.d + ")";
        }
    }

    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @m
    private a e;
    private boolean f;
    private boolean g;

    public j(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B02EC);  // id:comment_list_item_reply_content
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B02EB);  // id:comment_list_item_post_subject
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B02ED);  // id:comment_list_item_reply_count
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B02EA);  // id:comment_list_item_post_origin
        L.o(view4, "findViewById(...)");
        this.d = view4;
    }

    private final void e(a j$a0) {
        this.a.setAlpha(j$a0.h());
        this.b.setAlpha(j$a0.g());
        this.c.setAlpha(j$a0.g());
        this.d.setAlpha(j$a0.g());
        this.itemView.setSelected(j$a0.j());
        this.itemView.setActivated(j$a0.i());
    }

    public final void f() {
        float f = this.g ? 0.2f : 1.0f;
        a j$a0 = this.f ? new a(f, f, true, false, 8, null) : new a(f, f, false, false, 12, null);
        if(!L.g(this.e, j$a0)) {
            this.e = j$a0;
            this.e(j$a0);
        }
    }

    @l
    public final View h() {
        return this.d;
    }

    @l
    public final TextView i() {
        return this.b;
    }

    @l
    public final TextView j() {
        return this.a;
    }

    @l
    public final TextView k() {
        return this.c;
    }

    public final boolean l() {
        return this.g;
    }

    public final boolean m() {
        return this.f;
    }

    public final void n(boolean z) {
        if(this.g != z) {
            this.g = z;
        }
    }

    public final void o(boolean z) {
        if(this.f != z) {
            this.f = z;
        }
    }
}

