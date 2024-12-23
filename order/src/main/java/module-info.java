module example.order {
    exports org.example.order;
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.json;
    requires spring.core;
    requires spring.beans;
    opens org.example.order to spring.core, spring.beans, spring.context;
}
