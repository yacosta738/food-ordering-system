package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> {

  public OrderId(UUID value) {
    super(value);
  }
  public static OrderId create() {
    return new OrderId(UUID.randomUUID());
  }
}