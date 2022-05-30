package tycho.demo.itp01.tests;

import java.time.Duration;
import java.time.Instant;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ITP01Test.class, tycho.demo.itp01.test1.AllTests.class, tycho.demo.itp01.test2.AllTests.class})

@SuppressWarnings({})
public class AllTests {

    private static Instant start;
    private static Instant stop;

    
    @BeforeClass
    public static void setupAll() {

        start = Instant.now();

    }

    @AfterClass
    public static void tearDownAll() {
        stop = Instant.now();

        System.out.println("Die Unit-Tests haben ");
        System.out.println(Duration.between(start, stop));
        System.out.println(" gedauert");
    }
}
