package S1_04_N2_Hamcret_Matcher;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class LongitudMathcer extends FeatureMatcher {
    public LongitudMathcer(Matcher subMatcher, String featureDescription, String featureName) {
        super(subMatcher, featureDescription, featureName);
    }

    @Override
    public Object featureValueOf(Object o) {
        return null;
    }

    protected Integer featureValueOf(String texto) {
        return texto.length();
    }




}




