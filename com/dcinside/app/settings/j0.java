package com.dcinside.app.settings;

import A3.p;
import Y.B2;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.GuestInfoActivity;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.auth.OtpCodeActivity;
import com.dcinside.app.auth.OtpEnterActivity;
import com.dcinside.app.backup.BackupActivity;
import com.dcinside.app.license.LicenseActivity;
import com.dcinside.app.post.c0;
import com.dcinside.app.post.fragments.PostContainerChildInsets;
import com.dcinside.app.post.fragments.V;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.J;
import com.dcinside.app.settings.hate.HateSettingActivity;
import com.dcinside.app.settings.image.list.DefaultImageListActivity;
import com.dcinside.app.settings.image.setting.DefaultImageSettingActivity;
import com.dcinside.app.settings.spoiler.SpoilerSettingActivity;
import com.dcinside.app.settings.text.GalleryTextOptionListActivity;
import com.dcinside.app.settings.text.GalleryTextOptionSettingActivity;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.appbar.AppBarLayout;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsFragment.kt\ncom/dcinside/app/settings/SettingsFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,435:1\n1#2:436\n35#3:437\n37#4:438\n257#5,2:439\n257#5,2:441\n*S KotlinDebug\n*F\n+ 1 SettingsFragment.kt\ncom/dcinside/app/settings/SettingsFragment\n*L\n136#1:437\n248#1:438\n266#1:439,2\n293#1:441,2\n*E\n"})
public final class j0 extends V {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final long a(@m File file0) {
            long v = 0L;
            if(file0 != null && file0.exists()) {
                if(!file0.isDirectory()) {
                    return file0.length();
                }
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        v += this.a(arr_file[v1]);
                    }
                    return v;
                }
            }
            return 0L;
        }
    }

    @m
    private B2 c;
    @m
    private I0 d;
    @m
    private F0 e;
    @m
    private g1 f;
    @l
    private final P0 g;
    private o h;
    @l
    public static final a i = null;
    @l
    public static final String j = "com.dcinside.app.settings.SettingsFragment.KEY_OTP_URL";

    static {
        j0.i = new a(null);
    }

    public j0() {
        this.g = (g1 g10) -> {
            L.p(this, "this$0");
            L.p(g10, "<anonymous parameter 0>");
            this.s1();
        };
        this.h = f.e();
    }

    private final B2 T0() {
        B2 b20 = this.c;
        L.m(b20);
        return b20;
    }

    private final void U0() {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$10", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            b(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$11", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            c(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.l1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$12", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.d(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.p1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$13", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            e(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.Y0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$14", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.f(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.X0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$15", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            g(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.e1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$16", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            h(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$17", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            i(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.q1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$1", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            j(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.f1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$2", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            k(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.d1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$3", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.l(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.l(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.h1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$4", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.m(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.m(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.g1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$5", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            n(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new n(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.i1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$6", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.o(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.o(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.a1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$7", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.j0.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            com.dcinside.app.settings.j0.p(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.j0.p(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.o1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$8", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            q(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new q(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.k1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.settings.SettingsFragment$initCallbacks$9", f = "SettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final j0 l;

            r(j0 j00, d d0) {
                this.l = j00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new r(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m1();
                return S0.a;
            }
        }

        B2 b20 = this.T0();
        L.o(b20.p, "settingMember");
        j j0$j0 = new j(this, null);
        com.dcinside.app.internal.r.M(b20.p, null, j0$j0, 1, null);
        B2 b21 = this.T0();
        L.o(b21.h, "settingGuest");
        k j0$k0 = new k(this, null);
        com.dcinside.app.internal.r.M(b21.h, null, j0$k0, 1, null);
        B2 b22 = this.T0();
        L.o(b22.u, "settingOtp");
        com.dcinside.app.settings.j0.l j0$l0 = new com.dcinside.app.settings.j0.l(this, null);
        com.dcinside.app.internal.r.M(b22.u, null, j0$l0, 1, null);
        B2 b23 = this.T0();
        L.o(b23.r, "settingNotification");
        com.dcinside.app.settings.j0.m j0$m0 = new com.dcinside.app.settings.j0.m(this, null);
        com.dcinside.app.internal.r.M(b23.r, null, j0$m0, 1, null);
        B2 b24 = this.T0();
        L.o(b24.v, "settingPostWrite");
        n j0$n0 = new n(this, null);
        com.dcinside.app.internal.r.M(b24.v, null, j0$n0, 1, null);
        B2 b25 = this.T0();
        L.o(b25.f, "settingDefImgGallery");
        com.dcinside.app.settings.j0.o j0$o0 = new com.dcinside.app.settings.j0.o(this, null);
        com.dcinside.app.internal.r.M(b25.f, null, j0$o0, 1, null);
        B2 b26 = this.T0();
        L.o(b26.z, "settingScreen");
        com.dcinside.app.settings.j0.p j0$p0 = new com.dcinside.app.settings.j0.p(this, null);
        com.dcinside.app.internal.r.M(b26.z, null, j0$p0, 1, null);
        B2 b27 = this.T0();
        L.o(b27.g, "settingFont");
        q j0$q0 = new q(this, null);
        com.dcinside.app.internal.r.M(b27.g, null, j0$q0, 1, null);
        B2 b28 = this.T0();
        L.o(b28.o, "settingList");
        r j0$r0 = new r(this, null);
        com.dcinside.app.internal.r.M(b28.o, null, j0$r0, 1, null);
        B2 b29 = this.T0();
        L.o(b29.y, "settingRead");
        b j0$b0 = new b(this, null);
        com.dcinside.app.internal.r.M(b29.y, null, j0$b0, 1, null);
        B2 b210 = this.T0();
        L.o(b210.j, "settingHate");
        c j0$c0 = new c(this, null);
        com.dcinside.app.internal.r.M(b210.j, null, j0$c0, 1, null);
        B2 b211 = this.T0();
        L.o(b211.D, "settingSpoiler");
        com.dcinside.app.settings.j0.d j0$d0 = new com.dcinside.app.settings.j0.d(this, null);
        com.dcinside.app.internal.r.M(b211.D, null, j0$d0, 1, null);
        B2 b212 = this.T0();
        L.o(b212.e, "settingClearCache");
        e j0$e0 = new e(this, null);
        com.dcinside.app.internal.r.M(b212.e, null, j0$e0, 1, null);
        B2 b213 = this.T0();
        L.o(b213.c, "settingBackup");
        com.dcinside.app.settings.j0.f j0$f0 = new com.dcinside.app.settings.j0.f(this, null);
        com.dcinside.app.internal.r.M(b213.c, null, j0$f0, 1, null);
        B2 b214 = this.T0();
        L.o(b214.m, "settingLicense");
        g j0$g0 = new g(this, null);
        com.dcinside.app.internal.r.M(b214.m, null, j0$g0, 1, null);
        B2 b215 = this.T0();
        L.o(b215.w, "settingPostWriteQuick");
        h j0$h0 = new h(this, null);
        com.dcinside.app.internal.r.M(b215.w, null, j0$h0, 1, null);
        B2 b216 = this.T0();
        L.o(b216.F, "settingWriteSetting");
        i j0$i0 = new i(this, null);
        com.dcinside.app.internal.r.M(b216.F, null, j0$i0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void V0(j0 j00, g1 g10) [...]

    private final void W0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(com.dcinside.app.internal.c.o(appCompatActivity0)) {
            return;
        }
        this.v1();
        Dl.D(appCompatActivity0, 0x7F150961);  // string:setting_clear_cache_compelete "캐시를 삭제했습니다."
    }

    private final void X0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, BackupActivity.class));
    }

    private final void Y0() {
        static final class s extends N implements Function1 {
            public static final s e;

            static {
                s.e = new s();
            }

            s() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15009D);  // string:alert_clear_cache "캐시는 데이터 절약과 앱의 속도 향상을 위해 사용됩니다.\n\n캐시를 삭제하면 이미지 및 기타 임시파일을 
                                            // 지워서 저장소의 용량을 확보할 수 있습니다.\n\n전체 캐시 삭제는 이미지를 포함한 \'임시 저장 게시물\'까지 지워집니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class t extends N implements Function1 {
            final j0 e;

            t(j0 j00) {
                this.e = j00;
                super(1);
            }

            public final void a(Integer integer0) {
                static final class com.dcinside.app.settings.j0.t.a extends N implements A3.a {
                    final j0 e;

                    com.dcinside.app.settings.j0.t.a(j0 j00) {
                        this.e = j00;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.W0();
                    }
                }

                if(integer0 != null && ((int)integer0) == -2) {
                    return;
                }
                LifecycleOwner lifecycleOwner0 = this.e.getViewLifecycleOwner();
                L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                I0 i00 = com.dcinside.app.settings.d.a(LifecycleOwnerKt.a(lifecycleOwner0), integer0 != null && ((int)integer0) == -1, new com.dcinside.app.settings.j0.t.a(this.e));
                this.e.d = i00;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(s.e).y(0x7F150962).z(0x7F150960).x(0x1040000).d().x5((Object object0) -> {
            L.p(new t(this), "$tmp0");
            new t(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void Z0(Function1 function10, Object object0) [...]

    private final void a1() {
        @s0({"SMAP\nSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsFragment.kt\ncom/dcinside/app/settings/SettingsFragment$onClickDefaultImageGallery$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,435:1\n257#2,2:436\n257#2,2:438\n*S KotlinDebug\n*F\n+ 1 SettingsFragment.kt\ncom/dcinside/app/settings/SettingsFragment$onClickDefaultImageGallery$1\n*L\n270#1:436,2\n287#1:438,2\n*E\n"})
        static final class u extends N implements Function1 {
            final j0 e;
            final AppCompatActivity f;

            u(j0 j00, AppCompatActivity appCompatActivity0) {
                this.e = j00;
                this.f = appCompatActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.settings.image.e e0) {
                B2 b20 = this.e.T0();
                L.o(b20.x, "settingProgress");
                b20.x.setVisibility(8);
                if(e0 instanceof com.dcinside.app.settings.image.e.b) {
                    if(((com.dcinside.app.settings.image.e.b)e0).d().f().isEmpty()) {
                        String s = com.dcinside.app.realm.o.h.h(this.f);
                        com.dcinside.app.settings.image.setting.DefaultImageSettingActivity.a.b(DefaultImageSettingActivity.Q, this.f, "__DC_GLOBAL_DEF_IMAGE_ID", s, false, null, 24, null);
                        return;
                    }
                    DefaultImageListActivity.B.a(this.f);
                    return;
                }
                if(e0 instanceof com.dcinside.app.settings.image.e.a) {
                    com.hjq.toast.s.A(0x7F1502AB);  // string:error_auto_image "자동 짤방 정보를 불러오는데 실패했습니다."
                    B2 b21 = this.e.T0();
                    L.o(b21.x, "settingProgress");
                    b21.x.setVisibility(8);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.settings.image.e)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.h.l();
        B2 b20 = this.T0();
        L.o(b20.x, "settingProgress");
        b20.x.setVisibility(0);
        this.h = com.dcinside.app.settings.image.i.g().M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new u(this, appCompatActivity0), "$tmp0");
            new u(this, appCompatActivity0).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            com.hjq.toast.s.A(0x7F1502AB);  // string:error_auto_image "자동 짤방 정보를 불러오는데 실패했습니다."
            B2 b20 = this.T0();
            L.o(b20.x, "settingProgress");
            b20.x.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void b1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c1(j0 j00, Throwable throwable0) [...]

    private final void d1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, GuestInfoActivity.class));
    }

    private final void e1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, LicenseActivity.class));
    }

    private final void f1() {
        FragmentActivity fragmentActivity0 = this.requireActivity();
        com.dcinside.app.base.d d0 = fragmentActivity0 instanceof com.dcinside.app.base.d ? ((com.dcinside.app.base.d)fragmentActivity0) : null;
        if(d0 == null) {
            return;
        }
        if(B.E.V(this.e) == null && (this.f == null || !this.f.isEmpty())) {
            com.dcinside.app.base.d.y1(d0, 0, null, null, 0, false, 0x1F, null);
            return;
        }
        this.startActivity(LoginActivity.x.b(d0, true));
    }

    private final void g1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        NotificationSettingActivity.z.a(appCompatActivity0);
    }

    private final void h1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.auth.OtpCodeActivity.a.b(OtpCodeActivity.z, appCompatActivity0, false, false, 6, null);
    }

    private final void i1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        F0 f00 = this.e;
        if(f00 == null) {
            return;
        }
        RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.o.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        if(realmQuery0.W1("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID").f1("textOption").r0() != null) {
            GalleryTextOptionListActivity.z.a(appCompatActivity0);
            return;
        }
        String s = com.dcinside.app.realm.o.h.h(appCompatActivity0);
        GalleryTextOptionSettingActivity.F.a(appCompatActivity0, "__DC_GLOBAL_DEF_IMAGE_ID", s);
    }

    @Override  // com.dcinside.app.post.fragments.V
    @l
    public String j0() {
        return "com.dcinside.app.SettingActivity";
    }

    private final void j1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, QuickWriteSettingActivity.class));
    }

    @Override  // com.dcinside.app.post.fragments.V
    @l
    public String k0() {
        return "SettingActivity";
    }

    private final void k1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, FontSettingActivity.class));
    }

    private final void l1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, HateSettingActivity.class));
    }

    private final void m1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, ListSettingActivity.class));
    }

    private final void n1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, ReadSettingActivity.class));
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void o0() {
    }

    private final void o1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        appCompatActivity0.startActivity(new Intent(appCompatActivity0, ScreenSettingActivity.class));
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = B2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.T0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.h.l();
        this.c = null;
        g1 g10 = this.f;
        if(g10 != null) {
            g10.D();
        }
        this.f = null;
        F0 f00 = this.e;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.y4();
                f00.close();
            }
        }
        this.e = null;
        I0 i00 = this.d;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.d = null;
    }

    @Override  // com.dcinside.app.post.fragments.V
    @SuppressLint({"PrivateResource"})
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        F0 f00 = this.e;
        g1 g10 = null;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.y4();
                f00.close();
            }
        }
        this.e = F0.g4();
        if(this.getActivity() instanceof c0) {
            B2 b20 = this.T0();
            e0 e00 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> WindowInsetsCompat.c;
            ViewCompat.m2(b20.b, e00);
        }
        view0.setClickable(true);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            String s = bundle1.getString("com.dcinside.app.settings.SettingsFragment.KEY_OTP_URL");
            if(s != null) {
                this.r1(s);
            }
        }
        DcToolbar dcToolbar0 = (DcToolbar)view0.findViewById(0x7F0B0ED6);  // id:setting_toolbar
        if(dcToolbar0 != null) {
            dcToolbar0.setTitle(0x7F150212);  // string:config_options "설정"
            dcToolbar0.setNavigationIcon(0x7F08003D);  // drawable:abc_ic_ab_back_material
            dcToolbar0.setNavigationOnClickListener((View view0) -> {
                L.p(this, "this$0");
                FragmentActivity fragmentActivity0 = this.getActivity();
                if(fragmentActivity0 != null) {
                    com.dcinside.app.rx.bus.c.a(fragmentActivity0, new J());
                }
            });
        }
        this.T0().B.setVisibility(8);
        this.U0();
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        try {
            PackageInfo packageInfo0 = Build.VERSION.SDK_INT < 33 ? fragmentActivity0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0) : fragmentActivity0.getPackageManager().getPackageInfo("com.dcinside.app.android", PackageManager.PackageInfoFlags.of(0L));
            this.T0().t.setText(packageInfo0.versionName);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            timber.log.b.a.y(packageManager$NameNotFoundException0);
        }
        TextView textView0 = this.T0().A;
        L.o(textView0, "settingScreenDesc");
        com.dcinside.app.internal.r.o0(textView0, (Al.a.i(fragmentActivity0) ? 0x7F150970 : 0x7F15096F));  // string:setting_display_sub1 "테마색, 야간모드, 앱 아이콘, 분할모드"
        B2 b21 = this.T0();
        String s1 = dl.a.Y1();
        b21.l.setText(s1);
        B2 b22 = this.T0();
        Configuration configuration0 = fragmentActivity0.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        b22.C.setText(configuration0.screenWidthDp + "x" + configuration0.screenHeightDp);
        this.v1();
        F0 f01 = this.e;
        if(f01 != null) {
            RealmQuery realmQuery0 = f01.C4(B.class);
            if(realmQuery0 != null) {
                g10 = realmQuery0.p0();
            }
        }
        this.f = g10;
        if(g10 != null) {
            g10.l(this.g);
        }
        this.s1();
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void p0() {
        com.dcinside.app.settings.image.i.a.h();
        com.dcinside.app.realm.t t0 = com.dcinside.app.realm.t.i.a();
        if(t0.R5()) {
            B2 b20 = this.T0();
            String s = t0.S5();
            b20.i.setText(s);
            return;
        }
        this.T0().i.setText(0x7F150993);  // string:setting_off_value "OFF"
    }

    private final void p1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, SpoilerSettingActivity.class));
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void q0(@m PostContainerChildInsets postContainerChildInsets0) {
        super.q0(postContainerChildInsets0);
        AppBarLayout appBarLayout0 = this.T0().b;
        L.o(appBarLayout0, "settingAppbar");
        com.dcinside.app.internal.r.g0(appBarLayout0, ((int)(postContainerChildInsets0 == null ? 0 : postContainerChildInsets0.q())), null, null, null, 14, null);
    }

    private final void q1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        this.startActivity(new Intent(appCompatActivity0, WriteSettingActivity.class));
    }

    private final void r1(String s) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Intent intent0 = new Intent(appCompatActivity0, OtpEnterActivity.class);
        intent0.putExtra("com.dcinside.app.auth.OtpEnterActivity.EXTRA_URL", s);
        intent0.putExtra("com.dcinside.app.auth.OtpEnterActivity.EXTRA_CLOSEABLE", true);
        this.startActivity(intent0);
        appCompatActivity0.finish();
    }

    private final void s1() {
        B b0 = B.E.V(this.e);
        if((b0 == null ? null : b0.j6()) != null) {
            B2 b20 = this.T0();
            String s = b0.m6();
            b20.q.setText(s);
            return;
        }
        this.T0().q.setText(0x7F150986);  // string:setting_login_please "로그인해 주세요."
    }

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat t1(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private static final void u1(j0 j00, View view0) [...]

    private final void v1() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        File file0 = appCompatActivity0.getCacheDir();
        long v = j0.i.a(file0);
        B2 b20 = this.T0();
        String s = Gk.a(v);
        b20.d.setText(s);
    }
}

