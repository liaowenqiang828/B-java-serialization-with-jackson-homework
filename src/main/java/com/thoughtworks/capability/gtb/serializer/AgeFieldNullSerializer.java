package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeFieldNullSerializer extends StdSerializer<Integer> {
    protected AgeFieldNullSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer integer, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(0);
    }
}
