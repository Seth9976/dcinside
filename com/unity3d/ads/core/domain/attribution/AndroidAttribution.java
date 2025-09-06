package com.unity3d.ads.core.domain.attribution;

import A3.a;
import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.h;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.k;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.w0;
import y4.l;
import y4.m;

@SuppressLint({"NewApi", "MissingPermission"})
@s0({"SMAP\nAndroidAttribution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAttribution.kt\ncom/unity3d/ads/core/domain/attribution/AndroidAttribution\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,130:1\n29#2:131\n*S KotlinDebug\n*F\n+ 1 AndroidAttribution.kt\ncom/unity3d/ads/core/domain/attribution/AndroidAttribution\n*L\n124#1:131\n*E\n"})
public final class AndroidAttribution {
    @l
    private final ISDKDispatchers dispatchers;
    @l
    private final D measurementManager$delegate;
    @l
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@l Context context0, @l ISDKDispatchers iSDKDispatchers0, @l SessionRepository sessionRepository0) {
        L.p(context0, "context");
        L.p(iSDKDispatchers0, "dispatchers");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.dispatchers = iSDKDispatchers0;
        this.sessionRepository = sessionRepository0;
        this.measurementManager$delegate = E.a(new a(context0) {
            final Context $context;

            {
                AndroidAttribution.this = androidAttribution0;
                this.$context = context0;
                super(0);
            }

            @m
            public final MeasurementManager invoke() {
                return AndroidAttribution.this.getMeasurementManager(this.$context);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    private final MeasurementManager getMeasurementManager() {
        return h.a(this.measurementManager$delegate.getValue());
    }

    // 去混淆评级： 低(20)
    private final MeasurementManager getMeasurementManager(Context context0) {
        return SdkExtensions.getExtensionVersion(1000000) >= 4 ? h.a(context0.getSystemService(MeasurementManager.class)) : null;
    }

    private final Uri getUri(String s, AdObject adObject0) {
        Uri uri0 = Uri.parse(s);
        L.o(uri0, "parse(this)");
        Uri uri1 = uri0.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter("trackingToken", ProtobufExtensionsKt.toBase64$default(adObject0.getTrackingToken(), false, 1, null)).build();
        L.o(uri1, "baseUrl.toUri()\n        …4())\n            .build()");
        return uri1;
    }

    @m
    public final Object isAvailable(@l d d0) {
        S0 s00;
        if(SdkExtensions.getExtensionVersion(1000000) < 4) {
            return b.a(false);
        }
        if(this.getMeasurementManager() == null) {
            return b.a(false);
        }
        if(!AdServicesState.isAdServicesStateEnabled()) {
            return b.a(false);
        }
        k k0 = new k(kotlin.coroutines.intrinsics.b.e(d0));
        MeasurementManager measurementManager0 = this.getMeasurementManager();
        if(measurementManager0 == null) {
            s00 = null;
        }
        else {
            measurementManager0.getMeasurementApiStatus(w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new OutcomeReceiver() {
                public void onError(@l Exception exception0) {
                    L.p(exception0, "error");
                    this.$continuation.resumeWith(Boolean.FALSE);
                }

                @Override  // android.os.OutcomeReceiver
                public void onError(Throwable throwable0) {
                    this.onError(((Exception)throwable0));
                }

                public void onResult(int v) {
                    this.$continuation.resumeWith(Boolean.valueOf(v == 1));
                }

                @Override  // android.os.OutcomeReceiver
                public void onResult(Object object0) {
                    this.onResult(((Number)object0).intValue());
                }
            }));
            s00 = S0.a;
        }
        if(s00 == null) {
            k0.resumeWith(b.a(false));
        }
        Object object0 = k0.a();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object0;
    }

    @m
    public final Object registerClick(@l String s, @l AdObject adObject0, @l d d0) {
        S0 s00;
        if(this.getMeasurementManager() == null) {
            return b.a(false);
        }
        AdPlayer adPlayer0 = adObject0.getAdPlayer();
        if(adPlayer0 != null) {
            WebViewContainer webViewContainer0 = adPlayer0.getWebViewContainer();
            if(webViewContainer0 != null) {
                U u0 = webViewContainer0.getLastInputEvent();
                if(u0 != null) {
                    InputEvent inputEvent0 = (InputEvent)u0.getValue();
                    if(inputEvent0 != null) {
                        k k0 = new k(kotlin.coroutines.intrinsics.b.e(d0));
                        MeasurementManager measurementManager0 = this.getMeasurementManager();
                        if(measurementManager0 == null) {
                            s00 = null;
                        }
                        else {
                            measurementManager0.registerSource(this.getUri(s, adObject0), inputEvent0, w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new OutcomeReceiver() {
                                public void onError(@l Exception exception0) {
                                    L.p(exception0, "error");
                                    this.$continuation.resumeWith(Boolean.FALSE);
                                }

                                @Override  // android.os.OutcomeReceiver
                                public void onError(Throwable throwable0) {
                                    this.onError(((Exception)throwable0));
                                }

                                @Override  // android.os.OutcomeReceiver
                                public void onResult(@l Object object0) {
                                    L.p(object0, "p0");
                                    this.$continuation.resumeWith(Boolean.TRUE);
                                }
                            }));
                            s00 = S0.a;
                        }
                        if(s00 == null) {
                            k0.resumeWith(b.a(false));
                        }
                        Object object0 = k0.a();
                        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
                            kotlin.coroutines.jvm.internal.h.c(d0);
                        }
                        return object0;
                    }
                }
            }
        }
        return b.a(false);
    }

    @m
    public final Object registerView(@l String s, @l AdObject adObject0, @l d d0) {
        if(this.getMeasurementManager() == null) {
            return b.a(false);
        }
        k k0 = new k(kotlin.coroutines.intrinsics.b.e(d0));
        MeasurementManager measurementManager0 = this.getMeasurementManager();
        S0 s00 = null;
        if(measurementManager0 != null) {
            measurementManager0.registerSource(this.getUri(s, adObject0), null, w0.b(this.dispatchers.getDefault()), androidx.core.os.h.a(new OutcomeReceiver() {
                public void onError(@l Exception exception0) {
                    L.p(exception0, "error");
                    this.$continuation.resumeWith(Boolean.FALSE);
                }

                @Override  // android.os.OutcomeReceiver
                public void onError(Throwable throwable0) {
                    this.onError(((Exception)throwable0));
                }

                @Override  // android.os.OutcomeReceiver
                public void onResult(@l Object object0) {
                    L.p(object0, "p0");
                    this.$continuation.resumeWith(Boolean.TRUE);
                }
            }));
            s00 = S0.a;
        }
        if(s00 == null) {
            k0.resumeWith(b.a(false));
        }
        Object object0 = k0.a();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object0;
    }
}

