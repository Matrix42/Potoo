package cn.matrix42.potoo.parser.json;

public class Main {

    public static void main(String[] args) {

        JsonObject jsonObject = new JsonObject()
            .add("a", JsonLiteral.of(1))
            .add("b", JsonLiteral.of(12.0));

        JsonNode jsonNode = Json.buildJson()
            .addJsonLiteral("message", JsonLiteral.of( "succcess"))
            .addJsonLiteral("mes", JsonLiteral.of( "succcess"))
            .addJsonObject("map", jsonObject)
            .addJsonArray("array", new JsonArray(ObjectType.JSON_OBJECT)
                .add(jsonObject)
                .add(jsonObject))
            .build();

        System.out.println(jsonNode.toJsonString());

    }


}
