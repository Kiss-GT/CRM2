package CRM2.CRM2.controller;

import CRM2.CRM2.dao.CustomerDAO;
import CRM2.CRM2.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//git comment
@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("index")
    public String index(@ModelAttribute("index") Customer customer){
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model){

        List<Customer> customers=customerDAO.getCustomers();

        model.addAttribute("customers",customers);

        return "home";
    }
    @RequestMapping("/save")
    public String save(@ModelAttribute("save") Customer customer) {
        return "save";
    }


       @RequestMapping("/processForm")
        public String processFrom (
                @ModelAttribute("save") Customer customer){

            return "home";

    }

}
