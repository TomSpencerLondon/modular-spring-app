module inventory {
    exports org.example.inventory;
    requires example.order;
    requires spring.context;
    requires spring.boot;
    requires org.slf4j;
    requires spring.boot.autoconfigure;
    requires org.springframework.modulith.events.api;
    requires org.springframework.modulith.starter.core;
    requires spring.core;
    requires spring.beans;
    opens org.example.inventory to spring.core, spring.beans, spring.context;
}
