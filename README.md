Project to test running GraalVM with Java 13 using `-XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI`

To test with JVMCI, run `mvn compile exec:exec`

To test without JVMCI, run `mvn compile exec:exec -Pwithout-jvmci`
