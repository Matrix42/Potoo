package cn.matrix42.potoo.parser.json;

import java.io.Serializable;

import cn.matrix42.potoo.lang.StringUtils;

public class JsonLiteral extends JsonNode {

    protected Serializable value;

    public JsonLiteral(String key, Integer value) {
        super(key);
        this.value = value;
    }

    public JsonLiteral(String key, Long value) {
        super(key);
        this.value = value;
    }

    public JsonLiteral(String key, Float value) {
        super(key);
        this.value = value;
    }

    public JsonLiteral(String key, Double value) {
        super(key);
        this.value = value;
    }

    public JsonLiteral(String key, String value) {
        super(key);
        this.value = value;
    }

    @Override
    public boolean isJsonMap() {
        return false;
    }

    @Override
    public boolean isJsonArray() {
        return false;
    }

    @Override
    public boolean isJsonLiteral() {
        return true;
    }

    public boolean isNull() {
        return value == null;
    }

    @Override
    protected String toNormalJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"").append(key).append("\"").append(":");
        sb.append(valueToString());
        return sb.toString();
    }

    @Override
    protected String toPrettyJson(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat(' ', 2 * level));
        sb.append("\"").append(key).append("\"").append(":");
        sb.append(valueToString());
        return sb.toString();
    }

    private String valueToString() {
        if (value == null) {
            return "null";
        } else {
            if (isString()) {
                return "\"" + value + "\"";
            } else {
                return value.toString();
            }
        }
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isLong() {
        return value instanceof Long;
    }

    public boolean isFloat() {
        return value instanceof Float;
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public Integer getInteger() {
        return (Integer) value;
    }

    public Long getLong() {
        return (Long) value;
    }

    public Float getFloat() {
        return (Float) value;
    }

    public Double getDouble() {
        return (Double) value;
    }

    public String getString() {
        return (String) value;
    }

    public Object getNull() {
        return null;
    }

    /////////////////
    //static
    //////////////////

    public static JsonLiteral of(String key, Integer literal) {
        return new JsonLiteral(key, literal);
    }

    public static JsonLiteral of(String key, Long literal) {
        return new JsonLiteral(key, literal);
    }

    public static JsonLiteral of(String key, Float literal) {
        return new JsonLiteral(key, literal);
    }

    public static JsonLiteral of(String key, Double literal) {
        return new JsonLiteral(key, literal);
    }

    public static JsonLiteral of(String key, String literal) {
        return new JsonLiteral(key, literal);
    }

}
