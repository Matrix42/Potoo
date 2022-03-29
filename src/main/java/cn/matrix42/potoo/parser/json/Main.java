package cn.matrix42.potoo.parser.json;

public class Main {

    public static void main(String[] args) {

        JsonNode jsonNode = Json.buildJson()
            .addLiteral(JsonLiteral.of("message", "succcess"))
            .addLiteral(JsonLiteral.of("mes", "succcess"))
            .build();

        System.out.println(jsonNode.toJsonString(true));

    }


}
