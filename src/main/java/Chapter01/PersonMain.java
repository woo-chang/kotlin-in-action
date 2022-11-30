package Chapter01;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonMain {

    public static void main(String[] args) {
        List<PersonDto> persons = List.of(
                new PersonDto("영희", null),
                new PersonDto("철수", 29)
        );

        Optional<PersonDto> max = persons.stream()
                .filter(person -> Objects.nonNull(person.getAge()))
                .max(new Comparator<PersonDto>() {
                    @Override
                    public int compare(PersonDto o1, PersonDto o2) {
                        return o2.getAge() - o1.getAge();
                    }
                });

        max.ifPresent(personDto -> System.out.println("나이가 가장 많은 사람: " + personDto));
    }

}
