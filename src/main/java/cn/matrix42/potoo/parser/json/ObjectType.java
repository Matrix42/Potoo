package cn.matrix42.potoo.parser.json;

public enum ObjectType {

    JSON_LITERAL(JsonLiteral.class),
    JSON_OBJECT(JsonObject.class),
    JSON_ARRAY(JsonArray.class);

    private final Class<? extends JsonNode> objectType;

    ObjectType(Class<? extends JsonNode> objectType) {
        this.objectType = objectType;
    }

    public Class<? extends JsonNode> getObjectType() {
        return objectType;
    }
}
