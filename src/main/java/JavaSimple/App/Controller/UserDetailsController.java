package JavaSimple.App.Controller;

import JavaSimple.App.Entity.UserDetails;
import JavaSimple.App.Service.UserDetailsService;
import JavaSimple.App.dto.UserDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/users")
    public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return new ResponseEntity<>(userDetailsService.saveuserDetails(userDetailsDTO), HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<UserDetailsDTO>> getUserDetailsbyId(@PathVariable Long id) {
        return new ResponseEntity<>(userDetailsService.getUserDetailsbyId(id), HttpStatus.OK);
    }


}
