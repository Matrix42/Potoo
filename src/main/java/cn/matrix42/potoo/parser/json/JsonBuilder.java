package cn.matrix42.potoo.parser.json;

public class JsonBuilder {

    JsonRoot root = new JsonRoot();

    public JsonBuilder addLiteral(JsonLiteral literal) {
        root.add(literal);
        return this;
    }

    public JsonRoot build() {
        return root;
    }

}
