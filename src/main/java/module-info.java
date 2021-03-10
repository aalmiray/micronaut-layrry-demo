module com.example.demo {
    exports com.example;
    requires info.picocli;
    requires io.micronaut.picocli.picocli;
    
    opens com.example to info.picocli;
}