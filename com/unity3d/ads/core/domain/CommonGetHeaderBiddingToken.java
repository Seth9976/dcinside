package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String HB_TOKEN_VERSION = "2";
    @l
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    @l
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    @l
    private final SessionRepository sessionRepository;

    static {
        CommonGetHeaderBiddingToken.Companion = new Companion(null);
    }

    public CommonGetHeaderBiddingToken(@l BuildHeaderBiddingToken buildHeaderBiddingToken0, @l FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase0, @l SessionRepository sessionRepository0) {
        L.p(buildHeaderBiddingToken0, "buildHeaderBiddingToken");
        L.p(fetchSignalsAndSendUseCase0, "fetchSignalsAndSendUseCase");
        L.p(sessionRepository0, "sessionRepository");
        super();
        this.buildHeaderBiddingToken = buildHeaderBiddingToken0;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase0;
        this.sessionRepository = sessionRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @m
    public Object invoke(@l d d0) {
        HeaderBiddingToken headerBiddingTokenOuterClass$HeaderBiddingToken0;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken0;
        com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke.1 commonGetHeaderBiddingToken$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke.1) {
            commonGetHeaderBiddingToken$invoke$10 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke.1)d0;
            int v = commonGetHeaderBiddingToken$invoke$10.label;
            if((v & 0x80000000) == 0) {
                commonGetHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                commonGetHeaderBiddingToken$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            commonGetHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = commonGetHeaderBiddingToken$invoke$10.result;
        Object object1 = b.l();
        switch(commonGetHeaderBiddingToken$invoke$10.label) {
            case 0: {
                f0.n(object0);
                boolean z = this.sessionRepository.getScarEligibleFormats().isEmpty();
                commonGetHeaderBiddingToken$invoke$10.L$0 = this;
                commonGetHeaderBiddingToken$invoke$10.label = 1;
                object0 = this.buildHeaderBiddingToken.invoke(!z, commonGetHeaderBiddingToken$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                commonGetHeaderBiddingToken0 = this;
                goto label_24;
            }
            case 1: {
                commonGetHeaderBiddingToken0 = (CommonGetHeaderBiddingToken)commonGetHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
            label_24:
                headerBiddingTokenOuterClass$HeaderBiddingToken0 = (HeaderBiddingToken)object0;
                if(!commonGetHeaderBiddingToken0.sessionRepository.getScarEligibleFormats().isEmpty()) {
                    ByteString byteString0 = headerBiddingTokenOuterClass$HeaderBiddingToken0.getTokenId();
                    L.o(byteString0, "rawToken.tokenId");
                    commonGetHeaderBiddingToken$invoke$10.L$0 = headerBiddingTokenOuterClass$HeaderBiddingToken0;
                    commonGetHeaderBiddingToken$invoke$10.label = 2;
                    if(commonGetHeaderBiddingToken0.fetchSignalsAndSendUseCase.invoke(byteString0, commonGetHeaderBiddingToken$invoke$10) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 2: {
                HeaderBiddingToken headerBiddingTokenOuterClass$HeaderBiddingToken1 = (HeaderBiddingToken)commonGetHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
                headerBiddingTokenOuterClass$HeaderBiddingToken0 = headerBiddingTokenOuterClass$HeaderBiddingToken1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ByteString byteString1 = headerBiddingTokenOuterClass$HeaderBiddingToken0.toByteString();
        L.o(byteString1, "rawToken.toByteString()");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString1, false, 1, null);
    }
}

