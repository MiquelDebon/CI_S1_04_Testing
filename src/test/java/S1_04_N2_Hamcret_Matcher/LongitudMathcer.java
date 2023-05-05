package S1_04_N2_Hamcret_Matcher;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LongitudMathcer extends FeatureMatcher {
    public LongitudMathcer(Matcher subMatcher, String featureDescription, String featureName) {
        super(subMatcher, featureDescription, featureName);
    }

    /*
    Defineix un Matcher personalitzat per a Hamcrest que proporcioni el Matcher de longitud per a un String.

    Volem usar la classe ->FeatureMatcher.
    Amb FeatureMatcher podem ajustar un Matcher existent, decidir quin camp de l'Objecte prova ha de coincidir i proporcionar un missatge d'error agradable. El constructor de FeatureMatcher té els següents arguments en aquest ordre:

    El matcher que volem embolicar.
    Una descripció de la funció que provem.
    Una descripció del possible mismatch (desajustament).
    L'únic mètode que hem de sobreescriure és featureValueOf (T actual), que retorna el valor que es passarà al mètode match () / matchesSafely (). Utilitza el seu comparador personalitzat en una prova per a comprovar si la cadena "Mordor" té una longitud de 8.

    Ajusta la prova si és necessari.
     */


    @Override
    public Object featureValueOf(Object o) {
        return null;
    }
    protected Integer featureValueOf(String texto) {
        return texto.length();
    }

}




