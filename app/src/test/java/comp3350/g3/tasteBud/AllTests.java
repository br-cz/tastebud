package comp3350.g3.tasteBud;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comp3350.g3.tasteBud.dataTest.RecipeStubTest;
import comp3350.g3.tasteBud.logicTest.RecipeProcessorTest;
import comp3350.g3.tasteBud.logicTest.SearchProcessorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                RecipeStubTest.class,
                SearchProcessorTest.class,
                RecipeProcessorTest.class
        }
)
public class AllTests {
}