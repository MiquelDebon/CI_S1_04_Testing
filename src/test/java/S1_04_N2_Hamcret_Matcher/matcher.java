package S1_04_N2_Hamcret_Matcher;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class matcher {

    public static Matcher<String> length(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher,
                "a String of length that", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

    @Test
    @DisplayName("Check the length of a String")
    public void checkStringLength() {
        assertThat("Gandalf", length(is(7)));
    }




}
