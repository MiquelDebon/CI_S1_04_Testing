package S1_04_N3;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

@DisplayName("AssertJ Test by Miquel")
public class AssertJTest {

    /*References:
        https://www.baeldung.com/introduction-to-assertj
        https://www.youtube.com/watch?v=oLEUHVP3kFU
     */

    // Exercise 1 --------------

    @Test
    @DisplayName("Ex1 - Object=Object by fields")
    public void testMethodObjectByField(){
        Person person1 = new Person("Miquel", 27);
        Person person2 = new Person("Miquel", 27);
        assertThat(person1).isEqualToComparingFieldByField(person2); //True
        assertThat(person1).isEqualToComparingOnlyGivenFields(person2, "age");
    }
    @Test
    @DisplayName("Ex1 - Object!=Object by fields")
    public void testMethodNoObjectByField(){
        Person person1 = new Person("Miquel", 27);
        Person person2 = new Person("Miquel", 27);
        assertThat(person1).isNotEqualTo(person2); //True
    }

    // Exercise 2 --------------

    @Test
    @DisplayName("Ex2 - Object=Object by memory location")
    public void testMethodObjectMemoryLocation(){
        Person person1 = new Person("Miquel", 27);
        Person person2 = new Person("Miquel", 27);
        assertThat(person1).isEqualTo(person2); //Error != memory location
        assertThat(person1).isSameAs(person2);
    }

    // Exercise 3 --------------
    //Una asserció que indiqui que dos arrays d'enters són idèntics.
    @Test
    @DisplayName("Ex3 - Array=Array")
    public void testMethodArray(){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        assertThat(array1).isEqualTo(array2);
    }


    //Exercise 4 ----------------
    /*
    Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també). Escriu una asserció per a verificar
    l'ordre dels objectes en l'ArrayList segons han estat inserits.

    Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixa un dels elements sense afegir,
    i verifica que la llista no conté aquest últim.
     */

    @Test
    @DisplayName("Ex 4 - ArrayList Contains exactly Order")
    public void testMethodArrayList1(){
        ArrayList<Object> objArrayList = new ArrayList<>();
        int numero = 1;
        String string = "string";
        Person person1 = new Person("miquel", 1);
        objArrayList.add(numero);
        objArrayList.add(string);
        objArrayList.add(person1);
        assertThat(objArrayList).containsExactly(numero, string, person1);
        assertThat(objArrayList).containsSequence(numero, string, person1);
    }

    @Test
    @DisplayName("Ex 4 - ArrayList Contains exactly by any Order")
    public void testMethodArrayList2(){
        ArrayList<Object> objArrayList = new ArrayList<>();
        int numero = 1;
        String string = "string";
        Person person1 = new Person("miquel", 1);
        objArrayList.add(numero);
        objArrayList.add(string);
        objArrayList.add(person1);
        assertThat(objArrayList).containsExactlyInAnyOrder(string, numero,person1);
    }

    @Test
    @DisplayName("Ex 4 - ArrayList Missing One element")
    public void testMethodArrayList3(){
        ArrayList<Object> objArrayList = new ArrayList<>();
        int numero = 1;
        String string = "string";
        Person person1 = new Person("miquel", 1);
        objArrayList.add(numero);
        objArrayList.add(numero);
        objArrayList.add(string);
        //objArrayList.add(person1);

        assertThat(objArrayList).doesNotContainSequence(numero, numero, string, person1);
        assertThat(objArrayList).doesNotContain(person1);

    }

    //Exercise 5 ----------------

    @Test
    @DisplayName("Ex 5 - HashMap asser one key")
    public void testMethodHashMap(){
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(0, "zero");
        integerStringHashMap.put(1, "one");
        integerStringHashMap.put(2, "two");
        assertThat(integerStringHashMap).containsKey(2);
    }

    //Exercise 6 ----------------


    @Test
    @DisplayName("Ex 6 - Assert Exception")
    public void testMethodException(){
        assertThatThrownBy(() -> {
            Person person1 = new Person();
            person1.throeExceptionMethod();
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    @DisplayName("Ex 6 - Assert Exception 2")
    public void testMethodException2(){
        Person person1 = new Person();
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(person1::throeExceptionMethod);

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> person1.throeExceptionMethod());
    }

    //Exercise 7 ----------------

    @Test
    @DisplayName("Empty Optional")
    public void testMethodEmptyOprtional(){
        Optional<String> optionalS = Optional.empty();
        assertThat(optionalS).isEmpty();
    }


}
