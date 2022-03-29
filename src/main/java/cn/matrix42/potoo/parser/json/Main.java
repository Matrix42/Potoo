package cn.matrix42.potoo.parser.json;

public class Main {

    public static void main(String[] args) {

        JsonNode jsonNode = Json.buildJson()
            .addJsonLiteral(JsonLiteral.of("message", "succcess"))
            .addJsonLiteral(JsonLiteral.of("mes", "succcess"))
            .addJsonObject(new JsonObject("map")
                .add(JsonLiteral.of("a", 1))
                .add(JsonLiteral.of("b", 12.0)))
            .addJsonArray(new JsonArray("array", ObjectType.JSON_LITERAL)
                .add(JsonLiteral.of("a", 1)))
            .build();

        System.out.println(jsonNode.toJsonString(true));

    }


}
