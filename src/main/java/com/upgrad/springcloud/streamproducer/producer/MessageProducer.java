package com.upgrad.springcloud.streamproducer.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;


@EnableBinding(Source.class)
public class MessageProducer {

  private Source _source ;

  public MessageProducer(Source source) {
    _source = source;
  }

  public Source getSource() {
    return _source;
  }

  public void setSource(Source source) {
    _source = source;
  }
}
