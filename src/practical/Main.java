package practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){

        List<Person> people = List.of(
        new Person(23,"Pol"),
        new Person(28,"Tol"),
        new Person(21,"Rol")
         );


        //Optional personAge = people.stream().findFirst();
        Stream<Person> stream = people.stream().findFirst().stream();

        for (Person person : people){
            System.out.println(person);
        }
        

        System.out.println(stream);




    }
}


