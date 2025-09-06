package com.dcinside.app.pick.file.view;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Gk;
import e0.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nFilePickerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePickerAdapter.kt\ncom/dcinside/app/pick/file/view/FilePickerAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class a extends BaseAdapter {
    static final class com.dcinside.app.pick.file.view.a.a {
        @l
        private final ImageView a;
        @l
        private final TextView b;
        @l
        private final TextView c;
        @l
        private final TextView d;

        public com.dcinside.app.pick.file.view.a.a(@l View view0) {
            L.p(view0, "itemView");
            super();
            View view1 = view0.findViewById(0x7F0B09C6);  // id:picker_file_list_item_icon
            L.o(view1, "findViewById(...)");
            this.a = (ImageView)view1;
            View view2 = view0.findViewById(0x7F0B09C7);  // id:picker_file_list_item_name
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
            View view3 = view0.findViewById(0x7F0B09C5);  // id:picker_file_list_item_desc
            L.o(view3, "findViewById(...)");
            this.c = (TextView)view3;
            View view4 = view0.findViewById(0x7F0B09C4);  // id:picker_file_list_item_date
            L.o(view4, "findViewById(...)");
            this.d = (TextView)view4;
        }

        @l
        public final TextView a() {
            return this.d;
        }

        @l
        public final TextView b() {
            return this.c;
        }

        @l
        public final ImageView c() {
            return this.a;
        }

        @l
        public final TextView d() {
            return this.b;
        }
    }

    @l
    private final Context a;
    @l
    private final ArrayList b;
    @l
    private final String c;
    @l
    private final SimpleDateFormat d;

    public a(@l Context context0, @l ArrayList arrayList0) {
        L.p(context0, "context");
        L.p(arrayList0, "items");
        super();
        this.a = context0;
        this.b = arrayList0;
        L.o("...", "getString(...)");
        this.c = "...";
        Locale locale0 = Locale.getDefault();
        this.d = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale0, "yyyy/MM/dd HH:mm"), locale0);
    }

    @l
    public b a(int v) {
        Object object0 = this.b.get(v);
        L.o(object0, "get(...)");
        return (b)object0;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    @l
    public View getView(int v, @m View view0, @l ViewGroup viewGroup0) {
        com.dcinside.app.pick.file.view.a.a a$a0;
        L.p(viewGroup0, "viewGroup");
        if(view0 == null) {
            view0 = LayoutInflater.from(this.a).inflate(0x7F0E021F, viewGroup0, false);  // layout:view_picker_file_list_item
            L.m(view0);
            a$a0 = new com.dcinside.app.pick.file.view.a.a(view0);
            view0.setTag(a$a0);
        }
        else {
            Object object0 = view0.getTag();
            L.n(object0, "null cannot be cast to non-null type com.dcinside.app.pick.file.view.FilePickerAdapter.ViewHolder");
            a$a0 = (com.dcinside.app.pick.file.view.a.a)object0;
        }
        Object object1 = this.b.get(v);
        L.o(object1, "get(...)");
        if(((b)object1).f()) {
            a$a0.c().setImageResource(0x7F0802C0);  // drawable:ic_picker_file_foler
        }
        else {
            a$a0.c().setImageResource(0x7F0802BF);  // drawable:ic_picker_file_file
        }
        a$a0.c().setContentDescription(((b)object1).c());
        a$a0.d().setText(((b)object1).c());
        if(v == 0) {
            String s = ((b)object1).c();
            if(s != null && v.v2(s, this.c, false, 2, null)) {
                r.o0(a$a0.b(), 0x7F150346);  // string:file_picker_parent_desc "Parent Directory"
                a$a0.a().setText("");
                return view0;
            }
        }
        a$a0.b().setText(Gk.a(((b)object1).d()));
        Date date0 = new Date(((b)object1).e());
        a$a0.a().setText(this.d.format(date0));
        return view0;
    }
}

