package ExampleFile.File.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ExampleFile.File.Model.Owner;
import ExampleFile.File.Model.User;
import ExampleFile.File.Repository.UserRepository;
import ExampleFile.File.Repository.OwnRepository;

@Service // This annotation is crucial for Spring to recognize this as a service bean
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public boolean validateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        
        if (user != null && user.getPassword().equals(password)) {
        	System.out.println("Login Success");
            return true;
        }
        return false;
    }
    
    @Autowired
    private OwnRepository OwnRepository;
    
    public Owner saveUser(Owner owner) {
        return OwnRepository.save(owner);
    }
    public boolean validateOwner(String email, String password) {
    	Owner owner = OwnRepository.findByEmail(email);
        
        if (owner != null && owner.getPassword().equals(password)) {
        	System.out.println("Login Success");
            return true;
        }
        return false;
    }
}
