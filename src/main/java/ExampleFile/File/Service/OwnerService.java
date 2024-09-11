package ExampleFile.File.Service;

import org.springframework.beans.factory.annotation.Autowired;

import ExampleFile.File.Model.Owner;
import ExampleFile.File.Repository.OwnRepository;

public class OwnerService {
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
