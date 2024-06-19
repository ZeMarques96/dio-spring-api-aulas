package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.my_first_web_api.model.User;

@Repository
public class UserRepository {

    public void save(User user) {
        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo usuário na camada de repositório");
        }
        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema.");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("José", "123456"));
        usuarios.add(new User("Maria", "1234123"));
        return usuarios;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("José", "123");
    }

    public User findByUsername(String username) {
        System.out .println(String.format("FIND/username - Recebendo o username: %s para localizar o usuário", username));
        return new User("Maria", "1234");
    }
}
