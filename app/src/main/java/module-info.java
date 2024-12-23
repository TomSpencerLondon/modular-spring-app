module example.app {
    requires example.order;
    requires inventory;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires org.slf4j;
    requires spring.boot.autoconfigure;
    requires spring.web;
    requires org.springframework.modulith.starter.core;
    requires org.springframework.modulith.core;
    requires org.apache.tomcat.embed.core;
    opens org.example.app to spring.core, spring.beans, spring.context;
    opens org.example.app.controller to spring.core, spring.beans, spring.web;
    exports org.example.app.controller;
}
