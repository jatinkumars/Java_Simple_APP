package JavaSimple.App.Repo;

import JavaSimple.App.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {

}
