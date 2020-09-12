package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.EventType;

import java.io.IOException;

public class EventTypeSerializer extends StdSerializer<EventType> {
    protected EventTypeSerializer() {
        super(EventType.class);
    }

    @Override
    public void serialize(EventType eventType, JsonGenerator gen, SerializerProvider provider) throws IOException{
        gen.writeString(eventType.getCode());
    }
}
