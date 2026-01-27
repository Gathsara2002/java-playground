package advanced.recordClass;

import java.util.Objects;

/**
 * @author : Gathsara
 * created : 1/27/2026 -- 4:52 PM
 **/

public class UserDTO {
    private final int id;
    private final String name;

    public UserDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return id == userDTO.id && Objects.equals(name, userDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
