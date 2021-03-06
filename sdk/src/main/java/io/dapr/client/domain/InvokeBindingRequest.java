/*
 * Copyright (c) Microsoft Corporation and Dapr Contributors.
 * Licensed under the MIT License.
 */

package io.dapr.client.domain;

import java.util.Map;

/**
 * A request to invoke binding.
 */
public class InvokeBindingRequest {

  private String name;

  private String operation;

  private Object data;

  private Map<String, String> metadata;

  public String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  public String getOperation() {
    return operation;
  }

  void setOperation(String operation) {
    this.operation = operation;
  }

  public Object getData() {
    return data;
  }

  void setData(Object data) {
    this.data = data;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }
}
