package nhartner;

import org.graalvm.polyglot.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Context.create("js");
        System.out.println("success");
    }
}
