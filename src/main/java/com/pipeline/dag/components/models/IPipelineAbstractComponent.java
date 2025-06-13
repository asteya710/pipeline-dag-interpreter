package com.pipeline.dag.components.models;

import java.util.Map;

public interface IPipelineAbstractComponent {
    String getId();
    String getType();
    Map<String, Object> getProperties();
}
