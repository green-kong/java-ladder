package domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsersTest {
    Users users;

    @BeforeEach
    void setUp() {
        users = new Users();
    }

    @Test
    @DisplayName("일치하는 이름의 유저를 찾아 반환한다.")
    void findUserByNameTest() {
        User user1 = new User("pobi");
        User user2 = new User("polo");
        User user3 = new User("mako");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        User result = users.findUserByName("polo");

        assertThat(result).isEqualTo(user2);
    }

    @Test
    @DisplayName("일치하는 이름이 없으면 예외를 던진다.")
    void findUserByNameFailureTest() {
        User user1 = new User("pobi");
        User user2 = new User("polo");
        User user3 = new User("mako");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertThatThrownBy(() -> users.findUserByName("boxter"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("존재하지 않는 사용자 입니다.");
    }
}
