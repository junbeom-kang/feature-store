package com.example.eventhandler.transformer;

import com.example.eventhandler.consumer.DataConsumer;
import com.example.message.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionEventTransformer implements Transformer {

    private final DataConsumer dataConsumer;

    @Override
    public Event transform() {
        dataConsumer
        return null;
    }
}
