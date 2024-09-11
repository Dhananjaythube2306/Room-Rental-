package ExampleFile.File.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ExampleFile.File.Model.Owner;
import ExampleFile.File.Model.RoomInfo;
import ExampleFile.File.Model.User;
import ExampleFile.File.Repository.OwnRepository;
import ExampleFile.File.Repository.RoomInfoRepository;
import ExampleFile.File.Repository.UserRepository;
import ExampleFile.File.Service.RoomInfoService;
import ExampleFile.File.Service.UserService;

@Controller
public class DemoController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OwnRepository ownRepository;

    @Autowired
    private UserService userService;



    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/OwnerSignin")
    public String owner() {
        return "OwnerSignin";
    }

    @RequestMapping("/OwnerHome")
    public String OwnerHome() {
        return "OwnerHome";
    }

    @RequestMapping("/OwnerSignup")
    public String OwnerSignup() {
        return "OwnerSignup";
    }

    @RequestMapping("/FinderSignin")
    public String finder() {
        return "FinderSignin";
    }

    @RequestMapping("/FinderHome")
    public String FinderHome() {
        return "FinderHome";
    }

    @RequestMapping("/FinderSignup")
    public String FinderSignup() {
        return "FinderSignup";
    }

    // User Page
    @PostMapping("/submitForm")
    public RedirectView submitForm(@ModelAttribute User user) {
        userRepository.save(user);
        System.out.println("Data Saved");
        return new RedirectView("/FinderSignup");
    }

    @PostMapping("/login")
    public ModelAndView loginUser(@RequestParam String email, @RequestParam String password) {
        boolean isValidUser = userService.validateUser(email, password);
        if (isValidUser) {
            return new ModelAndView(new RedirectView("/FinderHome"));
        } else {
            return new ModelAndView("login", "error", "Invalid email or password");
        }
    }

    // Owner Page
    @PostMapping("/submitOwner")
    public RedirectView submitOwner(@ModelAttribute Owner owner) {
        ownRepository.save(owner);
        System.out.println("Data Saved");
        return new RedirectView("/OwnerSignin");
    }

    @PostMapping("/loginOwner")
    public ModelAndView loginOwner(@RequestParam String email, @RequestParam String password) {
        boolean isValidUser = userService.validateOwner(email, password);
        if (isValidUser) {
            System.out.println("User Data is Valid");
            return new ModelAndView(new RedirectView("/OwnerHome"));
        } else {
            System.out.println("User Data is Not Valid");
            return new ModelAndView("login", "error", "Invalid email or password");
        }
    }


}
