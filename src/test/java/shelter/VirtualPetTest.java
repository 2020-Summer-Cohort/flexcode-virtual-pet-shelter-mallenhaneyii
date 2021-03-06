package shelter;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import org.assertj.core.api.Assertions;

public class VirtualPetTest {

    @Test
    public void shouldFindName() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10,1);
        String foundPet = underTest.getName();
        Assertions.assertThat(foundPet).isEqualTo("Rusty");
    }

    @Test
    public void shouldFindDescription() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10, 1);
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 1);
        String foundPet = underTest.getDescription();
        Assertions.assertThat(foundPet).isEqualTo("smells like a Stargazer lily fresh with morning dew");
    }

    @Test
    public void shouldReturnValueOfHunger() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10, 1);
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 1);
        int foundPet = underTest.getHunger();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfThirst() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10, 1);
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,1);
        int foundPet = underTest.getThirst();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfBoredom() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10, 1);
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 1);
        int foundPet = underTest.getBoredom();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfAttributes() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 10, 10, 1);
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10, 1);
        String attributes = underTest.getAttributes();
        Assertions.assertThat(attributes).isEqualTo("10" + "10" + "10");
    }




}