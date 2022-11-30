package Chapter01;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class PersonDto {

    private final String name;
    private final Integer age;

    public PersonDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
