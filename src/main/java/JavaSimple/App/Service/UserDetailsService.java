package JavaSimple.App.Service;

import JavaSimple.App.Entity.UserDetails;
import JavaSimple.App.Repo.UserDetailsRepo;
import JavaSimple.App.dto.UserDetailsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public UserDetails saveuserDetails(UserDetailsDTO userDetailsDTO) {
        UserDetails userDetails = modelMapper.map(userDetailsDTO, UserDetails.class);
        return userDetailsRepo.save(userDetails);
    }

    public Optional<UserDetailsDTO> getUserDetailsbyId(Long id) {
        Optional<UserDetails> userDetailsEntityData = userDetailsRepo.findById(id);

        if (userDetailsEntityData.isPresent()) {
            UserDetailsDTO userDTOmapper = modelMapper.map(userDetailsEntityData, UserDetailsDTO.class);
            return Optional.of(userDTOmapper);

        } else {
            return Optional.empty();
        }

    }
}
