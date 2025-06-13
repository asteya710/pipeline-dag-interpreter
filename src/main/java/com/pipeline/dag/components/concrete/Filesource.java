package com.pipeline.dag.components.concrete;

import com.pipeline.dag.components.models.IPipelineSource;

import java.util.Map;

public class Filesource implements IPipelineSource {
    private final String id;
    private final String type;
    private final String category;
    private final Map<String, Object> properties;

    public Filesource(String id, String type, String category, Map<String, Object> properties) {
        this.id = id;
        this.type = type;
        this.category = category;
        this.properties = properties;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    public String getCategory(){
        return category;
    }

    @Override
    public Map<String, Object> getProperties() {
        return properties;
    }
}
