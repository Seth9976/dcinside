package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class DiagnosticEventKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0) {
                L.p(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0, "builder");
                return new Dsl(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0, null);
            }
        }

        public static final class IntTagsProxy extends DslProxy {
        }

        public static final class StringTagsProxy extends DslProxy {
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0) {
            this._builder = diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0;
        }

        public Dsl(Builder diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0, w w0) {
            this(diagnosticEventRequestOuterClass$DiagnosticEvent$Builder0);
        }

        @b0
        public final DiagnosticEvent _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DiagnosticEvent)generatedMessageLite0;
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        @i(name = "clearIntTags")
        public final void clearIntTags(DslMap dslMap0) {
            L.p(dslMap0, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        @i(name = "clearStringTags")
        public final void clearStringTags(DslMap dslMap0) {
            L.p(dslMap0, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        @l
        @i(name = "getAdType")
        public final DiagnosticAdType getAdType() {
            DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0 = this._builder.getAdType();
            L.o(diagnosticEventRequestOuterClass$DiagnosticAdType0, "_builder.getAdType()");
            return diagnosticEventRequestOuterClass$DiagnosticAdType0;
        }

        @i(name = "getAdTypeValue")
        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        @l
        @i(name = "getCustomEventType")
        public final String getCustomEventType() {
            String s = this._builder.getCustomEventType();
            L.o(s, "_builder.getCustomEventType()");
            return s;
        }

        @i(name = "getEventId")
        public final int getEventId() {
            return this._builder.getEventId();
        }

        @l
        @i(name = "getEventType")
        public final DiagnosticEventType getEventType() {
            DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0 = this._builder.getEventType();
            L.o(diagnosticEventRequestOuterClass$DiagnosticEventType0, "_builder.getEventType()");
            return diagnosticEventRequestOuterClass$DiagnosticEventType0;
        }

        @i(name = "getEventTypeValue")
        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        @l
        @i(name = "getImpressionOpportunityId")
        public final ByteString getImpressionOpportunityId() {
            ByteString byteString0 = this._builder.getImpressionOpportunityId();
            L.o(byteString0, "_builder.getImpressionOpportunityId()");
            return byteString0;
        }

        @i(name = "getIntTagsMap")
        public final DslMap getIntTagsMap() {
            Map map0 = this._builder.getIntTagsMap();
            L.o(map0, "_builder.getIntTagsMap()");
            return new DslMap(map0);
        }

        @i(name = "getIsHeaderBidding")
        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        @l
        @i(name = "getPlacementId")
        public final String getPlacementId() {
            String s = this._builder.getPlacementId();
            L.o(s, "_builder.getPlacementId()");
            return s;
        }

        @i(name = "getStringTagsMap")
        public final DslMap getStringTagsMap() {
            Map map0 = this._builder.getStringTagsMap();
            L.o(map0, "_builder.getStringTagsMap()");
            return new DslMap(map0);
        }

        @i(name = "getTimeValue")
        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        @l
        @i(name = "getTimestamps")
        public final Timestamps getTimestamps() {
            Timestamps timestampsOuterClass$Timestamps0 = this._builder.getTimestamps();
            L.o(timestampsOuterClass$Timestamps0, "_builder.getTimestamps()");
            return timestampsOuterClass$Timestamps0;
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        @i(name = "putAllIntTags")
        public final void putAllIntTags(DslMap dslMap0, Map map0) {
            L.p(dslMap0, "<this>");
            L.p(map0, "map");
            this._builder.putAllIntTags(map0);
        }

        @i(name = "putAllStringTags")
        public final void putAllStringTags(DslMap dslMap0, Map map0) {
            L.p(dslMap0, "<this>");
            L.p(map0, "map");
            this._builder.putAllStringTags(map0);
        }

        @i(name = "putIntTags")
        public final void putIntTags(@l DslMap dslMap0, @l String s, int v) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.putIntTags(s, v);
        }

        @i(name = "putStringTags")
        public final void putStringTags(@l DslMap dslMap0, @l String s, @l String s1) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(s1, "value");
            this._builder.putStringTags(s, s1);
        }

        @i(name = "removeIntTags")
        public final void removeIntTags(DslMap dslMap0, String s) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.removeIntTags(s);
        }

        @i(name = "removeStringTags")
        public final void removeStringTags(DslMap dslMap0, String s) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this._builder.removeStringTags(s);
        }

        @i(name = "setAdType")
        public final void setAdType(@l DiagnosticAdType diagnosticEventRequestOuterClass$DiagnosticAdType0) {
            L.p(diagnosticEventRequestOuterClass$DiagnosticAdType0, "value");
            this._builder.setAdType(diagnosticEventRequestOuterClass$DiagnosticAdType0);
        }

        @i(name = "setAdTypeValue")
        public final void setAdTypeValue(int v) {
            this._builder.setAdTypeValue(v);
        }

        @i(name = "setCustomEventType")
        public final void setCustomEventType(@l String s) {
            L.p(s, "value");
            this._builder.setCustomEventType(s);
        }

        @i(name = "setEventId")
        public final void setEventId(int v) {
            this._builder.setEventId(v);
        }

        @i(name = "setEventType")
        public final void setEventType(@l DiagnosticEventType diagnosticEventRequestOuterClass$DiagnosticEventType0) {
            L.p(diagnosticEventRequestOuterClass$DiagnosticEventType0, "value");
            this._builder.setEventType(diagnosticEventRequestOuterClass$DiagnosticEventType0);
        }

        @i(name = "setEventTypeValue")
        public final void setEventTypeValue(int v) {
            this._builder.setEventTypeValue(v);
        }

        @i(name = "setImpressionOpportunityId")
        public final void setImpressionOpportunityId(@l ByteString byteString0) {
            L.p(byteString0, "value");
            this._builder.setImpressionOpportunityId(byteString0);
        }

        @i(name = "setIntTags")
        public final void setIntTags(DslMap dslMap0, String s, int v) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            this.putIntTags(dslMap0, s, v);
        }

        @i(name = "setIsHeaderBidding")
        public final void setIsHeaderBidding(boolean z) {
            this._builder.setIsHeaderBidding(z);
        }

        @i(name = "setPlacementId")
        public final void setPlacementId(@l String s) {
            L.p(s, "value");
            this._builder.setPlacementId(s);
        }

        @i(name = "setStringTags")
        public final void setStringTags(DslMap dslMap0, String s, String s1) {
            L.p(dslMap0, "<this>");
            L.p(s, "key");
            L.p(s1, "value");
            this.putStringTags(dslMap0, s, s1);
        }

        @i(name = "setTimeValue")
        public final void setTimeValue(double f) {
            this._builder.setTimeValue(f);
        }

        @i(name = "setTimestamps")
        public final void setTimestamps(@l Timestamps timestampsOuterClass$Timestamps0) {
            L.p(timestampsOuterClass$Timestamps0, "value");
            this._builder.setTimestamps(timestampsOuterClass$Timestamps0);
        }
    }

    @l
    public static final DiagnosticEventKt INSTANCE;

    static {
        DiagnosticEventKt.INSTANCE = new DiagnosticEventKt();
    }
}

